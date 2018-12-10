 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  IahfInfoDao.java   
 * @Package com.tjclps.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:36:50 AM   
 * @version V1.0     
 */    
  
package com.clps.dao;   
/**   
 * @ClassName:  IahfInfoDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:36:50 AM   
 *      
 */

import java.util.List;

import com.clps.entity.IahfInfo;



public interface IahfInfoDao {
	
	public IahfInfo getQuery(String cityName);
	public boolean addIahf(List<IahfInfo> list);

}
  