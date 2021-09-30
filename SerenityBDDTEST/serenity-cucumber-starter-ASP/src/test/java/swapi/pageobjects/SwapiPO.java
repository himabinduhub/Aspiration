package swapi.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.io.FilterReader;
import java.io.Reader;

import org.junit.Assert;
import com.google.gson.JsonParser;


@DefaultUrl("https://swapi.dev/")
public class SwapiPO extends PageObject{

	
	@FindBy(id = "interactive")
	WebElementFacade endPoint;
		
	@FindBy(xpath="//button[contains(text(),'request')]")
    WebElementFacade requestBtn;
	
	@FindBy(id = "interactive_output")
	WebElementFacade response;
	
	@FindBy(xpath = "//div[@class='input-group']")
	WebElementFacade apiUrl;
	
	@SuppressWarnings("deprecation")
	JsonParser jasonParser;
		
	String responseText;
	
	public void verifyApiUrlPresent()
	{
		Assert.assertTrue(apiUrl.isDisplayed());		
	}
	public void enterUrl(String url)
	{
		endPoint.sendKeys(url);
					
	}
	public void clickRequest()
	{
		requestBtn.click();
					
	}
	public void verifyResponse()
	{
		Assert.assertTrue(response.isDisplayed());		
		responseText = response.getTextContent().toString();
		
		Assert.assertEquals("Response received ", responseText.toLowerCase().contains("count"), true);
		Assert.assertEquals("Response contains ", responseText.toLowerCase().contains("results"), true);
					
	}
	public void verifyTotalPeople(Integer people,Integer height)
	{
		responseText = response.getTextContent().toString();
	//	for(i=0;i<responseText.length();i++)
	//	{
	//			String height = responseText.get("height");
	//			if(height>=200)
	//			String name = responseText.get("name");
	//	}
			
		Assert.assertEquals("Response contains ", responseText.toLowerCase().contains("height"),true);
		
	}
	public void verifyTotalPeopleNames(Integer peoplecnt)
	{
		Assert.assertEquals("Response contains ", responseText.toLowerCase().contains("name"),true);
	}
	public void verifyTotalPeopleChecked(Integer checked)
	{
		Assert.assertEquals("Response contains ", responseText.toLowerCase().contains("name"),true);
							
	}

	
}
