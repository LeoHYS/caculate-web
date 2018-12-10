package com.clps.util;

import java.io.DataInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


import org.apache.commons.dbcp.BasicDataSource;

public class dbcpUtil {

	private static BasicDataSource ds;
	private static ThreadLocal<Connection> tl;
	
	static{
		try {
			InputStream is = dbcpUtil.class.getClassLoader().getResourceAsStream("config_proper.properties");
			Properties pro = new Properties();
			pro.load(is);
			is.close();
			ds = new BasicDataSource();
			
			tl = new ThreadLocal<Connection>();
			ds.setDriverClassName(pro.getProperty("driver"));
			ds.setUrl(pro.getProperty("url"));
			ds.setUsername(pro.getProperty("Uname"));
			ds.setPassword(pro.getProperty("password"));
			ds.setInitialSize(Integer.parseInt(pro.getProperty("initsize")));
			ds.setMaxActive(Integer.parseInt(pro.getProperty("maxactive")));
			ds.setMinIdle(Integer.parseInt(pro.getProperty("minidle")));
			ds.setMaxIdle(Integer.parseInt(pro.getProperty("maxidle")));
			ds.setMaxWait(Integer.parseInt(pro.getProperty("maxwait")));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		
		Connection conn = null;
		try {
			conn = ds.getConnection();
			tl.set(conn);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection() {
		Connection conn = tl.get();
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	public static void startTransaction() throws SQLException {
		getConnection().setAutoCommit(false);
	}
	
	
	public static void commit() throws SQLException {
		getConnection().commit();
		getConnection().close();
		tl.remove();
	}
	public static void rollback() throws SQLException {
		getConnection().rollback();
	}
	
}

