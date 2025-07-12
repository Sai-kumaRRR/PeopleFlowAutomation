package Peopleflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;



public class Lab38_Windows_Part1 extends CommonToAll {

    @Test
    public void test_windows() {

        String URL = "https://dev-app.peopleflow.io/";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();


        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            driver.switchTo().window(parent);
        }





    }


}



