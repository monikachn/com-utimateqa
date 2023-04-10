package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        // open Url
        driver.get(baseUrl);

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // print the Url
        System.out.println("Current Url :"+driver.getCurrentUrl());

        // get page source
        System.out.println("Page source :"+ driver.getPageSource());

        //Enter the email to email field
        WebElement emailField =driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Abc@gmail.com");

        // enter password to password field
        WebElement passField =driver.findElement(By.name("user[password]"));
        passField.sendKeys("123Prime");
        driver.close();


    }
}