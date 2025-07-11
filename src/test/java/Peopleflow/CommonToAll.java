
package Peopleflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class CommonToAll {

    public EdgeDriver driver;

    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }


    public void waitForVisibility(WebDriver driver, int timeInSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForTextToBePresent(WebDriver driver, int timeInSeconds,String xpath,String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));
    }




    @BeforeTest
    public void setUp(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }

    @AfterTest
    public void tearDown(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement email_input_box = driver.findElement(By.id("email"));
        email_input_box.sendKeys("lokendra@peopleflow.io");


        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password



        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345678");


        // 3. Find the submit button and click on it.


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


        driver.quit();




    }






}