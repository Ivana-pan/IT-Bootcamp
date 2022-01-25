package Pages.D_14_Ivana_Zinajic_NS129QA4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;

public class TestDodajNoviSmestaj {
    public static WebDriver driver;

    @BeforeTest
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void close() throws IOException {
        driver.close();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    @Test
    public void dodavanjeNovihApartmana() throws InterruptedException {

        driver.get("https://it-255-dz-06-andjela-bojic3972.vercel.app/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://it-255-dz-06-andjela-bojic3972.vercel.app/",
                "The current url should be equal to https://it-255-dz-06-andjela-bojic3972.vercel.app/");
        if (!Objects.equals(driver.getCurrentUrl(), "https://it-255-dz-06-andjela-bojic3972.vercel.app/")) {
            System.out.println("Web address is not equal to the one necessary.");
        }

        DodajNoviSmestaj dodavanje = new DodajNoviSmestaj(driver);

        dodavanje.unosApartmana("Lepi stan", "Balzakova 3", "5000", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Small_Apartment.jpg/640px-Small_Apartment.jpg");

        String unetNaziv = driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/lista-smestaja-component/div/smestaj-component[4]/div/div/h5[1]")).getText();
        //System.out.println(unetNaziv);
        Assert.assertTrue(unetNaziv.contains("Lepi stan"));
    }

}
