 public class Student {
        private int rollno;
        private String name;
        private String college = "BBDIT";

        //constructor to initialize the variable
        public Student(int r, String n) {
            rollno = r;
            name = n;
        }

        //static method to change the value of static variable
//       static void change(){
//            college = "CODEGYM";
//        }

        //method to display values
        public void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
        public void changeClass(String classes){
            this.college = classes;
        }
    }
