package OOP;


import java.io.IOException;

public class ExceptionTest {
    public static void tryCatchTest() {
        try {
            int[] arr = new int[]{25, 54, 13, 68, 47};
            System.out.println(arr[100]);
        } catch (Exception e) {
            System.err.println("Test again!");
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Cannot access this page!");
        } else {
            throw new ArithmeticException("Nice!");
        }
    }
    public void test() throws IOException {
        throw new IOException("Device error!");
    }
}
