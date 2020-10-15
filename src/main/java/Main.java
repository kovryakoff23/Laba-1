import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(@NotNull String[] args){
        MyContainer<Integer> myContainer = new MyContainer<Integer>();
        myContainer.add(1);
        myContainer.add(2);
        myContainer.add(3);
        myContainer.add(4);
        myContainer.add(5);
        System.out.println("myContainer[" + 3 + "] = " + myContainer.get(3));
        myContainer.set(23, 3);
        System.out.println("myContainer[" + 3 + "] = " + myContainer.get(3));
        String toString = myContainer.toString();
        System.out.println(toString);
        myContainer.delete();
    }
}
