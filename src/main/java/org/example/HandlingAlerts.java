package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
         driver.manage().window().maximize();
         Thread.sleep(2000);

         WebElement click= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
         click.click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Thread.sleep(2000);

         WebElement click2= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
         click2.click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Thread.sleep(2000);
         click2.click();
         Thread.sleep(2000);
         driver.switchTo().alert().dismiss();
         Thread.sleep(2000);

         WebElement click3= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
         click3.click();
         Thread.sleep(2000);
         Alert alert = driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.sendKeys("Hello Dear");
         alert.accept();
         Thread.sleep(4000);
         click3.click();
         Thread.sleep(2000);
         alert.sendKeys("Hello Dear");
         alert.dismiss();
         Thread.sleep(4000);


         driver.quit();
    }
}
