import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEmployee Management System");
            System.out.println("Choose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Display Employees by Department");
            System.out.println("7. Calculate Average Salary");
            System.out.println("8. Export Employees to File");
            System.out.println("9. Set Performance Rating for Employee");
            System.out.println("10. Adjust Salary Based on Performance");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // To avoid input skipping issue
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter Performance Rating (Good, Excellent, Poor): ");
                    String performanceRating = scanner.next();
                    System.out.print("Enter Remaining Leave Days: ");
                    int leaveDays = scanner.nextInt();
                    Employee employee = new Employee(name, age, id, department, salary, performanceRating, leaveDays);
                    management.addEmployee(employee);
                    break;
                case 2: // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    management.deleteEmployee(scanner.nextInt());
                    break;
                case 3: // Update Employee
                    System.out.print("Enter Employee ID to update: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Department: ");
                    String newDepartment = scanner.nextLine();
                    management.updateEmployee(empId, newName, newAge, newDepartment);
                    break;
                case 4: // Display All Employees
                    management.displayEmployees();
                    break;
                case 5: // Search Employee by ID
                    System.out.print("Enter Employee ID to search: ");
                    management.searchEmployee(scanner.nextInt());
                    break;
                case 6: // Display Employees by Department
                    System.out.print("Enter Department to display: ");
                    String dept = scanner.next();
                    management.displayEmployeesByDepartment(dept);
                    break;
                case 7: // Calculate Average Salary
                    double averageSalary = management.calculateAverageSalary();
                    System.out.println("Average Salary: $" + averageSalary);
                    break;
                case 8: // Export Employees to File
                    System.out.print("Enter filename to export: ");
                    String filename = scanner.next();
                    management.exportEmployeesToFile(filename);
                    break;
                case 9: // Set Performance Rating
                    System.out.print("Enter Employee ID to set performance rating: ");
                    int empIdRating = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Performance Rating (Good, Excellent, Poor): ");
                    String rating = scanner.nextLine();
                    management.adjustSalaryBasedOnPerformance(empIdRating);
                    break;
                case 10: // Adjust Salary Based on Performance
                    System.out.print("Enter Employee ID to adjust salary: ");
                    int empIdSalary = scanner.nextInt();
                    management.adjustSalaryBasedOnPerformance(empIdSalary);
                    break;
                case 11: // Exit
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
}
