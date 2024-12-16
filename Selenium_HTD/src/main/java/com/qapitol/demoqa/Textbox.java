package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Textbox {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelectorAll('[id*=\"ad\"], [class*=\"ad\"], [id*=\"banner\"], [class*=\"banner\"], iframe, ins, .sponsored, .advertisement').forEach(el => el.style.display = 'none');","");

//        driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//       js.executeScript("window.scrollBy(0,600)", "");
//        driver.findElement(By.id("userEmail")).sendKeys("sam@gmail.com");
//        driver.findElement(By.id("permanentAddress")).sendKeys("Bengaluru");
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        //Checkbox
//        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//        js.executeScript("window.scrollBy(0,250)", "");
//        driver.findElement(By.className("rct-checkbox")).click();

        //Radio button
//        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//        js.executeScript("window.scrollBy(0,250)", "");
//         List<WebElement> radiobtn = driver.findElements(By.className("custom-control-label"));
//         radiobtn.get(1).click();

        //Buttons
//        js.executeScript("window.scrollBy(0,500)", "");
//        driver.findElement(By.xpath("//span[text()='Buttons']")).click();
//        WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
//        js.executeScript("arguments[0].scrollIntoView();",click);
//        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
//        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
//
//
//        Actions actions=new Actions(driver);
//        actions.doubleClick(doubleclick).perform();
//        actions.contextClick(rightclick).perform();
//        actions.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();

//        js.executeScript("window.scrollBy(0,500)", "");
//       driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
//
//        List<WebElement> data = driver.findElements(By.className("rt-td"));
//        for(WebElement details:data)
//        {
//            System.out.print(details.getText()+ " ");
//            System.out.println();
//        }

//        js.executeScript("window.scrollBy(0,500)", "");
//        driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
//        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Qapitol QA\\Downloads\\welcome.txt");
//        driver.findElement(By.id("downloadButton")).click();








    }
}
