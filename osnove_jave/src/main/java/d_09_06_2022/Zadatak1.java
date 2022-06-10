package d_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    //    Maksimizirati prozor
//    Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//    Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//    Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//    I izvrsite akciju klik na odgovarajuci element preko indeksa
//    Na kraju programa ugasite pretrazivac.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://s.bootsnipp.com/iframe/WaXlr");
        List<WebElement>niz = driver.findElements(By.xpath("//button[contains(@id,'rating-star')]"));
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj u rasponu od 1 do 5");
        int broj = s.nextInt();

        for (int i = 0; i < broj; i++) {
            if (broj == 1){
                niz.get(0).click();
            } else if (broj == 2) {
                niz.get(1).click();
            } else if (broj == 3) {
                niz.get(2).click();
            } else if (broj == 4) {
                niz.get(3).click();
            }else if (broj == 5){
                niz.get(4).click();
            }
            Thread.sleep(4000);
        }
        driver.quit();
    }


}
