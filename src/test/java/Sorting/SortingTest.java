package Sorting;

import org.junit.jupiter.api.Test;
import sorting.BubbleSort;
import sorting.SelectionSort;
import sorting.Sortable;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingTest {
    Sortable algo;
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
        int[] arr = getRandomArray(10,100);
        algo = new SelectionSort();
        algo.sort(arr);
    }

    @Test
    public void selectionSortTest1(){
        assertTrue(isArraySorted(new int[]{4, 5, 6}));
    }

    @Test
    public void bubbleSortTest(){
        int[] arr = getRandomArray(10,1000);
        algo = new BubbleSort();
        algo.sort(arr);
        assertTrue(isArraySorted(arr));
    }


}
