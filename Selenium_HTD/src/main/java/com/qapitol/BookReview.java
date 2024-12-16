package com.qapitol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BookReview {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://139.59.27.246:3000/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.id("userNameOrEmail")).sendKeys("RohitTest");
        driver.findElement(By.id("password")).sendKeys("Rohit@1234");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        //Select a particular book
        driver.findElement(By.xpath("//a[@aria-label='Page 2']")).click();
        driver.findElement(By.xpath("//strong[text()='The Theory of Everything']")).click();
        Select select=new Select(driver.findElement(By.id("rating")));
        select.selectByIndex(2);
        driver.findElement(By.id("reviewMessage")).sendKeys("Not bad but below Average");
        driver.findElement(By.id("Review")).click();
        String confirm = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        System.out.println(confirm);

    }
}
