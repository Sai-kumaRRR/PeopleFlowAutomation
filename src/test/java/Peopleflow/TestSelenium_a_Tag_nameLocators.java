package Peopleflow;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_a_Tag_nameLocators {

    @Description("Verify Peopleflow")
    @Test
    public void test_login_vwo() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://dev-app.peopleflow.io/");


//         Link Text - Full Text Match


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("btn btn-primary w-100"));

        a_tag_partial_match.click();

        driver.quit();


    }

}

