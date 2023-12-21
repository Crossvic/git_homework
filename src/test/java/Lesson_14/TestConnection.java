package Lesson_14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

public class TestConnection extends WebDriverSettings {
    /* Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы,
     нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке),
      номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты,
       наличие иконок платёжных систем. */

    private static final String IFRAME = "//div[8]/div/iframe";
    private static final String LOGO = "//app-input/div/div/div[2]/div/div";
    private static final String SUM = "//app-header/header/div/div/p[1]";
    private static final String PHONE_NUMBER = "//app-header/header/div/div/p[2]";
    private static final String SUMBTN = "//app-card-page/div/div[1]/button";

    @Test
    public void dataInput() {
        acceptCookies();

        WebElement phoneInputField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneInputField.click();
        phoneInputField.sendKeys("297777777");

        WebElement sumInputField = driver.findElement(By.id("connection-sum"));
        sumInputField.click();
        sumInputField.sendKeys("3");

        WebElement emailInputField = driver.findElement(By.id("connection-email"));
        emailInputField.click();
        emailInputField.sendKeys("popchyk2012@gmail.com");

        WebElement btnProceed = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        btnProceed.click();

        driver.switchTo().frame(driver.findElement(By.xpath(IFRAME)));

        // Отображение суммы (верх фрейма)
        WebElement sum = driver.findElement(By.xpath(SUM));
        System.out.println(sum.getAttribute("innerText"));

        // Отображение номера телефона
        WebElement phoneNum = driver.findElement(By.xpath(PHONE_NUMBER));
        System.out.println(phoneNum.getAttribute("innerText"));

        // Отображение суммы на кнопке (низ фрейма)
        WebElement btnSum = driver.findElement(By.xpath(SUMBTN));
        System.out.println(btnSum.getAttribute("innerText"));


        // Содержимое внутренних полей
        WebElement cardNum = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        System.out.println(cardNum.getAttribute("innerText"));

        WebElement expDate = driver.findElement(By.xpath(" /html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]\n"));
        System.out.println(expDate.getAttribute("innerText"));

        WebElement cvs = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]"));
        System.out.println(cvs.getAttribute("innerText"));

        WebElement cardName = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]"));
        System.out.println(cardName.getAttribute("innerText"));

        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(visibilityOfAllElementsLocatedBy(By.xpath(LOGO)));
        System.out.println("Тест завершен");

    }
    private void acceptCookies() {
        WebElement cookieBtn = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        cookieBtn.click();
    }
}

















