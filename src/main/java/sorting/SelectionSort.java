package sorting;

public class SelectionSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        for (int i=0; i < arr.length-1; i++){
            int midIndex = i;
            for (int j=i+1; j < arr.length; j++){
                if (arr[midIndex] > arr[j]){
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
    }
}
