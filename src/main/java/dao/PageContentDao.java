package dao;



import pojo.PageContent;



public interface PageContentDao {

	public PageContent findLatestPageContent(String str) throws Exception;

	public void addPageContent(PageContent pagecontent) throws Exception;

}