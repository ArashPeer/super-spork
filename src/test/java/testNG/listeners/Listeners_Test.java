package testNG.listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNG.listeners.Custom_Listeners.class)//if you want to integrate with xml file, then this Listener annotation is not required
public class Listeners_Test {
    @Test
    void test1()
    {
        System.out.println("Test 1");
        Assert.assertEquals("A", "A");
    }
    @Test
    void test2()
    {
        System.out.println("Test 2");
        Assert.assertEquals("A", "A");
    }
    @Test
    void test3()
    {
        System.out.println("Test 3");
        throw new SkipException("This is skip exception");

    }
}
