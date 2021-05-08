package lecture5homework1.adapters;
import lecture5homework1.entities.concretes.User;
import lecture5homework1.signUpGoogle.SignUpGoogleManager;

public class SignUpGoogleAdapter implements SignUpGoogleService{
	

	public void register(User user) {
		SignUpGoogleManager googleSignUpManager = new SignUpGoogleManager();
		boolean result = googleSignUpManager.login(user.getEmail());
		if(result) {
			System.out.println("Ba�ar� ile Giri� Yap�ld�");
		}
		else {
			System.out.println("Kay�t olu�mad�");
		}
	}
}
