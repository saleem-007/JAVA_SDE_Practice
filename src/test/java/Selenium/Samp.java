package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;

import java.util.List;

public class Samp {
    @BeforeMethod
    public void name(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://payzapp-helpcenter0hercules.mum1-pp.zetaapps.in/#/");
        By by=By.tagName("");
       WebElement element=driver.findElement(by);


    }
}
