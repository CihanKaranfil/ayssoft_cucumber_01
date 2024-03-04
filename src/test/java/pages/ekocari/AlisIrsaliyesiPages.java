package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlisIrsaliyesiPages {
    public AlisIrsaliyesiPages(){PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div/div/a[1]") public WebElement alisIrsaliyesi ;
    @FindBy(xpath = "//*[@id='row1Customergrid']") public WebElement listedenCariSec ;
    @FindBy(xpath = "//*[@id=\"voucherItemListContainer\"]/wt-table/div/div[1]/div[1]/div/button") public WebElement CariSec ;
    @FindBy(xpath = "//*[@class='k-master-row k-state-selected']") public WebElement olusanCari;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[4]/a") public WebElement cariSil;


}
