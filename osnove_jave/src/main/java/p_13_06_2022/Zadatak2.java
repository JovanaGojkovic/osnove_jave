package p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        //Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://www.file.io/");
        driver.manage().window().maximize();
        File zip = new File("src/main/resources/Downloads.zip");

        driver.findElement(By.xpath("//*[contains(@id, 'upload-button')]"))
                .sendKeys(zip.getAbsolutePath());

        Thread.sleep(10000);
        driver.quit();
    }
}
