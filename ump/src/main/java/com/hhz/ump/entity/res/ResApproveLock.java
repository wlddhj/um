// 
package com.hhz.ump.entity.res;
// Generated 2011-3-30 13:29:48 by Hibernate Tools 3.2.2.GA


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
 * ResApproveLock generated by hbm2java
 */
@Entity
@Table(name="RES_APPROVE_LOCK"
    
)
public class ResApproveLock  implements java.io.Serializable {


     private String resApproveLockId;
     private ResApproveInfo resApproveInfo;
     private String lockUser;
     private Date lockDate;
     private String unlockUser;
     private Date unlockDate;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;

    public ResApproveLock() {
    }

	
    public ResApproveLock(String resApproveLockId, ResApproveInfo resApproveInfo, long recordVersion) {
        this.resApproveLockId = resApproveLockId;
        this.resApproveInfo = resApproveInfo;
        this.recordVersion = recordVersion;
    }
    public ResApproveLock(String resApproveLockId, ResApproveInfo resApproveInfo, String lockUser, Date lockDate, String unlockUser, Date unlockDate, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd) {
       this.resApproveLockId = resApproveLockId;
       this.resApproveInfo = resApproveInfo;
       this.lockUser = lockUser;
       this.lockDate = lockDate;
       this.unlockUser = unlockUser;
       this.unlockDate = unlockDate;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="RES_APPROVE_LOCK_ID", unique=true, nullable=false, length=50)
    public String getResApproveLockId() {
        return this.resApproveLockId;
    }
    
    public void setResApproveLockId(String resApproveLockId) {
        this.resApproveLockId = resApproveLockId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RES_APPROVE_INFO_ID", nullable=false)
    public ResApproveInfo getResApproveInfo() {
        return this.resApproveInfo;
    }
    
    public void setResApproveInfo(ResApproveInfo resApproveInfo) {
        this.resApproveInfo = resApproveInfo;
    }
    
    @Column(name="LOCK_USER", length=20)
    public String getLockUser() {
        return this.lockUser;
    }
    
    public void setLockUser(String lockUser) {
        this.lockUser = lockUser;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LOCK_DATE", length=7)
    public Date getLockDate() {
        return this.lockDate;
    }
    
    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }
    
    @Column(name="UNLOCK_USER", length=20)
    public String getUnlockUser() {
        return this.unlockUser;
    }
    
    public void setUnlockUser(String unlockUser) {
        this.unlockUser = unlockUser;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UNLOCK_DATE", length=7)
    public Date getUnlockDate() {
        return this.unlockDate;
    }
    
    public void setUnlockDate(Date unlockDate) {
        this.unlockDate = unlockDate;
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




}


