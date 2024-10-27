package orangeHrm.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import orangeHrm.entities.LoginDetails;

public final class LoginPage {
	
	private LoginPage() {
		
	}

	private static final SelenideElement USERNAME = $(Selectors.byName("username"));
	private static final SelenideElement PASSWORD = $(Selectors.byAttribute("placeholder", "Password"));
	private static final SelenideElement LOGIN_BTN = $("[type='submit']");
	
	public static LoginPage getInstance() {
		return new LoginPage();
	}
	
	public HomePage loginToApp(LoginDetails loginDetails) {
		USERNAME.shouldBe(visible).setValue(loginDetails.getUserName());
		PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
		LOGIN_BTN.shouldBe(enabled).click();
		
		return new HomePage();
	}
}
