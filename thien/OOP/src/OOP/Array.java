package OOP;

public class Array {
    private int[] arrNumber = new int[5];
    public Array(){
        randomNumber(arrNumber);
    }

    public int[] getArrNumber() {
        return arrNumber;
    }

    public void setArrNumber(int[] arrNumber) {
        this.arrNumber = arrNumber;
    }
    public void randomNumber(int[] arrNumber){
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = (int)Math.floor(Math.random()*(100 - 50 + 1) + 50);
        }
    }
    public void interchangeSort(){
        for (int i = 0; i < arrNumber.length - 1; i++) {
            for (int j = 1 + i; j < arrNumber.length; j++) {
                if (arrNumber[i] > arrNumber[j]){
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                }
            }
        }
    }
    public void bubbleSort(){
        // sau moi vong lap thi so lon nhat hoac be nhat (tuy theo dieu kien) se duoc xep vao cho
        for (int i = 0; i < arrNumber.length - 1; i++) {
            for (int j = 0; j < arrNumber.length - i - 1; j++) {
                if (arrNumber[j] < arrNumber[j + 1]){
                    int temp = arrNumber[j];
                    arrNumber[j] = arrNumber[j + 1];
                    arrNumber[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < arrNumber.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (arrNumber[j] < arrNumber[minIndex]) {
                    minIndex = j;
                }
                int temp = arrNumber[minIndex];
                arrNumber[minIndex] = arrNumber[i];
                arrNumber[i] = temp;
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int item : arrNumber) {
            str += item + " ";
        }
        return str;
    }
}
