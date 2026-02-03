package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class Google {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver .get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele = driver.findElement(By.xpath("//textarea[@name='q']"));
        Objects.requireNonNull(wait.until(ExpectedConditions.visibilityOf(ele))).sendKeys("frescoapps", Keys.ENTER);;
        Thread.sleep(30000);
        WebElement ele2 = driver.findElement(By.xpath("//h3"));
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(ele2))).click();
        //ele2.click();

    }
}
