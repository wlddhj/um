package com.hhz.ump.web.res.bean;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;
import org.springside.modules.spring.SpringContextHolder;

import com.hhz.ump.dao.cont.ContLedgerManager;
import com.hhz.ump.entity.cont.ContPay;
import com.hhz.ump.entity.res.ResApproveInfo;
import com.hhz.ump.util.FormatUtil;
import com.hhz.ump.web.res.baseBean.BaseContLedgerTemplate;


/**
 * 工程进度款付款审批表
 * @author baolm
 *
 * 2011-04-28
 */
public class ProjectProgressPayment extends BaseContLedgerTemplate {
	
	/**
	 * 景观、装修、外立面
	 */
	private String otherCondition;
	/**
	 * 合同台账存放的网批CD
	 */
	private String resApproveCd;
	/**
	 * 合同台账存放的网批ID
	 */
	private String resApproveId;
	
	/**
	 * 合同编号
	 */
	private String contNo;
	
	/**
	 * 合同名称
	 */
	private String contName;
	
	/**
	 * 项目cd
	 */
	private String projectCd;

	/**
	 * 乙方(收款人)
	 */
	private String partB;
	
	/**
	 * 合同总价
	 */
	private String totalPrice;
	
	/**
	 * 付款方式
	 */
	private String payWay;
	
	/**
	 * 保修期开始日期
	 */
	private String guarBeginDate;
	
	/**
	 * 保修期结束日期
	 */
	private String guarEndDate;
	
	/**
	 * 结算价
	 */
	private String clearPrice;
	
	/**
	 * 变更后的合同总价
	 */
	private String updateTotal;
	
	/**
	 * 项目名称
	 */
	private String projectName;
	
	/**
	 * ( )期
	 */
	private String projectPeriod;
	
	/**
	 * 付款单位
	 */
	private String paymentUnit;
	
	/**
	 * 收款人开户行
	 */
	private String payeeOpenBankNo;
	
	/**
	 * 收款人账号
	 */
	private String payeeAccountNo;
	
	/**
	 * 本次付款申请金额(元)
	 */
	private String applyAmount;
	
	/**
	 * 已确认产值(含甲供料)
	 */
	private String completeNumThis;
	private String completeNumBefore;
	private String completeNumTotal;

	/**
	 * 扣：甲供料款(按暂定价)
	 */
	private String matieralNumThis;
	private String matieralNumBefore;
	private String matieralNumTotal;
	
	/**
	 * 扣：其他扣款或代扣款
	 */
	private String currentAddThis;
	private String currentAddBefore;
	private String currentAddTotal;
	
	/**
	 * 直接支付
	 */
	private String currentPayThis;
	private String currentPayBefore;
	private String currentPayTotal;
	
	/**
	 * 产值付款比例
	 */
	private String payRateThis;
	private String payRateBefore;
	private String payRateTotal;
	
	/**
	 * 需说明事项/备注
	 */
	private String description;
	
	/**
	 * 结算审批表
	 */
	private String clearApproveId;
	private String curPicId;//现场照片
	
	public String getResApproveCd() {
		return resApproveCd;
	}

	public void setResApproveCd(String resApproveCd) {
		this.resApproveCd = resApproveCd;
	}

	public String getResApproveId() {
		return resApproveId;
	}

	public void setResApproveId(String resApproveId) {
		this.resApproveId = resApproveId;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public String getProjectCd() {
		return projectCd;
	}

	public void setProjectCd(String projectCd) {
		this.projectCd = projectCd;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getGuarBeginDate() {
		return guarBeginDate;
	}

	public void setGuarBeginDate(String guarBeginDate) {
		this.guarBeginDate = guarBeginDate;
	}

	public String getGuarEndDate() {
		return guarEndDate;
	}

	public void setGuarEndDate(String guarEndDate) {
		this.guarEndDate = guarEndDate;
	}

	public String getClearPrice() {
		return clearPrice;
	}

	public void setClearPrice(String clearPrice) {
		this.clearPrice = clearPrice;
	}

	public String getUpdateTotal() {
		return updateTotal;
	}

	public void setUpdateTotal(String updateTotal) {
		this.updateTotal = updateTotal;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPeriod() {
		return projectPeriod;
	}

	public void setProjectPeriod(String projectPeriod) {
		this.projectPeriod = projectPeriod;
	}

	public String getPaymentUnit() {
		return paymentUnit;
	}

	public void setPaymentUnit(String paymentUnit) {
		this.paymentUnit = paymentUnit;
	}

	public String getPayeeOpenBankNo() {
		return payeeOpenBankNo;
	}

	public void setPayeeOpenBankNo(String payeeOpenBankNo) {
		this.payeeOpenBankNo = payeeOpenBankNo;
	}

	public String getPayeeAccountNo() {
		return payeeAccountNo;
	}

	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getApplyAmount() {
		return applyAmount;
	}

	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClearApproveId() {
		return clearApproveId;
	}

	public void setClearApproveId(String clearApproveId) {
		this.clearApproveId = clearApproveId;
	}

	public String getCompleteNumBefore() {
		return completeNumBefore;
	}

	public void setCompleteNumBefore(String completeNumBefore) {
		this.completeNumBefore = completeNumBefore;
	}

	public String getCompleteNumThis() {
		return completeNumThis;
	}

	public void setCompleteNumThis(String completeNumThis) {
		this.completeNumThis = completeNumThis;
	}

	public String getCompleteNumTotal() {
		return completeNumTotal;
	}

	public void setCompleteNumTotal(String completeNumTotal) {
		this.completeNumTotal = completeNumTotal;
	}

	public String getMatieralNumBefore() {
		return matieralNumBefore;
	}

	public void setMatieralNumBefore(String matieralNumBefore) {
		this.matieralNumBefore = matieralNumBefore;
	}

	public String getMatieralNumThis() {
		return matieralNumThis;
	}

	public void setMatieralNumThis(String matieralNumThis) {
		this.matieralNumThis = matieralNumThis;
	}

	public String getMatieralNumTotal() {
		return matieralNumTotal;
	}

	public void setMatieralNumTotal(String matieralNumTotal) {
		this.matieralNumTotal = matieralNumTotal;
	}

	public String getCurrentAddBefore() {
		return currentAddBefore;
	}

	public void setCurrentAddBefore(String currentAddBefore) {
		this.currentAddBefore = currentAddBefore;
	}

	public String getCurrentAddThis() {
		return currentAddThis;
	}

	public void setCurrentAddThis(String currentAddThis) {
		this.currentAddThis = currentAddThis;
	}

	public String getCurrentAddTotal() {
		return currentAddTotal;
	}

	public void setCurrentAddTotal(String currentAddTotal) {
		this.currentAddTotal = currentAddTotal;
	}

	public String getCurrentPayBefore() {
		return currentPayBefore;
	}

	public void setCurrentPayBefore(String currentPayBefore) {
		this.currentPayBefore = currentPayBefore;
	}

	public String getCurrentPayThis() {
		return currentPayThis;
	}

	public void setCurrentPayThis(String currentPayThis) {
		this.currentPayThis = currentPayThis;
	}

	public String getCurrentPayTotal() {
		return currentPayTotal;
	}

	public void setCurrentPayTotal(String currentPayTotal) {
		this.currentPayTotal = currentPayTotal;
	}

	public String getPayRateBefore() {
		return payRateBefore;
	}

	public void setPayRateBefore(String payRateBefore) {
		this.payRateBefore = payRateBefore;
	}

	public String getPayRateThis() {
		return payRateThis;
	}

	public void setPayRateThis(String payRateThis) {
		this.payRateThis = payRateThis;
	}

	public String getPayRateTotal() {
		return payRateTotal;
	}

	public void setPayRateTotal(String payRateTotal) {
		this.payRateTotal = payRateTotal;
	}

	@Override
	public String getResProjectName() {
		// TODO Auto-generated method stub
		return projectName;
	}

	@Override
	public String getResProjectCd() {
		// TODO Auto-generated method stub
		return projectCd;
	}

	@Override
	public String getResTitleName() {
		// TODO Auto-generated method stub
		return contName;
	}

	@Override
	public void doImport() {
		ContLedgerManager contLedgerManager = SpringContextHolder.getBean("contLedgerManager");
		ResApproveInfo approveInfo=getResApproveInfo();
		setResApproveCd(approveInfo.getApproveCd()+approveInfo.getSerialNo());
		resApproveId =approveInfo.getResApproveInfoId();
		ContPay contPay = new ContPay();
		contPay.setResApproveCd(resApproveCd);
		contPay.setResApproveId(resApproveId);
		contPay.setCompleteNum(new BigDecimal(FormatUtil.formatDouble(completeNumThis)));
		contPay.setMatieralNum(new BigDecimal(FormatUtil.formatDouble(matieralNumThis)));
		contPay.setCurrentAdd(new BigDecimal(FormatUtil.formatDouble(currentAddThis)));
		contPay.setCurrentPay(new BigDecimal(FormatUtil.formatDouble(currentPayThis)));
		contPay.setPayRate(new BigDecimal(FormatUtil.formatDouble(payRateThis)));
		contPay.setPayTime(approveInfo.getCompleteDate());
		contLedgerManager.updateContByRes(getContLedgerId(),resApproveCd, "", null, null, contPay);
	}

	@Override
	public boolean isAutoImport() {
		//批完直接导入台账
		return true;
	}

	public String getCurPicId() {
		return curPicId;
	}

	public void setCurPicId(String curPicId) {
		this.curPicId = curPicId;
	}

	public String getOtherCondition() {
		return otherCondition;
	}

	public void setOtherCondition(String otherCondition) {
		this.otherCondition = otherCondition;
	}
	
	public static void main(String[] args) {
//		System.out.println(FormatUtil.formatDouble("17,955,226.25"));
		

		String str = "17,955,226.25";//若226.25,正常显示;若值太大，小数点会被截取.
		String regEx = "[^\\d\\.-]";
		// Pattern p=Pattern.compile(regEx);
		String val = str == null ? "" : str.replaceAll(regEx, "");
		
		System.out.println(String.valueOf(Float.valueOf(StringUtils.isEmpty(val) ? "0" : val)));//1.7955226E7
		System.out.println(String.valueOf(Double.valueOf(StringUtils.isEmpty(val) ? "0" : val)));//1.795522625E7
		
		System.out.println(new BigDecimal(Float.valueOf(StringUtils.isEmpty(val) ? "0" : val)));//17955226
		System.out.println(new BigDecimal(Double.valueOf(StringUtils.isEmpty(val) ? "0" : val)));//17955226.25
	}
}
