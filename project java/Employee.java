public class Employee extends Person {
    private int employeeId;
    private String department;
    private double salary;
    private String performanceRating;
    private int remainingLeaveDays; // Field for remaining leave days

    // Constructor to initialize Employee object
    public Employee(String name, int age, int employeeId, String department, double salary, String performanceRating, int remainingLeaveDays) {
        super(name, age); // Call the constructor of the parent class
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        setPerformanceRating(performanceRating); // Initialize performance rating
        this.remainingLeaveDays = remainingLeaveDays; // Initialize remaining leave days
    }

    // Method to set performance rating
    public void setPerformanceRating(String performanceRating) {
        // Validate performance rating
        if (performanceRating.equalsIgnoreCase("good") ||
                performanceRating.equalsIgnoreCase("excellent") ||
                performanceRating.equalsIgnoreCase("poor")) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid performance rating. Please use 'Good', 'Excellent', or 'Poor'.");
        }
    }

    // Method to display employee information
    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId +
                ", Name: " + getName() +
                ", Age: " + getAge() +
                ", Department: " + department +
                ", Salary: $" + salary +
                ", Performance Rating: " + performanceRating +
                ", Remaining Leave Days: " + remainingLeaveDays);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getPerformanceRating() {
        return performanceRating;
    }

    public int getRemainingLeaveDays() {
        return remainingLeaveDays;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRemainingLeaveDays(int remainingLeaveDays) {
        this.remainingLeaveDays = remainingLeaveDays;
    }
}
