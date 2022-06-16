package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CartPage;
import pages.NavPage;
import pages.ProductPage;

import java.time.Duration;

public class KatalonShopTests {
    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com/";
    private NavPage navPage;
    private ProductPage productPage;
    private CartPage cartPage;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        navPage = new NavPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @Test(priority = 10)
    public void addingProductWithQuantityToTheCart(){
        driver.get(baseUrl + "/product/flying-ninja/");
        productPage.getQuantityElement().clear();
        productPage.getQuantityElement().sendKeys("3");
        productPage.getAddToCartElement().click();
        Assert.assertTrue(productPage.getMessageAlertForAddingInCart().getText().contains("Flying Ninja"),
                "[ERROR] Message does not contains that text");

        navPage.getCartElement().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/cart"),
                "[ERROR] Page url does not contain /cart");

        Assert.assertEquals(cartPage.getAllTableRows().size(),1,
                "[ERROR] There is more than 1 product in cart");
    }
    @Test(priority = 20)
    public void RemovingProductFromCart() throws InterruptedException {
        navPage.getCartElement().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/cart"),
                "[ERROR] Page url does not contain /cart");
        Assert.assertTrue(cartPage.getAllTableRows().size() == 1,
                "[ERROR] There is more than 1 product in cart");
        cartPage.getDeleteRowByIndex(1).click();
        Thread.sleep(5000);
        Assert.assertEquals(cartPage.getAllTableRows().size(),0,
                "[ERROR] Cart should be empty");


    }




    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
