/**
 * 
 */
package com.hhz.ump.web.res.bean;

/** 请假单(委托管理酒店)
 * @author huangjian
 *
 * 2011-8-16
 */
public class HrHolidayWtjd extends HrHolidayApplySheet {
	private String dayType1;//短期
	private String dayType2;//长期
	private String positionLevel1;//业主代表
	private String positionLevel2;//业主财务代表
	public String getDayType1() {
		return dayType1;
	}
	public void setDayType1(String dayType1) {
		this.dayType1 = dayType1;
	}
	public String getDayType2() {
		return dayType2;
	}
	public void setDayType2(String dayType2) {
		this.dayType2 = dayType2;
	}
	public String getPositionLevel1() {
		return positionLevel1;
	}
	public void setPositionLevel1(String positionLevel1) {
		this.positionLevel1 = positionLevel1;
	}
	public String getPositionLevel2() {
		return positionLevel2;
	}
	public void setPositionLevel2(String positionLevel2) {
		this.positionLevel2 = positionLevel2;
	}
}
