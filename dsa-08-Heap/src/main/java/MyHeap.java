import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    //return the value
    public int peek(){
        if(size==0) throw new NoSuchElementException();
        return items[0]; //root value

    }

}
