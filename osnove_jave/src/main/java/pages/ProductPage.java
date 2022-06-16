package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getQuantityElement(){
        return driver.findElement(By.xpath("//input[contains(@class, input-text)]"));
    }
    public WebElement getAddToCartElement(){
        return driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
    }
    public WebElement getMessageAlertForAddingInCart(){
        return driver.findElement(By.xpath("//div[contains(@role, 'alert')]"));
    }
}
