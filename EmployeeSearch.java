class Employee {
    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EmployeeSearch {

   
    public static int searchById(Employee[] employees, int key) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        // Unsorted array of Employee objects
        Employee[] empArray = {
            new Employee(105, "Tanvi"),
            new Employee(102, "Raj"),
            new Employee(108, "Priya"),
            new Employee(101, "Amit")
        };

        int keyId = 1080; 

        int position = searchById(empArray, keyId);

        if (position != -1) {
            System.out.println("Employee with ID " + keyId + " is present at position " + position +
                               " with name: " + empArray[position].name);
        } else {
            System.out.println("Employee with ID " + keyId + " is NOT present in the array.");
        }
    }
}
