package action;

import pojo.Feedback;
import util.DaoFactory;
import util.EmailUtil;
import dao.FeedbackDao;

public class SaveFeedback {
private String name;
private String email;
private String message;
private String messageAbout;
private Feedback feedback= new Feedback();
FeedbackDao dao= (FeedbackDao) DaoFactory.getInstance("FeedbackDao");

public  String execute() {
	feedback.setName(name);
	feedback.setEmail(email);
	feedback.setMessage(message);
	feedback.setMessageAbout(messageAbout);
	feedback.setSubmitTime(System.currentTimeMillis());

		try {
			dao.add(feedback) ;
			System.out.println(feedback.getMessage());
			String admin="xiaoxue.beijing@gmail.com";
			EmailUtil.sendEmail(admin,feedback);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	return "fail";
	
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


public Feedback getFeedback() {
	return feedback;
}


public void setFeedback(Feedback feedback) {
	this.feedback = feedback;
}




}
