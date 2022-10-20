import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean checkContinue = true;
        String mainName = "";
        String mainClasses = "";
        Scanner scanner = new Scanner(System.in);
        boolean empty = true;
        do {
            do {
                System.out.print("Nhap name: ");
                String name = scanner.nextLine();
                name = name.trim();
                if(name.equals("")){
                    empty = true;
                }else{
                    mainName = name;
                    empty = false;
                }
            } while (empty);
            empty = true;
            do {
                System.out.print("Nhap class: ");
                String classes = scanner.nextLine();
                classes = classes.trim();
                if(classes.equals("")){
                    empty = true;
                }else{
                    mainClasses = classes;
                    empty = false;
                }
            } while (empty);
            System.out.printf("Name : %s - Class: %s\n", mainName, mainClasses);

            Student student = new Student(mainName, mainClasses);
            System.out.println(student.getName() + "-" + student.getClasses());

            System.out.println("Nhap tiep nua ko? Y/N");
            String checkYesNo = scanner.nextLine();
            switch (checkYesNo){
                case "Y":{
                    checkContinue = true;
                    break;
                }
                case "N":{
                    checkContinue = false;
                    break;
                }
            }
        } while (checkContinue);
    }
}
