/**
 * 
 */
package com.hhz.ump.web.res.bean;

/** 出差申请单(宝龙行业)
 * @author huangjian
 *
 * 2011-8-16
 */
public class HrTripApplyBlhy extends BusinessTripPlanSheet {
	private String positionLevel1;//总经理
	private String positionLevel2;//其他人员
	private String positionLevel3;//副总裁
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
