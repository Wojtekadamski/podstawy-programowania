import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MojaArrayLista<T> implements Iterable<T>{

    private T[] myStore;
    private int actSize = 0;

    public MojaArrayLista(int size){
        myStore = (T[]) new Object[size];
    }
    public MojaArrayLista(){
        myStore = (T[]) new Object[10];
    }

    public T get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(T obj){
        if(myStore.length-actSize <= 7){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }

    public void add(T[] collection){
        for(T elements: collection){
            add(elements);
        }

    }


    public T remove(int index){
        if(index < actSize){
            T obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int size(){
        return actSize;
    }

    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }


    public int length() {
        return myStore.length;
    }

    public void clear(){
        for (T element: myStore)
            element = null;
    }

    public int indexOf(T obj){
        for(int i=0;i<actSize;i++){
            if(myStore[i].equals(obj))
                return i;
        }
        return -1;
    }

    public void set(int index, T obj){
        if(index >= 0 && index<= actSize){
            myStore[index] = obj;
        }

    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < actSize && myStore[currentIndex] != null;
            }

            @Override
            public T next() {
                return myStore[currentIndex++];
            }

            public T previous(){
                return myStore[currentIndex--];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            public void first(){
                currentIndex=0;
            }

            public void last(){
                currentIndex=myStore.length;
            }

            public T current(){
                return myStore[currentIndex];
            }
        };
        return it;
    }
}