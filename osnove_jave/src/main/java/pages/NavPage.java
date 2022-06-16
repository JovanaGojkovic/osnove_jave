package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavPage {
    private WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getCartElement(){
        return driver.findElement(By.xpath("//li[contains(@class, item-8)]"));
    }
    public WebElement getCheckoutElement(){
        return driver.findElement(By.xpath("//li[contains(@class, item-8)]"));
    }
    public WebElement getMyAccountElement(){
        return driver.findElement(By.xpath("//li[contains(@class, item-9]"));
    }
    public WebElement getSamplePageElement(){
        return driver.findElement(By.xpath("//li[contains(@class, item-2)]"));
    }
    public WebElement getShopElement(){
        return driver.findElement(By.xpath("//li[contains(@class, item-7)]"));
    }
}
