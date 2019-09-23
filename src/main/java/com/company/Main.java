package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    @Test
    public void Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lapalingo.com/en");
        driver.manage().window().maximize();
        driver.findElement(By.name("lionline_user_login[_username]"));
        WebElement mail = driver.findElement(By.name("lionline_user_login[_username]"));
        mail.sendKeys("vladtestauto@gmail.com");
        driver.findElement(By.name("lionline_user_login[_password]"));
        WebElement password = driver.findElement(By.name("lionline_user_login[_password]"));
        password.sendKeys("Tester123");
        driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[1]/form/div[3]/button"));
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[1]/form/div[3]/button"));
        login.click();
        String actualUrl;
        actualUrl = "https://www.lapalingo.com/en";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(10000);
        driver.close();



    }
}
