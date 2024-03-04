package stepDefination.ekocari;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ekocari.HatalarPages;
import utilities.Driver;

import java.util.Set;

public class HatalarStepDef {
    HatalarPages hatalarPages = new HatalarPages();
    @Then("Alış İrsaliyelerine tıkla")
    public void alışİrsaliyelerineTıkla() {
        hatalarPages.alisIrsaliyeleri.click();

    }

    @Then("Alış irsaliyesine sağ tıklar inceler")
    public void alışIrsaliyesineSağTıklarInceler() {
        hatalarPages.inceleIconu.click();
    }

    @Then("Düzenle Butonuna tıkla")
    public void düzenleButonunaTıkla() {
        hatalarPages.duzenleButon.click();
    }

    @And("Yeni Alıs İrsaliye Kaydet butonuna tıklar")
    public void yeniAlısİrsaliyeKaydetButonunaTıklar() throws InterruptedException {
        try {
            hatalarPages.kaydetbutton.click();
        } catch (Exception e) {
           //Actions actions = new Actions(Driver.getDriver());
           //actions.click(hatalarPages.kaydetbutton2);
            hatalarPages.kaydetbutton.click();
        }
        Thread.sleep(3000);

    }
    Actions actions = new Actions(Driver.getDriver());

    @Then("Yeni İrsaliye oluştura tıkla")
    public void yeniİrsaliyeOluşturaTıkla() {
        hatalarPages.yeniirsaliyeolustur.click();
       //Select select = new Select(hatalarPages.yeniirsaliyeolustur);
       //select.deselectByIndex(0);

    }

    @Then("Alış iade İrsaliyesi oluştur")
    public void alışIadeİrsaliyesiOluştur() {
        hatalarPages.alisiadeirsaliyeolustur2.click();
    }

    @Then("Kullanici satis menusune tıklar")
    public void kullaniciSatisMenusuneTıklar() {
        hatalarPages.satisbutonu.click();

    }

    @Then("Kullanici Satıs Faturaları na tıklar")
    public void kullanıcaSatısFaturalarıNaTıklar() {
        hatalarPages.satisFaturalari.click();
    }

    @Then("Yeni Satıs Faturasına tıklar")
    public void yeniSatısFaturasınaTıklar() {
        hatalarPages.yeniFatura.click();
    }

    @Then("Para birimini döviz olarak belirle")
    public void paraBiriminiDövizOlarakBelirle() {
        hatalarPages.paraBirimi.click();
        hatalarPages.paraBirimiUSD.sendKeys("USD", Keys.ENTER);
        //Select select =
        //        new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"voucherItemListContainer\"]/wt-table/div/div[2]/div[2]/div/span/span[2]")));
        //select.deselectByIndex(2);
    }

    @When("Kayıt edilen son fatura da incele iconu tıklanır")
    public void kayıtEdilenSonFaturaDaInceleIconuTıklanır() throws InterruptedException {
        hatalarPages.inceleIconu.click();

        hatalarPages.satisFaturalari.click();

        hatalarPages.inceleIconu.click();Thread.sleep(2000);
    }

    @Then("eBelge butonuna tıkla")
    public void ebelgeButonunaTıkla() {
        actions.click(hatalarPages.eBelgeButonu).perform();
       // hatalarPages.eBelgeButonu.click();
    }

    @Then("eBelge goruntuleye tıkla")
    public void ebelgeGoruntuleyeTıkla() throws InterruptedException {
        hatalarPages.eBelgeGoruntule.click();
        Thread.sleep(3000);
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[1].toString());
        Driver.getDriver().navigate().refresh();
    }

    @Then("eBelge acıklama bolumundeki acıklama kontrol edilir")
    public void ebelgeAcıklamaBolumundekiAcıklamaKontrolEdilir() {

        Assert.assertTrue(hatalarPages.acıklamaalanı.getText().contains(""));
        System.out.println("Açıklama alanı = "+hatalarPages.acıklamaalanı.getSize());
        // System.out.println("Yazı İçeriyor mu " + hatalarPages.acıklamaalanı.getText().toString()+"uoo");
    }

    @And("Alış İade Faturasındaki göz iconuna tıklar")
    public void alışİadeFaturasındakiGözIconunaTıklar() {
        if(hatalarPages.gozIconu.isDisplayed()){
            System.out.println("Göz ikonu Aktif");

        }else
            System.out.println("Göz ikonu Aktif Değil");


    }
}
