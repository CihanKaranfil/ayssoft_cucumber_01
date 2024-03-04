package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ekocari.AlisIrsaliyesiPages;
import utilities.Driver;

public class AlisIrsaliyesiStepDef {
    AlisIrsaliyesiPages alisIrsaliyesi = new AlisIrsaliyesiPages();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Yeni Alıs İrsaliyesi ne tıkla")
    public void yeniAlısİrsaliyesiNeTıkla() {
        alisIrsaliyesi.alisIrsaliyesi.click();

    }

    @Then("Cari seçimini yap yeni irsaliyede")
    public void cariSeçiminiYapYeniIrsaliyede() {
        alisIrsaliyesi.CariSec.click();
        alisIrsaliyesi.listedenCariSec.click();
        alisIrsaliyesi.listedenCariSec.click();

    }

    @When("Kullanici olusturdugu irsliyeye sag tıklar")
    public void kullaniciOlusturduguIrsliyeyeSagTıklar() {
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",alisIrsaliyesi.olusanCari);



    }

    @Then("kullanici olusturdugu irsaliyeyi siler")
    public void kullaniciOlusturduguIrsaliyeyiSiler() {
        alisIrsaliyesi.cariSil.click();
    }
}
