package com.qapitol.demoqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class popups {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelectorAll('[id*=\"ad\"], [class*=\"ad\"], [id*=\"banner\"], [class*=\"banner\"], iframe, ins, .sponsored, .advertisement').forEach(el => el.style.display = 'none');","");
        js.executeScript("window.scrollBy(0,300)","");
       // driver.findElement(By.xpath("//span[text()='Alerts, Frame & Windows']")).click();
        // driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//        driver.findElement(By.id("alertButton")).click();
//        driver.switchTo().alert().accept();

//

//        driver.findElement(By.id("confirmButton")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promtButton")).click();
        Alert add = driver.switchTo().alert();
        add.sendKeys("Sam");
        add.accept();
    }
}
