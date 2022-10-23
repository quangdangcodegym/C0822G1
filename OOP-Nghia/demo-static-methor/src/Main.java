public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
class Student {
    int rollno;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}