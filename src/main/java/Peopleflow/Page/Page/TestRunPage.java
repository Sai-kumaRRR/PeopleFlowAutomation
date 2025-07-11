package Peopleflow.Page.Page;

import org.openqa.selenium.*;

public class TestRunPage {
    WebDriver driver;

    public TestRunPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToTestRun() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("Test Run")).click();
    }

    public void searchCreatePosition() {
        driver.findElement(By.id("searchBox")).sendKeys("Create Position");
    }

    public void selectTenant(String tenantName) {
        driver.findElement(By.xpath("//select[@id='tenant']")).sendKeys(tenantName);
    }
}

