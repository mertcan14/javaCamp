package lecture5homework1.business.abstracts;

import lecture5homework1.core.utilities.results.Result;
import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public interface UserService {
	Result add(User user);
	Result delete(User user);
	Result update(User user);
	Result login(LoginDto loginDto);
	Result checkEmail(String email);
}
