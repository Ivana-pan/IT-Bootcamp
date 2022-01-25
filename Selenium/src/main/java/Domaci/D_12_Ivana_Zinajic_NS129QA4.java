package Domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Properties;


public class D_12_Ivana_Zinajic_NS129QA4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
        Properties properties = System.getProperties();
        properties.list(System.out);
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.wikipedia.org/");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait

        //Promenite jezik iz padajuceg menija u input polju na Srpski

        wd.findElement(By.xpath("//select[@id='searchLanguage']")).click();
        wd.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Српски/Srpski");
        wd.findElement(By.xpath("//select[@id='searchLanguage']")).click();

        //Pronadjite input polje I unesite u njega kljuc “Java”

        wd.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Java");

        //Od ponudjenih pretraga izaberite  Java(Programski jezik)

        wd.findElement(By.xpath("//p[contains(text(),'објектно-оријентисани програмски језик')]")).click();

        //Proverite da li je naslov na otvorenoj stranici odgovarajuci.

        WebElement naslov = wd.findElement(By.xpath("//h1[@id='firstHeading']"));
        if (naslov.getText().equals("Java (програмски језик)")) {
            System.out.println("Naslov na otvorenoj stranici jeste odgovarajuci.");
        } else {
            System.out.println("Naslov nije odgovarajuci");
        }

        Thread.sleep(3000);
        wd.close();
    }
}
