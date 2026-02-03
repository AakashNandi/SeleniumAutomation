package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class Practice {
    public static void main(String [] args) throws Exception{

        //Verifying Site Opening
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com");
//        String title = driver.getTitle();
//        if(title.equals("Google")){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Try Unlimited");
//        }
//        String url = driver.getCurrentUrl();
//        if(url.contains("google.com")){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Try Unlimited");
//        }
//        driver.close();

        //Choosing Browser
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type Browser Name");
//        String browser = sc.next();
//        WebDriver driver = null;
//        if(browser.equalsIgnoreCase("Chrome")){
//            driver = new ChromeDriver();
//            System.out.println("Chrome");
//        } else if (browser.equalsIgnoreCase("FireFox")){
//            driver = new FirefoxDriver();
//            System.out.println("FireFox");
//        } else if (browser.equalsIgnoreCase("Edge")) {
//            driver = new EdgeDriver();
//            System.out.println("MicrosoftEdge");
//        }else{
//            System.out.println("Select a valid driver");
//        }
//        driver.get("https://www.google.com");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close();

        //Login Operation
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.nextgenerationautomation.com/");
        driver.manage().window().maximize();

// Click Login ONCE and wait
        WebElement login = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Log In')]"))
        );
        login.click();
//        login.click();
//        login.click();

// Now wait for First Name field to appear
        WebElement f_name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='First Name']")
                )
        );
        f_name.sendKeys("Aakash");

        WebElement l_name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Last Name']")
                )
        );
        l_name.sendKeys("Nandi");
       WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
       wait.until(ExpectedConditions.elementToBeClickable(email));
       email.sendKeys("aakash.nandi@gmail.com");
       WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
       wait.until(ExpectedConditions.elementToBeClickable(pass));
       pass.sendKeys("Password@123");
       WebElement no = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));
       wait.until(ExpectedConditions.elementToBeClickable(no));
       no.sendKeys("9988776655");
       WebElement city = driver.findElement(By.xpath("//input[@placeholder='Enter Work City']"));
       wait.until(ExpectedConditions.elementToBeClickable(city));
       city.sendKeys("ForKol");
       WebElement click = driver.findElement(By.xpath("//button[@data-testid='buttonElement']"));
       wait.until(ExpectedConditions.elementToBeClickable(click));
       click.click();
       driver.close();
    }
}
