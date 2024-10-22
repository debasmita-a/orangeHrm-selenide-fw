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
	
	public void addEmployee() {
		ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
		FIRST_NAME.shouldBe(visible).setValue("FirstName");
		LAST_NAME.shouldBe(visible).setValue("LastName");
		MIDDLE_NAME.shouldBe(visible).setValue("Middle");
		
		SAVE_BUTTON.shouldBe(enabled).click();
	}

}
