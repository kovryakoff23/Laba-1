
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    private static MyContainer<Integer> myContainer;

    @BeforeClass
    public static void before() {
        myContainer = new MyContainer<Integer>();
    }

    @Test
    public void checkAddAndGet() {
        int actual = 30;
        myContainer.add(actual);
        assertEquals((int) myContainer.get(0), actual);
    }

    @Test
    public void checkDelete() {
        myContainer.add(1);
        myContainer.add(2);
        myContainer.add(3);
        myContainer.delete();
        myContainer.get(0);
    }

    @Test
    public void checkSet(){
        myContainer.add(1);
        int actual = 50;
        myContainer.set(actual, 0);
        Assert.assertEquals((int)myContainer.get(0), actual);
    }
}
