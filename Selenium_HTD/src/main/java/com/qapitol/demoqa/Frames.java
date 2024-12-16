package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)","");
      //  js.executeScript("document.querySelectorAll('[id*=\"ad\"], [class*=\"ad\"], [id*=\"banner\"], [class*=\"banner\"], iframe, ins, .sponsored, .advertisement').forEach(el => el.style.display = 'none');","");
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());


    }
}
