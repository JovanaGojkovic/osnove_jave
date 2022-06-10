package d_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.AbstractList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
//        Napisati program koji matematicku formulu koju korisnik unese izvrsaav na stranici:
//        Ucitati stranicu https://www.calculatorsoup.com/calculators/math/basic.php
//        Korisnik unosi formulu, samo osnovne matematicke operacija, npr:
//        1243+329=
//        21912-4=
//        12913÷4=
//        U programu se formula unosi kao jedan string i potrebno je razbiti formulu na karaktere.
//        Za to imate metodu https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/
//        Zatim u odnosu na karakter uradite odredjenu logiku

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Scanner s = new Scanner(System.in);

        driver.navigate().to("https://www.calculatorsoup.com/calculators/math/basic.php");


        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite formulu:");
            String unos = s.next();
            List<Character> formule = convertStringToCharList(unos);
            String suma = "";

            for (int j = 0; j < formule.size(); j++) {
                suma += formule.get(j);
            }
            driver.findElement(By.xpath("//input[contains(@id, 'display')]")).click();
            driver.findElement(By.xpath("//input[contains(@id, 'display')]")).sendKeys(suma);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[contains(@value, 'CE')]")).click();

        }
    }
    public static List<Character> convertStringToCharList(String formula) {
        return new AbstractList<Character>() {
            @Override
            public Character get(int index) {
                return formula.charAt(index);
            }
            @Override
            public int size() {
                return formula.length();
            }
        };
    }
}
