package p_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
//        5.Zadatak
//        Napisti program koji:
//        Ucitava stranicu https://s.bootsnipp.com/iframe/z80en
//        Hvata sve elemente prve kolone i stampa tekst svakog elementa. Kako da od nekog elementa procitamo tekst imate na sledecem linku
//        Ceka 1s
//        Hvata sve element prvog reda i stampa tekst svakog elementa
//        Ceka 5s
//        Zatvara pretrazivac
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s.bootsnipp.com/iframe/z80en");
        List<WebElement>nizPrvaKolona = driver.findElements(By.xpath("//div[contains(@id,'lorem')]/table/tbody/tr/td[1]"));
        for (int i = 0; i < nizPrvaKolona.size(); i++) {
            nizPrvaKolona.get(i).getText();
            Thread.sleep(1000);
            System.out.println(nizPrvaKolona.get(i).getText());
        }
        List<WebElement>nizPrviRed = driver.findElements(By.xpath("//div[contains(@id,'lorem')]/table/tbody/tr[1]/td"));
        for (int i = 0; i < nizPrviRed.size(); i++) {
            nizPrviRed.get(i).getText();
            Thread.sleep(5000);
            System.out.println(nizPrviRed.get(i).getText());
        }
        driver.quit();

    }
}
