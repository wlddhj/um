// 
package com.hhz.ump.entity.bid;
// Generated 2012-7-23 13:29:24 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * BidOpenRecord generated by hbm2java
 */
@Entity
@Table(name="BID_OPEN_RECORD"
    
)
public class BidOpenRecord  implements java.io.Serializable {


     private String bidOpenRecordId;
     private BidLedger bidLedger;
     private Long batchNo;
     private String bidSectionName;
     private String construction;
     private Date lastReceDate;
     private Date openDate;
     private Long inviteSupNum;
     private Long receiveSupNum;
     private BigDecimal projectCost;
     private BigDecimal builtArea;
     private BigDecimal basePrice;
     private String openDep1;
     private String openner1;
     private String openDep2;
     private String openner2;
     private String openDep3;
     private String openner3;
     private String openDep4;
     private String openner4;
     private String openDep5;
     private String openner5;
     private String openDep6;
     private String openner6;
     private String openDep7;
     private String openner7;
     private String sign;
     private String itemNo;
     private String versionNo;
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
     private List<BidOpenRecordSup> bidOpenRecordSups = new ArrayList<BidOpenRecordSup>();

    public BidOpenRecord() {
    }

	
    public BidOpenRecord(String bidOpenRecordId, BidLedger bidLedger, long recordVersion) {
        this.bidOpenRecordId = bidOpenRecordId;
        this.bidLedger = bidLedger;
        this.recordVersion = recordVersion;
    }
    public BidOpenRecord(String bidOpenRecordId, BidLedger bidLedger, Long batchNo, String bidSectionName, String construction, Date lastReceDate, Date openDate, Long inviteSupNum, Long receiveSupNum, BigDecimal projectCost, BigDecimal builtArea, BigDecimal basePrice, String openDep1, String openner1, String openDep2, String openner2, String openDep3, String openner3, String openDep4, String openner4, String openDep5, String openner5, String openDep6, String openner6, String openDep7, String openner7, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<BidOpenRecordSup> bidOpenRecordSups) {
       this.bidOpenRecordId = bidOpenRecordId;
       this.bidLedger = bidLedger;
       this.batchNo = batchNo;
       this.bidSectionName = bidSectionName;
       this.construction = construction;
       this.lastReceDate = lastReceDate;
       this.openDate = openDate;
       this.inviteSupNum = inviteSupNum;
       this.receiveSupNum = receiveSupNum;
       this.projectCost = projectCost;
       this.builtArea = builtArea;
       this.basePrice = basePrice;
       this.openDep1 = openDep1;
       this.openner1 = openner1;
       this.openDep2 = openDep2;
       this.openner2 = openner2;
       this.openDep3 = openDep3;
       this.openner3 = openner3;
       this.openDep4 = openDep4;
       this.openner4 = openner4;
       this.openDep5 = openDep5;
       this.openner5 = openner5;
       this.openDep6 = openDep6;
       this.openner6 = openner6;
       this.openDep7 = openDep7;
       this.openner7 = openner7;
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
       this.bidOpenRecordSups = bidOpenRecordSups;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BID_OPEN_RECORD_ID", unique=true, nullable=false, length=50)
    public String getBidOpenRecordId() {
        return this.bidOpenRecordId;
    }
    
    public void setBidOpenRecordId(String bidOpenRecordId) {
        this.bidOpenRecordId = bidOpenRecordId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_LEDGER_ID", nullable=false)
    public BidLedger getBidLedger() {
        return this.bidLedger;
    }
    
    public void setBidLedger(BidLedger bidLedger) {
        this.bidLedger = bidLedger;
    }
    
    @Column(name="BATCH_NO", precision=10, scale=0)
    public Long getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }
    
    @Column(name="BID_SECTION_NAME", length=50)
    public String getBidSectionName() {
        return this.bidSectionName;
    }
    
    public void setBidSectionName(String bidSectionName) {
        this.bidSectionName = bidSectionName;
    }
    
    @Column(name="CONSTRUCTION", length=50)
    public String getConstruction() {
        return this.construction;
    }
    
    public void setConstruction(String construction) {
        this.construction = construction;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_RECE_DATE", length=7)
    public Date getLastReceDate() {
        return this.lastReceDate;
    }
    
    public void setLastReceDate(Date lastReceDate) {
        this.lastReceDate = lastReceDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OPEN_DATE", length=7)
    public Date getOpenDate() {
        return this.openDate;
    }
    
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    
    @Column(name="INVITE_SUP_NUM", precision=10, scale=0)
    public Long getInviteSupNum() {
        return this.inviteSupNum;
    }
    
    public void setInviteSupNum(Long inviteSupNum) {
        this.inviteSupNum = inviteSupNum;
    }
    
    @Column(name="RECEIVE_SUP_NUM", precision=10, scale=0)
    public Long getReceiveSupNum() {
        return this.receiveSupNum;
    }
    
    public void setReceiveSupNum(Long receiveSupNum) {
        this.receiveSupNum = receiveSupNum;
    }
    
    @Column(name="PROJECT_COST", precision=18)
    public BigDecimal getProjectCost() {
        return this.projectCost;
    }
    
    public void setProjectCost(BigDecimal projectCost) {
        this.projectCost = projectCost;
    }
    
    @Column(name="BUILT_AREA", precision=18)
    public BigDecimal getBuiltArea() {
        return this.builtArea;
    }
    
    public void setBuiltArea(BigDecimal builtArea) {
        this.builtArea = builtArea;
    }
    
    @Column(name="BASE_PRICE", precision=18)
    public BigDecimal getBasePrice() {
        return this.basePrice;
    }
    
    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }
    
    @Column(name="OPEN_DEP1", length=20)
    public String getOpenDep1() {
        return this.openDep1;
    }
    
    public void setOpenDep1(String openDep1) {
        this.openDep1 = openDep1;
    }
    
    @Column(name="OPENNER1", length=20)
    public String getOpenner1() {
        return this.openner1;
    }
    
    public void setOpenner1(String openner1) {
        this.openner1 = openner1;
    }
    
    @Column(name="OPEN_DEP2", length=20)
    public String getOpenDep2() {
        return this.openDep2;
    }
    
    public void setOpenDep2(String openDep2) {
        this.openDep2 = openDep2;
    }
    
    @Column(name="OPENNER2", length=20)
    public String getOpenner2() {
        return this.openner2;
    }
    
    public void setOpenner2(String openner2) {
        this.openner2 = openner2;
    }
    
    @Column(name="OPEN_DEP3", length=20)
    public String getOpenDep3() {
        return this.openDep3;
    }
    
    public void setOpenDep3(String openDep3) {
        this.openDep3 = openDep3;
    }
    
    @Column(name="OPENNER3", length=20)
    public String getOpenner3() {
        return this.openner3;
    }
    
    public void setOpenner3(String openner3) {
        this.openner3 = openner3;
    }
    
    @Column(name="OPEN_DEP4", length=20)
    public String getOpenDep4() {
        return this.openDep4;
    }
    
    public void setOpenDep4(String openDep4) {
        this.openDep4 = openDep4;
    }
    
    @Column(name="OPENNER4", length=20)
    public String getOpenner4() {
        return this.openner4;
    }
    
    public void setOpenner4(String openner4) {
        this.openner4 = openner4;
    }
    
    @Column(name="OPEN_DEP5", length=20)
    public String getOpenDep5() {
        return this.openDep5;
    }
    
    public void setOpenDep5(String openDep5) {
        this.openDep5 = openDep5;
    }
    
    @Column(name="OPENNER5", length=20)
    public String getOpenner5() {
        return this.openner5;
    }
    
    public void setOpenner5(String openner5) {
        this.openner5 = openner5;
    }
    
    @Column(name="OPEN_DEP6", length=20)
    public String getOpenDep6() {
        return this.openDep6;
    }
    
    public void setOpenDep6(String openDep6) {
        this.openDep6 = openDep6;
    }
    
    @Column(name="OPENNER6", length=20)
    public String getOpenner6() {
        return this.openner6;
    }
    
    public void setOpenner6(String openner6) {
        this.openner6 = openner6;
    }
    
    @Column(name="OPEN_DEP7", length=20)
    public String getOpenDep7() {
        return this.openDep7;
    }
    
    public void setOpenDep7(String openDep7) {
        this.openDep7 = openDep7;
    }
    
    @Column(name="OPENNER7", length=20)
    public String getOpenner7() {
        return this.openner7;
    }
    
    public void setOpenner7(String openner7) {
        this.openner7 = openner7;
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
@OneToMany(fetch=FetchType.EAGER, mappedBy="bidOpenRecord")
    @BatchSize(size=10)
public List<BidOpenRecordSup> getBidOpenRecordSups() {
        return this.bidOpenRecordSups;
    }
    
    public void setBidOpenRecordSups(List<BidOpenRecordSup> bidOpenRecordSups) {
        this.bidOpenRecordSups = bidOpenRecordSups;
    }

    @Column(name="SIGN", length=20)
	public String getSign() {
		return sign;
	}


	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name="ITEM_NO", length=50)
	public String getItemNo() {
		return itemNo;
	}


	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	@Column(name="VERSION_NO", length=50)
	public String getVersionNo() {
		return versionNo;
	}


	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}




}


