 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  IahfInfoDaoImpl.java   
 * @Package com.tjclps.dao.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:39:39 AM   
 * @version V1.0     
 */    
  
package com.clps.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.clps.dao.IahfInfoDao;
import com.clps.entity.IahfInfo;
import com.clps.servlet.LoginServlet;
import com.clps.util.dbcpUtil;



/**   
 * @ClassName:  IahfInfoDaoImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:39:39 AM   
 *      
 */
public class IahfInfoDaoImpl implements IahfInfoDao {
	private static Logger logger = Logger.getLogger(LoginServlet.class);

	/**   
	 * <p>Title: getQuery</p>   
	 * <p>Description: </p>   
	 * @param cityName
	 * @return   
	 * @see com.clps.dao.IahfInfoDao#getQuery(java.lang.String)   
	 */  
	@Override
	public IahfInfo getQuery(String cityName) {
		
		Connection conn = dbcpUtil.getConnection();
		String sql = "SELECT * FROM IAHFINFO WHERE CITYNAME = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cityName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				IahfInfo info = new IahfInfo();
				info.setHousingFund(Double.parseDouble(rs.getString("housingfund")));
				info.setMedicare(Double.parseDouble(rs.getString("medicare")));
				info.setPension(Double.parseDouble(rs.getString("pension")));
				info.setUnemployedInsu(Double.parseDouble(rs.getString("unemployedinsu")));
				return info;
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		
	}

	/**   
	 * <p>Title: addIahf</p>   
	 * <p>Description: </p>   
	 * @param list
	 * @return   
	 * @see com.clps.dao.IahfInfoDao#addIahf(java.util.List)   
	 */  
	@Override
	public boolean addIahf(List<IahfInfo> list) {
		
		return false;
		
	}

	

}
  