package lecture5homework1;

import lecture5homework1.adapters.SignUpGoogleAdapter;
import lecture5homework1.business.concretes.AuthManager;
import lecture5homework1.business.concretes.UserManager;
import lecture5homework1.core.utilities.mail.MailManager;
import lecture5homework1.dataAccess.concretes.HibernateUserDao;
import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()), new MailManager());
		UserManager userManager = new UserManager(new HibernateUserDao());
		User newUser = new User(6, "Mertcan", "Yaman", "mermer@gmail.com", "12345689");
		
		SignUpGoogleAdapter signUpGoogleAdapter = new SignUpGoogleAdapter();
		signUpGoogleAdapter.register(newUser);
		LoginDto newLogin = new LoginDto("Mert1437@gmail.com", "123456789");
		authManager.register(newUser);
		userManager.delete(newUser);
		authManager.login(newLogin);
	}

}
