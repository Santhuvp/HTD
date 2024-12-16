package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows
{
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)","");
        WebElement tab = driver.findElement(By.id("tabButton"));
        tab.click();
        Set<String> windowss = driver.getWindowHandles();
        for(String windows:windowss)
        {
            driver.switchTo().window(windows);
        }
    }
}
