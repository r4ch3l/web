package dao.impl.hibernate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import pojo.Feedback;
import pojo.User;
import util.DbUtil;
import util.HibernateUtil;
import dao.FeedbackDao;
import dao.UserDao;

public class FeedbackDaoHibernateImpl implements FeedbackDao{

	public void add(Feedback feedback) throws Exception {
		HibernateUtil.getSession().save(feedback);
		
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
