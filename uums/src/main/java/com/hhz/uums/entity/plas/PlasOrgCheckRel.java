// 
package com.hhz.uums.entity.plas;
// Generated 2011-6-23 11:42:42 by Hibernate Tools 3.2.2.GA


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
 * PlasOrgCheckRel generated by hbm2java
 */
@Entity
@Table(name="PLAS_ORG_CHECK_REL"
    
)
public class PlasOrgCheckRel  implements java.io.Serializable {


     private String plasOrgCheckRelId;
     private String plasOrgId;
     private String plasSysPositionId;
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

    public PlasOrgCheckRel() {
    }

	
    public PlasOrgCheckRel(String plasOrgCheckRelId, long recordVersion) {
        this.plasOrgCheckRelId = plasOrgCheckRelId;
        this.recordVersion = recordVersion;
    }
    public PlasOrgCheckRel(String plasOrgCheckRelId, String plasOrgId, String plasSysPositionId, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.plasOrgCheckRelId = plasOrgCheckRelId;
       this.plasOrgId = plasOrgId;
       this.plasSysPositionId = plasSysPositionId;
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
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_ORG_CHECK_REL_ID", unique=true, nullable=false, length=50)
    public String getPlasOrgCheckRelId() {
        return this.plasOrgCheckRelId;
    }
    
    public void setPlasOrgCheckRelId(String plasOrgCheckRelId) {
        this.plasOrgCheckRelId = plasOrgCheckRelId;
    }
    
    @Column(name="PLAS_ORG_ID", length=50)
    public String getPlasOrgId() {
        return this.plasOrgId;
    }
    
    public void setPlasOrgId(String plasOrgId) {
        this.plasOrgId = plasOrgId;
    }
    
    @Column(name="PLAS_SYS_POSITION_ID", length=50)
    public String getPlasSysPositionId() {
        return this.plasSysPositionId;
    }
    
    public void setPlasSysPositionId(String plasSysPositionId) {
        this.plasSysPositionId = plasSysPositionId;
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




}


