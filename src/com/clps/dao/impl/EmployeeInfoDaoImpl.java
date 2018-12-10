 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  EmployeeInfoDaoImpl.java   
 * @Package com.tjclps.dao.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:38:53 AM   
 * @version V1.0     
 */    
  
package com.clps.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.clps.dao.EmployeeInfoDao;
import com.clps.entity.EmployeeInfo;
import com.clps.servlet.LoginServlet;
import com.clps.util.dbcpUtil;



/**   
 * @ClassName:  EmployeeInfoDaoImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:38:53 AM   
 *      
 */
public class EmployeeInfoDaoImpl  implements EmployeeInfoDao {
	private static Logger logger = Logger.getLogger(EmployeeInfoDaoImpl.class);


	/**   
	 * <p>Title: queryEmployInfo</p>   
	 * <p>Description: </p>   
	 * @param username
	 * @param password
	 * @return   
	 * @see com.clps.dao.EmployeeInfoDao#queryEmployInfo(java.lang.String, java.lang.String)   
	 */  
	@Override
	public EmployeeInfo queryEmployInfo(String username, String password) {
		
		Connection conn = dbcpUtil.getConnection();
		String sql = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			System.out.println(username);
			System.out.println(password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				EmployeeInfo eInfo = new EmployeeInfo();
				eInfo.setId(rs.getInt("id"));
				return eInfo;
			}		
		} catch (SQLException e) {
			logger.error("出错");
			e.printStackTrace();
			
		}
		return null;
	}

	/**   
	 * <p>Title: queryEmployInfoById</p>   
	 * <p>Description: </p>   
	 * @param id
	 * @return   
	 * @see com.clps.dao.EmployeeInfoDao#queryEmployInfoById(int)   
	 */  
	@Override
	public EmployeeInfo queryEmployInfoById(int id) {
		Connection conn = dbcpUtil.getConnection();
		String sql = "SELECT * FROM USER WHERE ID = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				EmployeeInfo eInfo = new EmployeeInfo();
				eInfo.setName(rs.getString("username"));
				eInfo.setSex(rs.getString("sex"));
				eInfo.setmBSalary(rs.getDouble("mbsalary"));
				eInfo.setOvertimemoney(rs.getDouble("overtimemoney"));
				eInfo.setLocation(rs.getString("location"));
				return eInfo;
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**   
	 * <p>Title: insertEmployeeInfo</p>   
	 * <p>Description: </p>   
	 * @param eInfo
	 * @return   
	 * @see com.clps.dao.EmployeeInfoDao#insertEmployeeInfo(com.clps.entity.EmployeeInfo)   
	 */  
	@Override
	public boolean insertEmployeeInfo(EmployeeInfo eInfo) {
		Connection conn = dbcpUtil.getConnection();
		String sql = "INSERT INTO USER(USERNAME,PASSWORD,SEX,LOCATION,MBSALARY,OVERTIMEMONEY) values(?,?,?,?,?,?)";
		 try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eInfo.getName());
			ps.setString(2, eInfo.getPassword());
			ps.setString(3, eInfo.getSex());
			ps.setString(4, eInfo.getLocation());
			ps.setDouble(5, eInfo.getmBSalary());
			ps.setDouble(6, eInfo.getOvertimemoney());
			int count = ps.executeUpdate();
			if (count > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}}
  