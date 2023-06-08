package tests;

import static Constants.Login_Constants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class test2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-translate");
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.teknosa.com/login");



        WebElement loginName = driver.findElement(SB_LOGIN);
        loginName.click();
        loginName.sendKeys(USERNAME);

        WebElement button_continue = driver.findElement(BTN_LOGIN);
        button_continue.click();

        WebElement password = driver.findElement(SB_PASSWORD);
        password.click();
        password.sendKeys(PASSWORD);

        WebElement button_login = driver.findElement(BTN_PASSWORD);
        button_login.click();

        Assert.assertEquals(driver.findElement(MY_NAME).getText()," eylül gümüş");
        Assert.assertEquals(driver.findElement(MY_ACCOUNT).getText(),"Hesabım");

        driver.quit();


    }
}
