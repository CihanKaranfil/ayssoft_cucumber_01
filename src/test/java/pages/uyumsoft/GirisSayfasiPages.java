package pages.uyumsoft;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisSayfasiPages {
    public GirisSayfasiPages(){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"Username\"]") public WebElement kullaniciAdi;
    @FindBy(xpath = "//*[@id=\"form-login\"]/button") public WebElement oturumAcButton;
    @FindBy(xpath = "//*[@id=\"btnCloseAnnouncement\"]") public WebElement bilgilendirmekapat;
}
