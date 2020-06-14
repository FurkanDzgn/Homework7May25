package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AudiPage {

    public AudiPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="global-models")
    public WebElement models;

    @FindBy(xpath = "(//a[@title='SUVs and Wagons'])[1]")
    public WebElement SUVsAndWagons;

    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg close-icon']")
    public WebElement cookeisClose;

    @FindBy(xpath = "//div[@class='txt']//span[@class='price']")
    public List<WebElement> prices;

    @FindBy(xpath = "//img[@data-bumper-responsive-image-url='https://media-service.audiusa.com/s7/audiusa/Models/2020-Models-Jellies/2020-Model-Profiles/2020_Profile_Temp/2020-Q5-profile-con.png']")
    public WebElement Q52020;

    @FindBy(xpath = "(//div[@class='content-overlay__content responsive-container text-white']//div[@class='text parbase section']//p//b[@class='text-white'])[1]")
    public WebElement startingAt;

    @FindBy(xpath = "(//div[@class='content-overlay__content responsive-container text-white']//span[@class='text-white']//span[contains(text(),'2020 Audi Q5')])")
    public WebElement theCarYear;

    // (//div[@class='image-content responsive-container']//span[@class='text-white']//span[@class='extendedbold'])
    //*[@id="image_21324958591"]/div[2]/div/div/div/div/div[1]/div/h1/span/span/span

    @FindBy(xpath = "(//div[@class='multilinks section']//a[@class='button no-icon center-text grey no-background fat'])[1]")
    public WebElement build;

    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-container']//div[@class='audi-headline-order-3 nm-module-trimline-engine-headline']")
    public List<WebElement> versionOfCar;

    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-container']//ul[@class='nm-module-trimline-engine-list']//li//div//div[@class='audi-headline-order-3 nm-module-trimline-engine-name']")
    public List<WebElement> differentVersion;

    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-container']//ul[@class='nm-module-trimline-engine-list']//li[@data-configurator-id='FYB5NY0WPS6W9_2020']//span[@class='audi-checkbox nm-module-trimline-engine-checkbox nm-j-configurator-delegate-click']")
    public WebElement premiumPlus45TFSI;

    @FindBy(xpath = "//a[@class='nm-pageOpen audi-button audi-button--ghost']")
    public WebElement continueButton;

    @FindBy(xpath = "//li[@data-configurator-id='A2A2']//span[@class='nm-j-configurator-text-price audi-copy-m']")
    public WebElement optionalEquipment;

    @FindBy(xpath = "//div[contains(text(),'$48,695')]")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[contains(text(),'Navarra Blue metallic')]")
    public WebElement blueMetallicColor;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div[2]/div/audi-configurator-tile-list[1]/div/div/ul/li[12]/div/div[1]/div/img")
    public WebElement blueMetallic;

    @FindBy(xpath = "//li[@data-configurator-id='2D2D']//span[@class='nm-j-configurator-text-price audi-copy-m']")
    public WebElement getOptionalPrice;

    @FindBy(xpath = "//div[contains(text(),'$49,290')]")
    public WebElement newTotalPrice;

    @FindBy(xpath = "//li[@data-configurator-id='40T_in_PFW']")
    public WebElement blackOpticpackage;

    @FindBy(xpath = "//li[@data-configurator-id='40T_in_PFW']//div[@class='nm-module-tiles-uncategorized-description']")
    public WebElement validate;

    @FindBy(xpath = "//button[@class='audi-button nm-teaser-equipment-list-item__button  nm-j-configurator-delegate-click']")
    public WebElement selectButton;

    @FindBy(xpath = "//a[@class='nm-pageOpen audi-button audi-button--ghost']")
    public WebElement getContinueButton;

    @FindBy(xpath = "//div[@data-configurator-id='Q1D_in_PS8']//span[@class='audi-checkbox-symbol']")
    public WebElement warmWeatherPackage;

    @FindBy(xpath = "//div[contains(text(),'$52,040')]")
    public WebElement getNewTotalPrice;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div[2]/div/audi-configurator-tile-list[1]/div/div/ul/li[2]/div/div[2]/div[1]/span")
    public WebElement validateZero;

    @FindBy(xpath = "//li[@data-configurator-id='5MT']//div[@class='nm-module-tiles-uncategorized-tile-container']")
    public WebElement decorativeInlays;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div[2]/div/audi-configurator-tile-list[2]/div/div/ul/li[8]/div/div[2]/div[1]/span")
    public WebElement getValidateZero;

    @FindBy(xpath = "//a[@class='nm-pageOpen audi-button audi-button--ghost']")
    public WebElement getContinueButton2;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div[2]/div/div[1]/div[18]/div/div/button")
    public WebElement addConfiguration;
    //div[@data-configurator-id='9VS']//button[@class='audi-button nm-teaser-equipment-list-item__button  nm-j-configurator-delegate-click']
    @FindBy(xpath = "//div[@data-configurator-id='9VS']//button[@x-cq-linkchecker='skip']")
    public WebElement addBangOlufsen;

    @FindBy(xpath = "//img[@alt='45ca18e4-ccb4-4f3c-9e47-1ae5d162c27e.jpg']")
    public WebElement clickSome;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div[2]/div/div[1]/div[18]/div/div/button//span[contains(text(),'Selected')]")
    public WebElement addConfigurationSelect;

    @FindBy(xpath = "//div[@data-configurator-id='9VS']//button[@x-cq-linkchecker='skip']//span[contains(text(),'Selected')]")
    public WebElement addBangOlufsenSelect;

    @FindBy(xpath = "//div[contains(text(),'$53,340')]")
    public WebElement getNewTotalPrice2;

    @FindBy(xpath = "//a[@class='nm-pageOpen audi-button audi-button--ghost']")
    public WebElement getContinueButton3;

    @FindBy(xpath = "//div[contains(text(),'Fork Mount Bike Rack')]")
    public WebElement bikeRack;

    @FindBy(xpath = "//div[contains(text(),'$190')]")
    public WebElement bikePrice;

    @FindBy(xpath = "//div[contains(text(),'Audi Interior Cargo Box')]")
    public WebElement cargoBox;

    @FindBy(xpath = "//div[contains(text(),'$60')]")
    public WebElement cargoPrice;

    @FindBy(xpath = "//div[@data-configurator-id='Z8R0071128C']//button[@x-cq-linkchecker='skip']")
    public WebElement addBikeRack;

    @FindBy(xpath = "//img[@alt='f9dcc197-c455-4098-a2b7-6d27674289f9.jpg']")
    public WebElement imgClick;

//    @FindBy(xpath = "//li[@data-configurator-id='Z8R0071128C']//div")
//    public WebElement bikeDisplay;

    @FindBy(xpath = "//span[@class='js-configurator-model-text-price']")
    public WebElement msrpPrice;

    @FindBy(xpath = "//li[@data-configurator-id='2D2D']//span[contains(text(),'$595')]")
    public WebElement blueMetallicPrice;

    @FindBy(xpath = "//li[@data-configurator-id='K_MSIBN1F_YM']//span[contains(text(),'$0')]")
    public WebElement seatPrice;

    @FindBy(xpath = "//li[@data-configurator-id='4X4']//span[contains(text(),'$350')]")
    public WebElement rearSideAirbagsPrc;

    @FindBy(xpath = "//li[@data-configurator-id='PFW']//span[contains(text(),'$1,300')]")
    public WebElement blackOptikPackagePrc;

    @FindBy(xpath = "//li[@data-configurator-id='PS8']//span[contains(text(),'$1,450')]")
    public WebElement warmWeatherPackagePrc;

    @FindBy(xpath = "//li[@data-configurator-id='9VS']//span[contains(text(),'$950')]")
    public WebElement bangOlufsenPrc;

    @FindBy(xpath = "//li[@data-configurator-id='Z8R0071128C']//span[contains(text(),'$190')]")
    public WebElement getBikePrice;

    @FindBy(xpath = "//span[@class='nm-summary-options-total__value audi-copy-m nm-j-configurator-text-optionsPrice']")
    public WebElement equipmentPrc;

    @FindBy(xpath = "//span[@class='nm-summary-options-total__value audi-copy-m']")
    public WebElement destinationChargePrc;

    @FindBy(xpath = "//span[@class='nm-summary-options-total__value audi-headline-order-3 nm-j-configurator-text-totalWithCharges']")
    public WebElement priceAsBuilt;



}
