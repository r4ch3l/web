package dao.impl.hibernate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Query;

import dao.PageContentDao;


import pojo.PageContent;

import util.DbUtil;
import util.HibernateUtil;



public class PageContentHibernateImpl implements PageContentDao {

	public PageContent findLatestPageContent(String pagename) throws Exception{
		String hql="from ? order by id desc";
		PageContent pc= new  PageContent();
		Query query=HibernateUtil.getSession().createQuery(hql);
		query.setString(0, pagename);
		pc=(PageContent) query.uniqueResult();

		return pc;
		
		
	}


	
	public void addPageContent(PageContent pagecontent) throws Exception {
		
		 HibernateUtil.getSession().save(pagecontent);

		
	}

}