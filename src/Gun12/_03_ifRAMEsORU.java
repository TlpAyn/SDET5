package Gun12;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_ifRAMEsORU extends BaseDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */


    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));//b[@id='topic']//following::input
        input.sendKeys("Turkiye");


       driver.switchTo().frame(0);

        //input[@type='checkbox' and @id='a']

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @id='a']"));

        checkbox.click();
        Assert.assertTrue(checkbox.isSelected());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        WebElement selecktMenu = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(selecktMenu);

        select.selectByIndex(3);



        BekleKapat();



    }


    }
