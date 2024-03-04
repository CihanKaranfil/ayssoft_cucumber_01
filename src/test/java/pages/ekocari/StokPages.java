package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StokPages {
    public StokPages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="//*[@id=\"main-menu-navigation\"]/li[3]/a/span") public  WebElement stok ;
    @FindBy(xpath ="//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[1]/a/span") public  WebElement stokKartlar ;
    @FindBy(xpath ="//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public  WebElement yeniStok ;
    @FindBy(xpath ="//*[@id='txtCODE']") public  WebElement StokKodu ;
    @FindBy(xpath ="//*[@id=\"txtSALESPRICE\"]") public  WebElement satisFiyat ;
    @FindBy(xpath ="//*[@id=\"txtBUYINGPRICE\"]") public  WebElement alisFiyat ;
    @FindBy(xpath ="//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[2]/button") public  WebElement yeniStokKaydet ;



}
