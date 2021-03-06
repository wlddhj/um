// 
package com.hhz.ump.entity.bid;
// Generated 2012-6-27 11:01:25 by Hibernate Tools 3.2.2.GA



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
 * BidDivisiton generated by hbm2java
 */
@Entity
@Table(name="BID_DIVISITON"
    
)
public class BidDivisiton  implements java.io.Serializable {


     private String bidDivisitonId;
     private BidProject bidProject;
     private String itemNo;
     private String itemName;
     private String itemDesc;
     private String unitDesc;
     private String compUnitPriceAmt;
     private String totalAmt;
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
     private Long batchNo;
     private String shortItemNo;
     private String quantitie;
     private List<BidDivisionSupRel> bidDivisionSupRels = new ArrayList<BidDivisionSupRel>();

    public BidDivisiton() {
    }

	
    public BidDivisiton(String bidDivisitonId, BidProject bidProject, long recordVersion) {
        this.bidDivisitonId = bidDivisitonId;
        this.bidProject = bidProject;
        this.recordVersion = recordVersion;
    }
    public BidDivisiton(String bidDivisitonId, BidProject bidProject, String itemNo, String itemName, String itemDesc, String unitDesc, String compUnitPriceAmt, String totalAmt, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, Long rowNo, Long batchNo, String shortItemNo, String quantitie, List<BidDivisionSupRel> bidDivisionSupRels) {
       this.bidDivisitonId = bidDivisitonId;
       this.bidProject = bidProject;
       this.itemNo = itemNo;
       this.itemName = itemName;
       this.itemDesc = itemDesc;
       this.unitDesc = unitDesc;
       this.compUnitPriceAmt = compUnitPriceAmt;
       this.totalAmt = totalAmt;
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
       this.batchNo = batchNo;
       this.shortItemNo = shortItemNo;
       this.quantitie = quantitie;
       this.bidDivisionSupRels = bidDivisionSupRels;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BID_DIVISITON_ID", unique=true, nullable=false, length=50)
    public String getBidDivisitonId() {
        return this.bidDivisitonId;
    }
    
    public void setBidDivisitonId(String bidDivisitonId) {
        this.bidDivisitonId = bidDivisitonId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_PROJECT_ID", nullable=false)
    public BidProject getBidProject() {
        return this.bidProject;
    }
    
    public void setBidProject(BidProject bidProject) {
        this.bidProject = bidProject;
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
    
    @Column(name="ITEM_DESC", length=500)
    public String getItemDesc() {
        return this.itemDesc;
    }
    
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    
    @Column(name="UNIT_DESC", length=10)
    public String getUnitDesc() {
        return this.unitDesc;
    }
    
    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }
    
    @Column(name="COMP_UNIT_PRICE_AMT", length=20)
    public String getCompUnitPriceAmt() {
        return this.compUnitPriceAmt;
    }
    
    public void setCompUnitPriceAmt(String compUnitPriceAmt) {
        this.compUnitPriceAmt = compUnitPriceAmt;
    }
    
    @Column(name="TOTAL_AMT", length=20)
    public String getTotalAmt() {
        return this.totalAmt;
    }
    
    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
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
    
    @Column(name="BATCH_NO", precision=18, scale=0)
    public Long getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }
    
    @Column(name="SHORT_ITEM_NO", length=12)
    public String getShortItemNo() {
        return this.shortItemNo;
    }
    
    public void setShortItemNo(String shortItemNo) {
        this.shortItemNo = shortItemNo;
    }
    
    @Column(name="QUANTITIE", length=20)
    public String getQuantitie() {
        return this.quantitie;
    }
    
    public void setQuantitie(String quantitie) {
        this.quantitie = quantitie;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidDivisiton")
    @BatchSize(size=10)
public List<BidDivisionSupRel> getBidDivisionSupRels() {
        return this.bidDivisionSupRels;
    }
    
    public void setBidDivisionSupRels(List<BidDivisionSupRel> bidDivisionSupRels) {
        this.bidDivisionSupRels = bidDivisionSupRels;
    }




}


