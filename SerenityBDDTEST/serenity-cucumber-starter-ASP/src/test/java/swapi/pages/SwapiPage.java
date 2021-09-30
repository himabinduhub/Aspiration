package swapi.pages;

import net.thucydides.core.annotations.Step;
import swapi.pageobjects.SwapiPO;

public class SwapiPage {
	
	SwapiPO swapiPO;
	
	@Step
	public void apiUrl()
	{
		swapiPO.verifyApiUrlPresent();		
	}
	
	@Step
	public void subUrl(String url)
	{
		swapiPO.enterUrl(url);
					
	}
	
	@Step
	public void request()
	{
		swapiPO.clickRequest();
					
	}
	
	@Step
	public void response()
	{
		swapiPO.verifyResponse();
	}
	
	@Step
	public void totalPeople(Integer people, Integer height)
	{
		swapiPO.verifyTotalPeople(people,height);
					
	}
	@Step
	public void totalPeopleNames(Integer peoplecnt)
	{
		swapiPO.verifyTotalPeopleNames(peoplecnt);
					
	}
	@Step
	public void totalPeopleChecked(Integer checked)
	{
		swapiPO.verifyTotalPeopleChecked(checked);
					
	}
	
	

}
