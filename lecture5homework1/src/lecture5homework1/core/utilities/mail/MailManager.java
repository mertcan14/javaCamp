package lecture5homework1.core.utilities.mail;

public class MailManager implements MailService{

	@Override
	public void send(String email, String message) {
		System.out.println("Mail içeriði: " + message + "  --  alýcý: " + email);
	}

}
