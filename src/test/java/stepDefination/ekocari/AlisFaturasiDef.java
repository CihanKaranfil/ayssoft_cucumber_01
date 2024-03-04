package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.AlisPages;
import utilities.Driver;

import java.util.List;

public class AlisFaturasiDef {
    AlisPages alisPages = new AlisPages();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @When("Alış menusune tıkla")
    public void alışMenusuneTıkla() {
        alisPages.alis.click();
    }

    @When("Alış Faturalarına tıkla")
    public void alışFaturalarınaTıkla() throws InterruptedException {
        alisPages.alisFaturalari.click();Thread.sleep(1000);
    }

    @Then("Yeni Fatura butonuna tıkla")
    public void yeniFaturaButonunaTıkla() throws InterruptedException {
        alisPages.yeniFatura.click(); Thread.sleep(1000);
    }

    @Then("Alış Faturası oluştura tıkla")
    public void alışFaturasıOluşturaTıkla() {
        alisPages.alisfaturasi.click();
    }

    @When("Cari seçimini yap")
    public void cariSeçiminiYap() {
        alisPages.caributton.click();
        List<WebElement> webElements = Driver.getDriver().findElements(By.xpath("//*[@class='k-master-row']"));

        actions.doubleClick(webElements.get(webElements.size()-1)).perform();

        //alisPages.carisec.click();
        //alisPages.carisec.click();
    }

    @Then("Fatura no gir")
    public void faturaNoGir() {
        alisPages.faturaNo.sendKeys(faker.number().digits(5));
        alisPages.satirEkle.click();
    }

    @Then("Satır ekle butonuna tıkla")
    public void satırEkleButonunaTıkla() throws InterruptedException {
        alisPages.satirEkle.click();
        Thread.sleep(3000);

    }

    @Then("Yeni Alıs Faturası Kaydet butonuna tıklar")
    public void yeniAlısFaturasıKaydetButonunaTıklar() {
        alisPages.kaydetButton.click();
    }

    @Then("Kayıt Basarıyla Kaydedildi yazısını dogrula")
    public void kayıtBasarıylaKaydedildiYazısınıDogrula() {
        alisPages.basariliyazisi.isEnabled();
        Assert.assertTrue(alisPages.basariliyazisi.isEnabled());
    }
}
