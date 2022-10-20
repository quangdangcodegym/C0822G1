import java.util.Arrays;
import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkString = true;
        do {
            System.out.print("Nhap 1 string: ");
            String string = scanner.nextLine();
            String[] arrayString = string.split("");

            for(int i=0; i<arrayString.length; i++){
                if(arrayString[i].equals("") || arrayString[i].equals(" ")){
                    checkString = true;
                }else{
                    checkString = false;
                    break;
                }
            }
            if(checkString == false){
                boolean checkWord = true;
                do {
                    System.out.print("Nhap 1 ki tu: ");
                    String word = scanner.nextLine();
                    String[] stringWord = word.split("");
                    for(int i=0; i<stringWord.length; i++){
                        if (stringWord[i].equals("") || stringWord[i].equals(" ") || stringWord.length > 1) {
                            checkWord =true;
                        } else {
                            checkWord = false;
                            break;
                        }
                    }
                    if (checkWord == false) {
                        checkWord(string, word);
                    }
                } while (checkWord);
            }
        } while (checkString);
    }
    public static void checkWord(String string, String word){
        int count = 0;
        String[] stringArray = string.split("");
        for(int i=0; i< stringArray.length; i++){
            if(word.equals(stringArray[i])){
                count++;
            }
        }
        System.out.printf("%s is %s time in %s", word, count, string);
    }
}
