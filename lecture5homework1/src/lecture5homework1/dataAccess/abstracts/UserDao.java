package lecture5homework1.dataAccess.abstracts;

import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean login(LoginDto loginDto);
	boolean checkEmail(String email);
}
