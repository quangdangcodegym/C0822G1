import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    private static void reverseArray() {
        int[] list = {3, 6, 7, 1, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
        }
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        int i= 0;
        while (!stack.isEmpty()) {
            list[i] = stack.pop();
            i++;
        }

        //System.out.println(Arrays.toString(list));
    }

    private static void convertHexToBinary() {
        int number = 17;
        Stack<Integer> stack = new Stack<>();
        do {
            int temp = number % 2;
            stack.push(temp);
            number = number / 2;
        } while (number!= 0);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
