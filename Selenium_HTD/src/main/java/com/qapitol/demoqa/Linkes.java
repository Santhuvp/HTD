package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Linkes {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,350)","");
        String home = driver.getWindowHandle();
        driver.findElement(By.linkText("Home")).click();
        driver.switchTo().window(home);

        driver.findElement(By.id("dynamicLink")).click();
        driver.switchTo().window(home);

    }
}
