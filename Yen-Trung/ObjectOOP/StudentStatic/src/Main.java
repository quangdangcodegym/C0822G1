public class Main {
    public static void main(String[] args) {
         //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        //calling display method
        s1.changeClass("CODEGYM");
        s2.changeClass("CODEGYM");
        s3.changeClass("CODEGYM");
        s1.display();
        s2.display();
        s3.display();
    }
}