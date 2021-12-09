package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiaryNewNote {
    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://diary.ru/user/login";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get(LOGIN_PAGE_URL);
        Cookie cookie = new Cookie("_identity_", "b0373fb71b1021fc36cbaf4be3e57ec9698aa08cb24de591a58ea19e4a2eb9a3a%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3559771%2C%22iLBKMS3EgCGYhkOfOc9-qKXF3eemhQUy%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        driver.get("https://mirradaul.diary.ru/?newpost"); // лучше сразу указать нужную страницу или
        //driver.findElement(By.xpath("//a[@title='Новая запись']")).click(); или перейти по ссылке
        driver.findElement(By.id("postTitle")).sendKeys("Погода на завтра");

        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='message_ifr']")));

        driver.findElement(By.xpath("//body")).sendKeys("Мороз и солнце");

        Thread.sleep(3000);

        driver.switchTo().parentFrame();

        driver.findElement(By.id("rewrite")).click();

        Thread.sleep(3000);

        driver.quit();


    }
}
