package array;

public class SortedLinearSearch extends Array implements Searchable {

    public SortedLinearSearch(int[] items) {
        super(items);
    }

    @Override
    public int findItem(int item) {
        int index = 0;
        int length = this.items.length;
        while ( index < length && items[index] < item){
            index ++;
        }
        if(index >= length && items[index] != item){
            return -1;
        }
        return index;
    }
}
