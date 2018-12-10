 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  EmployeeInfoDao.java   
 * @Package com.tjclps.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:37:35 AM   
 * @version V1.0     
 */    
  
package com.clps.dao;   
/**   
 * @ClassName:  EmployeeInfoDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:37:35 AM   
 *      
 */

import java.util.List;

import com.clps.entity.EmployeeInfo;




public interface EmployeeInfoDao {
	public EmployeeInfo queryEmployInfo(String username,String password);
	public EmployeeInfo queryEmployInfoById(int id);
	public boolean insertEmployeeInfo(EmployeeInfo eInfo);
}
  