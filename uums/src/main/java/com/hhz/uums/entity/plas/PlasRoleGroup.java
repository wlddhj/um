// 
package com.hhz.uums.entity.plas;
// Generated 2012-1-31 18:23:30 by Hibernate Tools 3.2.2.GA


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
 * PlasRoleGroup generated by hbm2java
 */
@Entity
@Table(name="PLAS_ROLE_GROUP"
    
)
public class PlasRoleGroup  implements java.io.Serializable {


     private String plasRoleGroupId;
     private String roleGroupCd;
     private String roleGroupBizCd;
     private String roleGroupName;
     private String parentId;
     private Long sequenceNo;
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
     private String createdDeptCd;
     private String updatedDeptCd;
     private List<PlasRole> plasRoles = new ArrayList<PlasRole>();

    public PlasRoleGroup() {
    }

	
    public PlasRoleGroup(String plasRoleGroupId, String parentId, long recordVersion) {
        this.plasRoleGroupId = plasRoleGroupId;
        this.parentId = parentId;
        this.recordVersion = recordVersion;
    }
    public PlasRoleGroup(String plasRoleGroupId, String roleGroupCd, String roleGroupBizCd, String roleGroupName, String parentId, Long sequenceNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, String createdDeptCd, String updatedDeptCd, List<PlasRole> plasRoles) {
       this.plasRoleGroupId = plasRoleGroupId;
       this.roleGroupCd = roleGroupCd;
       this.roleGroupBizCd = roleGroupBizCd;
       this.roleGroupName = roleGroupName;
       this.parentId = parentId;
       this.sequenceNo = sequenceNo;
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
       this.createdDeptCd = createdDeptCd;
       this.updatedDeptCd = updatedDeptCd;
       this.plasRoles = plasRoles;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_ROLE_GROUP_ID", unique=true, nullable=false, length=50)
    public String getPlasRoleGroupId() {
        return this.plasRoleGroupId;
    }
    
    public void setPlasRoleGroupId(String plasRoleGroupId) {
        this.plasRoleGroupId = plasRoleGroupId;
    }
    
    @Column(name="ROLE_GROUP_CD", length=20)
    public String getRoleGroupCd() {
        return this.roleGroupCd;
    }
    
    public void setRoleGroupCd(String roleGroupCd) {
        this.roleGroupCd = roleGroupCd;
    }
    
    @Column(name="ROLE_GROUP_BIZ_CD", length=20)
    public String getRoleGroupBizCd() {
        return this.roleGroupBizCd;
    }
    
    public void setRoleGroupBizCd(String roleGroupBizCd) {
        this.roleGroupBizCd = roleGroupBizCd;
    }
    
    @Column(name="ROLE_GROUP_NAME", length=50)
    public String getRoleGroupName() {
        return this.roleGroupName;
    }
    
    public void setRoleGroupName(String roleGroupName) {
        this.roleGroupName = roleGroupName;
    }
    
    @Column(name="PARENT_ID", nullable=false, length=50)
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
    }
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasRoleGroup")
    @BatchSize(size=10)
public List<PlasRole> getPlasRoles() {
        return this.plasRoles;
    }
    
    public void setPlasRoles(List<PlasRole> plasRoles) {
        this.plasRoles = plasRoles;
    }




}


