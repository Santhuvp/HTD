package com.qapitol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookstore {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://139.59.27.246:3000/register");
        driver.findElement(By.id("userName")).sendKeys("RohitTest");
        driver.findElement(By.id("firstName")).sendKeys("Rohit");
        driver.findElement(By.id("email")).sendKeys("rohit5511@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Rohit@1234");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Rohit@1234");
        driver.findElement(By.xpath("//button[text()='Register']")).click();
    }
}
