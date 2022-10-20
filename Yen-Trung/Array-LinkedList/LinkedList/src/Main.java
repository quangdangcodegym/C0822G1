public class Main {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(0);
        for(int i=1; i<10; i++){
            ll.add(i,i);
        }
        ll.add(15, 666);
//        ll.addFirst(11);
//        ll.addFirst(12);
//        ll.addFirst(13);

//        ll.add(4,9);
//        ll.add(4,910);
        ll.printList();
    }
}