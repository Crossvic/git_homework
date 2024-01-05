import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    private AndroidDriver driver;

    @BeforeEach
    public  void initialize() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("MobileCapabilityType.DEVICE_NAME", "MI 6");
        capabilities.setCapability("AndroidMobileCapabilityType.APP_PACKAGE", "com.google.android.calculator");
        capabilities.setCapability("AndroidMobileCapabilityType.APP_ACTIVITY", "com.android.calculator2.Calculator");

        capabilities.setCapability("MobileCapabilityType.NO_RESET", true);

        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void addTest() {

        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());

        assertEquals(8, Integer.parseInt(result.getText()));

    }

    @Test
    public void subTest() {

        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());

        assertEquals(5, Integer.parseInt(result.getText()));

    }

    @Test
    public void multiplyTest() {

        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());

        assertEquals(6, Integer.parseInt(result.getText()));

    }

    @Test
    public void divideTest() {

        driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());

        assertEquals(2, Integer.parseInt(result.getText()));

    }

    @AfterEach
    public  void close () {
        driver.quit();
    }
}

