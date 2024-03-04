package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Ekocari_StepDef {
    Faker faker= new Faker();
    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }
    HomePage homePage = new HomePage();
    @When("Kullanici e pota ve sifre girer")
    public void kullaniciEPotaVeSifreGirer()  {

        homePage.eposta.sendKeys(ConfigReader.getProperty("eposta"));
        homePage.sifre.sendKeys(ConfigReader.getProperty("sifre"));

    }

    @Then("Kullanici giris butonuna tiklar")
    public void kullaniciGirisButonunaTiklar() throws InterruptedException {

        homePage.girisbutton.click();
        Thread.sleep(4000);
    }

    @And("Sayfaya giris yapıldığı doğrulanır")
    public void sayfayaGirisYapıldığıDoğrulanır() {

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Firmalar bolumunden firma sec")
    public void firmalarBolumundenFirmaSec() throws InterruptedException {
        try {
            homePage.firmasec.click();
        } catch (Exception e) {
            homePage.firmasec2.click();

        }
        Thread.sleep(5000);
    }

    @When("Cari ye tıklar")
    public void cariYeTıklar() {
        homePage.carisec.click();
    }

    @Then("Cari kartlara tıklar")
    public void cariKartlaraTıklar() {
        homePage.carikartsec.click();

    }

    @Then("Yeni Cari butonuna tıklar")
    public void yeniCariButonunaTıklar() {
        homePage.yenicari.click();
    }

    @When("Cari kodunu gir")
    public void cariKodunuGir() {
        homePage.carikodu.clear();
        homePage.carikodu.sendKeys(faker.number().digits(6));
    }

    @Then("Cari adını gir")
    public void cariAdınıGir() {
        homePage.cariadi.clear();
        homePage.cariadi.sendKeys(faker.name().fullName());
    }

    @Then("Kaydet butonuna tıklar")
    public void kaydetButonunaTıklar() throws InterruptedException {
        try {
            homePage.kaydetbuton.click();
        } catch (Exception e) {
            homePage.kaydetbuton2.click();
        }
        Thread.sleep(4000);
    }

    @Given("Cari listesindeki son karta sag tıklar ve siler")
    public void cariListesindekiSonKartaSagTıklarVeSiler() throws InterruptedException {
        List<WebElement> cariListesi = Driver.getDriver().findElements(By.xpath("//*[@id=\"gridList\"]/div[2]/table/tbody/tr"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(cariListesi.get(cariListesi.size()-1)).perform();
        homePage.cariSil.click();
        Thread.sleep(2000);
        homePage.cariSilevetButton.click();
        Thread.sleep(3000);

    }
}
