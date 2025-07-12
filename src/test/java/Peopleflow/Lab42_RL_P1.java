package Peopleflow;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class Lab42_RL_P1 extends CommonToAll {

    @Test
    public void test_selenium_exception() {
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box = driver.findElement(By.xpath("//input[@type='search']"));
        System.out.println(driver.getWindowHandle());


        search_input_box.sendKeys("PeopleFlow "+ Keys.ENTER);

    }

}