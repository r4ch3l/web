package dao;

import java.util.List;

import pojo.User;


public interface UserDao {

	public List<User> findAll(String str) throws Exception;

	public User findById(int id) throws Exception;

	public User findByUsername(String username) throws Exception;

	public void add(User emp) throws Exception;

	public boolean modify(User emp) throws Exception;

	public boolean remove(int id) throws Exception;

}