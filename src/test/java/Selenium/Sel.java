package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.plugin.PluginURLJarFileCallBack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Sel {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://payzapp-helpcenter0hercules.mum1-pp.zetaapps.in/#/");
        //driver.get("https://www.google.com/search?q=google&rlz=1C1OPNX_enIN931IN931&oq=go&aqs=chrome.0.69i59j46i131i199i433i465i512j69i59j69i57j0i131i433i512j69i60l3.3951j0j7&sourceid=chrome&ie=UTF-8");

    }

    @Test
    public void Step1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       // Thread.sleep(5000);
        //Verify the title of the page
        String Title = driver.getTitle();
        System.out.println(Title);
        Assert.assertEquals(Title, "Zeta Single Sign-on");

        //Verify the Heading of the page
        String text = driver.findElement(By.xpath("//span[@class='branding-content']")).getText();
        Assert.assertEquals(text, "| Help Center");
        System.out.println(text);
        //verify the text "Please enter your registered PayZapp number"
        if (driver.getPageSource().contains("Please enter your registered PayZapp number"))
            System.out.println("Text is present");
        else
            System.out.println("Text is absent");

        WebElement TextBox=driver.findElement(By.xpath("//input[@id='user-contact']"));
        TextBox.click();
        WebElement countryCode = driver.findElement(By.xpath("//p[@class='country-code show']"));
        countryCode.isDisplayed();
        WebElement PlaceHolder=driver.findElement(By.xpath("//span[@id='sticky-label']"));
        PlaceHolder.isDisplayed();
        WebElement ContinueButton=driver.findElement(By.xpath("//button[@class='button']"));
        boolean EnabledStatus=ContinueButton.isEnabled();
        System.out.println(EnabledStatus);
        Assert.assertEquals(EnabledStatus,false);
        WebElement i = driver.findElement
                (By.xpath("//img[@class='branding-image']"));
        // Javascript executor to check image
        Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

        //verify if status is true
        if (p) {
            System.out.println("Logo present");
        } else {
            System.out.println("Logo not present");
        }
        boolean D=i.isDisplayed();
        System.out.println(D);
        Assert.assertEquals(D,true);

        TextBox.sendKeys("8722");
        System.out.println(EnabledStatus);
        Assert.assertEquals(EnabledStatus,false);
        Thread.sleep(2000);
        TextBox.sendKeys("8722850530");
        System.out.println(EnabledStatus);
        WebElement Button=driver.findElement(By.xpath("//button[@class='button']"));
        boolean b=Button.isEnabled();
        System.out.println(b);
        Assert.assertEquals(b,true);
        Button.click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank');");
       Thread.sleep(2000);
       ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tab1.get(1));
       Thread.sleep(2000);
       driver.get("http://akhq-appinfra.internal.mum1-pp.zetaapps.in/preprod-olympusworld/topic/_tenant_1000140_identity?sort=NEWEST");
       driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
       driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("8722850530");
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//tr[@class='fade-in']")).click();
        Thread.sleep(5000);
       driver.quit();
    }
}
