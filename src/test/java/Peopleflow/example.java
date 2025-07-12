package Peopleflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

class Lab02_ActionClass01 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        String URL = "https://www.dev-app.peopleflow.io/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath(""));

        Actions actions = new Actions(driver);
        // move to Element
        // click
        // sendKeys

        actions.moveToElement(source).click().sendKeys("Create Position").build().perform();


    }
}
