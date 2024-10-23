package orangeHrm.pages;

import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class EmployeeInformationPage {
	
	private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText("a", "Add Employee"));
	private static final SelenideElement FIRST_NAME = $(byName("firstName"));
	private static final SelenideElement LAST_NAME = $(byName("lastName"));
	private static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
	private static final SelenideElement SAVE_BUTTON = $(byAttribute("type","submit"));
	private static final SelenideElement IMAGE = $(byXpath("//input[@type='file']"));
	private static final SelenideElement SUCCESS_MESSAGE = $$(byText("Success")).first();
		
	
	public EmployeeInformationPage addNewEmployee() {
		ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
		FIRST_NAME.shouldBe(visible).setValue("abc");
		LAST_NAME.shouldBe(visible).setValue("efg");
		MIDDLE_NAME.shouldBe(visible).setValue("dk");
		IMAGE.shouldBe(enabled).uploadFromClasspath("testimg.jpeg");
		SAVE_BUTTON.shouldBe(enabled).click();
		
		return this;
	}
	
	public void checkWhetherNewEmployeeIsCreated() {
		SUCCESS_MESSAGE.shouldHave(visible, text("Success"));
	}

}
