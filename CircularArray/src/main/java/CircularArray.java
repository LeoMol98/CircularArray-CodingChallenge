import java.util.Arrays;
import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{

    public T[] arr;
    public int head;

    public CircularArray(){}

    public CircularArray(T[] arr){
        this.arr = arr;
    }

    public int arraySize(){
        return arr.length;
    }

    public T getIndex(Integer index){
        return arr[index];
    }

    public void incrementHead(){
        head = (head+1)%arr.length;
    }

    public void decreaseHead(){
        head--;
        if (head < 0){
            head = arr.length-1;
        }
    }

    public void rotateForward(int amount){

        for(int i = 0; i < amount; i++){
            incrementHead();
        }
    }
 public void rotateBackwards(int amount){

        for (int i = 0; i < amount; i++){

            decreaseHead();
        }

 }

 public void addIndex(T object){
        T[] newArr = (T[]) new Object[arr.length + 1];


     System.arraycopy(arr, 0, newArr, 0, arr.length);
     newArr[newArr.length-1] = object;

     arr = newArr;

 }
    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(arr).iterator();
    }
}
