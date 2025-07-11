package Peopleflow;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_commands {

    @Test
    public void test_Method(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://dev-app.peopleflow.io/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        driver.quit();

    }
}



