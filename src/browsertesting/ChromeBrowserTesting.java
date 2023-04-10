package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * BaseUrl: https://courses.ultimateqa.com/users/sign_in
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
     // Launch the chrome browser
        WebDriver driver= new ChromeDriver();

        // Open the Url into the browser
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
