package Gun04TekrarEv;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://huertgenwald-hilft.de/index.php/kontakt/");

        MyFunc.Bekle(2);

        WebElement kutucuk = driver.findElement(By.name("your-name"));
        kutucuk.sendKeys("Talip Ayan");
        MyFunc.Bekle(2);
   //     kutucuk.clear();

        WebElement kutucuk2 = driver.findElement(By.name("your-email"));
        kutucuk2.sendKeys("talipayan6035@gmail.com");
        MyFunc.Bekle(2);
//        kutucuk2.clear();

        WebElement yazi1 = driver.findElement(By.id("your-email"));

        WebDriver driver2 = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement ilkyazi = driver2.findElement(By.id("sublabel_8_first"));
        System.out.println("ilkyazi = " + ilkyazi);



        MyFunc.Bekle(2);
        driver.quit();
    }
}
