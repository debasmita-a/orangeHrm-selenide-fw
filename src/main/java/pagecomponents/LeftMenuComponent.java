package pagecomponents;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class LeftMenuComponent {
	
	public void selectAMenuFromLeftBar(String menuName) {
		$(byText(menuName)).shouldBe(enabled).click();
	}
	
}
