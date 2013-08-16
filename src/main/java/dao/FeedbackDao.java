package dao;

import java.util.List;

import pojo.Feedback;
import pojo.User;


public interface FeedbackDao {

	public List<Feedback> findAll() throws Exception;

	public Feedback findById(int id) throws Exception;

	public Feedback findByUsername(String username) throws Exception;

	public void add(Feedback fd) throws Exception;

	public boolean modify(Feedback fd) throws Exception;

	public boolean remove(int id) throws Exception;

}