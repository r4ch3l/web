package pojo;

public class User {
	private Integer id;
	private String email;
	private String username;
	private String password;
	private String userIntegral;
	private String isEmailVerified;
	private String emailVerifyCode;
	private long lastLoginTime;
	private String lastLoginIP;
	
	
	
	public User(){
		
	}
	
	
	
	public String getUserIntegral() {
		return userIntegral;
	}



	public void setUserIntegral(String userIntegral) {
		this.userIntegral = userIntegral;
	}



	public String getIsEmailVerified() {
		return isEmailVerified;
	}



	public void setIsEmailVerified(String isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}



	public String getEmailVerifyCode() {
		return emailVerifyCode;
	}



	public void setEmailVerifyCode(String emailVerifyCode) {
		this.emailVerifyCode = emailVerifyCode;
	}



	public long getLastLoginTime() {
		return lastLoginTime;
	}



	public void setLastLoginTime(long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}



	public String getLastLoginIP() {
		return lastLoginIP;
	}



	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
