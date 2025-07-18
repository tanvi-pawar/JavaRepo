
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

    // Method to perform linear search
    public static int searchById(Employee[] employees, int key) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == key) {
                return i; // Return position (index) if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        // Unsorted array of Employee objects
        Employee[] empArray = {
            new Employee(105, "Tanvi"),
            new Employee(102, "Raj"),
            new Employee(108, "Priya"),
            new Employee(101, "Amit")
        };

        int keyId = 108; // Employee ID to search

        int position = searchById(empArray, keyId);

        if (position != -1) {
            System.out.println("Employee with ID " + keyId + " is present at position " + position +
                               " with name: " + empArray[position].name);
        } else {
            System.out.println("Employee with ID " + keyId + " is NOT present in the array.");
        }
    }
}
