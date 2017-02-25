public class BubbleSort {

    public void sortArray(int[] ar) {
        for (int i = ar.length-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i != ar.length-1) System.out.print(", ");
        }
    }
}
