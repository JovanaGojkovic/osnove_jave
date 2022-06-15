package p_14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KatalonLoginTests {
//    Kreirati klasu KatalonLoginTests za testove
//    Base url: https://cms.demo.katalon.com
//    Test #1: Visit login page from Nav bar
//    Koraci:
//    Ucitati home stranicu
//    Kliknuti na My account link
//    Verifikovati da je naslov stranice My account – Katalon Shop
//    Verifikovati da se u url-u stranice javlja /my-account
//    Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//
//    Test #2: Check input types
//    Koraci:
//    Ucitati /my-account stranicu
//    Verifikovati da  polje za unos email-a za atribu type ima vrednost text
//    Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//    Verifikovati da checkbox Remember me za atribut type ima vrednost checkbox
//    Verifikovati da je Remember me checkbox decekiran. Koristan link kako naci informaciu da li je checkbox cekiran ili ne.
//    Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//    Test #3: Display error when credentials are wrong
//    Podaci:
//    email: invalidemail@gmail.com
//    password: invalid123
//    Koraci:
//    Ucitati /my-account stranicu
//    Unesite email
//    Unesite password
//    Kliknite na login dugme
//    Verifikovati da postoji element koji prikazuje gresku
//    Verifikovati da je prikazana greska ERROR: Invalid email address
//    Za sve validacije ispisati odgovarajuce poruke u slucaju greske
//    Verifikovati da smo idalje na login stranici posle greske, tako sto proveravamo da se url-u javlja /my-account


    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://cms.demo.katalon.com");
    }
    @Test (priority = 10)
        public void visitLoginPageFromNavBar(){
        driver.get(baseUrl);
        driver.findElement(By.xpath("//ul/li[3]")).click();
        Assert.assertTrue(driver.getTitle().contains("My account – Katalon Shop"),
                "[ERROR] Page title does not contain My account – Katalon Shop");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "[ERROR] Page url does not contain /my-account");
    }
    @Test (priority = 20)
        public void checkInputTypes(){
        driver.get(baseUrl + "/my-account");
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@type, 'text')]"))
                .getAttribute("type")
                .contains("text"), "[ERROR] There is no element with that value");
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@type, 'password')]"))
                .getAttribute("type")
                .contains("password"), "[ERROR] There is no element with that value");
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]"))
                .getAttribute("type")
                .contains("checkbox"), "[ERROR] There is no element with that value");
        WebElement checkbox = driver.findElement(By.id("rememberme"));
        Assert.assertTrue(!checkbox.isSelected(),"[ERROR] CheckBox is selected");
    }
    @Test (priority = 30)
        public void displayErrorWhenCredentialsAreWrong(){
        driver.get(baseUrl + "/my-account");
        driver.findElement(By.id("username")).sendKeys("invalidemail@gmail.com");
        driver.findElement(By.id("password")).sendKeys("invalid123");
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
        WebElement alert = driver.findElement(By.xpath("//ul[contains(@role, 'alert')]"));
        Assert.assertEquals(alert.getAttribute("role"),"alert",
                "[ERROR] There is no alert message");
        Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                "[ERROR] Page title is not /my-account");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
