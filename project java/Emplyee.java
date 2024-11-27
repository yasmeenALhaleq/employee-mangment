public class Emplyee {
    private String name;
    private int id;
    private String email;
    private String position;
    private String department;
    private double salary;


    public Emplyee(String name, int id, String email, String position, String department, double salary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //method to display the employee details
    public void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("id: "+id);
        System.out.println("email: "+email);
        System.out.println("position: "+position);
        System.out.println("department: "+department);
        System.out.println("salary: "+salary);

    }


}
