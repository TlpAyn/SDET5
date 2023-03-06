package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {

    public static void main(String[] args) {

        // 1-Acilan sayfadaki kutucuga mesajinizi yaziniz.
        // 2- Butona tiklayiniz
        // 3- Basildiginda mesajin test edildigini onaylayiniz

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement a = driver.findElement(By.cssSelector("#user-message"));
      //   WebElement b = driver.findElement(By.cssSelector("input[id= 'user-message']"));
        WebElement c = driver.findElement(By.cssSelector("[type='button'][onclick='showInput();']"));

        a.sendKeys("Talip Ayan");
        Bekle3();
        c.click();

       WebElement d =  driver.findElement(By.cssSelector("[id='display']"));



        if (d.getText().equals("Talip Ayan")) {

            System.out.println("Test Passed");
        }else {

            System.out.println("Test Failed");
        }

        Bekle3();

        driver.quit();


    }
}
