package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class Automation2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.goibibo.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement click= driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
        click.click();

        Thread.sleep(1000);

        WebElement click2= driver.findElement(By.xpath("//*[@id='root']/div[2]/p"));
        click2.click();

        Thread.sleep(1000);

        

        WebElement area_from= driver.findElement(By.xpath("//input[@id='fromCity']"));
        area_from.click();

        Thread.sleep(1000);
        WebElement feed_from= driver.findElement(By.xpath("//input[@placeholder='From']"));
        feed_from.sendKeys("India");

        Thread.sleep(1000);

        List<WebElement> items_from = driver.findElements(By.xpath("//span[@class='revampedIataText']"));
        for(int i=0; i<items_from.size(); i++){
            if(items_from.get(i).getText().equals("CCU")) {
                items_from.get(i).click();
                break;
            }
        }

        Thread.sleep(1000);

        WebElement area_to= driver.findElement(By.xpath("//input[@id='toCity']"));
        area_to.click();

        Thread.sleep(1000);
        WebElement feed_to= driver.findElement(By.xpath("//input[@placeholder='To']"));
        feed_to.sendKeys("India");

        Thread.sleep(1000);

        List<WebElement> items_to = driver.findElements(By.xpath("//span[@class='revampedIataText']"));
        for(int i=0; i<items_to.size(); i++){
            if(items_to.get(i).getText().equals("DEL")) {
                items_to.get(i).click();
                break;
            }
        }

        WebElement Cal_div= driver.findElement(By.xpath("//div[@class='DayPicker-Months']"));

        Thread.sleep(4000);
        driver.close();

    }
}
