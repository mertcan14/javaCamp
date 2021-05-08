package lecture5homework1.business.concretes;

import lecture5homework1.business.abstracts.UserService;
import lecture5homework1.core.utilities.results.ErrorResult;
import lecture5homework1.core.utilities.results.Result;
import lecture5homework1.core.utilities.results.SuccessResult;
import lecture5homework1.dataAccess.abstracts.UserDao;
import lecture5homework1.entities.concretes.LoginDto;
import lecture5homework1.entities.concretes.User;

public class UserManager implements UserService{

	UserDao _userDao;
	
	
	public UserManager(UserDao userDao) {
		this._userDao = userDao;
	}

	@Override
	public Result add(User user) {
		_userDao.add(user);
		return new SuccessResult("Baþarýlý bir þekilde eklendi");
	}
	
	

	@Override
	public Result delete(User user) {
		// TODO Auto-generated method stub
		_userDao.delete(user);
		return new SuccessResult("Baþarýlý bir þekilde silindi.");
	}

	@Override
	public Result update(User user) {
		// TODO Auto-generated method stub
		_userDao.update(user);
		return new SuccessResult("Baþarýlý bir þekilde güncellendi.");
	}

	@Override
	public Result login(LoginDto loginDto) {
		// TODO Auto-generated method stub
		
		var result = _userDao.login(loginDto);
		if (result == true) {
			return new SuccessResult("Baþarýlý bir þekilde giriþ yapýldý");
		}
		else {
			return new ErrorResult("Kullanýcý bilgileri yanlýþ");
		}
	}

	@Override
	public Result checkEmail(String email) {
		var result = _userDao.checkEmail(email);
		if (result == true) {
			return new SuccessResult();
		}
		else {
			return new ErrorResult();
		}
		
	}

}
