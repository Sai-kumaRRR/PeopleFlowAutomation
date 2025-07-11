package Peopleflow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

class Lab02_ActionClass {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        String URL = "https://dev-app.peopleflow.io/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement email_input_box = driver.findElement(By.id("email"));
        email_input_box.sendKeys("lokendra@peopleflow.io");


        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password input box and enter the password



        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345678");


        // 3. Find the submit button and click on it.


        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement source = driver.findElement(By.xpath("//span[@data-cy=\"menu-title text-truncate\"]"));

        Actions actions = new Actions(driver);
        // move to Element
        // click
        // sendKeys

        actions.moveToElement(source).click().sendKeys("Create Position").build().perform();






    }
}

