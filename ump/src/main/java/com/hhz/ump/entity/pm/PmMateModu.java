// 
package com.hhz.ump.entity.pm;
// Generated 2012-6-19 17:48:25 by Hibernate Tools 3.2.2.GA


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
 * PmMateModu generated by hbm2java
 */
@Entity
@Table(name="PM_MATE_MODU"
    
)
public class PmMateModu  implements java.io.Serializable {


     private String pmMateModuId;
     private String moduleName;
     private Long enableFlg;
     private String parentId;
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
     private BigDecimal sequenceNo;
     private List<PmMateEntry> pmMateEntries = new ArrayList<PmMateEntry>();

    public PmMateModu() {
    }

	
    public PmMateModu(String pmMateModuId, long recordVersion) {
        this.pmMateModuId = pmMateModuId;
        this.recordVersion = recordVersion;
    }
    public PmMateModu(String pmMateModuId, String moduleName, Long enableFlg, String parentId, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, BigDecimal sequenceNo, List<PmMateEntry> pmMateEntries) {
       this.pmMateModuId = pmMateModuId;
       this.moduleName = moduleName;
       this.enableFlg = enableFlg;
       this.parentId = parentId;
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
       this.sequenceNo = sequenceNo;
       this.pmMateEntries = pmMateEntries;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PM_MATE_MODU_ID", unique=true, nullable=false, length=50)
    public String getPmMateModuId() {
        return this.pmMateModuId;
    }
    
    public void setPmMateModuId(String pmMateModuId) {
        this.pmMateModuId = pmMateModuId;
    }
    
    @Column(name="MODULE_NAME", length=100)
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    @Column(name="ENABLE_FLG", precision=10, scale=0)
    public Long getEnableFlg() {
        return this.enableFlg;
    }
    
    public void setEnableFlg(Long enableFlg) {
        this.enableFlg = enableFlg;
    }
    
    @Column(name="PARENT_ID", length=50)
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    
    @Column(name="SEQUENCE_NO", precision=38, scale=0)
    public BigDecimal getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="pmMateModu")
    @BatchSize(size=10)
public List<PmMateEntry> getPmMateEntries() {
        return this.pmMateEntries;
    }
    
    public void setPmMateEntries(List<PmMateEntry> pmMateEntries) {
        this.pmMateEntries = pmMateEntries;
    }




}


