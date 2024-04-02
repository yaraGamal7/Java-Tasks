import java.util.Arrays;
import java.util.Random;

class task2 {
    public static void main(String args[]) {
        int arr[];
        arr = new int[1000];

       
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rand_val = rand.nextInt(1000);
            arr[i] = rand_val;

        }

        Arrays.sort(arr);

        
        long startTime = System.nanoTime();

        int min = arr[0];
        int max = arr[arr.length - 1];

        
        long endTime = System.nanoTime();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

 
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }
}
