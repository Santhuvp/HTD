package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)","");
        driver.switchTo().frame("frame1");

        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
        System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
        driver.switchTo().defaultContent();
    }
}
