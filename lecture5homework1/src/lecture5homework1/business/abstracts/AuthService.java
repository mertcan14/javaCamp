package lecture5homework1.business.abstracts;

import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(LoginDto loginDto);
}
