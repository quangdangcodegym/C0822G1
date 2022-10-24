public class Intern extends Employee{
    private String majors, semester, universityName;
    public Intern(){

    }
    public Intern(int id, String fullName, String email, int phone, int employeeType, String majors, String semester, String universityName){
        super(id, fullName, email, phone, employeeType);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }
    public String showInfo(){
        return getFullName() + getUniversityName();
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
