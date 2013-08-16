package dao.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import pojo.Feedback;
import pojo.User;
import util.DbUtil;
import dao.FeedbackDao;
import dao.UserDao;

public class FeedbackDaoJdbcImpl implements FeedbackDao{

	public void add(Feedback fd) throws Exception {
		String sql="insert into d_feedback(name,email,message,message_about,submit_time) values(?,?,?,?,?);";
		Connection con=null;
		PreparedStatement pstm=null;
		
		 con=DbUtil.getConnection();
		 pstm=con.prepareStatement(sql);
		
			int index=1;
			pstm.setString(index++, fd.getName());
			pstm.setString(index++, fd.getEmail());
			pstm.setString(index++, fd.getMessage());
			pstm.setString(index++, fd.getMessageAbout());
			pstm.setLong(index++, fd.getSubmitTime());
			
			int rs= pstm.executeUpdate();
			
	
	
		
	}

	public List<Feedback> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Feedback findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Feedback findByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modify(Feedback fd) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	
}
