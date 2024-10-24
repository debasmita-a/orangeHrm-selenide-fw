package base;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeEach;

public class TestSetup {

	@BeforeEach
	void setup() {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
