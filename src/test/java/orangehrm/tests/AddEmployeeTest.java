package orangehrm.tests;

import static pagecomponents.LeftMenuComponentType.PIM;

import org.junit.jupiter.api.Test;

import base.TestSetup;
import orangeHrm.entities.EmployeeDetails;
import orangeHrm.entities.LoginDetails;
import orangeHrm.pages.LoginPage;
import testdata.EmployeeTestData;
import testdata.LoginTestDetails;

class AddEmployeeTest extends TestSetup{

	private final EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
	private final LoginDetails loginDetails = LoginTestDetails.getValidLoginTestData();

	@Test
	void testAddEmployee() throws InterruptedException {
		
		LoginPage.getInstance().loginToApp(loginDetails).getLeftMenuComponent().selectAMenuFromLeftBar(PIM).navigateToEmployeeInfoPage()
		.addNewEmployee(employeeDetails).checkWhetherNewEmployeeIsCreated();

	}

}
