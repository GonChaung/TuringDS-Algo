package array;

public class BinarySearch extends Array implements Searchable {
    public BinarySearch(int[] items) {
        super(items);
    }

    @Override
    public int findItem(int value){
        int first = 0;
        int last = items.length - 1;

        while (first <= last){
            int middle = (first + last) / 2;
            if (this.items[middle] == value){
                return middle;
            } else if (this.items[middle] < value){
                first = middle + 1;
            } else last = middle - 1;
        }
        return -1;
    }
}
