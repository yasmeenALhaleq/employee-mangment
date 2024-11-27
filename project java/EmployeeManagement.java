import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManagement {
    ArrayList<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {
        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId() == employeeId) {
                employees.remove(i);
                found = true;
                System.out.println("Employee deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
        }
    }

    // Update Employee
    public void updateEmployee(int employeeId, String newName, int newAge, String newDepartment) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setName(newName);
                employee.setAge(newAge);
                employee.setDepartment(newDepartment);
                found = true;
                System.out.println("Employee data updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
        }
    }

    // Display all Employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                employee.displayInfo();
            }
        }
    }

    // Search Employee by ID
    public void searchEmployee(int employeeId) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
        }
    }

    // Display Employees by Department
    public void displayEmployeesByDepartment(String department) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                employee.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in the department: " + department);
        }
    }

    // Calculate Average Salary
    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }

        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

    // Export Employees to File
    public void exportEmployeesToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Employee employee : employees) {
                writer.write("ID: " + employee.getEmployeeId() +
                        ", Name: " + employee.getName() +
                        ", Age: " + employee.getAge() +
                        ", Department: " + employee.getDepartment() +
                        ", Salary: $" + employee.getSalary() +
                        ", Performance Rating: " + employee.getPerformanceRating() +
                        ", Remaining Leave Days: " + employee.getRemainingLeaveDays() + "\n");
            }
            System.out.println("Employee data exported to " + filename + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while exporting employee data to the file.");
            e.printStackTrace();
        }
    }

    // Adjust salary based on performance rating
    public void adjustSalaryBasedOnPerformance(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                switch (employee.getPerformanceRating().toLowerCase()) {
                    case "excellent":
                        employee.setSalary(employee.getSalary() * 1.10); // 10% increase for excellent performance
                        break;
                    case "good":
                        employee.setSalary(employee.getSalary() * 1.05); // 5% increase for good performance
                        break;
                    case "weak":
                        employee.setSalary(employee.getSalary() * 1.02); // 2% increase for poor performance
                        break;
                    default:
                        System.out.println("Unknown performance rating.");
                }
                System.out.println("Employee salary adjusted successfully based on performance.");
                return;
            }
        }
        System.out.println("No employee found with this ID.");
    }
}
