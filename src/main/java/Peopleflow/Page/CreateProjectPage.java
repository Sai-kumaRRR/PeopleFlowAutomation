package Peopleflow.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProjectPage {
    WebDriver driver;

    public CreateProjectPage(WebDriver driver) {

        this.driver = driver;
    }

    public void generateTestCases(int count) {
        for (int i = 1; i <= count; i++) {
            driver.findElement(By.id("addTestCase")).click();
            driver.findElement(By.name("testCaseName")).sendKeys("Test Case " + i);
            driver.findElement(By.name("testCaseDesc")).sendKeys("Description for Test Case " + i);
            driver.findElement(By.id("saveTestCase")).click();
        }
    }

    public void createProject() {
        driver.findElement(By.id("createProjectButton")).click();
    }
}
