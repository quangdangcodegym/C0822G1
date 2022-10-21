public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
        a.p(20);
    }
}
class A extends B {
    public void p(double number) {
        System.out.println(number);
    }
    public void p(int num){
        System.out.println(num);
    }
}

class B {
    public void p(double number) {
        System.out.println(number * 2);
    }
}
