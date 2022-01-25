package Pages.D_14_Ivana_Zinajic_NS129QA4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DodajNoviSmestaj {

    WebDriver wd;

    public DodajNoviSmestaj(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(wd, this);
    }

    @FindBy(id = "naziv")
    WebElement dodajNazivApartmana;

    @FindBy(id = "adresa")
    WebElement dodajAdresuApartmana;

    @FindBy(id = "cena")
    WebElement dodajCenuApartmana;

    @FindBy(id = "slika")
    WebElement dodajSlikuApartmana;

    @FindBy(xpath = "/html/body/app-root/div/div/div[1]/form-dodaj-smestaj/form/div[5]/button")
    WebElement submitButton;

    public void unosApartmana(String imeApartmana, String adresa, String cena, String link) throws InterruptedException {
        dodajNazivApartmana.sendKeys(imeApartmana);
        dodajAdresuApartmana.sendKeys(adresa);
        dodajCenuApartmana.sendKeys(cena);
        dodajSlikuApartmana.sendKeys(link);
        Thread.sleep(5000);
        submitButton.click();
    }


}
