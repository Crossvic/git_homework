package popchyk2012;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ("#basketContent > div.navbar-pc__item.j-item-basket > a"))
    public WebElement cartBtn;

    @FindBy(css = ("div:nth-child(4) > div > div.list-item__good > div > a > span.good-info__good-name"))
    public WebElement itemName;

    @FindBy(css = (" div > div:nth-child(7) > div > div.list-item__good > div > a > span.good-info__good-name"))
    public WebElement itemName1;

    @FindBy(className = "list-item__price-new")
    public WebElement price;

    @FindBy(css = (" div:nth-child(7) > div > div.list-item__price > div.list-item__price-new"))
    public WebElement price1;

    @FindBy(css = ("div.basket-order__b-top.b-top > div > span:nth-child(1)"))
    public WebElement quantity;

    @FindBy(css = (" div > div.basket-order__b-top.b-top > p"))
    public WebElement totalSum;

    public void moveToCart() {
        cartBtn.click();
        driver.switchTo().window(driver.getWindowHandle());
    }

    public void checkName() {
        System.out.println(itemName.getText());
        System.out.println(itemName1.getText());
    }

    public void checkPrice() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(price.getText());
        System.out.println(price1.getText());
    }

    public void checkQuantity() {
        System.out.println(quantity.getText());
    }

    public void checkTotalSum() {
        System.out.print(totalSum.getText());
    }

}
