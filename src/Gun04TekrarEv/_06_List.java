package Gun04TekrarEv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_List {
    public static void main(String[] args) {

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://form.jotform.com/221934510376353");


        List<WebElement> elements = driver2.findElements(By.linkText("form-sub-label"));
    }
}
