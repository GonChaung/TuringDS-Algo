package Sorting;

import org.junit.jupiter.api.Test;
import sorting.SelectionSort;
import sorting.Sortable;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    Random random = new Random();
    int[] getRandomArray(int n, int range){
        int[] arr = new int[n];
        for (int i=0; i < arr.length; i++){
            arr [i] = random.nextInt(range);
        }
        return arr;
    }
    void print(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    boolean isArraySorted(int[] arr){
        for (int i=0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        } return true;
    }

    @Test
    public void selectionSortTest(){
        /*assertEquals(true,isArraySorted(new int[]{4,5,6}));*/
        int arr[] = getRandomArray(10,100);
        Sortable algo = new SelectionSort();
        algo.sort(arr);
    }

    @Test
    public void selectionSortTest1(){
        assertEquals(true,isArraySorted(new int[]{4,7,6}));
    }
}
