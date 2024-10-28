package pagecomponents;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import orangeHrm.pages.EmployeeInformationPage;

import static com.codeborne.selenide.Condition.*;

public class LeftMenuComponent {
	
	public LeftMenuComponent selectAMenuFromLeftBar(LeftMenuComponentType menuType) {
		
		$(byText(menuType.getMenuName())).shouldBe(enabled).click();
		return this;
	}
	
	
	public EmployeeInformationPage navigateToEmployeeInfoPage() {
		return new EmployeeInformationPage();
	}
}
