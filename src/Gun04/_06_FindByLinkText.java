package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

       WebElement siparislerimlinki =  driver.findElement(By.linkText("Siparişlerim"));

        System.out.println("siparislerimlinki = " + siparislerimlinki.getText());

        System.out.println("siparislerimlinki = " + siparislerimlinki.getAttribute("title"));
        System.out.println("siparislerimlinki = " + siparislerimlinki.getAttribute("href"));
        System.out.println("siparislerimlinki = " + siparislerimlinki.getAttribute("rel"));

       WebElement link2 =  driver.findElement(By.partialLinkText("Süper Fiyat, Süper Teklif"));
        System.out.println("link2.getText() = " + link2.getText());




        MyFunc.Bekle(10);
        driver.quit();

    }
}
