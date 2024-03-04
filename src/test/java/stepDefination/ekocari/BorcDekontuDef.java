package stepDefination.ekocari;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ekocari.BorcDekontuPages;
import utilities.Driver;

import java.util.List;

public class BorcDekontuDef {
   BorcDekontuPages borcDekontu =new BorcDekontuPages();
   Faker faker = new Faker();
   Actions actions= new Actions(Driver.getDriver());

   @Then("Kullanici Cari hareketlere tıklar")
    public void kullaniciCariHareketlereTıklar() {
        borcDekontu.cariHareketler.click();
    }

    @Then("Kullanici Yeni Cari Hareketlerine tıklar")
    public void kullaniciYeniCariHareketlerineTıklar() throws InterruptedException {
       borcDekontu.yenicariHareketler.click();Thread.sleep(1000);
        
    }

    @Then("Kullanici Borc Dekondunu secer")
    public void kullaniciBorcDekondunuSecer() {
       borcDekontu.borcDekontu.click();
    }

    @When("Kullanici fis no girer")
    public void kullaniciFisNoGirer() {
       borcDekontu.fisNo.clear();
       borcDekontu.fisNo.sendKeys(faker.number().digits(3));
    }

    @Then("Kullanici Cari seçimini yapar")
    public void kullaniciCariSeçiminiYapar() throws InterruptedException {
       borcDekontu.cariButton.click();Thread.sleep(1000);
       borcDekontu.secilenCari.click();
       borcDekontu.secilenCari.click();Thread.sleep(1000);

      // List<WebElement> webElements = Driver.getDriver().findElements(By.xpath("//*[@class='k-master-row']"));

      // actions.doubleClick(webElements.get(webElements.size()-1)).perform();
    }

    @Then("Kullanici Tl Tutar girer")
    public void kullaniciTlTutarGirer() {
       borcDekontu.tlTutar.clear();
       borcDekontu.tlTutar.sendKeys("100");
    }

    @Then("Kullanici Borc Dekontunu kaydeder")
    public void kullaniciBorcDekontunuKaydeder() throws InterruptedException {
        try {
            borcDekontu.kaydetButton.click();
        } catch (Exception e) {
            actions.doubleClick(borcDekontu.kaydetButton2).perform();
        }
        Thread.sleep(3000);
    }

    @When("Kullanici olusturdugu borç dekontuna sag tıklar")
    public void kullaniciOlusturduguBorçDekontunaSagTıklar() throws InterruptedException {
      //List<WebElement> cariHareketler = Driver.getDriver().findElements(By.xpath("//*[@role='row']"));
      //actions.contextClick(cariHareketler.get(cariHareketler.size()-2)).perform();
       //borcDekontu.ilksatır.click();
       //actions.doubleClick(borcDekontu.ilksatır).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", borcDekontu.ilksatır);


       Thread.sleep(3000);
    }

    @Then("Kullanici sil iconuna tıklayıp dekontu siler")
    public void kullaniciSilIconunaTıklayıpDekontuSiler() {
       borcDekontu.silIkonu.click();
       borcDekontu.evetButton.click();
    }
}
