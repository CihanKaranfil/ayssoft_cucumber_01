package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ekocari.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Ekocari_StepDef {
    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("ekocariUrl"));
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
    public void firmalarBolumundenFirmaSec() {
        try {
            homePage.carisec.click();
        } catch (Exception e) {
            homePage.carisec2.click();
        }
    }
}
