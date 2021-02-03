package com.transmuda.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestBrowser {
    public TestBrowser(String browserName, String testingUrl) {
    }

    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                ;
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
