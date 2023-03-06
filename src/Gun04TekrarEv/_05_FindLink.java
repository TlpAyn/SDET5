package Gun04TekrarEv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindLink {
    public static void main(String[] args) {


        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://form.jotform.com/221934510376353");


        List<WebElement> elements = driver2.findElements(By.className("form-sub-label"));
        System.out.println("elements.size() = " + elements.size());

        for (WebElement w:elements) {

            System.out.println("w.getText() = " + w.getText());
        }
    }

}
