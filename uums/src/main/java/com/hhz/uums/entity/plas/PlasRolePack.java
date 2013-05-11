// 
package com.hhz.uums.entity.plas;
// Generated 2012-2-1 11:15:13 by Hibernate Tools 3.2.2.GA


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
 * PlasRolePack generated by hbm2java
 */
@Entity
@Table(name="PLAS_ROLE_PACK"
    
)
public class PlasRolePack  implements java.io.Serializable {


     private String plasRolePackId;
     private String packName;
     private String enableFlg;
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
     private List<PlasRolePackRel> plasRolePackRels = new ArrayList<PlasRolePackRel>();
     private List<PlasRolePackPosRel> plasRolePackPosRels = new ArrayList<PlasRolePackPosRel>();

    public PlasRolePack() {
    }

	
    public PlasRolePack(String plasRolePackId, long recordVersion) {
        this.plasRolePackId = plasRolePackId;
        this.recordVersion = recordVersion;
    }
    public PlasRolePack(String plasRolePackId, String packName, String enableFlg, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<PlasRolePackRel> plasRolePackRels, List<PlasRolePackPosRel> plasRolePackPosRels) {
       this.plasRolePackId = plasRolePackId;
       this.packName = packName;
       this.enableFlg = enableFlg;
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
       this.plasRolePackRels = plasRolePackRels;
       this.plasRolePackPosRels = plasRolePackPosRels;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_ROLE_PACK_ID", unique=true, nullable=false, length=50)
    public String getPlasRolePackId() {
        return this.plasRolePackId;
    }
    
    public void setPlasRolePackId(String plasRolePackId) {
        this.plasRolePackId = plasRolePackId;
    }
    
    @Column(name="PACK_NAME", length=200)
    public String getPackName() {
        return this.packName;
    }
    
    public void setPackName(String packName) {
        this.packName = packName;
    }
    
    @Column(name="ENABLE_FLG", length=1)
    public String getEnableFlg() {
        return this.enableFlg;
    }
    
    public void setEnableFlg(String enableFlg) {
        this.enableFlg = enableFlg;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasRolePack")
    @BatchSize(size=10)
public List<PlasRolePackRel> getPlasRolePackRels() {
        return this.plasRolePackRels;
    }
    
    public void setPlasRolePackRels(List<PlasRolePackRel> plasRolePackRels) {
        this.plasRolePackRels = plasRolePackRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasRolePack")
    @BatchSize(size=10)
public List<PlasRolePackPosRel> getPlasRolePackPosRels() {
        return this.plasRolePackPosRels;
    }
    
    public void setPlasRolePackPosRels(List<PlasRolePackPosRel> plasRolePackPosRels) {
        this.plasRolePackPosRels = plasRolePackPosRels;
    }




}


