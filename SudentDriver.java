// File: SudentDriver.java

import java.util.*;

 class StudentDriver {
    static int index = 0;
    static Student[] arr = new Student[20];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n----- Welcome -----");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. UPDATE STUDENT");
            System.out.println("3. ALL STUDENT");
            System.out.println("4. ADD MOCK");
            System.out.println("5. LOGOUT");
            System.out.print("Enter Your Option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> viewAllStudent();
                case 4 -> addMock();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Option!");
            }
        }
    }

    private static void addStudent() {
        System.out.println("\n--- Add Student Detail ---");
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email id: ");
        String emailid = sc.next();
        System.out.print("Contact: ");
        long contact = sc.nextLong();
        Address address = addAddress();
        Student student = new Student(name, emailid, contact, address, sc);
        arr[index++] = student;
        System.out.println("Student added successfully.");
    }

    private static Address addAddress() {
        sc.nextLine(); // consume newline
        System.out.println("--- Address Details ---");
        System.out.print("Area: ");
        String area = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Pincode: ");
        int pincode = sc.nextInt();
        return new Address(area, city, state, pincode);
    }

    private static void updateStudent() {
        sc.nextLine();
        System.out.print("Enter student email to update: ");
        String email = sc.nextLine();
        for (int i = 0; i < index; i++) {
            if (arr[i].getEmailid().equalsIgnoreCase(email)) {
                System.out.println("1. Update Name\n2. Update Contact");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.print("Enter new name: ");
                    arr[i].setName(sc.nextLine());
                } else if (choice == 2) {
                    System.out.print("Enter new contact: ");
                    arr[i].setContact(sc.nextLong());
                }
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void viewAllStudent() {
        System.out.println("\n--- All Student List ---");
        if (index == 0) {
            System.out.println("No Data Found");
            return;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void addMock() {
        sc.nextLine();
        System.out.print("Enter student email to add mock: ");
        String email = sc.nextLine();
        for (int i = 0; i < index; i++) {
            if (arr[i].getEmailid().equalsIgnoreCase(email)) {
                System.out.print("Subject: ");
                String subject = sc.nextLine();
                System.out.print("Trainer: ");
                String trainer = sc.nextLine();
                System.out.print("Date: ");
                String date = sc.nextLine();
                System.out.print("Rating: ");
                String rating = sc.nextLine();
                System.out.print("Batch Code: ");
                String batchCode = sc.nextLine();

                Mock mock = new Mock(subject, trainer, date, rating, batchCode);
                arr[i].addMock(mock);
                System.out.println("Mock added.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

// Student Class
class Student {
    static int unqid = 123;
    private String id;
    private String name;
    private String emailid;
    private long contact;
    private Mock[] mock = new Mock[5];
    private int mockIndex = 0;
    private Address address;
    private Education[] education;

    {
        id = "QSP" + unqid++;
    }

    public Student(String name, String emailid, long contact, Address address, Scanner sc) {
        this.name = name;
        this.emailid = emailid;
        this.contact = contact;
        this.address = address;
        this.education = addEducation(sc);
    }

    private Education[] addEducation(Scanner sc) {
        Education[] arr = new Education[5];
        int count = 0;
        sc.nextLine(); // consume newline
        while (count < 5) {
            System.out.println("--- Enter Education Details ---");
            System.out.print("Course: ");
            String course = sc.nextLine();
            System.out.print("University: ");
            String university = sc.nextLine();
            System.out.print("YOP: ");
            int yop = sc.nextInt();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine(); // consume newline

            arr[count++] = new Education(course, university, yop, cgpa);

            System.out.print("Do you want to add more education details? (Yes/No): ");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("No")) break;
        }
        return Arrays.copyOf(arr, count);
    }

    public void addMock(Mock m) {
        if (mockIndex < mock.length) {
            mock[mockIndex++] = m;
        } else {
            System.out.println("Maximum mock limit reached.");
        }
    }

    public String getEmailid() {
        return emailid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "\nStudent [id=" + id + ", name=" + name + ", emailid=" + emailid +
               ", contact=" + contact + ", address=" + address +
               ",\nMocks=" + Arrays.toString(Arrays.copyOf(mock, mockIndex)) +
               ",\nEducation=" + Arrays.toString(education) + "]\n";
    }
}

// Mock Class
class Mock {
    private String trainer;
    private String date;
    private String rating;
    private String batchCode;
    private String subject;

    public Mock(String subject, String trainer, String date, String rating, String batchCode) {
        this.subject = subject;
        this.trainer = trainer;
        this.date = date;
        this.rating = rating;
        this.batchCode = batchCode;
    }

    @Override
    public String toString() {
        return "Mock [subject=" + subject + ", trainer=" + trainer + ", date=" + date +
               ", rating=" + rating + ", batchCode=" + batchCode + "]";
    }
}

// Address Class
class Address {
    private String area;
    private String city;
    private String state;
    private int pincode;

    public Address(String area, String city, String state, int pincode) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [area=" + area + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
    }
}

// Education Class
class Education {
    private String course;
    private String university;
    private int yop;
    private double cgpa;

    public Education(String course, String university, int yop, double cgpa) {
        this.course = course;
        this.university = university;
        this.yop = yop;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Education [course=" + course + ", university=" + university + ", yop=" + yop + ", cgpa=" + cgpa + "]";
    }
}
