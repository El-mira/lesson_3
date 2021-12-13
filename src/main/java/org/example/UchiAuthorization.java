package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UchiAuthorization {
    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://uchi.ru/";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        login();

        Thread.sleep(3000);

        driver.quit();

    }

    private static void login(){
        driver.get(LOGIN_PAGE_URL);

        driver.findElement(By.id("login")).sendKeys("karina_mixt@mail.ru");

        driver.findElement(By.id("password")).sendKeys("daulmirra2014"); // daulmirra2015 актуальный

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
