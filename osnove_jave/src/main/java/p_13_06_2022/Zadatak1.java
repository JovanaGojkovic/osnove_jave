package p_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
//        Napisati program koji:
//        Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
//        Implicitno cekanje za trazenje elemenata je maksimalno 10s
//        Implicitno cekanje za ucitavanje stranice je 5s
//        Ucitava stranicu https://docs.katalon.com/
//        Maksimizuje prozor
//        Od html elementa cita data-theme atribut.
//        Korisni linkovi za citanje vrednosti atributa link1 i link2
//        Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
//        Klikce na dugme za zamenu tema
//        Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
//        Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati precice
//        preko Actions objekta
//        Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
//        Zatvara pretrazivac

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://docs.katalon.com/");
        driver.manage().window().maximize();

        WebElement element =
                driver.findElement(By.xpath("//*[contains(@class, 'plugin-id-default')]"));
        element.getAttribute("data-theme");

        if (element.getAttribute("data-theme").equals("light")){
            System.out.println("Elemet je " + element.getAttribute("data-theme"));
        }else {
            System.out.println("Element nije light");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class, 'toggleButton_rCf9')]")).click();

        if (element.getAttribute("data-theme").equals("dark")){
            System.out.println("Element je " + element.getAttribute("data-theme"));
        }else {
            System.out.println("Element nije dark");
        }
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        driver.
                findElement(By.xpath("//input[contains(@class, 'DocSearch-Input')]"))
                .getAttribute("search");

        WebElement element1 = driver.findElement(By.xpath("//input[contains(@class, 'DocSearch-Input')]"));

        if (element1.getAttribute("type").equals("search")){
            System.out.println("Element postoji");
        }else {
            System.out.println("Element ne postoji");
        }
        Thread.sleep(1000);

        driver.quit();
    }
//    public static boolean elementExist(WebDriver driver, By by){
//        boolean elementExist = true;
//        try {
//            driver.findElement(by);
//        } catch (Exception e) {
//            elementExist = false;
//        }
//        return  elementExist;
//    }
}
