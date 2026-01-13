package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.By.className;

public class SmartBazaarAutomation {
    public static void main(String[] args) throws Exception{
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.smartbazaar.co.uk/");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            WebElement popup = driver.findElement(className("brave_popup__close__button"));
            popup.click();
            Thread.sleep(1000);

            Actions ac = new Actions(driver);
            WebElement drop = driver.findElement(By.xpath("//a[@class='account-icon dropdown-toggle']"));
            ac.moveToElement(drop);
            drop.click();
            int height=drop.getSize().getHeight();  //heightoftheelement
            ac.moveByOffset(0,height+5).click().perform();   //justbelowtheelement
            //WebElement s= driver.findElement(By.linkText("Login / Register"));
            //System.out.println(s.getText());

        }
}
