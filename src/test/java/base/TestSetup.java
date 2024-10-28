package base;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import com.codeborne.selenide.junit5.TextReportExtension;

@ExtendWith({TextReportExtension.class})
public class TestSetup {

	@BeforeEach
	void setup() {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
