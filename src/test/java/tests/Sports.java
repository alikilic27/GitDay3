package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Sports {

    @Test
    public void sport() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input")).isSelected());

        Random random = new Random();

        String[] sports = {"Basketball", "Baseball", "Football","Hockey","Soccer","Water Polo"};

        //"gwt-debug-cwRadioButton-sport-"+a+"-label"


        WebElement sport = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-"+sports[random.nextInt(sports.length)]+"-input"));

        sport.click();

        if(!sport.isSelected()){

            Assert.assertTrue(sport.isSelected());
        }
        driver.quit();

    }

}
