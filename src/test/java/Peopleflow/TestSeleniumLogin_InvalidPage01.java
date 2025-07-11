package Peopleflow;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumLogin_InvalidPage01 {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Sai")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_Peopleflow_login_invalid_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://dev-app.peopleflow.io/");

//        driver.manage().window().maximize();


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.


        WebElement email_input_box = driver.findElement(By.id("email"));
        email_input_box.sendKeys("admin@admin.com");


        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password



        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");


        // 3. Find the submit button and click on it.


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


        // Step 4 - Wait some time.
        Thread.sleep(3000);


        // Step 5 - Verify the message error message.

        WebElement error_message = driver.findElement(By.className("d-flex justify-content-between"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"These credentials do not match our records.");

        driver.quit();



    }

}










