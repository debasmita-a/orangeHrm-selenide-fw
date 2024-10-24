package orangeHrm.pages;

import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;

import orangeHrm.entities.EmployeeDetails;

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
		
	
	public EmployeeInformationPage addNewEmployee(EmployeeDetails employee) {
		
		ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
		FIRST_NAME.shouldBe(visible).setValue(employee.getFirstName());
		LAST_NAME.shouldBe(visible).setValue(employee.getLastName());
		MIDDLE_NAME.shouldBe(visible).setValue(employee.getMiddleName());
		IMAGE.shouldBe(enabled).uploadFromClasspath("images/testimg.jpeg");
		SAVE_BUTTON.shouldBe(enabled).click();
		
		return this;
	}
	
	public void checkWhetherNewEmployeeIsCreated() {
		SUCCESS_MESSAGE.shouldHave(visible, text("Success"));
	}

}
