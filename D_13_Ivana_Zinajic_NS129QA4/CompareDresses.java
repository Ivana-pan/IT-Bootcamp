package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CompareDresses {

    WebDriver dr;

    public CompareDresses(WebDriver dr){
        this.dr = dr;
        PageFactory.initElements(dr, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]")
    WebElement dressesButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement hover1stDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")
    WebElement addToCompare1;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement hover2ndDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")
    WebElement addToompare2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[3]/div[2]/form/button/span")
    WebElement buttonCompare;



    public void putInCompareTwoDress() throws InterruptedException {
        dressesButton.click();

        Actions lebdenje = new Actions(dr);
        lebdenje.moveToElement(hover1stDress);
        Thread.sleep(2000);
        lebdenje.moveToElement(addToCompare1).click().build().perform();

        Thread.sleep(2000);
        lebdenje.moveToElement(hover2ndDress);
        Thread.sleep(2000);
        lebdenje.moveToElement(addToompare2).click().build().perform();

    }

}
