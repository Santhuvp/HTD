package com.qapitol.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        driver.findElement(By.id("firstName")).sendKeys("Zaheer");
        driver.findElement(By.id("lastName")).sendKeys("Khan");
        driver.findElement(By.id("userEmail")).sendKeys("zaheer@khan.com");
        List<WebElement> gender = driver.findElements(By.name("gender"));
        gender.get(1).click();
        driver.findElement(By.id("userNumber")).sendKeys("9009009009");
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("05 Aug 1987");
        driver.findElement(By.id("subjectsContainer")).sendKeys("History");
        List<WebElement> hobby = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement hb:hobby)
        {
            hb.click();
        }
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Qapitol QA\\Downloads\\sampleFile.jpeg");
        driver.findElement(By.id("currentAddress")).sendKeys("2675 Ralston Eve");
        driver.findElement(By.id("react-select-6-input")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("react-select-7-input")).click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("submit")).click();


    }
}
