package util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class DaoFactory {
	private static Properties config=new Properties();
	
	static{
		
		InputStream in=DaoFactory.class.getClassLoader().getResourceAsStream("util"+File.separatorChar+"dao.properties");
		try {
			config.load(in);
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in!=null){				
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static Object getInstance(String daoName) {
		Object obj=null;
		//class fullname
		String className=config.getProperty(daoName);
		
		//
		
		try {
			Class c = Class.forName(className);
			 obj=c.newInstance();
		} catch (Exception e) {		
			e.printStackTrace();
		}
			return obj;
	}
		public static void main(String[] args){
			Object obj=DaoFactory.getInstance("EmpDao");
		//	com.ems.dao.impl.EmpDaoJdbcImpl obj = new com.ems.dao.impl.EmpDaoJdbcImpl();
			
			System.out.println(obj);
		}
}
