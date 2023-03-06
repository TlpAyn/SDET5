package Gun04TekrarEv;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingException {
    public static void main(String[] args) {

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://form.jotform.com/221934510376353");


        try {
            WebElement a = driver2.findElement(By.id("Ali"));


        }catch (Exception ex){
            System.out.println("WebElement bulunamadi    "+ ex.getMessage());
        }


        MyFunc.Bekle(2);
        driver2.quit();


    }
}
