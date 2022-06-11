package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
//        Napisati program koji:
//        Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//        Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element
//        obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//        POMOC: Brisite elemente odozdo.
//        (ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://s.bootsnipp.com/iframe/Dq2X");
        List<WebElement> niz = driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]/div"));
        for (int i = niz.size() - 1; i < niz.size(); i--) {
            WebElement element = niz.get(i);
            element.findElement(By.xpath("//div[last()][contains(@class, 'alert')]/button[last()]")).click();
            try {
                driver.findElement(By.xpath("$x(//div[contains(@class, 'alert')]/button)[" + i + "]"));
                System.out.println("Element postoji");
            } catch (Exception e) {
                System.out.println("Element ne postoji");
            }
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
