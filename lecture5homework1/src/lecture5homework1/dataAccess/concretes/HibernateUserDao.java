package lecture5homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lecture5homework1.dataAccess.abstracts.UserDao;
import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	User user1 = new User(1, "Mertcan", "Yaman", "Mert1437@gmail.com", "123456789");
	User user2 = new User(2, "Mert", "Yaman", "Mert14@gmail.com", "12345678");
	User user3 = new User(3, "Can", "Yaman", "Mert1437@gmail.com", "1234567");
	User user4 = new User(4, "Mert Can", "Yaman", "Mert@gmail.com", "123456789");
	User user5 = new User(5, "Mert", "Can", "Mert1@gmail.com", "123456789");
	
	List<User> listUsers = new ArrayList<User>(Arrays.asList(user1,user2,user3,user4,user5));
	
	
	@Override
	public void add(User user) {
		listUsers.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi." + user.getEmail());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi." + user.getEmail());
		
	}

	@Override
	public boolean login(LoginDto loginDto) {
		for (User userr : listUsers) {
			if (userr.getEmail() == loginDto.getEmail() && userr.getPassword() == loginDto.getPassword()) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public boolean checkEmail(String email) {
		for (User user : listUsers) {
			if (user.getEmail() == email) {
				return true;
			}
		}
		return false;
	}

}
