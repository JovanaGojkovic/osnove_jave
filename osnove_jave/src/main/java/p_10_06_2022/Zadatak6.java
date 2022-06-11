package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {
//        Napisati program koji ucitava stranicu Zadatak6.html
//        I na stranici dodaje 5 poruka “IT Bootcamp”
//        Potrebno  je u svakoj iteraciji kliknuti na dugme Show in
//        Sacekati da se novi element pojavi pre nego sto se doda sledeci/

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/admin%20j/Downloads/Zadatak6%20(1).html");

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//button[contains(@id, 'showInBtn')]")).click();
            driver.findElement(By.id("id-" + i));
            Thread.sleep(5);
        }
        driver.quit();
    }
}

