package stepDefination.uyumsoft;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.uyumsoft.GirisSayfasiPages;
import utilities.ConfigReader;
import utilities.Driver;

public class GirisSayfası_StepDef {
    GirisSayfasiPages girisSayfasiPage = new GirisSayfasiPages();
    @When("Kullanıcı uyumsoft için kullanıcı adi ve parola girer")
    public void kullanıcıUyumsoftIçinKullanıcıAdiVeParolaGirer() {
        girisSayfasiPage.kullaniciAdi.click();
        girisSayfasiPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"),
                Keys.TAB,ConfigReader.getProperty("parola"));
    }

    @Then("Kullanıcı Oturum Aç butonuna tıklar")
    public void kullanıcıOturumAçButonunaTıklar() throws InterruptedException {
        girisSayfasiPage.oturumAcButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(girisSayfasiPage.bilgilendirmekapat).perform();

    }
}
