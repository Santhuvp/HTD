package com.qapitol;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FetchnameOfAllBooks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://139.59.27.246:3000/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.id("userNameOrEmail")).sendKeys("RohitTest");
        driver.findElement(By.id("password")).sendKeys("Rohit@1234");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();


        //Fetching all the Books details.
       /* List<WebElement> bookNames= driver.findElements(By.xpath("//strong"));


       for(WebElement bname:bookNames)
       {
           System.out.println(bname.getText());
       }


        WebElement scroll = driver.findElement(By.xpath("//a[@aria-label='Page 2']"));
        scroll.click();


        List<WebElement> book2 = driver.findElements(By.xpath("//strong"));
        for(WebElement bname2:book2)
        {
            System.out.println(bname2.getText());
        }

        WebElement scroll2 = driver.findElement(By.xpath("//a[text()='3']"));
        scroll2.click();


        List<WebElement> book3 = driver.findElements(By.xpath("//strong"));
        for(WebElement bname3:book3)
        {
            System.out.println(bname3.getText());
        }
        WebElement scroll3= driver.findElement(By.xpath("//a[text()='4']"));
        scroll3.click();


        List<WebElement> book4 = driver.findElements(By.xpath("//strong"));
        for(WebElement bname4:book4)
        {
            System.out.println(bname4.getText());
        } */

        driver.findElement(By.xpath("//strong[text()='Modern Indian Literature: Poems and Short Stories']")).click();
        driver.findElement(By.xpath("//div[text()='Add to Cart']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed To Checkout']")).click();
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed to Payment']")).click();
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed to PlaceOrder']")).click();
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

    }

}


