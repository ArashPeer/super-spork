package testNG;

import org.testng.annotations.Test;

public class Priority_Example {
    @Test(priority = 0)
    void TestOne()
    {
        System.out.println("THIS IS TEST 1");
    }
    @Test(priority = 1)
    void TestTow()
    {
        System.out.println("THIS IS TEST 2");
    }
    @Test(priority = 2)
    void TestThree()
    {
        System.out.println("THIS IS TEST 3");
    }
    //how to disable a method from execution as follows
    @Test(priority = 3, enabled = false)
    void TestFour()
    {
        System.out.println("THIS IS TEST 4");
    }
}
