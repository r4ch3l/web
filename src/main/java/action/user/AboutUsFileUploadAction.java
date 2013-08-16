package action.user;

import dao.PageContentDao;
import pojo.AboutUsPageContent;
import pojo.PageContent;
import pojo.User;
import util.DaoFactory;

public class AboutUsFileUploadAction {
	private User user=new User();
	private PageContent content=new AboutUsPageContent();
	private String title;
	private String paragraph;
	private String paragraph1;
	private String paragraph2;
	private String paragraph3;
	
	PageContentDao dao= (PageContentDao) DaoFactory.getInstance("PageContentDao");

	public String execute(){
		try {
			content.setTitle(title);
			content.setParagraph(paragraph);
			content.setParagraph1(paragraph1);
			content.setParagraph2(paragraph2);
			content.setParagraph3(paragraph3);
			dao.addPageContent(content);
			
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
