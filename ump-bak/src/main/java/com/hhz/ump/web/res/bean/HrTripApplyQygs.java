/**
 * 
 */
package com.hhz.ump.web.res.bean;

/** 出差申请单(区域公司)
 * @author huangjian
 *
 * 2011-8-16
 */
public class HrTripApplyQygs extends BusinessTripPlanSheet {
	private String positionLevel1;//总经理
	private String positionLevel2;//副总经理、部门第一负责人
	private String positionLevel3;//其他人员
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
	public String getPositionLevel3() {
		return positionLevel3;
	}
	public void setPositionLevel3(String positionLevel3) {
		this.positionLevel3 = positionLevel3;
	}
}
