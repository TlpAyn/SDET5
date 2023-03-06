package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


try{
    WebElement labelFirstName = driver.findElement(By.id("talip"));
  //  System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

}catch (Exception ex)
{
    System.out.println("Web element bulunamadi "+ ex.getMessage());
}





        MyFunc.Bekle(2);
        driver.quit();

    }

}
