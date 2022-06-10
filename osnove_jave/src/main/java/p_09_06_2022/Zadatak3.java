package p_09_06_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ima:
//        Niz stranica (niz stringova) koje treba da ucita. Niz je:
//        https://google.com/
//        https://youtube.com/
//        https://www.ebay.com/
//        https://www.kupujemprodajem.com/
//        Program petljom prolazi kroz niz stranica i svaku stranicu ucitava preko get
//        ili navigate i od svake stranice na ekranu ispisuje naslov stranice. Kako od stranice procitati naslov imate na ovom linku
//        U prevodu u konzoli treba da se ispisu:
//        Google
//        YouTube
//        Electronics, Cars, Fashion, Collectibles & More | eBay
//        KupujemProdajem
//        Zatvara pretrazivac
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ArrayList<String> nizStranica = new ArrayList<>();
        nizStranica.add("https://google.com/");
        nizStranica.add("https://youtube.com/");
        nizStranica.add("https://www.ebay.com/");
        nizStranica.add("https://www.kupujemprodajem.com/");
        for (int i = 0; i < nizStranica.size(); i++) {
            String nazivStranice = nizStranica.get(i);
            driver.get(nazivStranice);
            System.out.println("Naziv stranice je " + driver.getTitle());
        }
        driver.quit();


    }
}
