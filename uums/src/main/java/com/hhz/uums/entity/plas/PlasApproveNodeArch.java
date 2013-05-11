// 
package com.hhz.uums.entity.plas;
// Generated 2011-11-21 15:11:29 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * PlasApproveNodeArch generated by hbm2java
 */
@Entity
@Table(name="PLAS_APPROVE_NODE_ARCH"
    
)
public class PlasApproveNodeArch  implements java.io.Serializable {


     private String plasApproveNodeArchId;
     private PlasApproveInfo plasApproveInfo;
     private String approveUiid;
     private String approveUserName;
     private String approveRoleCd;
     private String positionCd;
     private String workDutyDesc;
     private Date approveDate;
     private String approveOptionCd;
     private BigDecimal sequenceNo;
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

    public PlasApproveNodeArch() {
    }

	
    public PlasApproveNodeArch(String plasApproveNodeArchId, PlasApproveInfo plasApproveInfo, long recordVersion) {
        this.plasApproveNodeArchId = plasApproveNodeArchId;
        this.plasApproveInfo = plasApproveInfo;
        this.recordVersion = recordVersion;
    }
    public PlasApproveNodeArch(String plasApproveNodeArchId, PlasApproveInfo plasApproveInfo, String approveUiid, String approveUserName, String approveRoleCd, String positionCd, String workDutyDesc, Date approveDate, String approveOptionCd, BigDecimal sequenceNo, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.plasApproveNodeArchId = plasApproveNodeArchId;
       this.plasApproveInfo = plasApproveInfo;
       this.approveUiid = approveUiid;
       this.approveUserName = approveUserName;
       this.approveRoleCd = approveRoleCd;
       this.positionCd = positionCd;
       this.workDutyDesc = workDutyDesc;
       this.approveDate = approveDate;
       this.approveOptionCd = approveOptionCd;
       this.sequenceNo = sequenceNo;
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
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_APPROVE_NODE_ARCH_ID", unique=true, nullable=false, length=50)
    public String getPlasApproveNodeArchId() {
        return this.plasApproveNodeArchId;
    }
    
    public void setPlasApproveNodeArchId(String plasApproveNodeArchId) {
        this.plasApproveNodeArchId = plasApproveNodeArchId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PLAS_APPROVE_INFO_ID", nullable=false)
    public PlasApproveInfo getPlasApproveInfo() {
        return this.plasApproveInfo;
    }
    
    public void setPlasApproveInfo(PlasApproveInfo plasApproveInfo) {
        this.plasApproveInfo = plasApproveInfo;
    }
    
    @Column(name="APPROVE_UIID", length=20)
    public String getApproveUiid() {
        return this.approveUiid;
    }
    
    public void setApproveUiid(String approveUiid) {
        this.approveUiid = approveUiid;
    }
    
    @Column(name="APPROVE_USER_NAME", length=40)
    public String getApproveUserName() {
        return this.approveUserName;
    }
    
    public void setApproveUserName(String approveUserName) {
        this.approveUserName = approveUserName;
    }
    
    @Column(name="APPROVE_ROLE_CD", length=40)
    public String getApproveRoleCd() {
        return this.approveRoleCd;
    }
    
    public void setApproveRoleCd(String approveRoleCd) {
        this.approveRoleCd = approveRoleCd;
    }
    
    @Column(name="POSITION_CD", length=40)
    public String getPositionCd() {
        return this.positionCd;
    }
    
    public void setPositionCd(String positionCd) {
        this.positionCd = positionCd;
    }
    
    @Column(name="WORK_DUTY_DESC", length=100)
    public String getWorkDutyDesc() {
        return this.workDutyDesc;
    }
    
    public void setWorkDutyDesc(String workDutyDesc) {
        this.workDutyDesc = workDutyDesc;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="APPROVE_DATE", length=7)
    public Date getApproveDate() {
        return this.approveDate;
    }
    
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }
    
    @Column(name="APPROVE_OPTION_CD", length=20)
    public String getApproveOptionCd() {
        return this.approveOptionCd;
    }
    
    public void setApproveOptionCd(String approveOptionCd) {
        this.approveOptionCd = approveOptionCd;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public BigDecimal getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(BigDecimal sequenceNo) {
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




}


