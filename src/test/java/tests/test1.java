package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//eylul.gumus@teknosa.com
//Aa147852



public class test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.teknosa.com/login");
        driver.manage().window().maximize();

        WebElement loginName = driver.findElement(By.id("j_username1"));
        loginName.click();
        loginName.sendKeys("eylul.gumus@teknosa.com");

        WebElement button_continue = driver.findElement(By.id("newLoginStepSecond"));
        button_continue.click();

        WebElement password = driver.findElement(By.id("j_password"));
        password.click();
        password.sendKeys("Aa147852");

        WebElement button_login = driver.findElement(By.id("customerLoginButton"));
        button_login.click();

        driver.quit();

        }

    }
