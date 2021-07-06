package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Amazon Sayfasina Gider")
    public void amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @When("Samsung Not20 arama cubuguna yazar")
    public void samsung_not20_arama_cubuguna_yazar() {
        amazonPage.aramaKutusu.sendKeys("Samsung Not20" + Keys.ENTER);
    }

    @Then("sonuclarinda Samsung Not20 yazisi varmi test eder")
    public void sonuclarinda_samsung_not20_yazisi_varmi_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Samsung Not20"));
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
