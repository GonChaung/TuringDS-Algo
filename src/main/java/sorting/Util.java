package sorting;

import java.util.Random;

public class Util {
    static Random random =new Random();
    static int[] getRandomArray(int n,int range)
    {
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range);
        }
        return arr;
    }
    public static void print(String message,int[]arr)
    {
        System.out.print(message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
        System.out.println("");
    }
    public static boolean isArraySorted(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
