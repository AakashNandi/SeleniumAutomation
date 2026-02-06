package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.indiatoday.in/");
//        Thread.sleep(3000);
//        ////a[@id='signIn_external']/span[2]
//        WebElement iframe1 = driver.findElement(By.xpath("//iframe[contains(@class,'election_stripe')]"));
//        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wt.until(ExpectedConditions.visibilityOf(iframe1));
//        driver.switchTo().frame(iframe1);
//        List<WebElement> logos = driver.findElements(By.xpath("//img[contains(@src,'lic_logo.gif')]"));
//        logos.get(0).click();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentWindow = driver.getWindowHandle();  //must store parent window to switch later

        driver.findElement(By.id("newTabsBtn")).click();

        Set<String> windows = driver.getWindowHandles();

        for (String w : windows){
            if(!w.equals(parentWindow)){
                driver.switchTo().window(w);
                Thread.sleep(5000);
                driver.switchTo().window(parentWindow);
                driver.close();
            }
        }
    }
}
