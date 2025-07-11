package Peopleflow;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_miniProject extends CommonToAll {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://dev-app.Peopleflow.io/");

        if (driver.getPageSource().contains("Peopleflow Service")) {
            System.out.println("Testcase Passed!");
            Assert.assertTrue(true);
        } else {
            Assert.fail("Peopleflow The Most Efficient way to seamlessly Test workday with Speed and Accuracy");

        }

        closeBrowser(driver);


    }

}