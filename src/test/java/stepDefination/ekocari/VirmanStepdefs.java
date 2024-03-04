package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.VirmanPages;

public class VirmanStepdefs {
    VirmanPages virmanPages = new VirmanPages();

    @Then("Kullanici yeni virman fisi olustura tıklar")
    public void kullaniciYeniVirmanFisiOlusturaTıklar() {
        virmanPages.yeniVirmanFisi.click();

    }

    @Then("Kullanici borclu cari secer")
    public void kullaniciBorcluCariSecer() {
    }

    @Then("Kullanici alacakli cari secer")
    public void kullaniciAlacakliCariSecer() {
    }

    @Then("Kullanici virman kaydet butonuna tıklar")
    public void kullaniciVirmanKaydetButonunaTıklar() {
    }
}
