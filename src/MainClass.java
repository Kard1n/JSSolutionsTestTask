import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
//test
public class MainClass {

    public static void main(String[] args) {
        int array[];
        int arraySize = 0;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size: ");
        try {
            arraySize = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
            if(max < array[i]) max = array[i];
        }

        System.out.println("Main Array: \nMin element is "+min+" Max element is "+max);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1) System.out.print(", ");
        }

        System.out.println("\nBubble Sort:");
        new BubbleSort().sortArray(array);

        System.out.println("\nInsertion Sort:");
        new InsertionSort().sortArray(array);

    }
}
