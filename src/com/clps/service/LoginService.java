
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  LoginService.java   
 * @Package com.tjclps.service   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 1:14:51 PM   
 * @version V1.0     
 */

package com.clps.service;
/**   
 * @ClassName:  LoginService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 1:14:51 PM   
 *      
 */

import java.util.Iterator;
import java.util.List;

import com.clps.dao.EmployeeInfoDao;
import com.clps.dao.impl.EmployeeInfoDaoImpl;
import com.clps.entity.EmployeeInfo;

public class LoginService {

	private EmployeeInfoDao eInfoDao;

	public EmployeeInfo vaildate(String username,String password) {
		EmployeeInfoDao eDao = new EmployeeInfoDaoImpl();
		EmployeeInfo eInfo = eDao.queryEmployInfo(username, password);
		return eInfo;
	}
}
