package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://geodata.solutions/");
        driver.manage().window().maximize();

        Select c = new Select(driver.findElement(By.xpath("//*[contains(@id, 'countryId')]")));
        List<WebElement> opcije = c.getOptions();
        Random random = new Random();
        int broj = random.nextInt((opcije.size()));
        c.selectByIndex(broj);
        Thread.sleep(1000);

        Select s = new Select(driver.findElement(By.xpath("//*[contains(@id, 'stateId')]")));
        List<WebElement> opcijeS = s.getOptions();
        Random random2 = new Random();
        int broj2 = random.nextInt((opcijeS.size()));
        s.selectByIndex(broj2);
        Thread.sleep(1000);

        Select city = new Select(driver.findElement(By.xpath("//*[contains(@id, 'cityId')]")));
        List<WebElement> opcijeCity = city.getOptions();
        Random random3 = new Random();
        int broj3 = random.nextInt((opcijeCity.size()));
        city.selectByIndex(broj3);
        Thread.sleep(1000);

        driver.quit();
    }
}
