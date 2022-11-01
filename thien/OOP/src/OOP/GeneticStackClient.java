package OOP;

public class GeneticStackClient {
    private static void stackOfString(){
        MyGenericStack<String> stackString = new MyGenericStack<>();
        stackString.push("ten");
        stackString.push("one");
        stackString.push("seven");
        stackString.push("eight");
        stackString.push("three");
        System.out.println("1.1 Size of stack after push operations: " + stackString.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stackString.isEmpty()){
            System.out.printf("%s ", stackString.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operators: " + stackString.size());
    }private static void stackOfInteger(){
        MyGenericStack<Integer> stackInteger = new MyGenericStack<Integer>();
        stackInteger.push(11);
        stackInteger.push(25);
        stackInteger.push(81);
        stackInteger.push(97);
        stackInteger.push(3);
        System.out.println("2.1 size of stack after push number" + stackInteger.size());
        System.out.println("2.2 pop number from stack: ");
        while(!stackInteger.isEmpty()){
            System.out.printf("%s ", stackInteger.pop());
        }
        System.out.println("\n2.3 size of stack after pop number" + stackInteger.size());
    }

    public static void main(String[] args) {
        System.out.println("1. stack String");
        stackOfString();
        System.out.println("2. stack Integer");
        stackOfInteger();
    }
}
