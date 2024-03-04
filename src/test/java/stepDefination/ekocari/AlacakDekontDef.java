package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.AlacakDekontPages;

public class AlacakDekontDef {
    AlacakDekontPages alacakDekont = new AlacakDekontPages();

    @Then("Kullanici alacak dekontuna tıklar")
    public void kullaniciAlacakDekontunaTıklar() {
        alacakDekont.alacakDekontu.click();

    }
}
