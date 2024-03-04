package pages.ekocari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"MAIL\"]") public WebElement eposta ;
    @FindBy(xpath = "//*[@id=\"PASSWORD\"]") public WebElement sifre ;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[4]/div/button") public WebElement girisbutton ;

    @FindBy(xpath = "//*[@id=\"firmaModal\"]/div[3]/button[2]") public WebElement firmasec;
    @FindBy(xpath = "(//*[@class='x-btn ca-footer-btn'])[2]") public WebElement firmasec2;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]") public WebElement carisec;
    @FindBy(xpath = "(//*[@class='x-btn ca-footer-btn'])[2]") public WebElement carisec2;
    @FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[1]/a/span") public WebElement carikartsec;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[4]/div[1]/button") public WebElement yenicari;
    @FindBy(xpath = "//*[@id=\"txtCODE\"]") public WebElement carikodu;
    @FindBy(xpath = "//*[@id=\"txtDEFINITION_\"]") public WebElement cariadi;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[2]/div[2]/div/div[2]/button[1]") public WebElement kaydetbuton;
    @FindBy(xpath = "//*[@id=\"gelecekDeger\"]/div[1]/div[2]/div/div/button/span") public WebElement kaydetbuton2;
    @FindBy(xpath = "//*[@id=\"context-menu\"]/context-menu-content/div/ul/li[6]/a") public WebElement cariSil;

    @FindBy(xpath = "/html/body/div[26]/div/div[6]/button[1]") public WebElement cariSilevetButton;
}
