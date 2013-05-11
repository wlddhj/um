// 
package com.hhz.ump.entity.bid;
// Generated 2012-6-27 11:01:25 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
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
 * BidDivisionSupRel generated by hbm2java
 */
@Entity
@Table(name="BID_DIVISION_SUP_REL"
    
)
public class BidDivisionSupRel  implements java.io.Serializable {


     private String bidDivisionSupRelId;
     private BidSup bidSup;
     private BidDivisiton bidDivisiton;
     private BidProject bidProject;
     private BigDecimal quantitie;
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
     private String itemNo;
     private String itemName;
     private String shortItemNo;
     private String compUnitAmt;
     private String totalAmt;

    public BidDivisionSupRel() {
    }

	
    public BidDivisionSupRel(String bidDivisionSupRelId, BidSup bidSup, long recordVersion) {
        this.bidDivisionSupRelId = bidDivisionSupRelId;
        this.bidSup = bidSup;
        this.recordVersion = recordVersion;
    }
    public BidDivisionSupRel(String bidDivisionSupRelId, BidSup bidSup, BidDivisiton bidDivisiton, BidProject bidProject, BigDecimal quantitie, Long batchNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, Long rowNo, String itemNo, String itemName, String shortItemNo, String compUnitAmt, String totalAmt) {
       this.bidDivisionSupRelId = bidDivisionSupRelId;
       this.bidSup = bidSup;
       this.bidDivisiton = bidDivisiton;
       this.bidProject = bidProject;
       this.quantitie = quantitie;
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
       this.itemNo = itemNo;
       this.itemName = itemName;
       this.shortItemNo = shortItemNo;
       this.compUnitAmt = compUnitAmt;
       this.totalAmt = totalAmt;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BID_DIVISION_SUP_REL_ID", unique=true, nullable=false, length=50)
    public String getBidDivisionSupRelId() {
        return this.bidDivisionSupRelId;
    }
    
    public void setBidDivisionSupRelId(String bidDivisionSupRelId) {
        this.bidDivisionSupRelId = bidDivisionSupRelId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_SUP_ID", nullable=false)
    public BidSup getBidSup() {
        return this.bidSup;
    }
    
    public void setBidSup(BidSup bidSup) {
        this.bidSup = bidSup;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_DIVISITON_ID")
    public BidDivisiton getBidDivisiton() {
        return this.bidDivisiton;
    }
    
    public void setBidDivisiton(BidDivisiton bidDivisiton) {
        this.bidDivisiton = bidDivisiton;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_PROJECT_ID")
    public BidProject getBidProject() {
        return this.bidProject;
    }
    
    public void setBidProject(BidProject bidProject) {
        this.bidProject = bidProject;
    }
    
    @Column(name="QUANTITIE", precision=18, scale=6)
    public BigDecimal getQuantitie() {
        return this.quantitie;
    }
    
    public void setQuantitie(BigDecimal quantitie) {
        this.quantitie = quantitie;
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
    
    @Column(name="ITEM_NO", length=50)
    public String getItemNo() {
        return this.itemNo;
    }
    
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    
    @Column(name="ITEM_NAME", length=100)
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    @Column(name="SHORT_ITEM_NO", length=12)
    public String getShortItemNo() {
        return this.shortItemNo;
    }
    
    public void setShortItemNo(String shortItemNo) {
        this.shortItemNo = shortItemNo;
    }
    
    @Column(name="COMP_UNIT_AMT", length=20)
    public String getCompUnitAmt() {
        return this.compUnitAmt;
    }
    
    public void setCompUnitAmt(String compUnitAmt) {
        this.compUnitAmt = compUnitAmt;
    }
    
    @Column(name="TOTAL_AMT", length=20)
    public String getTotalAmt() {
        return this.totalAmt;
    }
    
    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }




}


