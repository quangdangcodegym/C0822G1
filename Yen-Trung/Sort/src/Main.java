public class Main {
    public static void main(String [] args) {
//        int []  arr1 = {1,5,2,7,4,9,3};
//        SortJavaExample.SelectionSort(arr1);
//        for (int i:arr1){
//            System.out.printf(String.valueOf(i));
//        }
//        int[] arr = {9,10,20,3,5};
//        ComparatorBubble comparatorBubble = new ComparatorBubble(arr);
//        comparatorBubble.BubbleSortInteger();
//        for(int i:arr){
//            System.out.println(i);
//        }
//        String[] arr = {"nghia","nguyen","yen","anh","trinh","bao", "ngu"};
        int[] arr = {2,2,6,1,7,5,8};
        ComparatorInterchange comparatorInterchange = new ComparatorInterchange(arr);
        comparatorInterchange.InterchangeSortInteger();
        for(int i:arr){
            System.out.println(i);
        }
    }
}