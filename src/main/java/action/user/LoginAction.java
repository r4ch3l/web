package action.user;

import pojo.User;
import util.DaoFactory;
import dao.UserDao;

public class LoginAction {
private String username;
private String password;
private User user=new User();
private String loginError;
UserDao dao= (UserDao) DaoFactory.getInstance("UserDao");

public String execute(){
	try {
		user=dao.findByUsername(username);
		if (user==null){
			loginError="That account doesn't exist.  Username is invalid. ";
			
		}else{
			return "success";
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return "fail";
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String getLoginError() {
	return loginError;
}

public void setLoginError(String loginError) {
	this.loginError = loginError;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
