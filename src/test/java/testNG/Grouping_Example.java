package testNG;

import org.testng.annotations.Test;

public class Grouping_Example {
    @Test(groups = {"sanity"})
    void test1()
    {
        System.out.println("TEST 1");
    } @Test(groups = {"sanity"})
    void test2()
    {
        System.out.println("TEST 2");
    } @Test(groups = {"regression"})
    void test3()
    {
        System.out.println("TEST 3");
    } @Test(groups = {"regression"})
    void test4()
    {
        System.out.println("TEST 4");
    } @Test(groups = {"sanity", "regression"})
    void test5()
    {
        System.out.println("TEST 5");
    }
}
