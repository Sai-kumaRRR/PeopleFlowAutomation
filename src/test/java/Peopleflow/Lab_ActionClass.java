package Peopleflow;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_ActionClass {


    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        String URL = "https://dev-app.peopleflow.io/";
        driver.get(URL);
        driver.manage().window().maximize();




        // Keys - Action classes
        WebElement firstName = driver.findElement(By.id("searchInput"));


        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName,"Create Position")
                .keyUp(Keys.SHIFT).build().perform();




    }


}