public class SortJavaExample {
    public static void InterchangeSort(int[] arr){
        int temp,i,j;
        for (i=0;i<arr.length-1;i++){
            for (j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void BubbleSort(int[] arr){
        int temp,i,j;
        for (i=0;i<arr.length-1;i++){
            for (j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void SelectionSort(int[]arr){
        int temp,i,j,index;
        for (i=0;i<arr.length-1;i++){
            index=i;
            for (j=i+1;j<arr.length;j++){
                if (arr[j]<arr[index]){
                    index=j;
                }
            }
            temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }

}
