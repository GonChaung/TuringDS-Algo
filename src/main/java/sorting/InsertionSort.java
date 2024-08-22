package sorting;

public class InsertionSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int j = i;
            while ( j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            Util.print(" Iteration " + i + " = ", arr);
        }
    }
}
