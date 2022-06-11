package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5 {
    public static void main(String[] args) {
//        Ucitati stranicu https://demoqa.com/modal-dialogs
//        Kliknuti na dugme Large modal
//        Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showLargeModal")).click();
        boolean postojiElement = true;

        try {
            driver.findElement(By.xpath("//div[contains(@class, 'modal-content')]"));
        }catch (Exception e){
            postojiElement = false;
        }
        if (postojiElement == false){
            System.out.println("Ne postoji element");
        }
        driver.quit();
    }
}
