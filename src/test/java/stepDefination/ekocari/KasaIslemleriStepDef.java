package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.KasaPages;
import utilities.Driver;

public class KasaIslemleriStepDef {
    KasaPages kasaPages = new KasaPages();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @When("Kullanici kasa menusune tıklar")
    public void kullaniciKasaMenusuneTıklar() throws InterruptedException {
        kasaPages.kasaMenusu.click(); Thread.sleep(2000);
    }

    @Then("Kullanici kasa listedine tıklar")
    public void kullaniciKasaListedineTıklar() throws InterruptedException {
        kasaPages.kasaListesi.click();

    }

    @Then("Kullanici Yeni Kasa butonuna tıklar")
    public void kullaniciYeniKasaButonunaTıklar() throws InterruptedException {
        kasaPages.yeniKasaButton.click();
        Thread.sleep(3000);
    }

    @When("Kullanici kasa kodunu girer")
    public void kullaniciKasaKodunuGirer() {
        kasaPages.kasaKodu.clear();
        kasaPages.kasaKodu.sendKeys(faker.number().digits(7));
    }

    @Then("Kullanici kasa adını girer")
    public void kullaniciKasaAdınıGirer() {
        kasaPages.kasaAdi.clear();
        kasaPages.kasaAdi.sendKeys("Test Kasa 02");
    }

    @Then("Kullanici yeni kasa kaydete tıklar")
    public void kullaniciYeniKasaKaydeteTıklar() throws InterruptedException {
        try {
            kasaPages.yeniKasaButton.click();
        } catch (Exception e) {
           actions.click(kasaPages.kasaKaydetButton).perform();
        }
        Thread.sleep(2000);
    }

    @And("Kullanici yeni kasanın oluştugunu dogrular")
    public void kullaniciYeniKasanınOluştugunuDogrular() {
    }

    @When("Kullanici oluşturdugu kasaya sag clik yapar")
    public void kullaniciOluşturduguKasayaSagClikYapar() {
        actions.contextClick(kasaPages.silinecekKasa).perform();

    }

    @Then("Kullanici sil iconuna tıklar ve kasayı siler")
    public void kullaniciSilIconunaTıklarVeKasayıSiler() throws InterruptedException {
        kasaPages.silmeIkonu.click();
        Thread.sleep(2000);
        try {
            kasaPages.evetButton.click();
        } catch (Exception e) {
           actions.click(kasaPages.evetButton).perform();
        }

    }
}
