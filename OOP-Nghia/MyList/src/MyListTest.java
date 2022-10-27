public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        System.out.println(listInteger.get(2));
    }
}
