package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class labAssessment {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
            driver.findElement(By.xpath("//button[@name='proceed']")).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());  //creating alert object
            String alertText1 = alert.getText();
            System.out.println("First Alert: " + alertText1);
            if (alertText1.equals("Please enter a valid user name")) {
                System.out.println("Alert1 Verification: Passed");
            } else {
                System.out.println("Alert1 Verification: Failed");
            }
            alert.accept();  //accepted
            driver.findElement(By.linkText("Forgot password?")).click();
            driver.findElement(By.xpath("//button[@name='next']")).click();
            String alertText2 = alert.getText();
            System.out.println("Second Alert: " + alertText2);
            if (alertText2.equals("Please enter your email ID")) {
                System.out.println("Alert2 : verification passed");
            } else {
                System.out.println("Alert2: verification failed");
            }
            alert.accept();
            driver.quit();
        }
}
