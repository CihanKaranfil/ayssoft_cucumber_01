package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlisPages {
    public AlisPages(){PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement alisfaturasi;
    @FindBy(xpath = "//*[@id=\"voucherItemListContainer\"]/wt-table/div/div[1]/div[1]/div/button/i") public WebElement caributton;
    @FindBy(xpath = "//*[@id=\"row1Customergrid\"]/div[3]") public WebElement carisec;
    @FindBy(xpath = "//*[@id=\"txtFICHENO\"]") public WebElement faturaNo;
    @FindBy(xpath = "//*[@id=\"voucherItemListContainer\"]/wt-table/div/div[3]/div[1]/div/div[1]/div/button/span") public WebElement satirEkle;
    @FindBy(xpath = " //*[@id=\"gridlines_active_cell\"]/button") public WebElement stokListesi;
    @FindBy(xpath = "//*[@id=\"gridListCustomerSelect\"]/div[2]/table/tbody/tr[1]") public WebElement stokSec;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[4]/a/span") public WebElement alis;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[4]/ul/li[1]/a/span") public WebElement alisFaturalari;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniFatura;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[2]") public WebElement alisIadeFaturasi;
    @FindBy(xpath = "//*[@id=\"voucherItemListContainer\"]/wt-table/div/div[1]/div[1]/div/button/i") public WebElement cariSec;
    @FindBy(xpath = "//*[@id=\"row0Customergrid\"]") public WebElement listedenCariSec;
    @FindBy(xpath = "//*[@id=\"gridlines_active_cell\"]/button") public WebElement urunEkle;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[2]/div/div/button/span") public WebElement kaydetButton;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]/td[1]/button") public WebElement inceleIconu;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[5]/button") public WebElement duzenleButon;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]") public WebElement ilkFatura;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[4]/a") public WebElement silButton;
    @FindBy(xpath = "/html/body/div[60]/div/div[6]/button[1]") public WebElement evetButton;
    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]") public WebElement basariliyazisi;

}
