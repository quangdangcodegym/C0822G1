public class Fresher extends Employee{
    private String graduationYear, graduationRank, education;

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Fresher(){

    }
    public Fresher(int id, String fullName, String email, int phone, int employeeType, String graduationYear, String graduationRank, String education){
        super(id, fullName, email, phone, employeeType);
        this.graduationYear = graduationYear;
        this.graduationRank = graduationRank;
        this.education = education;
    }
//    public Fresher(int id, String fullName, String email, int phone, int employeeType){
//        super(id, fullName, email, phone, employeeType);
//    }
    public String showInfo(){
        return getFullName() + getGraduationYear();
    }
}
