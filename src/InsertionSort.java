public class InsertionSort {

    public void sortArray(int[] ar){
        int j;
        for (int i = 1; i < ar.length; i++) { //foreach
            int temp = ar[i];
            for (j = i-1; j >= 0 && ar[j] < temp; j--) {
                ar[j+1] = ar[j];
            }
            ar[j+1] = temp;
        }
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i != ar.length-1) System.out.print(", ");
        }
    }
}
