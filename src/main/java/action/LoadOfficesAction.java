package action;

import dao.PageContentDao;

import pojo.PageContent;
import pojo.User;
import util.DaoFactory;

public class LoadOfficesAction extends LoadAction {
private User user=new User();
private PageContent content=new PageContent();
PageContentDao dao= (PageContentDao) DaoFactory.getInstance("PageContentDao");

public String execute(){
	try {
		content=dao.findLatestPageContent("offices");
		 return "success";
	} catch (Exception e) {
		// TODO Auto-generated catch block
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
