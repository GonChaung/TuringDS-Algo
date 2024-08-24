package array;

public class Array {
    int size;
    protected int[] items;

    public Array(int arr[]) {
        this.items = arr;
    }

    Array(int size){
        this.items = new int[size];
    }

    void put(int index, int value) {
        this.items[index] = value;
    }

    int get(int index) {
        return this.items[index];
    }
}
