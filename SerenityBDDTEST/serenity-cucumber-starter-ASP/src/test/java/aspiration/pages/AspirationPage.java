package aspiration.pages;

import aspiration.pageobjects.AspirationPO;
import net.thucydides.core.annotations.Step;
public class AspirationPage {

	AspirationPO aspirationPO;	
	
	@Step
	public void verifyLandingPage() {
		aspirationPO.verifyAspirationLandingPage();
	}
	@Step
	public void navigateToProducts() {
		aspirationPO.clickAspirationHome();
	}
	@Step
	public void viewProducts() {
		aspirationPO.verifyProducts();
	}
	@Step
	public void getAspiration() {
		aspirationPO.clickGetAspiration();
	}
	@Step
	public void verifyGetStartedAspiration() {
		aspirationPO.verifyGetStartedAspiration();
	}
	@Step
	public void clickGetAspirationPlus() {
		aspirationPO.clickGetAspirationPlus();
	}
	@Step
	public void verifyGetStartedAspirationPlus(String plusplanprc,String plusplan,String regplanprc,String regplan) {
		aspirationPO.verifyGetStartedAspirationPlus(plusplanprc, plusplan,regplanprc,regplan);
	}

	
}
