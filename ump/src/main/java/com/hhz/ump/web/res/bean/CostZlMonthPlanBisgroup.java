package com.hhz.ump.web.res.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springside.modules.spring.SpringContextHolder;

import com.hhz.ump.dao.plan.CostCtrlBidPurcManager;
import com.hhz.ump.web.res.baseBean.BaseTemplate;
import com.hhz.ump.web.res.baseBean.IAutoImport;

//成本月战略计划(商业集团)
public class CostZlMonthPlanBisgroup extends BaseTemplate implements IAutoImport {

	private String planYear;
	private String planMonth;
	
	private String centerName;
	private String centerCd;
	private String deptName;
	private String deptCd;
	 
	private List<CostZlMonthPlanBisgroupProperty> planProperties = new ArrayList<CostZlMonthPlanBisgroupProperty>();

	@Override
	public void doImport() {

		// 自动导入 成本工作任务招采
		// 自动导入 成本工作任务招采
		CostCtrlBidPurcManager contSettlementManager = SpringContextHolder.getBean("costCtrlBidPurcManager");
		contSettlementManager.importZlPlanByBis(this);
	}

	@Override
	public boolean isAutoImport() {
		return true;
	}
 

	public List<CostZlMonthPlanBisgroupProperty> getPlanProperties() {
		return planProperties;
	}

	public void setPlanProperties(List<CostZlMonthPlanBisgroupProperty> planProperties) {
		this.planProperties = planProperties;
	}

	public String getPlanYear() {
		return planYear;
	}

	public void setPlanYear(String planYear) {
		this.planYear = planYear;
	}

	public String getPlanMonth() {
		return planMonth;
	}

	public void setPlanMonth(String planMonth) {
		this.planMonth = planMonth;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCd() {
		return deptCd;
	}

	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}

	@Override
	public String getResTitleName() {
		// TODO Auto-generated method stub
		return (StringUtils.isBlank(planYear)?"":planYear) + " " + (StringUtils.isBlank(planMonth)?"":planMonth);
	}
 

}
