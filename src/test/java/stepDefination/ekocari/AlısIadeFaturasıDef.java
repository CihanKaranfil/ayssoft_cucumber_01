package stepDefination.ekocari;

import io.cucumber.java.en.Then;
import pages.ekocari.AlisPages;

public class AlısIadeFaturasıDef {
    AlisPages alisPages = new AlisPages();
    @Then("Alış İade Faturası olustura tıkla")
    public void alışİadeFaturasıOlusturaTıkla() {
     alisPages.alisIadeFaturasi.click();
    }
}
