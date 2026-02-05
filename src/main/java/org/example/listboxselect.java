package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class listboxselect {
    public static void main(String[] args) throws Exception {
        // Initialize WebDriver and navigate to the page
        WebDriver driver = new ChromeDriver();
        driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
        driver.manage().window().maximize();

        // Locate the listbox (dropdown) element
        WebElement listbox = driver.findElement(By.id("country_code"));

        // Scroll to the listbox
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", listbox);

        // Initialize Select to interact with the dropdown
        Select select = new Select(listbox);

        // Use a simple int to count occurrences
        int f = 0;
        String search = "India (+91)";

        // Iterate over options and check for matching text
        List<WebElement> wB = select.getOptions();
        for (WebElement option : wB) {
            if (option.getText().equals(search)) {
                f++;
            }
        }

        // Check if any match was found
        if (f == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }

        // Quit the driver after the operation
        driver.quit();
    }
}
