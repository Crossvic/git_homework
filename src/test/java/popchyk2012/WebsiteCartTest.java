package popchyk2012;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebsiteCartTest {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static CartPage cartPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.wildberries.ru/");
    }

    @Test
    public void mainPageTest() throws InterruptedException {
        mainPage.addToCart();
        mainPage.addToCart1();
        cartPage.moveToCart();
        cartPage.checkName();
        cartPage.checkPrice();
        cartPage.checkQuantity();
        cartPage.checkTotalSum();
    }
    @After
    public void close() {
        driver.quit();
    }


}
