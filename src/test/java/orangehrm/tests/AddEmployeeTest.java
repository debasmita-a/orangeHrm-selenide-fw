package orangehrm.tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import orangeHrm.pages.LoginPage;

class AddEmployeeTest {

	@Test
	void testAddEmployee() {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		new LoginPage().loginToApp().getLeftMenuComponent()
		                                 .selectAMenuFromLeftBar("PIM");
	}

}
