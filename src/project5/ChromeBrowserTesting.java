package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        // declaring the url
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // launch the web browser
        WebDriver driver = new ChromeDriver();
        // open url
        driver.get(baseUrl);
        // maximize the screen of web browser
        driver.manage().window().maximize();
        // manage the time out of application
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        // print the title of the page
        System.out.println("The title of the page is :" + driver.getTitle());
        // print the current Url
        System.out.println("The current Url is :" + driver.getCurrentUrl());
        // print the page source
        System.out.println("The source of the page is : "+ driver.getPageSource());
        // enter the username in userNameField
        WebElement userNameFiled = driver.findElement(By.id("user[email]"));
        userNameFiled.sendKeys("maharajswami007@gmail.com");
        // enter the password in passwordField
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("password1234");
        // driver closer
        driver.close();
    }
}