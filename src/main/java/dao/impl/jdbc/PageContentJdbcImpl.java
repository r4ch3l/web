package dao.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.PageContentDao;

import pojo.PageContent;

import util.DbUtil;



public class PageContentJdbcImpl implements PageContentDao {

	public PageContent findLatestPageContent(String pagename) throws Exception{
		String sql="select * from d_"+pagename+"_page Order by id desc";
		PageContent pc= new  PageContent();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
	
		 con=DbUtil.getConnection();		
		stmt=con.createStatement();
		 rs=stmt.executeQuery(sql);
		
		
		while(rs.next()){
			pc.setId(rs.getInt("id"));
			pc.setParagraph(rs.getString("paragraph"));
			pc.setParagraph1(rs.getString("paragraph_1"));
			pc.setParagraph2(rs.getString("paragraph_2"));
			pc.setParagraph3(rs.getString("paragraph_3"));
			pc.setPublishTime(rs.getLong("publish_time"));
			pc.setTitle(rs.getString("title"));
			System.out.println(pc.getTitle());
			return pc;
			
		}

		return null;
		
		
	}



	public void addPageContent(PageContent pagecontent) throws Exception {
		String sql="insert into d_aboutUs_page(title,paragraph,paragraph_1,paragraph_2,paragraph_3,publish_time) values(?,?,?,?,?,?);";
		Connection con=null;
		PreparedStatement pstm=null;
		
		 con=DbUtil.getConnection();
		 pstm=con.prepareStatement(sql);
		
			int index=1;
			pstm.setString(index++,pagecontent.getTitle());
			pstm.setString(index++ ,pagecontent.getParagraph());
			pstm.setString(index++ ,pagecontent.getParagraph1());
			pstm.setString(index++,pagecontent.getParagraph2());
			pstm.setString(index++,pagecontent.getParagraph3());
			pstm.setLong(index++,System.currentTimeMillis());
			int rs= pstm.executeUpdate();

		
	}

}