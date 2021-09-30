package aspiration.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


@DefaultUrl("https://aspiration.com/")
public class AspirationPO extends PageObject {

    @FindBy(xpath="//*[@data-testid='hero-title']/*[local-name() = 'h1']")
    WebElementFacade landingPageTxt;
			
	@FindBy(xpath="//a[contains(text(),'Spend & Save')]")
    WebElementFacade spendAndSave;
	
	@FindBy(xpath="//div[contains(text(),'Spend & Save Plans')]")
    WebElementFacade spendAndSavePlans;
	
	@FindBy(xpath="//div[contains(text(),'Aspiration')]")
    WebElementFacade aspirationProduct;
	
	@FindBy(xpath="//div[contains(text(),'Aspiration Plus')]")
    WebElementFacade aspirationPlusProduct;
	
	@FindBy(xpath="//button[contains(text(),'Get Aspiration')]")
    WebElementFacade getAspirationProduct;
	
	@FindBy(xpath="//button[contains(text(),'Get Aspiration Plus')]")
    WebElementFacade getAspirationPlusProduct;

	@FindBy(xpath="//div[contains(text(),'Get Started with Aspiration')]")
    WebElementFacade getStartedAspiration;
	
	@FindBy(name = "email")
	WebElementFacade emailAspiration;
	
	@FindBy(xpath = "//div[@class='close']")
	WebElementFacade closeAspirationStart;
	
	@FindBy(xpath = "//div[@class='logo-plus']")
	WebElementFacade getStartedAspirationPlus;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/h3']")
	WebElementFacade aspirationMonthly;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/p")
	WebElementFacade aspirationMonthlyPrice;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]/h3/text()']")
	WebElementFacade aspirationPlusYearly;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]/p")
	WebElementFacade aspirationPlusYearlyPrice;
	
	String pageUrl;
	String priceYr;
	String priceMon;
	String priceYrPrc;
	String priceMonPrc;
	String productsPage;

	public void verifyAspirationLandingPage()
	{
			
		Assert.assertEquals("You can change Climate Change", landingPageTxt.getText());		
		
	}
	public void clickAspirationHome()
	{
		spendAndSave.click();
					
	}
	public void verifyProducts()
	{	
		Assert.assertTrue(spendAndSavePlans.isDisplayed());
		Assert.assertTrue(aspirationProduct.isDisplayed());
		Assert.assertTrue(aspirationPlusProduct.isDisplayed());		
	}
	public void clickGetAspiration()
	{
		getAspirationProduct.click();
					
	}
	public void clickGetAspirationPlus()
	{
		getAspirationPlusProduct.click();
					
	}
	public void verifyGetStartedAspiration()
	{
		Assert.assertTrue(getStartedAspiration.isDisplayed());	
		Assert.assertTrue(emailAspiration.isPresent());	
		closeAspirationStart.click();
					
	}
	public void verifyGetStartedAspirationPlus(String plusplanprc,String plusplan,String regplanprc,String regplan)
	{
		Assert.assertTrue(getStartedAspirationPlus.isDisplayed());
		this.priceYr = plusplan;
		this.priceYrPrc = plusplanprc;
		this.priceMon = regplan;
		this.priceMonPrc = regplanprc;
		 
		Assert.assertEquals(plusplan, aspirationPlusYearly.getText());
		Assert.assertEquals(plusplanprc, aspirationPlusYearlyPrice.getText());
		
		Assert.assertEquals(regplan, aspirationMonthly.getText());
		Assert.assertEquals(regplanprc, aspirationMonthlyPrice.getText());

	}

}
