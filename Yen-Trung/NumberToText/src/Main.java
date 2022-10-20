import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");

        int number = scanner.nextInt();
        String text;

        String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] arrayTeen = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"};
        String[] array20 = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eightty", "ninety"};

        if(number <=0 || number >= 1000){
            System.out.println("Dau vao khong hop le");
            return;
        }
        if(number % 100 == 0){
            int hundress = number / 100;
            System.out.printf(array[hundress-1] + "hundress");
        }else if(number % 100 > 0){
            if(number / 100 >= 1){
                int hundres = number / 100;
                String textHundres = array[hundres-1] + "hundress";
                int soDu = number % (hundres*100);
                String textTeens = "";
                if(soDu <= 10){
                    textTeens = array[soDu-1];
                }else if(soDu > 10 && soDu < 20){
                    int teen = soDu / 10;
                    textTeens = arrayTeen[teen-1];
                }else if(soDu >= 20){
                    int teen = soDu / 10;
                    int soDuTeen = soDu % 10;
                    if(soDuTeen == 0){
                        textTeens = array20[teen-2];
                    }else{
                        textTeens = array20[teen-2] + " " + array[soDuTeen-1];
                    }
                }
                System.out.printf("%s and %s", textHundres, textTeens);
                return;
            }
        }
        if(number >= 20){
            int teens = number / 10;
            int soDu = number % 10;
            if(soDu == 0){
                System.out.printf(array20[teens-2]);
            }else{
                System.out.printf(array20[teens-2] + array[soDu-1]);
            }
            return;
        }
        if(number > 10 && number < 20){
            System.out.printf(arrayTeen[number-11]);
            return;
        }
        if(number <= 10){
            System.out.printf(array[number-1]);
        }
    }
}