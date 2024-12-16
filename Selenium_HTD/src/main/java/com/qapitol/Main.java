package com.qapitol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();//maximize the window
        // driver.get("https://www.facebook.com/login");
        /*driver.findElement(By.id("email")).sendKeys("8892961664");
        driver.findElement(By.id("pass")).sendKeys("Sam@1234");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("login")).click();
//        Thread.sleep(1500);
//        driver.quit(); */
        driver.get("https://www.facebook.com/r.php");
        driver.findElement(By.name("firstname")).sendKeys("Ram");
        driver.findElement(By.name("lastname")).sendKeys("Maranahalli");
        Select select =new Select(driver.findElement(By.id("day")));
        select.selectByValue("5");
        Select select1 =new Select(driver.findElement(By.id("month")));
        select1.selectByVisibleText("Feb");
        Select select2 =new Select(driver.findElement(By.id("year")));
        select2.selectByVisibleText("2003");
        List<WebElement> gender = driver.findElements(By.xpath("//input[@type='radio']"));
         gender.get(1).click();
         driver.findElement(By.name("reg_email__")).sendKeys("samanderson1257@gmail.com");
         driver.findElement(By.name("reg_passwd__")).sendKeys("Sam@1234");
         driver.findElement(By.xpath("//button[text()='Sign Up']")).click();



    }
}