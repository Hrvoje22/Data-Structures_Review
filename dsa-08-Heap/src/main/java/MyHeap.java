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

    public void insert(int value){
        if(size== items.length) throw new IllegalStateException(); //we cannot insert new element here
        else{
            items[size++]=value;
            bubbleUp();
        }

    }

    public void bubbleUp(){
        //calculate start index/point
        int index = size - 1;
        //while index > 0 && parent is less than child continue
        //1. swap child and parent
        //2. calculate next index = parent index
        while(index>0 && items[index]>items[parentIndex(index)]){
            //swap
            swap(index,parentIndex(index));
            //assign index with the parent index
            index = parentIndex(index); //like current=current.next
        }


    }

    public int parentIndex(int index){
        return (index-1)/2;
    }

    public void swap(int first, int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }


    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println();
    }

    public int remove(){
        if(size==0) throw new NoSuchElementException();
        else{
            int result = items[0];
            items[0] = items[--size];
            bubbleDown();
            return result;
        }
    }

    public void bubbleDown(){
        int index=0;
        int largerChildIndex;
        while(index <= size && !isValidParent(index)){
            largerChildIndex = largerChildIndex(index);
            swap(index,largerChildIndex);
            index = largerChildIndex;

        }
    }

    public boolean isValidParent(int index){
        if(!hasLeftChild(index)) return true;
        else{
            boolean isValid = false;
            if(hasRightChild(index)){
                isValid = (items[index]>=items[leftChildIndex(index)] && items[index]>=items[rightChildIndex(index)]);
            }
            return isValid;
        }
    }

    public boolean hasLeftChild(int index){
        return leftChildIndex(index) <= size;
    }

    public boolean hasRightChild(int index){
        return rightChildIndex(index) <= size;
    }

    public int leftChildIndex(int index){
        return index * 2 + 1;
    }

    public int rightChildIndex(int index){
        return index * 2 + 2;
    }

    public int largerChildIndex(int index){
        if(!hasLeftChild(index)) return index;
        else if(!hasRightChild(index)){
            return leftChildIndex(index);
        }
        return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
    }

}
