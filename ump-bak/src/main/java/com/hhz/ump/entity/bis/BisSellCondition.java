// 
package com.hhz.ump.entity.bis;
// Generated 2012-6-11 13:35:46 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * BisSellCondition generated by hbm2java
 */
@Entity
@Table(name="BIS_SELL_CONDITION"
    ,schema="POWERDESK"
)
public class BisSellCondition  implements java.io.Serializable {


     private String bisSellConditionId;
     private BigDecimal signMoneyJhMonth;
     private BigDecimal signMoneySjMonth;
     private BigDecimal returnMoneyJhMonth;
     private BigDecimal returnMoneySjMonth;
     private BigDecimal signMoneyJhYear;
     private BigDecimal signMoneySjYear;
     private BigDecimal returnMoneyJhYear;
     private BigDecimal returnMoneySjYear;
     private BigDecimal dsMoney;
     private BigDecimal dsArea;
     private BigDecimal dsSuiteNum;
     private BigDecimal xkMoney;
     private BigDecimal xkArea;
     private BigDecimal xkSuiteNum;
     private BigDecimal notSignMoney;
     private BigDecimal notSignSuiteNum;
     private BigDecimal mortgageArrears;
     private BigDecimal otherArrears;
     private String bisProjectId;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdDeptCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedDeptCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private long recordVersion;
     private Long sellYear;
     private Long sellMonth;
     private String projectName;
     private String statusFlg; //状态：1：新增、2：已提交、3：已确认、4：驳回
     
     
    public BisSellCondition() {
    }

	
    public BisSellCondition(String bisSellConditionId,long recordVersion) {
        this.bisSellConditionId = bisSellConditionId;
        this.recordVersion = recordVersion;
    }
    public BisSellCondition(String bisSellConditionId, BigDecimal signMoneyJhMonth, BigDecimal signMoneySjMonth, BigDecimal returnMoneyJhMonth, BigDecimal returnMoneySjMonth, BigDecimal signMoneyJhYear, BigDecimal signMoneySjYear, BigDecimal returnMoneyJhYear, BigDecimal returnMoneySjYear, BigDecimal dsMoney, BigDecimal dsArea, BigDecimal dsSuiteNum, BigDecimal xkMoney, BigDecimal xkArea, BigDecimal xkSuiteNum, BigDecimal notSignMoney, BigDecimal notSignSuiteNum, BigDecimal mortgageArrears, BigDecimal otherArrears, String bisProjectId, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion,Long sellYear,Long sellMonth,String projectName,String statusFlg) {
       this.bisSellConditionId = bisSellConditionId;
       this.signMoneyJhMonth = signMoneyJhMonth;
       this.signMoneySjMonth = signMoneySjMonth;
       this.returnMoneyJhMonth = returnMoneyJhMonth;
       this.returnMoneySjMonth = returnMoneySjMonth;
       this.signMoneyJhYear = signMoneyJhYear;
       this.signMoneySjYear = signMoneySjYear;
       this.returnMoneyJhYear = returnMoneyJhYear;
       this.returnMoneySjYear = returnMoneySjYear;
       this.dsMoney = dsMoney;
       this.dsArea = dsArea;
       this.dsSuiteNum = dsSuiteNum;
       this.xkMoney = xkMoney;
       this.xkArea = xkArea;
       this.xkSuiteNum = xkSuiteNum;
       this.notSignMoney = notSignMoney;
       this.notSignSuiteNum = notSignSuiteNum;
       this.mortgageArrears = mortgageArrears;
       this.otherArrears = otherArrears;
       this.bisProjectId = bisProjectId;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdDeptCd = createdDeptCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.sellYear = sellYear;
       this.sellMonth = sellMonth;
       this.projectName = projectName;
       this.statusFlg = statusFlg;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    @Column(name="BIS_SELL_CONDITION_ID", unique=true, nullable=false, length=50)
    public String getBisSellConditionId() {
        return this.bisSellConditionId;
    }
    
    public void setBisSellConditionId(String bisSellConditionId) {
        this.bisSellConditionId = bisSellConditionId;
    }
    
    @Column(name="SIGN_MONEY_JH_MONTH", precision=18)
    public BigDecimal getSignMoneyJhMonth() {
        return this.signMoneyJhMonth;
    }
    
    public void setSignMoneyJhMonth(BigDecimal signMoneyJhMonth) {
        this.signMoneyJhMonth = signMoneyJhMonth;
    }
    
    @Column(name="SIGN_MONEY_SJ_MONTH", precision=18)
    public BigDecimal getSignMoneySjMonth() {
        return this.signMoneySjMonth;
    }
    
    public void setSignMoneySjMonth(BigDecimal signMoneySjMonth) {
        this.signMoneySjMonth = signMoneySjMonth;
    }
    
    @Column(name="RETURN_MONEY_JH_MONTH", precision=18)
    public BigDecimal getReturnMoneyJhMonth() {
        return this.returnMoneyJhMonth;
    }
    
    public void setReturnMoneyJhMonth(BigDecimal returnMoneyJhMonth) {
        this.returnMoneyJhMonth = returnMoneyJhMonth;
    }
    
    @Column(name="RETURN_MONEY_SJ_MONTH", precision=18)
    public BigDecimal getReturnMoneySjMonth() {
        return this.returnMoneySjMonth;
    }
    
    public void setReturnMoneySjMonth(BigDecimal returnMoneySjMonth) {
        this.returnMoneySjMonth = returnMoneySjMonth;
    }
    
    @Column(name="SIGN_MONEY_JH_YEAR", precision=18)
    public BigDecimal getSignMoneyJhYear() {
        return this.signMoneyJhYear;
    }
    
    public void setSignMoneyJhYear(BigDecimal signMoneyJhYear) {
        this.signMoneyJhYear = signMoneyJhYear;
    }
    
    @Column(name="SIGN_MONEY_SJ_YEAR", precision=18)
    public BigDecimal getSignMoneySjYear() {
        return this.signMoneySjYear;
    }
    
    public void setSignMoneySjYear(BigDecimal signMoneySjYear) {
        this.signMoneySjYear = signMoneySjYear;
    }
    
    @Column(name="RETURN_MONEY_JH_YEAR", precision=18)
    public BigDecimal getReturnMoneyJhYear() {
        return this.returnMoneyJhYear;
    }
    
    public void setReturnMoneyJhYear(BigDecimal returnMoneyJhYear) {
        this.returnMoneyJhYear = returnMoneyJhYear;
    }
    
    @Column(name="RETURN_MONEY_SJ_YEAR", precision=18)
    public BigDecimal getReturnMoneySjYear() {
        return this.returnMoneySjYear;
    }
    
    public void setReturnMoneySjYear(BigDecimal returnMoneySjYear) {
        this.returnMoneySjYear = returnMoneySjYear;
    }
    
    @Column(name="DS_MONEY", precision=18)
    public BigDecimal getDsMoney() {
        return this.dsMoney;
    }
    
    public void setDsMoney(BigDecimal dsMoney) {
        this.dsMoney = dsMoney;
    }
    
    @Column(name="DS_AREA", precision=18)
    public BigDecimal getDsArea() {
        return this.dsArea;
    }
    
    public void setDsArea(BigDecimal dsArea) {
        this.dsArea = dsArea;
    }
    
    @Column(name="DS_SUITE_NUM", precision=18)
    public BigDecimal getDsSuiteNum() {
        return this.dsSuiteNum;
    }
    
    public void setDsSuiteNum(BigDecimal dsSuiteNum) {
        this.dsSuiteNum = dsSuiteNum;
    }
    
    @Column(name="XK_MONEY", precision=18)
    public BigDecimal getXkMoney() {
        return this.xkMoney;
    }
    
    public void setXkMoney(BigDecimal xkMoney) {
        this.xkMoney = xkMoney;
    }
    
    @Column(name="XK_AREA", precision=18)
    public BigDecimal getXkArea() {
        return this.xkArea;
    }
    
    public void setXkArea(BigDecimal xkArea) {
        this.xkArea = xkArea;
    }
    
    @Column(name="XK_SUITE_NUM", precision=18)
    public BigDecimal getXkSuiteNum() {
        return this.xkSuiteNum;
    }
    
    public void setXkSuiteNum(BigDecimal xkSuiteNum) {
        this.xkSuiteNum = xkSuiteNum;
    }
    
    @Column(name="NOT_SIGN_MONEY", precision=18)
    public BigDecimal getNotSignMoney() {
        return this.notSignMoney;
    }
    
    public void setNotSignMoney(BigDecimal notSignMoney) {
        this.notSignMoney = notSignMoney;
    }
    
    @Column(name="NOT_SIGN_SUITE_NUM", precision=18)
    public BigDecimal getNotSignSuiteNum() {
        return this.notSignSuiteNum;
    }
    
    public void setNotSignSuiteNum(BigDecimal notSignSuiteNum) {
        this.notSignSuiteNum = notSignSuiteNum;
    }
    
    @Column(name="MORTGAGE_ARREARS", precision=18)
    public BigDecimal getMortgageArrears() {
        return this.mortgageArrears;
    }
    
    public void setMortgageArrears(BigDecimal mortgageArrears) {
        this.mortgageArrears = mortgageArrears;
    }
    
    @Column(name="OTHER_ARREARS", precision=18)
    public BigDecimal getOtherArrears() {
        return this.otherArrears;
    }
    
    public void setOtherArrears(BigDecimal otherArrears) {
        this.otherArrears = otherArrears;
    }
    
    @Column(name="BIS_PROJECT_ID", length=50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }
    
    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }

    @Column(name="REMARK", length=200)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="CREATOR", length=20)
    public String getCreator() {
        return this.creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    @Column(name="CREATED_CENTER_CD", length=20)
    public String getCreatedCenterCd() {
        return this.createdCenterCd;
    }
    
    public void setCreatedCenterCd(String createdCenterCd) {
        this.createdCenterCd = createdCenterCd;
    }
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
    }
    
    @Column(name="CREATED_POSITION_CD", length=20)
    public String getCreatedPositionCd() {
        return this.createdPositionCd;
    }
    
    public void setCreatedPositionCd(String createdPositionCd) {
        this.createdPositionCd = createdPositionCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE", length=7)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    @Column(name="UPDATOR", length=20)
    public String getUpdator() {
        return this.updator;
    }
    
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    
    @Column(name="UPDATED_CENTER_CD", length=20)
    public String getUpdatedCenterCd() {
        return this.updatedCenterCd;
    }
    
    public void setUpdatedCenterCd(String updatedCenterCd) {
        this.updatedCenterCd = updatedCenterCd;
    }
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
    }
    
    @Column(name="UPDATED_POSITION_CD", length=20)
    public String getUpdatedPositionCd() {
        return this.updatedPositionCd;
    }
    
    public void setUpdatedPositionCd(String updatedPositionCd) {
        this.updatedPositionCd = updatedPositionCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE", length=7)
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    @Column(name="RECORD_VERSION", nullable=false, precision=10, scale=0)
    @Version 
    public long getRecordVersion() {
        return this.recordVersion;
    }
    
    public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }

    @Column(name = "SELL_YEAR", precision = 10, scale = 0)
	public Long getSellYear() {
		return sellYear;
	}

    public void setSellYear(Long sellYear) {
		this.sellYear = sellYear;
	}

    @Column(name = "SELL_MONTH", precision = 10, scale = 0)
	public Long getSellMonth() {
		return sellMonth;
	}

    public void setSellMonth(Long sellMonth) {
		this.sellMonth = sellMonth;
	}

    @Column(name="PROJECT_NAME", length=50)
    public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Column(name="STATUS_FLG", length=10)
	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
	
}


