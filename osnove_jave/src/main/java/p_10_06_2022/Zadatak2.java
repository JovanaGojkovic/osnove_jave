package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
//    Napisati program koji ucitava stranicu https://www.ebay.com/
//    i bira kategoriju “Crafts”
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Select s = new Select(driver.findElement(By.xpath("//select[contains(@class, 'gh-sb ')]")));
        Thread.sleep(1000);
        s.selectByVisibleText("Crafts");

    }
}
