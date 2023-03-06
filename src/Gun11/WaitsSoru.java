package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsSoru extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */


    @Test
    public void Wait1(){
        driver.get("https://www.demoblaze.com/index.html");

       WebElement galaxys6= driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxys6.click();

        WebElement sepet = driver.findElement(By.linkText("Add to cart"));
        sepet.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.alertIsPresent());


        driver.switchTo().alert().accept();

        WebElement ustYol = driver.findElement(By.xpath("//a[@id='nava']"));
        ustYol.click();









}
}