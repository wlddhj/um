// 
package com.hhz.ump.entity.ct;
// Generated 2011-12-28 16:32:59 by Hibernate Tools 3.2.2.GA


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
 * CtItemHistory generated by hbm2java
 */
@Entity
@Table(name="CT_ITEM_HISTORY"
    
)
public class CtItemHistory  implements java.io.Serializable {


     private String ctItemHistoryId;
     private String ctItemId;
     private String ctDimeCd;
     private Long sequenceNo;
     private Long itemLevel;
     private String itemName;
     private String parentId;
     private BigDecimal targetAmt;
     private String ctItemTemplateId;
     private String ctItemTemplatePid;
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
     private String ctLedgerId;
     private String ctContPlanId;

    public CtItemHistory() {
    }

	
    public CtItemHistory(String ctItemHistoryId, long recordVersion) {
        this.ctItemHistoryId = ctItemHistoryId;
        this.recordVersion = recordVersion;
    }
    public CtItemHistory(String ctItemHistoryId, String ctItemId, String ctDimeCd, Long sequenceNo, Long itemLevel, String itemName, String parentId, BigDecimal targetAmt, String ctItemTemplateId, String ctItemTemplatePid, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, String ctLedgerId, String ctContPlanId) {
       this.ctItemHistoryId = ctItemHistoryId;
       this.ctItemId = ctItemId;
       this.ctDimeCd = ctDimeCd;
       this.sequenceNo = sequenceNo;
       this.itemLevel = itemLevel;
       this.itemName = itemName;
       this.parentId = parentId;
       this.targetAmt = targetAmt;
       this.ctItemTemplateId = ctItemTemplateId;
       this.ctItemTemplatePid = ctItemTemplatePid;
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
       this.ctLedgerId = ctLedgerId;
       this.ctContPlanId = ctContPlanId;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="CT_ITEM_HISTORY_ID", unique=true, nullable=false, length=50)
    public String getCtItemHistoryId() {
        return this.ctItemHistoryId;
    }
    
    public void setCtItemHistoryId(String ctItemHistoryId) {
        this.ctItemHistoryId = ctItemHistoryId;
    }
    
    @Column(name="CT_ITEM_ID", length=50)
    public String getCtItemId() {
        return this.ctItemId;
    }
    
    public void setCtItemId(String ctItemId) {
        this.ctItemId = ctItemId;
    }
    
    @Column(name="CT_DIME_CD", length=20)
    public String getCtDimeCd() {
        return this.ctDimeCd;
    }
    
    public void setCtDimeCd(String ctDimeCd) {
        this.ctDimeCd = ctDimeCd;
    }
    
    @Column(name="SEQUENCE_NO", precision=18, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="ITEM_LEVEL", precision=18, scale=0)
    public Long getItemLevel() {
        return this.itemLevel;
    }
    
    public void setItemLevel(Long itemLevel) {
        this.itemLevel = itemLevel;
    }
    
    @Column(name="ITEM_NAME", length=200)
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    @Column(name="PARENT_ID", length=50)
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    @Column(name="TARGET_AMT", precision=18)
    public BigDecimal getTargetAmt() {
        return this.targetAmt;
    }
    
    public void setTargetAmt(BigDecimal targetAmt) {
        this.targetAmt = targetAmt;
    }
    
    @Column(name="CT_ITEM_TEMPLATE_ID", length=50)
    public String getCtItemTemplateId() {
        return this.ctItemTemplateId;
    }
    
    public void setCtItemTemplateId(String ctItemTemplateId) {
        this.ctItemTemplateId = ctItemTemplateId;
    }
    
    @Column(name="CT_ITEM_TEMPLATE_PID", length=50)
    public String getCtItemTemplatePid() {
        return this.ctItemTemplatePid;
    }
    
    public void setCtItemTemplatePid(String ctItemTemplatePid) {
        this.ctItemTemplatePid = ctItemTemplatePid;
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
    
    @Column(name="CT_LEDGER_ID", length=50)
    public String getCtLedgerId() {
        return this.ctLedgerId;
    }
    
    public void setCtLedgerId(String ctLedgerId) {
        this.ctLedgerId = ctLedgerId;
    }
    
    @Column(name="CT_CONT_PLAN_ID", length=50)
    public String getCtContPlanId() {
        return this.ctContPlanId;
    }
    
    public void setCtContPlanId(String ctContPlanId) {
        this.ctContPlanId = ctContPlanId;
    }




}


