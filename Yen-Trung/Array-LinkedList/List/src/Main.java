import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        for(int i=0; i<11; i++){
            list.push(i);
        }
        for(int i=0; i< list.size(); i++){
            System.out.printf(list.get(i) + ", ");
        }
        System.out.println("");
        System.out.println("Index of " + list.indexOf(188));
//        list.remove(3);
//        System.out.println("");
//        list.add(2,100);
//        for(int i=0; i<list.size; i++){
//            System.out.println("VVV"+list.get(i) + ", ");
//        }

    }

}