package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
//    Ucitava stranicu https://demoqa.com/login
//    Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//    Zatim ceka 5sekundi da se korisnik uloguje
//    Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout.
//    Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//    Klikce na dugme za logout
//    Gasi stranicu

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/login");
        String user = "itbootcamp";
        String pass = "ITBootcamp2021!";
        driver.findElement(By.id("userName")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);

        driver.findElement(By.id("login")).click();
        Thread.sleep(5);

        try {
            driver.findElement(By.xpath("//button[contains(@id, 'submit')]"));
        }catch (Exception e){
            System.out.println("Element ne postoji");
        }
        driver.quit();


}
}