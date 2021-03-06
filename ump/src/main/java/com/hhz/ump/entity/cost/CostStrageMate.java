// 
package com.hhz.ump.entity.cost;
// Generated 2012-3-20 10:04:03 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * CostStrageMate generated by hbm2java
 */
@Entity
@Table(name="COST_STRAGE_MATE"
    
)
public class CostStrageMate  implements java.io.Serializable {


     private String costStrageMateId;
     private String resApproveInfoId;
     private String title;
     private String projectName;
     private String projectCd;
     private String contName;
     private String contStrageName;
     private String parta;
     private String partb;
     private String realProvName;
     private String strageFlg;
     private String takeUnitId;
     private String takeUnitName;
     private String takeUnitContNo;
     private String costMateId;
     private String mateName;
     private String useAeraDesc;
     private String buyCycleDesc;
     private String enterDate;
     private BigDecimal buyTotalAmt;
     private BigDecimal toThisTotalNum;
     private BigDecimal outStragePrice;
     private String outStrageAttachId;
     private BigDecimal contTotalNum;
     private BigDecimal budgetAdjustNum;
     private String orderDesc;
     private String provTradeContAttachId;
     private String tradeProjContAttachId;
     private String purchaseTechConfirmFileId;
     private String contNo;
     private String headNames;
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
     private BigDecimal totalFloatRate;
     private BigDecimal strageTotalAmt;
     private long recordVersion;
     private List<CostStrageMateDetail> costStrageMateDetails = new ArrayList<CostStrageMateDetail>();

    public CostStrageMate() {
    }

	
    public CostStrageMate(String costStrageMateId, long recordVersion) {
        this.costStrageMateId = costStrageMateId;
        this.recordVersion = recordVersion;
    }
    public CostStrageMate(String costStrageMateId, String resApproveInfoId, String title,String projectName, String projectCd, String contName, String contStrageName, String parta, String partb,String realProvName, String strageFlg, String takeUnitId, String takeUnitName, String takeUnitContNo, String costMateId, String mateName, String useAeraDesc, String buyCycleDesc, String enterDate, BigDecimal buyTotalAmt, BigDecimal toThisTotalNum, BigDecimal outStragePrice, String outStrageAttachId, BigDecimal contTotalNum, BigDecimal budgetAdjustNum, String orderDesc, String provTradeContAttachId, String tradeProjContAttachId,String purchaseTechConfirmFileId, String contNo, String headNames, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate,BigDecimal totalFloatRate,BigDecimal strageTotalAmt, long recordVersion, List<CostStrageMateDetail> costStrageMateDetails) {
       this.costStrageMateId = costStrageMateId;
       this.resApproveInfoId = resApproveInfoId;
       this.title = title; 
       this.projectName = projectName;
       this.projectCd = projectCd;
       this.contName = contName;
       this.contStrageName = contStrageName;
       this.parta = parta;
       this.partb = partb;
       this.realProvName = realProvName;
       this.strageFlg = strageFlg;
       this.takeUnitId = takeUnitId;
       this.takeUnitName = takeUnitName;
       this.takeUnitContNo = takeUnitContNo;
       this.costMateId = costMateId;
       this.mateName = mateName;
       this.useAeraDesc = useAeraDesc;
       this.buyCycleDesc = buyCycleDesc;
       this.enterDate = enterDate;
       this.buyTotalAmt = buyTotalAmt;
       this.toThisTotalNum = toThisTotalNum;
       this.outStragePrice = outStragePrice;
       this.outStrageAttachId = outStrageAttachId;
       this.contTotalNum = contTotalNum;
       this.budgetAdjustNum = budgetAdjustNum;
       this.orderDesc = orderDesc;
       this.provTradeContAttachId = provTradeContAttachId;
       this.tradeProjContAttachId = tradeProjContAttachId;
       this.purchaseTechConfirmFileId = purchaseTechConfirmFileId;
       this.contNo = contNo;
       this.headNames = headNames;
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
       this.totalFloatRate = totalFloatRate;
       this.strageTotalAmt = strageTotalAmt;
       this.recordVersion = recordVersion;
       this.costStrageMateDetails = costStrageMateDetails;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="COST_STRAGE_MATE_ID", unique=true, nullable=false, length=50)
    public String getCostStrageMateId() {
        return this.costStrageMateId;
    }
    
    public void setCostStrageMateId(String costStrageMateId) {
        this.costStrageMateId = costStrageMateId;
    }
    
    @Column(name="RES_APPROVE_INFO_ID", length=50)
    public String getResApproveInfoId() {
        return this.resApproveInfoId;
    }
    
    public void setResApproveInfoId(String resApproveInfoId) {
        this.resApproveInfoId = resApproveInfoId;
    }
    
    @Column(name="TITLE", length=100)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="PROJECT_NAME", length=50)
    public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name="PROJECT_CD", length=20)
	public String getProjectCd() {
		return projectCd;
	}

	public void setProjectCd(String projectCd) {
		this.projectCd = projectCd;
	}

    @Column(name="REAL_PROV_NAME", length=100)
    
    public String getRealProvName() {
		return realProvName;
	}

	public void setRealProvName(String realProvName) {
		this.realProvName = realProvName;
	}

    @Column(name="STRAGE_FLG", length=1) 
    public String getStrageFlg() {
		return strageFlg;
	}


	public void setStrageFlg(String strageFlg) {
		this.strageFlg = strageFlg;
	}
    
	
	@Column(name="TAKE_UNIT_ID", length=50)
	public String getTakeUnitId() {
		return takeUnitId;
	}

	public void setTakeUnitId(String takeUnitId) {
		this.takeUnitId = takeUnitId;
	}

	@Column(name="CONT_NAME", length=100)
    public String getContName() {
        return this.contName;
    }
    
    public void setContName(String contName) {
        this.contName = contName;
    }
    
    @Column(name="CONT_STRAGE_NAME", length=100)
    public String getContStrageName() {
        return this.contStrageName;
    }
    
    public void setContStrageName(String contStrageName) {
        this.contStrageName = contStrageName;
    }
    
    @Column(name="PARTA", length=100)
    public String getParta() {
        return this.parta;
    }
    
    public void setParta(String parta) {
        this.parta = parta;
    }
    
    @Column(name="PARTB", length=100)
    public String getPartb() {
        return this.partb;
    }
    
    public void setPartb(String partb) {
        this.partb = partb;
    }
    
    @Column(name="TAKE_UNIT_NAME", length=100)
    public String getTakeUnitName() {
        return this.takeUnitName;
    }
    
    public void setTakeUnitName(String takeUnitName) {
        this.takeUnitName = takeUnitName;
    }
    
    @Column(name="TAKE_UNIT_CONT_NO", length=100)
    public String getTakeUnitContNo() {
        return this.takeUnitContNo;
    }
    
    public void setTakeUnitContNo(String takeUnitContNo) {
        this.takeUnitContNo = takeUnitContNo;
    }
    
    @Column(name="COST_MATE_ID", length=50)
    public String getCostMateId() {
        return this.costMateId;
    }
    
    public void setCostMateId(String costMateId) {
        this.costMateId = costMateId;
    }
    
    @Column(name="MATE_NAME", length=400)
    public String getMateName() {
        return this.mateName;
    }
    
    public void setMateName(String mateName) {
        this.mateName = mateName;
    }
    
    @Column(name="USE_AERA_DESC", length=100)
    public String getUseAeraDesc() {
        return this.useAeraDesc;
    }
    
    public void setUseAeraDesc(String useAeraDesc) {
        this.useAeraDesc = useAeraDesc;
    }
    
    @Column(name="BUY_CYCLE_DESC", length=100)
    public String getBuyCycleDesc() {
        return this.buyCycleDesc;
    }
    
    public void setBuyCycleDesc(String buyCycleDesc) {
        this.buyCycleDesc = buyCycleDesc;
    }
    
    @Column(name="ENTER_DATE", length=100)
    public String getEnterDate() {
        return this.enterDate;
    }
    
    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }
    
    @Column(name="BUY_TOTAL_AMT", precision=18)
    public BigDecimal getBuyTotalAmt() {
        return this.buyTotalAmt;
    }
    
    public void setBuyTotalAmt(BigDecimal buyTotalAmt) {
        this.buyTotalAmt = buyTotalAmt;
    }
    
    @Column(name="TO_THIS_TOTAL_NUM", precision=18)
    public BigDecimal getToThisTotalNum() {
        return this.toThisTotalNum;
    }
    
    public void setToThisTotalNum(BigDecimal toThisTotalNum) {
        this.toThisTotalNum = toThisTotalNum;
    }
    
    @Column(name="OUT_STRAGE_PRICE", precision=18)
    public BigDecimal getOutStragePrice() {
        return this.outStragePrice;
    }
    
    public void setOutStragePrice(BigDecimal outStragePrice) {
        this.outStragePrice = outStragePrice;
    }
    
    @Column(name="OUT_STRAGE_ATTACH_ID", length=50)
    public String getOutStrageAttachId() {
        return this.outStrageAttachId;
    }
    
    public void setOutStrageAttachId(String outStrageAttachId) {
        this.outStrageAttachId = outStrageAttachId;
    }
    
    @Column(name="CONT_TOTAL_NUM", precision=18)
    public BigDecimal getContTotalNum() {
        return this.contTotalNum;
    }
    
    public void setContTotalNum(BigDecimal contTotalNum) {
        this.contTotalNum = contTotalNum;
    }
    
    @Column(name="BUDGET_ADJUST_NUM", precision=18)
    public BigDecimal getBudgetAdjustNum() {
        return this.budgetAdjustNum;
    }
    
    public void setBudgetAdjustNum(BigDecimal budgetAdjustNum) {
        this.budgetAdjustNum = budgetAdjustNum;
    }
    
    @Column(name="ORDER_DESC", length=2000)
    public String getOrderDesc() {
        return this.orderDesc;
    }
    
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
    
    @Column(name="PROV_TRADE_CONT_ATTACH_ID", length=50)
    public String getProvTradeContAttachId() {
        return this.provTradeContAttachId;
    }
    
    public void setProvTradeContAttachId(String provTradeContAttachId) {
        this.provTradeContAttachId = provTradeContAttachId;
    }
    
    @Column(name="TRADE_PROJ_CONT_ATTACH_ID", length=50)
    public String getTradeProjContAttachId() {
        return this.tradeProjContAttachId;
    }
    
    public void setTradeProjContAttachId(String tradeProjContAttachId) {
        this.tradeProjContAttachId = tradeProjContAttachId;
    }
    
    @Column(name="PURCHASE_TECH_CONFIRM_FILE_ID", length=50)
    public String getPurchaseTechConfirmFileId() {
		return purchaseTechConfirmFileId;
	}


	public void setPurchaseTechConfirmFileId(String purchaseTechConfirmFileId) {
		this.purchaseTechConfirmFileId = purchaseTechConfirmFileId;
	}
    
    
    @Column(name="CONT_NO", length=100)
    public String getContNo() {
        return this.contNo;
    }
    

	public void setContNo(String contNo) {
        this.contNo = contNo;
    }
    
    @Column(name="HEAD_NAMES", length=400)
    public String getHeadNames() {
        return this.headNames;
    }
    
    public void setHeadNames(String headNames) {
        this.headNames = headNames;
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
    
    @Column(name="TOTAL_FLOAT_RATE", precision=18, scale=2)
    public BigDecimal getTotalFloatRate() {
        return this.totalFloatRate;
    }
    
    public void setTotalFloatRate(BigDecimal totalFloatRate) {
        this.totalFloatRate = totalFloatRate;
    }
    
    @Column(name="STRAGE_TOTAL_AMT", precision=18, scale=2)
    public BigDecimal getStrageTotalAmt() {
		return strageTotalAmt;
	}

	public void setStrageTotalAmt(BigDecimal strageTotalAmt) {
		this.strageTotalAmt = strageTotalAmt;
	}

	@Column(name="RECORD_VERSION", nullable=false, precision=10, scale=0)
    @Version 
    public long getRecordVersion() {
        return this.recordVersion;
    }
    
    public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costStrageMate")
    @BatchSize(size=10)
public List<CostStrageMateDetail> getCostStrageMateDetails() {
        return this.costStrageMateDetails;
    }
    
    public void setCostStrageMateDetails(List<CostStrageMateDetail> costStrageMateDetails) {
        this.costStrageMateDetails = costStrageMateDetails;
    }




}


