// 
package com.hhz.ump.entity.bid;
// Generated 2012-6-27 11:01:25 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * BidSupAttachRel generated by hbm2java
 */
@Entity
@Table(name="BID_SUP_ATTACH_REL"
    ,schema="POWERDESK"
)
public class BidSupAttachRel  implements java.io.Serializable {


     private String bidSupAttachRelId;
     private BidSup bidSup;
     private String batchNo;
     private String attaBizFlg;
     private String attaTechFlg;
 	private BigDecimal totalPrice; //add 2012-7-24
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

    public BidSupAttachRel() {
    }

	
    public BidSupAttachRel(String bidSupAttachRelId, BidSup bidSup, long recordVersion) {
        this.bidSupAttachRelId = bidSupAttachRelId;
        this.bidSup = bidSup;
        this.recordVersion = recordVersion;
    }
    public BidSupAttachRel(String bidSupAttachRelId, BidSup bidSup, String batchNo, String attaBizFlg, String attaTechFlg, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.bidSupAttachRelId = bidSupAttachRelId;
       this.bidSup = bidSup;
       this.batchNo = batchNo;
       this.attaBizFlg = attaBizFlg;
       this.attaTechFlg = attaTechFlg;
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
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BID_SUP_ATTACH_REL_ID", unique=true, nullable=false, length=50)
    public String getBidSupAttachRelId() {
        return this.bidSupAttachRelId;
    }
    
    public void setBidSupAttachRelId(String bidSupAttachRelId) {
        this.bidSupAttachRelId = bidSupAttachRelId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_SUP_ID", nullable=false)
    public BidSup getBidSup() {
        return this.bidSup;
    }
    
    public void setBidSup(BidSup bidSup) {
        this.bidSup = bidSup;
    }
    
    @Column(name="BATCH_NO", length=10)
    public String getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    
    @Column(name="ATTA_BIZ_FLG", length=1)
    public String getAttaBizFlg() {
        return this.attaBizFlg;
    }
    
    public void setAttaBizFlg(String attaBizFlg) {
        this.attaBizFlg = attaBizFlg;
    }
    
    @Column(name="ATTA_TECH_FLG", length=1)
    public String getAttaTechFlg() {
        return this.attaTechFlg;
    }
    
    public void setAttaTechFlg(String attaTechFlg) {
        this.attaTechFlg = attaTechFlg;
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

    @Column(name = "TOTAL_PRICE", precision = 18)
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}




}


