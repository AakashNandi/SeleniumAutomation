package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class RediffTask {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://m.rediff.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement create_ac= driver.findElement(By.linkText("Create Account"));
        create_ac.click();

//        String parent_W = driver.getWindowHandle();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //top to bottom
//        Thread.sleep(1500);
//        By terms = By.linkText("terms and conditions");
//        driver.findElement(terms).click();
//        //WebElement tc= driver.findElement(By.linkText("terms and conditions"));
        //System.out.println(tc.getText());
        //Actions act = new Actions(driver);
        // act.scrollToElement(tc).click().perform();
        // js.executeScript("arguments[0].scrollIntoView(true);",tc);
        // tc.click();
        //Thread.sleep(2000);

//        Set<String> windows = driver.getWindowHandles();
//        for(String window : windows){
//            if(!window.equals(parent_W)){
//                driver.switchTo().window(window);
//                break;       //breaking, if there sre multiple child then there will be ambiguity....
//            }
//        }
//        WebElement click= driver.findElement(By.xpath("//div[@class='floatR']/input"));
//        click.click();
//        //Thread.sleep(2000);
//
//        driver.switchTo().window(parent_W);
//        js.executeScript("window.scrollTo(0,0)"); // bottom to top
//        Thread.sleep(1500);

        // driver.close();
//
        Thread.sleep(2000);
        WebElement feed1 = driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
        feed1.sendKeys("Aakash Nandi");
        feed1.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement feed2 = driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
        feed2.sendKeys("aakash");
        driver.findElement(By.xpath("//input[@class='btn_checkavail button']")).click();
        Thread.sleep(2000);
        WebElement msg = driver.findElement(By.xpath("//div[@id='check_availability']/div/span"));
       // WebElement msg = driver.findElement(By.className("success"));
       // if(msg.getText("Success")) {
        System.out.println(msg.getText());
        //}else{
          //  System.out.println(msg.getText());
        //}
       // Thread.sleep(40000);




        driver.quit();
    }
}
