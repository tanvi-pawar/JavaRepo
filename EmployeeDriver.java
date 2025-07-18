import java.util.Arrays;

class Employee implements Comparable<Employee> {
    int empId;
    String ename;
    String depart;
    double salary;

    public Employee(int empId, String ename, String depart, double salary) {
        super();
        this.empId = empId;
        this.ename = ename;
        this.depart = depart;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId +
               ", ename=" + ename +
               ", depart=" + depart +
               ", salary=" + salary + "]";
    }

    // @Override
    // public int compareTo(Employee emp) {
    //     return this.empId - emp.empId; // ascending sort by empId
    // }

    // Alternate comparison options (not used currently)
    // empId desc

    // @Override
    // public int compareTo(Employee emp) {
    //     return emp.empId - this.empId; // ascending sort by empId
    // }

    // ename dec

    //  @Override
    // public int compareTo(Employee emp) {
    //     return emp.ename.compareTo(this.ename) ; // descending sort 
    // }
    // ename asc

  // @Override
  //    public int compareTo(Employee emp) {
  //        return this.ename.compareTo(emp.ename) ; // ascending sort 
  //   }



    // salary desc


  // @Override
  //    public int compareTo(Employee emp) {
  //        return (int) (emp.salary-this.salary) ; // descending sort 
  //   }

    
    // salary asc


  @Override
     public int compareTo(Employee emp) {
         return (int) (this.salary-emp.salary) ; // ascending sort 
    }


}

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee(1234, "RAMESH", "HR", 50000);
        employeeList[1] = new Employee(1232, "SURESH", "TESTER", 40000);
        employeeList[2] = new Employee(1235, "GANESH", "DEVELOPER", 60000);
        employeeList[3] = new Employee(1231, "RAJESH", "FRONT END DEVELOPER", 45000);
        employeeList[4] = new Employee(1233, "MAHESH", "FM", 55000);

        System.out.println("Before Sorting:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        Arrays.sort(employeeList);
        System.out.println("\nAfter Sorting by empId (ascending):");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}