package Selenium;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class Selenium {
   @Test
   public void start() throws IOException {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");

       WebDriver cm = new ChromeDriver();

       cm.get("https://google.com");
       TakesScreenshot takesScreenshot=(TakesScreenshot) cm;
       File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
       File des=new File("src/test/java/StaticPrograms");
       FileUtils.copyFile(src,des);

/*
       cm.findElement(By.id("user-contact")).sendKeys("8722850530");
       cm.findElement(By.id("continue-btn")).click();
       cm.close();
/*cm.get("kibana0jupiter.internal.mum1-pp.zeta.in");
cm.findElement(By.className("euiIcon__fillSecondary")).click();
cm.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("app:inbox AND \"p:+918722850530\"");
cm.findElement(By.className("euiButton__text euiSuperUpdateButton__text")).click();*/

   }
    }

