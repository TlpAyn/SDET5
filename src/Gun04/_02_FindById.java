package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement nameBox = driver.findElement(By.id("first_8"));

        nameBox.sendKeys("Talip ");

        WebElement nameBox2 = driver.findElement(By.id("last_8"));

        nameBox2.sendKeys("Ayan");

        MyFunc.Bekle(2);
//        nameBox.clear();
        MyFunc.Bekle(2);

//        nameBox2.clear();

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        MyFunc.Bekle(2);

        WebElement labelFirstName2 = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelFirstName2.getText() = " + labelFirstName2.getText());

        MyFunc.Bekle(2);

        WebElement button1= driver.findElement(By.id("input_2"));



        MyFunc.Bekle(2);
        driver.quit();
//# idler icin gecerli
    }
}
