package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;


public class TopUpMobileTest extends WebDriverSettings {

    @Test
    // Проверка названия блока
    public void testMessage() {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        System.out.println(message.getText());
    }

    @Test
    // Проверка логотипов
    public void testLogo() {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul")));
        System.out.println("Тест завершен");
    }
    @Test
    public void testLink() {
        // Принятие cookies
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement btn = driver.findElement(By.id("bxdynamic_cookies-agreement-pt1_end"));
        js.executeScript("arguments[0].click();", btn);
        // Ссылка Подробнее о сервисе
        WebElement btnPecul = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        btnPecul.click();
        System.out.println("Тест завершен");
    }

    @Test
    public void testDataInput() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement btn = driver.findElement(By.id("bxdynamic_cookies-agreement-pt1_end"));
        js.executeScript("arguments[0].click();", btn);
        // Заполнение полей
        WebElement phoneInputField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneInputField.click();
        phoneInputField.sendKeys("297777777");

        WebElement sumInputField = driver.findElement(By.id("connection-sum"));
        sumInputField.click();
        sumInputField.sendKeys("3");

        WebElement emailInputField = driver.findElement(By.id("connection-email"));
        emailInputField.click();
        emailInputField.sendKeys("popchyk2012@gmail.com");
        // Кнопка Продолжить
        WebElement btnProceed = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        btnProceed.click();

    }
}

