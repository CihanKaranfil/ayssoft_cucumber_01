package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BankaPages {
    public BankaPages(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[7]/a/span") public WebElement bankaMenusu;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[7]/ul/li[1]/a") public WebElement bankalarMenusu;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniBanka;
    @FindBy(xpath = "//*[@id=\"txtCODE\"]") public WebElement bankaKodu;
    @FindBy(xpath = "//*[@id=\"txtDEFINITION_\"]") public WebElement bankaAdi;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[2]/button") public WebElement kaydetButton;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]/td[3]") public WebElement olusanBanka;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[5]/a") public WebElement silIconu;
    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled swal2-default-outline']") public WebElement evetIconu;
    @FindBy(xpath = "//*[@style='display: inline-block; background-color: rgb(48, 133, 214);']") public WebElement evetIconu2;


}
