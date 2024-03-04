package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HatalarPages {
    public HatalarPages(){PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[2]/div/div/button/span") public WebElement kaydetbutton;
    @FindBy(xpath = "(//*[@class='btn x-btn ca-footer-btn'])[2]") public WebElement kaydetbutton2;
    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[1]/td[1]/button") public WebElement inceleIconu;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div/div[2]/div/div[5]/button") public WebElement duzenleButon;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[4]/ul/li[2]/a/span") public WebElement alisIrsaliyeleri;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement yeniirsaliyeolustur;
    @FindBy(xpath = "(//*[@data-toggle='dropdown'])[7]") public WebElement yeniirsaliyeolustur2;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/button") public WebElement alisiadeirsaliyeolustur;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[2]") public WebElement alisiadeirsaliyeolustur2;



    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[5]/a/span") public WebElement satisbutonu;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[5]/ul/li[1]/a/span") public WebElement satisFaturalari;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement yeniFatura;
    @FindBy(xpath = "//*[@id=\"select2-txtTRCURR-container\"]") public WebElement paraBirimi;
    @FindBy(xpath = "/html/body/span/span/span[1]/input") public WebElement paraBirimiUSD;

    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[2]/a") public WebElement inceleIconuu;
    @FindBy(xpath = "//*[@id=\"divBtneInvoice\"]/button/span") public WebElement eBelgeButonu;
    @FindBy(xpath = "//*[@id=\"dropdown-menu\"]/a[1]") public WebElement eBelgeGoruntule;
    @FindBy(xpath = "//*[@id=\"notesTableTd\"]") public WebElement acıklamaalanı;




    @FindBy(xpath = "//*[@id=\"gridList\"]/div[2]/table/tbody/tr[2]/td[1]/button") public WebElement gozIconu;



}
