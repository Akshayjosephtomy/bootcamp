package Employee;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Employee Added");
                    break;
                case 2:
                    System.out.println("EmployeeRemove");
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
