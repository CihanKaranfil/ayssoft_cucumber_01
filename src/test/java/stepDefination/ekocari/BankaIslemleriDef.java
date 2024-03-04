package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.BankaPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class BankaIslemleriDef {
    BankaPages bankaPages = new BankaPages();
    Faker faker = new Faker();
    Actions actions =  new Actions(Driver.getDriver());

    @When("Kullanici banka menusune  tıklar")
    public void kullaniciBankaMenusuneTıklar() {
        bankaPages.bankaMenusu.click();

    }

    @Then("Kullanici bankalar menusune tıklar")
    public void kullaniciBankalarMenusuneTıklar() {
        bankaPages.bankalarMenusu.click();
    }

    @Then("Kullanici Yeni banka olustura tıklar")
    public void kullaniciYeniBankaOlusturaTıklar() {
        bankaPages.yeniBanka.click();
    }

    @When("Kullanici banka kodu girer")
    public void kullaniciBankaKoduGirer() {
        bankaPages.bankaKodu.sendKeys(faker.number().digits(3));
    }

    @When("Kullanici banka adı girer")
    public void kullaniciBankaAdıGirer() {
        bankaPages.bankaAdi.sendKeys("İŞ");
    }

    @When("Kullanici banka kaydet butonuna tıklar")
    public void kullaniciBankaKaydetButonunaTıklar() throws InterruptedException {
        bankaPages.kaydetButton.click();
        Thread.sleep(3000);
    }

    @Then("Kullanici olusturdugu banka hesabını siler")
    public void kullaniciOlusturduguBankaHesabınıSiler() {
        actions.contextClick(bankaPages.olusanBanka).perform();
        bankaPages.silIconu.click();
        try {
            try {
                actions.click(bankaPages.evetIconu).perform();
            } catch (Exception e) {
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();", bankaPages.evetIconu2);
            }
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", bankaPages.evetIconu2);
        }

    }
}
