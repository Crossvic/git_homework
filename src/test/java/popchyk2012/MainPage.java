package popchyk2012;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    public WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div/div[2]/div/article[1]/div"))
    public WebElement product;

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div/div[2]/div/article[1]/div/div[3]/p[3]/a"))
    public WebElement cartBtn;

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div/div[2]/div/article[2]/div"))
    public WebElement product1;

    @FindBy(xpath = ("//*[@id=\"app\"]/div[2]/div/div[2]/div/article[2]/div/div[3]/p[3]/a"))
    public WebElement cartBtn1;

    @FindBy(xpath = ("/html/body/div[1]/div/ul/li[1]"))
    public WebElement sizeElem;


    public void addToCart() {

        driver.navigate().refresh();
        actions.moveToElement(product).perform();
        cartBtn.click();
        checkSizeElem();
    }

    public void addToCart1() {
        actions.moveToElement(product1).perform();
        cartBtn1.click();
        checkSizeElem();
    }

    private void checkSizeElem() {
        try {
            boolean element = sizeElem.isDisplayed();
            if (element) {
                sizeElem.click();
            }
        } catch (NoSuchElementException e) {

        }
    }
}
