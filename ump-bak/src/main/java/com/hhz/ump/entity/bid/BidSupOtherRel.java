// 
package com.hhz.ump.entity.bid;
// Generated 2012-6-27 11:01:25 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BidSupOtherRel generated by hbm2java
 */
@Entity
@Table(name="BID_SUP_OTHER_REL"
    ,schema="POWERDESK"
)
public class BidSupOtherRel  implements java.io.Serializable {


     private String bidsupotherrelId;
     private BidSup bidSup;
     private String itemNo;
     private String feeName;
     private String contentDesc;
     private Long batchNo;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private long recordVersion;
     private Long rowNo;
     private String feeAmt;

    public BidSupOtherRel() {
    }

	
    public BidSupOtherRel(String bidsupotherrelId, BidSup bidSup, long recordVersion) {
        this.bidsupotherrelId = bidsupotherrelId;
        this.bidSup = bidSup;
        this.recordVersion = recordVersion;
    }
    public BidSupOtherRel(String bidsupotherrelId, BidSup bidSup, String itemNo, String feeName, String contentDesc, Long batchNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, Long rowNo, String feeAmt) {
       this.bidsupotherrelId = bidsupotherrelId;
       this.bidSup = bidSup;
       this.itemNo = itemNo;
       this.feeName = feeName;
       this.contentDesc = contentDesc;
       this.batchNo = batchNo;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.rowNo = rowNo;
       this.feeAmt = feeAmt;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIDSUPOTHERREL_ID", unique=true, nullable=false, length=50)
    public String getBidsupotherrelId() {
        return this.bidsupotherrelId;
    }
    
    public void setBidsupotherrelId(String bidsupotherrelId) {
        this.bidsupotherrelId = bidsupotherrelId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_SUP_ID", nullable=false)
    public BidSup getBidSup() {
        return this.bidSup;
    }
    
    public void setBidSup(BidSup bidSup) {
        this.bidSup = bidSup;
    }
    
    @Column(name="ITEM_NO", length=50)
    public String getItemNo() {
        return this.itemNo;
    }
    
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    
    @Column(name="FEE_NAME", length=100)
    public String getFeeName() {
        return this.feeName;
    }
    
    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }
    
    @Column(name="CONTENT_DESC", length=1000)
    public String getContentDesc() {
        return this.contentDesc;
    }
    
    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }
    
    @Column(name="BATCH_NO", precision=18, scale=0)
    public Long getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
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
    
    @Column(name="ROW_NO", precision=18, scale=0)
    public Long getRowNo() {
        return this.rowNo;
    }
    
    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }
    
    @Column(name="FEE_AMT", length=20)
    public String getFeeAmt() {
        return this.feeAmt;
    }
    
    public void setFeeAmt(String feeAmt) {
        this.feeAmt = feeAmt;
    }




}

