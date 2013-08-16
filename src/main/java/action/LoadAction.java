package action;

import pojo.AboutUsPageContent;
import pojo.PageContent;
import pojo.User;
import util.DaoFactory;
import dao.PageContentDao;

public abstract class LoadAction {
	private User user=new User();
	private PageContent content=new AboutUsPageContent();
	PageContentDao dao= (PageContentDao) DaoFactory.getInstance("PageContentDao");
	
	public abstract String execute();

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
