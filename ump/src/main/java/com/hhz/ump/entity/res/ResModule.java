// 
package com.hhz.ump.entity.res;
// Generated 2011-3-30 13:29:48 by Hibernate Tools 3.2.2.GA


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
 * ResModule generated by hbm2java
 */
@Entity
@Table(name="RES_MODULE"
    
)
public class ResModule  implements java.io.Serializable {


     private String resModuleId;
     private String moduleCd;
     private String moduleName;
     private Long sequenceNo;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String parentModuleCd;
     private Boolean active;
     private String moduleTypeCd;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private List<ResAuthType> resAuthTypes = new ArrayList<ResAuthType>();
     
     

    public ResModule() {
    }

	
    public ResModule(String resModuleId, long recordVersion) {
        this.resModuleId = resModuleId;
        this.recordVersion = recordVersion;
    }
    
    public ResModule(String resModuleId,  String moduleCd, String moduleName,ResAuthType resAuthType) {
        this.resModuleId = resModuleId;
        this.moduleCd = moduleCd;
        this.moduleName = moduleName;
        this.resAuthTypes.add(resAuthType);
        
    }
    
    public ResModule(String resModuleId, String moduleCd, String moduleName, Long sequenceNo, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String parentModuleCd, Boolean active, String moduleTypeCd, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd, List<ResAuthType> resAuthTypes) {
       this.resModuleId = resModuleId;
       this.moduleCd = moduleCd;
       this.moduleName = moduleName;
       this.sequenceNo = sequenceNo;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.parentModuleCd = parentModuleCd;
       this.active = active;
       this.moduleTypeCd = moduleTypeCd;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.resAuthTypes = resAuthTypes;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="RES_MODULE_ID", unique=true, nullable=false, length=50)
    public String getResModuleId() {
        return this.resModuleId;
    }
    
    public void setResModuleId(String resModuleId) {
        this.resModuleId = resModuleId;
    }
    
    @Column(name="MODULE_CD", length=20)
    public String getModuleCd() {
        return this.moduleCd;
    }
    
    public void setModuleCd(String moduleCd) {
        this.moduleCd = moduleCd;
    }
    
    @Column(name="MODULE_NAME", length=50)
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
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
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
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
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
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
    
    @Column(name="PARENT_MODULE_CD", length=20)
    public String getParentModuleCd() {
        return this.parentModuleCd;
    }
    
    public void setParentModuleCd(String parentModuleCd) {
        this.parentModuleCd = parentModuleCd;
    }
    
    @Column(name="ACTIVE", precision=1, scale=0)
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    
    @Column(name="MODULE_TYPE_CD", length=20)
    public String getModuleTypeCd() {
        return this.moduleTypeCd;
    }
    
    public void setModuleTypeCd(String moduleTypeCd) {
        this.moduleTypeCd = moduleTypeCd;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="resModule")
    @BatchSize(size=10)
public List<ResAuthType> getResAuthTypes() {
        return this.resAuthTypes;
    }
    
    public void setResAuthTypes(List<ResAuthType> resAuthTypes) {
        this.resAuthTypes = resAuthTypes;
    }




}


