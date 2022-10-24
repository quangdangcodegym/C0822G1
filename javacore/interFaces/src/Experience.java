public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(){

    }
//    public Experience(int id, String fullName, String email, int phone, int employeeType) {
//        super(id, fullName, email, phone,employeeType);
//    }
    public Experience(int id, String fullName, String email, int phone, int employeeType, int expInYear, String proSkill) {
        super(id, fullName, email, phone,employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    @Override
    public String showInfo(){
        return getId() + getFullName() + getEmail() + getPhone() + getEmployeeType();
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
