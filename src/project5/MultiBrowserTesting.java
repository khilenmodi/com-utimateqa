package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-5 - Project Name: com-utimateqa
 * BaseUrl =
 * https://courses.ultimateqa.com/users/sign_in
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class MultiBrowserTesting {

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Invalid webBrowser entered ");
        }
        // open url
        driver.get(baseUrl);
        // maximize the screen of web browser
        driver.manage().window().maximize();
        // manage the time out of application
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        // print the title of the page
        System.out.println("This is the title of page :" + driver.getTitle());
        // print the current url
        System.out.println("This is the current Url :" + driver.getCurrentUrl());
        // print the source of the page
        System.out.println("This is the source of page :" + driver.getPageSource());
        // enter the email in the emailField
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("maharajswami007@gmail.com");
        // enter the password in the passwordField
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("password1234");
        // close the driver
        driver.close();


    }
}
