package pagecomponents;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class LeftMenuComponent {
	
	public void selectAMenuFromLeftBar(LeftMenuComponentType menuType) {
		$(byText(menuType.getMenuName())).shouldBe(enabled).click();
	}
	
}
