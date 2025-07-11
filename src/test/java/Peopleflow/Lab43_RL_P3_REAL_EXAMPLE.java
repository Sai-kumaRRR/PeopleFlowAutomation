package Peopleflow;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


import java.util.List;

public class Lab43_RL_P3_REAL_EXAMPLE extends CommonToAll {
    @Test
    public void test_js() {
        driver.get("https://dev-app.peopleflow.io/dashboard");
        driver.manage().window().maximize();


        WebElement email_input_box = driver.findElement(By.id("email"));
        email_input_box.sendKeys("lokendra@peopleflow.io");


        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password



        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345678");


        // 3. Find the submit button and click on it.


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys("Create Position" + Keys.ENTER);



        }








    }

