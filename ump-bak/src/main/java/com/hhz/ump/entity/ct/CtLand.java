// 
package com.hhz.ump.entity.ct;
// Generated 2011-12-9 17:20:36 by Hibernate Tools 3.2.2.GA


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
 * CtLand generated by hbm2java
 */
@Entity
@Table(name="CT_LAND"
    ,schema="POWERDESK"
)
public class CtLand  implements java.io.Serializable {


     private String ctLandId;
     private CtLedger ctLedger;
     private String landName;
     private String landDesc;
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
     private List<CtOperation> ctOperations = new ArrayList<CtOperation>();

    public CtLand() {
    }

	
    public CtLand(String ctLandId, CtLedger ctLedger, long recordVersion) {
        this.ctLandId = ctLandId;
        this.ctLedger = ctLedger;
        this.recordVersion = recordVersion;
    }
    public CtLand(String ctLandId, CtLedger ctLedger, String landName, String landDesc, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<CtOperation> ctOperations) {
       this.ctLandId = ctLandId;
       this.ctLedger = ctLedger;
       this.landName = landName;
       this.landDesc = landDesc;
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
       this.ctOperations = ctOperations;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="CT_LAND_ID", unique=true, nullable=false, length=50)
    public String getCtLandId() {
        return this.ctLandId;
    }
    
    public void setCtLandId(String ctLandId) {
        this.ctLandId = ctLandId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CT_LEDGER_ID", nullable=false)
    public CtLedger getCtLedger() {
        return this.ctLedger;
    }
    
    public void setCtLedger(CtLedger ctLedger) {
        this.ctLedger = ctLedger;
    }
    
    @Column(name="LAND_NAME", length=100)
    public String getLandName() {
        return this.landName;
    }
    
    public void setLandName(String landName) {
        this.landName = landName;
    }
    
    @Column(name="LAND_DESC", length=500)
    public String getLandDesc() {
        return this.landDesc;
    }
    
    public void setLandDesc(String landDesc) {
        this.landDesc = landDesc;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="ctLand")
    @BatchSize(size=10)
public List<CtOperation> getCtOperations() {
        return this.ctOperations;
    }
    
    public void setCtOperations(List<CtOperation> ctOperations) {
        this.ctOperations = ctOperations;
    }




}

