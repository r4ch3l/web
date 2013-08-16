package action;

import dao.PageContentDao;
import pojo.AboutUsPageContent;
import pojo.PageContent;
import pojo.User;
import util.DaoFactory;

public class LoadAboutUsAction {
private User user=new User();
private PageContent content=new AboutUsPageContent();
PageContentDao dao= (PageContentDao) DaoFactory.getInstance("PageContentDao");

public String execute(){
	try {
		content=dao.findLatestPageContent("aboutUs");
		 return "success";
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

public PageContent getContent() {
	return content;
}
public void setContent(PageContent content) {
	this.content = content;
}
public PageContentDao getDao() {
	return dao;
}
public void setDao(PageContentDao dao) {
	this.dao = dao;
}



}
