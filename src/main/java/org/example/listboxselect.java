package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class listboxselect {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
        driver.manage().window().maximize();

        WebElement prefix = driver.findElement(By.id("prefix"));
        WebElement countryCode = driver.findElement(By.id("country_code"));

        Select pp = new Select(prefix);
        Select select = new Select(countryCode);

        // Select dropdowns properly
        pp.selectByVisibleText("Ms.");

        String type = "Current"; // matches the id
        List<WebElement> radios = driver.findElements(By.name("accounttype"));
        for (WebElement r : radios) {
            if (r.getAttribute("id").equalsIgnoreCase(type)) {
                System.out.println("ExceutedFinally");
                r.click();
                System.out.println("ExceutedFinally");
                break;
            }
        }


        select.selectByVisibleText("India (+91)");

        // Select radio button by value


        driver.quit();
    }
}
