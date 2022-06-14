package p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV i
        // ceka da se ucita progress bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s.bootsnipp.com/iframe/klDWV");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"), "100%"));
        System.out.println("Stranica ucitana");
        driver.quit();
    }
}
