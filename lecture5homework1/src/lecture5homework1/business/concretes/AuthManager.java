package lecture5homework1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lecture5homework1.business.abstracts.AuthService;
import lecture5homework1.business.abstracts.UserService;
import lecture5homework1.core.utilities.mail.MailService;
import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public class AuthManager implements AuthService{

	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	UserService userService;
	MailService mailService;
	
	public AuthManager(UserService userService, MailService mailService) {
		this.userService = userService;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		if (user.getPassword().length()>=6
				&& user.getFirstName().length()>=2
				&& user.getLastName().length()>=2
				&& matcher.matches()
				&& userService.checkEmail(user.getEmail()).getSuccess() == false ) {
			mailService.send(user.getEmail(), "Doðrulama yapmak için linke gidiniz");
			var result = userService.add(user);
			System.out.println(result.getMessage());
		}
		else {
			System.out.println("Maalesef user isteklerini karþýlamýyor.");
		}
			
	}

	@Override
	public void login(LoginDto loginDto) {
		var result = userService.login(loginDto);
		System.out.println(result.getMessage());
	}
	
}
