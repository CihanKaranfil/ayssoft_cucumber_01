package stepDefination.uyumsoft;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.uyumsoft.EFaturaPages;
import utilities.Driver;

public class e_FaturaStepDef {
    EFaturaPages eFaturaPages = new EFaturaPages();
    @When("e-Fatura ve e-Arsiv Fatura düzenlemeye tıkla")
    public void eFaturaVeEArsivFaturaDüzenlemeyeTıkla() {
        eFaturaPages.efaturaDuzenle.click();

    }

    @Then("e-Fatura ve e-Arsiv Fatura Oluştura tıkla")
    public void eFaturaVeEArsivFaturaOluşturaTıkla() throws InterruptedException {
        eFaturaPages.efaturaOlustur.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(50, 70).click().perform();
    }

    @Then("Alıcı ünvan ile arama yap ve alıcı sec")
    public void alıcıÜnvanIleAramaYapVeAlıcıSec() {
        eFaturaPages.aliciVKN.sendKeys("uyumsoft");
        eFaturaPages.Ddmuyumsoft.click();
    }

    @Then("e-Fatura kayıt butonuna tıkla")
    public void eFaturaKayıtButonunaTıkla() throws InterruptedException {
        eFaturaPages.kaydetButon.click();
        Thread.sleep(3000);
    }
}
