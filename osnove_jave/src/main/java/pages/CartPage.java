package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getDeleteRowByIndex(int rowIndex){
       return driver.findElement(By.xpath("//tbody/tr["+ rowIndex +"]/td/a"));
    }
    public WebElement getInputForCouponCode(){
        return driver.findElement(By.id("coupon_code"));
    }
    public WebElement getApplyCouponButton(){
        return driver.findElement(By.xpath("//button[contains(@class, 'button')]"));
    }
    public WebElement getUpdateCartButton(){
        return driver.findElement(By.xpath("//button[contains(@name, 'update_cart')]"));
    }
    public List<WebElement> getAllTableRows(){
        return driver.findElements(By.className("woocommerce-cart-form__cart-item"));
    }

}
