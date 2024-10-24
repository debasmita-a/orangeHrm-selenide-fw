package orangeHrm.entities;

import lombok.Data;

@Data
public class LoginDetails {
	
	@PodamStringValue(strValue = "Admin")
	private String userName;
	
	@PodamStringValue(strValue = "admin123")
	private String password;
	

}
