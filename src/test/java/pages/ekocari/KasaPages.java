package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KasaPages {
    public KasaPages(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[6]/a") public WebElement kasaMenusu;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[6]/ul/li[1]") public WebElement kasaListesi;
    @FindBy(xpath = "//*[@id=\"txtCODE\"]") public WebElement kasaKodu;
    @FindBy(xpath = "//*[@id=\"txtNAME\"]") public WebElement kasaAdi;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[2]/button[1]") public WebElement kasaKaydetButton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniKasaButton;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]") public WebElement silinecekKasa;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[5]/a") public WebElement silmeIkonu;
    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled swal2-default-outline']") public WebElement evetButton;
    @FindBy(xpath = "(//*[@type='button'])[40]") public WebElement evetButton2;


}
