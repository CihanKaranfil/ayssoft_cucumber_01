package stepDefination.ekocari;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ekocari.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class EkocariStepDefinotions {
    @Given("Kullanıcı ekocari sitesine gider")
    public void kullanıcı_ekocari_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ekocariUrl"));

    }
    @When("Kullanıcı e pota ve sifre girer")
    public void kullanıcı_e_pota_ve_sifre_girer() {
        HomePage ekocariPage = new HomePage();
        ekocariPage.eposta.sendKeys(ConfigReader.getProperty("eposta"));
        ekocariPage.sifre.sendKeys(ConfigReader.getProperty("sifre"), Keys.ENTER);

    }
    @Then("Kullanici giris butonuna tıklar")
    public void kullanici_giris_butonuna_tıklar() {

    }

    @And("Sayfayı kapar")
    public void sayfayıKapar() {
        Driver.closeDriver();
    }
}
