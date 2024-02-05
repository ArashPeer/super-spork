package testNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider_Example {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data =
                {
                        {"arashperzai@yahoo.com", "Gmail.1986"},
                        {"ali.p@yahoo.com", "Aliiii1990"},
                        {"jj@gmial.com", "ar12"}
                };
        return data;
    }

}
