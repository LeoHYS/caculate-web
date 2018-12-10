 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  monthSalaryService.java   
 * @Package com.tjclps.service   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:36:18 AM   
 * @version V1.0     
 */    
  
package com.clps.service;   
/**   
 * @ClassName:  monthSalaryService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:36:18 AM   
 *      
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.clps.dao.EmployeeInfoDao;
import com.clps.dao.IahfInfoDao;
import com.clps.dao.impl.EmployeeInfoDaoImpl;
import com.clps.dao.impl.IahfInfoDaoImpl;
import com.clps.entity.EmployeeInfo;
import com.clps.entity.IahfInfo;



public class monthSalaryService {
	@SuppressWarnings("unchecked")
	public List getmonthSalary(double quitdays,double overtime,int id) {
		DecimalFormat df = new DecimalFormat(".##");
		EmployeeInfo eInfo = new EmployeeInfo();
		EmployeeInfoDao eDao = new EmployeeInfoDaoImpl();
		eInfo = eDao.queryEmployInfoById(id);
		double mbSalary = eInfo.getmBSalary();
		double overtimemoney = eInfo.getOvertimemoney();
		String sex = eInfo.getSex();
		String location = eInfo.getLocation();
		String username = eInfo.getName();
		
		IahfInfo info = new IahfInfo();
		IahfInfoDao infoDao = new IahfInfoDaoImpl();
		info = infoDao.getQuery(location);
		double housingFund = info.getHousingFund();
		double medicare = info.getMedicare();
		double pension = info.getPension();
		double unemployedInsu = info.getUnemployedInsu();
		
		double realSalary = mbSalary-quitdays*(mbSalary/22)+overtime*overtimemoney;
		double iahf = realSalary*(housingFund+medicare+pension+unemployedInsu);
		
		double needToPay = realSalary-3500;
		double tax = 0;

		if(needToPay<=0) {
			tax=0;
		}else if(needToPay>0&&needToPay<=1500) {
			tax = needToPay*0.03;
		}else if(needToPay>1500&&needToPay<=4500) {
			tax = needToPay*0.1-105;
		}else if (needToPay>4500&&needToPay<=9000) {
			tax = needToPay*0.2-555;
		}else if (needToPay>9000&&needToPay<=35000) {
			tax = needToPay*0.25-1005;
		}else if (needToPay>35000&&needToPay<=55000) {
			tax = needToPay*0.3-2755;
		}else if (needToPay>55000&&needToPay<=80000) {
			tax = needToPay*0.35-5505;
		}else if (needToPay>80000) {
			tax = needToPay*0.45-13505;
		}
		double finalSalary = realSalary-tax-iahf; 
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add(username);
		list.add(sex);
		list.add(mbSalary);
		list.add(df.format(quitdays*(mbSalary/22)));
		list.add(df.format(overtime*overtimemoney));
		list.add(df.format(realSalary));
		list.add(df.format(iahf));
		list.add(df.format(tax));
		list.add(df.format(finalSalary));
		return list;
		
	}
}
  