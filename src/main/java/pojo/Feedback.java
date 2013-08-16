package pojo;

public class Feedback {
	private Integer id;
	private String name;
	private String email;
	private String message;
	private String messageAbout;
	private long submitTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageAbout() {
		return messageAbout;
	}
	public void setMessageAbout(String messageAbout) {
		this.messageAbout = messageAbout;
	}
	public long getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(long submitTime) {
		this.submitTime = submitTime;
	}
	
	
	
}
