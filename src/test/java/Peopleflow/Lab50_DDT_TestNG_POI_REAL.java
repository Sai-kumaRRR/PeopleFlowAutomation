package Peopleflow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab50_DDT_TestNG_POI_REAL extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email,String password) {

        driver.navigate().to("https://dev-app.peopleflow.io/");
        System.out.println(driver.getTitle());

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");



        // 1. Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys(email);


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys(password);


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");





    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"lokendra@peopleflow.io", " 12345678"},
                new Object[]{"lokendra@peopleflow.io", " 12345678"},
                new Object[]{"lokendra@peopleflow.io", " 123678"},
                new Object[]{"lokendra@peopleflow.io", " 12345678"},
                new Object[]{"dvjvj@peopleflow.io", " 12345678"},
                new Object[]{"lokenrcha@peopleflow.io", " 12345678"},
                new Object[]{"lokendra@peopleflow.io", " 12345678"},
                new Object[]{"suman@peopleflow.io", " 12345678"},

        };

    }
    }