package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {
    @Test

    public void Test02() {

        driver.get("https://www.facebook.com/");

        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Erforderliche und optionale Cookies erlauben']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        WebElement NewAccount = driver.findElement(By.linkText("Neues Konto erstellen"));
        NewAccount.click();


        WebElement vorname = driver.findElement(By.xpath("//input [@placeholder='Vorname']"));
        vorname.sendKeys("Hasan");

        MyFunc.Bekle(1);

        WebElement name = driver.findElement(By.xpath("//input [@name='lastname']"));
        name.sendKeys("Bastibacak");
        MyFunc.Bekle(1);

        WebElement Reemail = driver.findElement(By.xpath("//input [@name='reg_email_confirmation__']"));
        Assert.assertFalse(Reemail.isDisplayed());  // beklenen gorunmemesi !
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("Hasan@gmail.com");


        MyFunc.Bekle(1);

        Assert.assertTrue(Reemail.isDisplayed());



        MyFunc.Bekle(1);

           WebElement BirtdayBox = driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select birtdayMenu = new Select(BirtdayBox);

    birtdayMenu.selectByVisibleText("21");

      MyFunc.Bekle(1);

      WebElement monatBox = driver.findElement(By.xpath("//select[@name='birthday_month'] "));
      Select monatMenu = new Select(monatBox);

      monatMenu.selectByValue("2");

      MyFunc.Bekle(1);

      WebElement jahrBox = driver.findElement(By.xpath("//select[@name='birthday_year'] "));
      Select jahrBoxMenu = new Select(jahrBox);
        jahrBoxMenu.selectByVisibleText("1990");
//        MyFunc.Bekle(1);
//
////input [@name='lastname']   //input [@name='reg_email__']
        MyFunc.Bekle(1);
        BekleKapat();
    }


}
