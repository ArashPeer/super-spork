package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider_Example.class)
    public void loginTest(String email, String pwd)
    {
        System.out.println(email+ " " +pwd.toUpperCase());

    }

//    @DataProvider(name = "newLoginData")
//    public Object[][] getNewData() {
//        Object[][] newData =
//                {
//                        {"dummy@gmail.com", "ar1988"},
//                        {"arash@yahoo.com", "ahah19"},
//                        {"this@yahoo.com", "dishing"}
//                };
//        return newData;
//
//    }

}
