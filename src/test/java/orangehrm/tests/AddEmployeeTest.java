package orangehrm.tests;

import org.junit.jupiter.api.Test;

import orangeHrm.entities.EmployeeDetails;
import orangeHrm.entities.LoginDetails;
import orangeHrm.pages.EmployeeInformationPage;
import orangeHrm.pages.LoginPage;
import static pagecomponents.LeftMenuComponentType.*;
import testdata.EmployeeTestData;
import testdata.LoginTestDetails;

class AddEmployeeTest {

	EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
	LoginDetails loginDetails = LoginTestDetails.getValidLoginTestData();

	@Test
	void testAddEmployee() throws InterruptedException {
		
		LoginPage.getInstance().loginToApp(loginDetails).getLeftMenuComponent().selectAMenuFromLeftBar(PIM);

		new EmployeeInformationPage().addNewEmployee(employeeDetails).checkWhetherNewEmployeeIsCreated();

		Thread.sleep(5000);
	}

}
