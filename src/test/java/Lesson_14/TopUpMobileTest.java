package Lesson_14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopUpMobileTest extends WebDriverSettings {
    /*Проверить надписи в незаполненных полях каждого варианта оплаты услуг:
    услуги связи, домашний интернет, рассрочка, задолженность*/
    @Test
    public void testPhone() {
        acceptCookies();

        WebElement message = driver.findElement(By.id("connection-phone"));
        System.out.println(message.getAttribute("placeholder"));

        WebElement message1 = driver.findElement(By.id("connection-sum"));
        System.out.println(message1.getAttribute("placeholder"));

        WebElement message2 = driver.findElement(By.id("connection-email"));
        System.out.println(message2.getAttribute("placeholder"));

    }
    @Test
    public void testHomeInternet() {
        acceptCookies();

        WebElement selectHeader = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        selectHeader.click();

        WebElement headerHomeInt = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]"));
        headerHomeInt.click();

        WebElement message = driver.findElement(By.id("internet-phone"));
        System.out.println(message.getAttribute("placeholder"));

        WebElement message1 = driver.findElement(By.id("internet-sum"));
        System.out.println(message1.getAttribute("placeholder"));

        WebElement message2 = driver.findElement(By.id("internet-email"));
        System.out.println(message2.getAttribute("placeholder"));
    }

    @Test
    public void testInstallment() {
        acceptCookies();

        WebElement selectHeader = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        selectHeader.click();

        WebElement installment = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]"));
        installment.click();

        WebElement message = driver.findElement(By.id("score-instalment"));
        System.out.println(message.getAttribute("placeholder"));

        WebElement message1 = driver.findElement(By.id("instalment-sum"));
        System.out.println(message1.getAttribute("placeholder"));

        WebElement message2 = driver.findElement(By.id("instalment-email"));
        System.out.println(message2.getAttribute("placeholder"));
    }

    @Test
    public void testDebt() {
        acceptCookies();

        WebElement selectHeader = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]"));
        selectHeader.click();

        WebElement debt = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]"));
        debt.click();

        WebElement message = driver.findElement(By.id("score-arrears"));
        System.out.println(message.getAttribute("placeholder"));

        WebElement message1 = driver.findElement(By.id("arrears-sum"));
        System.out.println(message1.getAttribute("placeholder"));

        WebElement message2 = driver.findElement(By.id("arrears-email"));
        System.out.println(message2.getAttribute("placeholder"));
    }
    private void acceptCookies() {
        // Принятие cookies
        WebElement cookieBtn = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        cookieBtn.click();
    }
}
