package d_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Vezba {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[contains(@class, 'emMrhw')]")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
        WebElement alert = driver.findElement(By.xpath("//*[@action='error']"));
        System.out.println("Vrednost je " + alert.getAttribute("action"));
    }
}
