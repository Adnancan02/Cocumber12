package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.KullaniciDataPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KullaniciStepDefinitions {

    KullaniciDataPage kullaniciDataPage=new KullaniciDataPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("editor_datatables_url"));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
 kullaniciDataPage.newButton.click();
    }

    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(kullaniciDataPage.firstName).
                sendKeys(ConfigReader.getProperty("feditor_data_first_name")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_last_name")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_position")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_office")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("sonuc_url")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_salary")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("sonuc_url")).sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("salary")).perform();

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        kullaniciDataPage.createButonu.click();
    }

        @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

    }



    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }


}
