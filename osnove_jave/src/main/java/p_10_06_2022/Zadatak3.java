package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji:
//        Ucitava stranicu  https://www.ebay.com/
//        Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
//        Zatim bira random element iz niza opcija koristeci Random. Vodite racuna da random element
//        bude u opsegu broja elemenata niza. Random podsetnik
//        Selektuje random kategoriju izabranu u koraku iznad
//        Zatvara pretrazivac

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Select s = new Select(driver.findElement(By.xpath("//select[contains(@class, 'gh-sb ')]")));
        List<WebElement> opcije = s.getOptions();

        Random random = new Random();
        int broj = random.nextInt((opcije.size()));
        s.selectByIndex(broj);
        driver.quit();
    }
}
