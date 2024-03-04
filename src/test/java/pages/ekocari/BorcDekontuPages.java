package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BorcDekontuPages {
    public BorcDekontuPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[2]/a/span") public WebElement cariHareketler;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yenicariHareketler;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement borcDekontu;
    @FindBy(xpath = "//*[@id=\"txtFICHENO\"]") public WebElement fisNo;
    @FindBy(xpath = "//*[@id=\"customerForm\"]/wt-tab-container/wt-tab-content/div[1]/div/div/div[2]/div/div[3]/div/button") public WebElement cariButton;
    @FindBy(xpath = "//*[@id=\"row0grid\"]") public WebElement secilenCari;
    @FindBy(xpath = "//*[@id=\"txtCREDIT\"]") public WebElement tlTutar;
    @FindBy(xpath = "//*[@id=\"row0grid\"]") public WebElement kaydetButton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[2]/button") public WebElement kaydetButton2;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[3]/a") public WebElement silIkonu;
    @FindBy(xpath = "/html/body/div[22]/div/div[6]/button[1]") public WebElement evetButton;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]") public WebElement ilksatır;


}
