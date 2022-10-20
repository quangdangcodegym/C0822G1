public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }
}

