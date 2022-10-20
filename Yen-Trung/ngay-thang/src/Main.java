import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outPutDate;
        System.out.println("Month input: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                outPutDate = "31";
                break;
            case 2:
                outPutDate = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                outPutDate = "30";
                break;
            default: {
                outPutDate = "";
            }
        }
        if(outPutDate != "") {
            System.out.printf("Tháng %s có %s ngày", month, outPutDate);
        }else{
            System.out.println("Tháng không hợp lệ");
        }
    }

}