package testNG;
import org.testng.annotations.*;


/*
All about testNG annotations
* */
public class TC_1 {
    @BeforeClass
    void beforeClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    void beforeMethod_setup() {
        System.out.println("Before Method setup");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After Method");
    }

    @Test
//based on this annotations testng will recognize this method as test method
    void test1() {
        System.out.println("THIS IS TEST 2");
    }

    @Test
    void test2() {

        System.out.println("THIS IS TEST 1");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("THIS WILL EXECUTE BEFORE TEST");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("THIS WILL EXECUTE AFTER TEST");
    }
}
