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

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>

//         Link Text - Full Text Match
        //     WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
//         If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free trial"}
        //      a_tag_free_trail_full_match.click();

//        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
//        a_tag_free_trial_full_match.click();


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("btn btn-primary w-100"));
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...

        a_tag_partial_match.click();

        driver.quit();


    }

}

