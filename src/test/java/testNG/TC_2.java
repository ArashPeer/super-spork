package testNG;

import org.testng.annotations.*;

public class TC_2 {

//@Test(priority = 1)
//    void setup()
//{
//    System.out.println("This is setup test");
//}
//    @Test(priority = 3) //based on this annotations testng will recognize this method as test method
//    void searchCustomer()
//    {
//
//        System.out.println("This is search customer Test");
//    }
//    @Test(priority = 2)
//    void addCustomer()
//    {
//        System.out.println("This is add customer test test");
//    }
//    @Test(priority = 4)
//    void teardown()
//    {
//        System.out.println("closing the browser");
//    }

    @BeforeClass
    void beforeClass (){
        System.out.println("This will be executed before the class".toUpperCase());
    }
    @AfterClass
    void afterClass(){
        System.out.println("This will be executed after the class".toUpperCase());
    }
    @BeforeMethod
    void beforeMethod_setup()
    {
        System.out.println("THIS WILL BE EXECUTE BEFORE METHOD");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("THIS WILL BE EXECUTED AFTER METHOD");
    }

    @Test
    void test3()
    {
        System.out.println("THIS IS TEST 3");
    }
    @Test
    void test4 ()
    {
        System.out.println("THIS IS TEST 4");
    }
    @BeforeSuite
    void beforeSuit()
    {
        System.out.println("THIS WILL EXECUTE BEFORE SUIT");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("THIS WILL EXECUTE AFTER SUIT");
    }
}
