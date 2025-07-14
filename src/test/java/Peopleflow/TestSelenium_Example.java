package Peopleflow;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_Example extends CommonToAll {


    @Description("Verify Peopleflow opens with home page")
    @Test
    public void test () {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://dev-app.peopleflow.io/");
        System.out.println(driver.getTitle());


        WebElement email_input_box = driver.findElement(By.id("email"));
        email_input_box.sendKeys("lokendra@peopleflow.io");



        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345678");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();



        WebElement homeButton = driver.findElement((By.className("feather feather-home")));
        homeButton.click();







    }
}
