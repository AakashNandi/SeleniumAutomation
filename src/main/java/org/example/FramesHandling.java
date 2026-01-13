package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FramesHandling {
    public static void main (String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/selenium/deprecated.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement frame = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
        driver.switchTo().frame(frame);
        System.out.println("Switched");
        Thread.sleep(1000);
        List<WebElement> li = driver.findElements(By.xpath("//ul[@title='Packages']/li/a"));
        for(WebElement l:  li){
            WebElement wb = driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/condition/package-frame.html']"));
            if(l.equals(wb)){
                wb.click();
                wb.click();
                Thread.sleep(1000);
                System.out.println(wb.getText());
                break;
            }
        }
        driver.close();
    }
}
