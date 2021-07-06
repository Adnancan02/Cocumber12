package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class KullaniciDataPage {

    public KullaniciDataPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy (xpath = "//button[@class='btn']")
    public WebElement createButonu;


}
