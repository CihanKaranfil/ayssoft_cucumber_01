package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.StokPages;
import utilities.Driver;

public class StokEklemeSilme_Def {
    Faker faker= new Faker();
    StokPages stokPages = new StokPages();

    @Given("Kullanici stok menusune tıklar")
    public void kullaniciStokMenusuneTıklar() {
        stokPages.stok.click();
    }

    @When("Kullanici stok kartlar a tıklar")
    public void kullaniciStokKartlarATıklar() {
        stokPages.stokKartlar.click();
    }

    @Then("Yeni stok butonuna tıklar")
    public void yeniStokButonunaTıklar() {
        stokPages.yeniStok.click();
    }

    @When("Stok kodu alanı doldurulur")
    public void stokKoduAlanıDoldurulur() {
        stokPages.StokKodu.clear();
        stokPages.StokKodu.sendKeys("11", Keys.TAB,"Akü");
    }

    @Then("Stok Adı alanını doldurur")
    public void stokAdıAlanınıDoldurur() {
    }

    @Then("Satış Fiyatı alanını doldurur")
    public void satışFiyatıAlanınıDoldurur() {
        stokPages.satisFiyat.clear();
        stokPages.satisFiyat.sendKeys("80");
    }

    @Then("Alış Fiyatı alanını doldurur")
    public void alışFiyatıAlanınıDoldurur() {
        stokPages.alisFiyat.clear();
        stokPages.alisFiyat.sendKeys("130");
    }

    @Then("Yeni stok Kaydet butonuna tıklar")
    public void yeniStokKaydetButonunaTıklar() throws InterruptedException {
        try {
            stokPages.yeniStokKaydet.click();
        } catch (Exception e) {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(stokPages.yeniStokKaydet).perform();
        }
        Thread.sleep(3000);
    }
}
