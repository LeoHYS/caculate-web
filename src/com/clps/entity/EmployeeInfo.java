 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  EnployeeInfo.java   
 * @Package com.tjclps.entity   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Sep 4, 2017 11:04:01 AM   
 * @version V1.0     
 */    
  
package com.clps.entity;   
/**   
 * @ClassName:  EnployeeInfo   
 * @Description:entity   
 * @author: Android_Robot  
 * @date:   Sep 4, 2017 11:04:01 AM   
 *      
 */
public class EmployeeInfo {
	
	private int id;
	private String name;
	private String password;
	private String sex;
	private String location;
	private double mBSalary;
	private double overtimemoney;
	/**  
	 * @Title:  getOvertimemoney <BR>  
	 * @Description: please write your description <BR>  
	 * @return: double <BR>  
	 */
	public double getOvertimemoney() {
		return overtimemoney;
	}
	/**  
	 * @Title:  setOvertimemoney <BR>  
	 * @Description: please write your description <BR>  
	 * @return: double <BR>  
	 */
	public void setOvertimemoney(double overtimemoney) {
		this.overtimemoney = overtimemoney;
	}
	private String status;
	/**  
	 * @Title:  getId <BR>  
	 * @Description: please write your description <BR>  
	 * @return: int <BR>  
	 */
	public int getId() {
		return id;
	}
	/**  
	 * @Title:  setId <BR>  
	 * @Description: please write your description <BR>  
	 * @return: int <BR>  
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**  
	 * @Title:  getName <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getName() {
		return name;
	}
	/**  
	 * @Title:  setName <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**  
	 * @Title:  getPassword <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getPassword() {
		return password;
	}
	/**  
	 * @Title:  setPassword <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**  
	 * @Title:  getSex <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getSex() {
		return sex;
	}
	/**  
	 * @Title:  setSex <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**  
	 * @Title:  getLocation <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getLocation() {
		return location;
	}
	/**  
	 * @Title:  setLocation <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**  
	 * @Title:  getmBSalary <BR>  
	 * @Description: please write your description <BR>  
	 * @return: int <BR>  
	 */
	public double getmBSalary() {
		return mBSalary;
	}
	/**  
	 * @Title:  setmBSalary <BR>  
	 * @Description: please write your description <BR>  
	 * @return: int <BR>  
	 */
	public void setmBSalary(double mBSalary) {
		this.mBSalary = mBSalary;
	}
	/**  
	 * @Title:  getStatus <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getStatus() {
		return status;
	}
	/**  
	 * @Title:  setStatus <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
  