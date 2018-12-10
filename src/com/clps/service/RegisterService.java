 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  RegisterService.java   
 * @Package com.clps.service   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 6:24:30 PM   
 * @version V1.0     
 */    
  
package com.clps.service;

import com.clps.dao.EmployeeInfoDao;
import com.clps.dao.impl.EmployeeInfoDaoImpl;
import com.clps.entity.EmployeeInfo;

/**   
 * @ClassName:  RegisterService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 6:24:30 PM   
 *      
 */
public class RegisterService {
	
	public boolean insertInfo(EmployeeInfo eInfo) {
		EmployeeInfoDao eDao = new EmployeeInfoDaoImpl();
		boolean flag = eDao.insertEmployeeInfo(eInfo);
		if (flag) {
			return true;
		}else {
			return false;
		}
		
	}

}
  