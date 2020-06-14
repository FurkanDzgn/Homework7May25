package Tests.Audi.com;

import Pages.AudiPage;
import Tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.Utils;
import utils.converterClass;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AudiTest extends TestBase {

    AudiPage page;

    @BeforeClass
    public void setUpPage(){
        page=new AudiPage(driver);

    }

    @Test
    public void case1() throws InterruptedException {
        driver.get("https://www.audiusa.com/");
        WebDriverWait wait=new WebDriverWait(driver, 20);
        Actions actions=new Actions(driver);
        actions.moveToElement(page.models).perform();
        page.SUVsAndWagons.click();
        Thread.sleep(1000);
        page.cookeisClose.click();

        Thread.sleep(1000);
        List<WebElement> prices=page.prices;
        for(WebElement prc:prices){
            if(!(prc.getText().isEmpty()))
            System.out.println(prc.getText());
        //    Assert.assertTrue(prc.getText().contains("$"));
        }
        actions.moveToElement(page.Q52020).click().perform();

        Thread.sleep(1000);
 //       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
//        System.out.println(page.theCarYear.getText());
        Assert.assertTrue(page.theCarYear.isDisplayed());
        Thread.sleep(1000);
//        System.out.println(page.startingAt.getText());
        Assert.assertTrue(page.startingAt.getText().contains("$43,300"));

//       wait.until(ExpectedConditions.visibilityOf(page.build));
//       wait.until(ExpectedConditions.elementToBeClickable(page.build));
        page.build.click();

        List<WebElement> version=page.versionOfCar;
        for(WebElement vr:version){
            Assert.assertTrue(vr.isDisplayed());
        }

        // Validate three version has three different options -->> I need to solve
        List<WebElement> difVersion=page.differentVersion;
        for(WebElement dif:difVersion){
            System.out.println(dif.getText());
        }

        Thread.sleep(500);
        actions.moveToElement(page.premiumPlus45TFSI).click().perform();
  //      page.premiumPlus45TFSI.click();

        Thread.sleep(500);
        page.continueButton.click();

        Thread.sleep(1000);
  //      System.out.println(page.optionalEquipment.getText());
 //       Assert.assertEquals(page.optionalEquipment.getText(),"$0");

        String expected="$48,695";
        Assert.assertEquals(page.totalPrice.getText(),expected);
        Thread.sleep(1000);
//        System.out.println(page.blueMetallicColor.getText());
//        Assert.assertTrue(page.blueMetallicColor.getText().contains("Navarra Blue metallic"));
        page.blueMetallic.click();
        Assert.assertEquals(page.getOptionalPrice.getText(),"$595");
        Thread.sleep(1000);
        Assert.assertTrue(page.newTotalPrice.getText().contains("$49,290"));
        page.blackOpticpackage.click();
        Assert.assertTrue(page.validate.isDisplayed());
        Assert.assertTrue(page.selectButton.isDisplayed());
        page.getContinueButton.click();
        Thread.sleep(500);
        page.warmWeatherPackage.click();
        Thread.sleep(500);
        Assert.assertTrue(page.getNewTotalPrice.getText().contains("$52,040"));
        Assert.assertEquals(page.validateZero.getText(),"$0");
    //    actions.moveToElement(page.decorativeInlays).click().perform();
        page.decorativeInlays.click();
        Thread.sleep(1000);
    //    Assert.assertEquals(page.getValidateZero.getText(),"$0"); // Verify Decorative Inlays prices are equals to $0

        page.getContinueButton2.click();

        actions.moveToElement(page.addConfiguration).click().perform();
        actions.release().perform();
        Thread.sleep(1000);
        actions.moveToElement(page.clickSome).click().perform();
        actions.release().perform();
        Thread.sleep(1000);
   //     actions.moveToElement(page.addBangOlufsen).click().perform();
        page.addBangOlufsen.click();
        Thread.sleep(1000);
        actions.moveToElement(page.clickSome).click().perform();
        actions.release().perform();


        Assert.assertEquals(page.addConfigurationSelect.getText(),"Selected");
        Assert.assertEquals(page.addBangOlufsenSelect.getText(),"Selected");

        Assert.assertTrue(page.getNewTotalPrice2.getText().contains("$53,340"));

        page.getContinueButton3.click();

        Thread.sleep(1000);
        Assert.assertTrue(page.bikeRack.isDisplayed());

        Assert.assertTrue(page.bikePrice.getText().contains("$190"));
        Assert.assertTrue(page.cargoBox.isDisplayed());
        Assert.assertTrue(page.cargoPrice.getText().contains("$60"));

        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());

//        actions.moveToElement(page.addBikeRack).click().perform();
//        actions.release().perform();
        Thread.sleep(500);
        page.addBikeRack.click();
        Thread.sleep(250);
        actions.moveToElement(page.imgClick).click().perform();
        actions.release().perform();
        Thread.sleep(1000);
        page.getContinueButton3.click();
        Thread.sleep(2000);
//        Assert.assertTrue(page.bikeDisplay.isDisplayed());
        Assert.assertEquals(page.getBikePrice.getText(),"$190");
        Assert.assertTrue(page.msrpPrice.isDisplayed());

//        System.out.println(page.msrpPrice.getText());
//        System.out.println(page.blueMetallicPrice.getText());
//        System.out.println(page.seatPrice.getText());
//        System.out.println(page.rearSideAirbagsPrc.getText());
//        System.out.println(page.blackOptikPackagePrc.getText());
//        System.out.println(page.warmWeatherPackagePrc.getText());
//        System.out.println(page.bangOlufsenPrc.getText());
//        System.out.println(page.getBikePrice.getText());
//        System.out.println(page.equipmentPrc.getText());
//        System.out.println(page.destinationChargePrc.getText());
//        System.out.println(page.priceAsBuilt.getText());

        Double msrpPrice= converterClass.value(page.msrpPrice.getText());
        System.out.println(msrpPrice);

        Double bluePrc=converterClass.value(page.blueMetallicPrice.getText());
     //   System.out.println(bluePrc);
        Double seatPrc=converterClass.value(page.seatPrice.getText());
     //   System.out.println(seatPrc);
        Double rearSidePrc=converterClass.value(page.rearSideAirbagsPrc.getText());
    //    System.out.println(rearSidePrc);
        Double optikPrc=converterClass.value(page.blackOptikPackagePrc.getText());
     //   System.out.println(optikPrc);
        Double warmWeprc=converterClass.value(page.warmWeatherPackagePrc.getText());
    //    System.out.println(warmWeprc);
        Double bangPrc=converterClass.value(page.bangOlufsenPrc.getText());
      //  System.out.println(bangPrc);
        Double bikePrc=converterClass.value(page.getBikePrice.getText());
      //  System.out.println(bikePrc);
        Double result=bluePrc+seatPrc+rearSidePrc+optikPrc+warmWeprc+bangPrc+bikePrc;
        Double eqPrc=converterClass.value(page.equipmentPrc.getText());
     //   System.out.println(result);
     //   System.out.println(eqPrc);

        Assert.assertEquals(result,eqPrc);
        Double destPrc=converterClass.value(page.destinationChargePrc.getText());
        Double res=msrpPrice+eqPrc+destPrc;
        Double total=converterClass.value(page.priceAsBuilt.getText());
        Assert.assertEquals(res,total);












    }


}
