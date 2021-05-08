package lecture5homework1.entities.concretes;

import lecture5homework1.core.entities.abstracts.Dto;

public class LoginDto implements Dto{
	private String email;
	private String password;
	
	public LoginDto(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
