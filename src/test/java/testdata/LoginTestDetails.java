package testdata;

import orangeHrm.entities.LoginDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class LoginTestDetails {
	
	private static final PodamFactory FACTORY = new PodamFactoryImpl();

	private LoginTestDetails() {
		
	}
	
	public static LoginDetails getValidLoginTestData() {
		
		return FACTORY.manufacturePojo(LoginDetails.class);	
	}
}
