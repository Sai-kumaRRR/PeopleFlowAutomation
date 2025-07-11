package Peopleflow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_TestNG_POI extends CommonToAll {


    @Test(dataProvider = "getData")
    public void test_Peopleflow_login(String email, String password) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://dev-app.peopleflow.io/");


        System.out.println(email + " - " + password);
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
