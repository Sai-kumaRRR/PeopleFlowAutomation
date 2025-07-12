package Peopleflow;




import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_miniProject02 extends CommonToAll {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://dev-app.peopleflow.io/");

        if (driver.getPageSource().contains("The Most Efficient Way to Seamlessly Test Workday with Speed and Accuracy")) {
            System.out.println("Testcase Passed!");
            Assert.assertTrue(true);
        } else {
            Assert.fail("");

        }

        closeBrowser(driver);


    }

}



