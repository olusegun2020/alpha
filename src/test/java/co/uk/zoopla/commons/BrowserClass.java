package co.uk.zoopla.commons;

import com.fasterxml.jackson.databind.Module;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserClass extends DriverClass
{
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }


    private WebDriver initHeadLess()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new ChromeDriver(options);

    }
private WebDriver initFirefox()
{
    WebDriverManager.firefoxdriver().setup();
    return  new FirefoxDriver();
}

private WebDriver initinternetexplorer()
    {
       WebDriverManager.iedriver().setup();
       return new InternetExplorerDriver();


    }



}

