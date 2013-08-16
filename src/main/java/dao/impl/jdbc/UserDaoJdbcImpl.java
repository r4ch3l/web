package dao.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import pojo.User;
import util.DbUtil;
import dao.UserDao;

public class UserDaoJdbcImpl implements UserDao{

	public void add(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAll(String listOrder) throws Exception {
		String sql="";
		if("".equals(listOrder)||listOrder==null){
			 sql="select id,username,password,email from d_user order by id";
		}else{
			sql="select id,username,password,email from d_user"+listOrder;
		}
		List<User> users=new ArrayList<User>();
		Connection con=null;
		Statement pstm=null;
		ResultSet rs=null;
	
		con=DbUtil.getConnection();		
		pstm=con.createStatement();
		rs=pstm.executeQuery(sql);
			
			
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				users.add(user);
				
			}
		return users;
	
	}

	public User findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByLogin(String name, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUsername(String username) throws Exception {
		String sql="select * from d_user where username = ?";
		User user= new User();
		
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
	
		 con=DbUtil.getConnection();		
		 pstm=con.prepareStatement(sql);
		pstm.setString(1, username);
		 rs=pstm.executeQuery();
		
		while(rs.next()){
			user.setId(rs.getInt("id"));
			user.setEmail(rs.getString("email"));
			user.setUsername(username);
			user.setPassword(rs.getString("password"));
			
		}
		System.out.println("User finded:"+user);
		return user;

		
	}

	public boolean modify(User user) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
