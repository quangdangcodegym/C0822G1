public class ComparatorInterchange {
    private int[] arr;
    private String[] arrStr;
    public ComparatorInterchange (int[] arr){
        this.arr = arr;
    }
    public ComparatorInterchange(String[] arrStr){
        this.arrStr = arrStr;
    }
    public void InterchangeSortInteger(){
        int temp,i,j;
        for (i=0;i<arr.length-1;i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void InterchangeSortString(){
        String temp;
        for(int i=0; i<arrStr.length-1; i++){
            for (int j=i+1;j<arrStr.length;j++){
                String[] arr1 = arrStr[i].split("");
                String[] arr2 = arrStr[j].split("");
                String[] arrFake= arr1;
                if(arr1.length > arr2.length){
                    arrFake = arr2;
                }
                for(int g=0; g<arrFake.length; g++){
                    if(arr1[g].codePointBefore(1) > arr2[g].codePointBefore(1)){
                        temp = arrStr[i];
                        arrStr[i]=arrStr[j];
                        arrStr[j]=temp;
                        break;
                    }
                    break;
                }
//                if(arrStr[j].codePointBefore(1) > arrStr[j+1].codePointBefore(1)){
//                    temp = arrStr[j];
//                    arrStr[j]=arrStr[j+1];
//                    arrStr[j+1]=temp;
//                }
            }
        }
    }
}
