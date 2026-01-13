package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Automation01 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("java");

        Thread.sleep(2000);

        List<WebElement> items = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for(int i=0; i<items.size(); i++){
            if(items.get(i).getText().equalsIgnoreCase("java compiler")) {
                items.get(i).click();
                break;
            }
        }
        driver.close();

    }
}
