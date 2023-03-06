package Gun11;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillingFormTask extends BaseDriver {

    /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */


    @Test
    public void Test1 (){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement a = driver.findElement(By.id("title"));
        a.sendKeys("Talip");

        WebElement ab = driver.findElement(By.id("description"));
        ab.sendKeys("Hey merhaba nasilsin");


        WebElement abcsubmit = driver.findElement(By.id("btn-submit"));
        abcsubmit.click();


        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until((ExpectedConditions.textToBePresentInElementValue(By.id("submit-control"), "Form submit Successfully")));



        WebElement mesaj = driver.findElement(By.id("submit-control")
        );


        Assert.assertEquals("Form submited Successfully!",mesaj.getText());
        








    }
}
