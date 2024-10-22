package orangeHrm.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {

	private static final SelenideElement USERNAME = $(Selectors.byName("username"));
	private static final SelenideElement PASSWORD = $(Selectors.byAttribute("placeholder", "Password"));
	private static final SelenideElement LOGIN_BTN = $("[type='submit']");
	
	public HomePage loginToApp() {
		USERNAME.shouldBe(visible).setValue("Admin");
		PASSWORD.shouldBe(visible).setValue("admin123");
		LOGIN_BTN.shouldBe(enabled).click();
		
		return new HomePage();
	}
}
