import java.io.IOException;

public class MyContainer <T> {
    private T[] myList;
    private int size;
    public MyContainer ()
    {
        size = 0;
    }
    public MyContainer (int size)
    {
        this.size = size;
        T[] myMewList = (T[]) new Object [size];
    }
    private void createNewList (int newSize){
        T[] myNewList = (T[]) new Object [newSize];
        for (int i = 0; i<size; i++)
        {
            myNewList [i] = myList[i];
        }
        size = myNewList.length;
        myList = myNewList;
    }
    public void set (T newElement, int index){
        myList[index] = newElement;
    }
    public T get (int index) {
        T getEl = null;
        try {
            getEl = myList[index];
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return getEl;
    }
    public void delete (){
        size = 0;
        myList = null;
    }
    public void add(T newElement){
        createNewList(size + 1);
        myList[size - 1] = newElement;
    }
    public String toString (){
        String s = "";
        for (int i = 0; i<size; i++){
            s = s + myList[i] + " ";
        }
        return s;
    }
}
