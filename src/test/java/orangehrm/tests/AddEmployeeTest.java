package orangehrm.tests;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

import orangeHrm.pages.EmployeeInformationPage;
import orangeHrm.pages.LoginPage;

class AddEmployeeTest {

	@Test
	void testAddEmployee() throws InterruptedException {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		new LoginPage().loginToApp().getLeftMenuComponent()
		                                 .selectAMenuFromLeftBar("PIM");
		
		new EmployeeInformationPage().addNewEmployee()
		                                .checkWhetherNewEmployeeIsCreated();
		
		Thread.sleep(5000);
	}

}
