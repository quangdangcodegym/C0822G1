public abstract class Employee {
    private String fullName, email;
    private int id, phone, employeeType, employeeCount;

    public abstract String showInfo();

    public static int count = 1;


    public Employee() {

    }

    public Employee(int id, String fullName, String email, int phone, int employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.employeeType = employeeType;
        employeeCount = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
}
