package orangehrm.tests;

import org.junit.jupiter.api.Test;

import orangeHrm.entities.EmployeeDetails;
import orangeHrm.entities.LoginDetails;
import orangeHrm.pages.EmployeeInformationPage;
import orangeHrm.pages.LoginPage;
import pagecomponents.LeftMenuComponentType;
import testdata.EmployeeTestData;
import testdata.LoginTestDetails;

class AddEmployeeTest {

	EmployeeDetails employee = EmployeeTestData.getRandomEmployeeDetails();
	LoginDetails login = LoginTestDetails.getValidLoginTestData();

	@Test
	void testAddEmployee() throws InterruptedException {
		LoginPage.getInstance().loginToApp(login).getLeftMenuComponent().selectAMenuFromLeftBar(LeftMenuComponentType.PIM);

		new EmployeeInformationPage().addNewEmployee(employee).checkWhetherNewEmployeeIsCreated();

		Thread.sleep(5000);
	}

}
