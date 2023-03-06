package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyFunc.Bekle(2);
        WebElement clickAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
clickAlert.click();
        MyFunc.Bekle(2);

        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);


        BekleKapat();
}
}