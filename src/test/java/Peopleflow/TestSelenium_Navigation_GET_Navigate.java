package Peopleflow;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.URL;


public class TestSelenium_Navigation_GET_Navigate {


    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com"); // 95%

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL


        // Use navigation methods
        driver.navigate().to("https://dev-app.peopleflow.io/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();


driver.quit();
    }
}

