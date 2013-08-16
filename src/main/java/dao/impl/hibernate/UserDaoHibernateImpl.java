package dao.impl.hibernate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;



import pojo.User;
import util.DbUtil;
import util.HibernateUtil;
import dao.UserDao;


public class UserDaoHibernateImpl implements UserDao{

	public void add(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAll(String listOrder) throws Exception {
		String hql="from user";
		if("".equals(listOrder)||listOrder==null){
			hql="from user order by id";
		}else{
			hql="from user order by "+listOrder;
		}
	
		Query query=HibernateUtil.getSession().createQuery(hql);
		query.setCacheable(true);
		List<User> users=query.list();
		
	
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
		String hql="from user where username =? ";
		Query query=HibernateUtil.getSession().createQuery(hql);
		query.setString(0, username);
		User user=(User) query.uniqueResult();
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
