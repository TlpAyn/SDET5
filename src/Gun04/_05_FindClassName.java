package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        MyFunc.Bekle(2);

        WebElement ilkkutuClassName =  driver.findElement(By.className("form-textbox"));
        ilkkutuClassName.sendKeys("Talip");

       List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());

        for (WebElement e : labels) {
            System.out.println("e.getText() = " + e.getText());

        }









        MyFunc.Bekle(5);
        driver.quit();

    }
}
