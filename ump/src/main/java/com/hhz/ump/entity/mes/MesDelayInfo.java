// 
package com.hhz.ump.entity.mes;
// Generated 2012-2-13 15:02:52 by Hibernate Tools 3.2.2.GA


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
 * MesDelayInfo generated by hbm2java
 */
@Entity
@Table(name="MES_DELAY_INFO"
    
)
public class MesDelayInfo  implements java.io.Serializable {


     private String mesDelayInfoId;
     private MesMeetingInfo mesMeetingInfo;
     private String delayReson;
     private String nodeCd;
     private String userCd;
     private Long timeLimit;
     private String approveOptionCd;
     private String approveRemark;
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

    public MesDelayInfo() {
    }

	
    public MesDelayInfo(String mesDelayInfoId, MesMeetingInfo mesMeetingInfo, long recordVersion) {
        this.mesDelayInfoId = mesDelayInfoId;
        this.mesMeetingInfo = mesMeetingInfo;
        this.recordVersion = recordVersion;
    }
    public MesDelayInfo(String mesDelayInfoId, MesMeetingInfo mesMeetingInfo, String delayReson, String nodeCd, String userCd, Long timeLimit, String approveOptionCd, String approveRemark, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.mesDelayInfoId = mesDelayInfoId;
       this.mesMeetingInfo = mesMeetingInfo;
       this.delayReson = delayReson;
       this.nodeCd = nodeCd;
       this.userCd = userCd;
       this.timeLimit = timeLimit;
       this.approveOptionCd = approveOptionCd;
       this.approveRemark = approveRemark;
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
    
    @Column(name="MES_DELAY_INFO_ID", unique=true, nullable=false, length=50)
    public String getMesDelayInfoId() {
        return this.mesDelayInfoId;
    }
    
    public void setMesDelayInfoId(String mesDelayInfoId) {
        this.mesDelayInfoId = mesDelayInfoId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MES_MEETING_INFO_ID", nullable=false)
    public MesMeetingInfo getMesMeetingInfo() {
        return this.mesMeetingInfo;
    }
    
    public void setMesMeetingInfo(MesMeetingInfo mesMeetingInfo) {
        this.mesMeetingInfo = mesMeetingInfo;
    }
    
    @Column(name="DELAY_RESON", length=1000)
    public String getDelayReson() {
        return this.delayReson;
    }
    
    public void setDelayReson(String delayReson) {
        this.delayReson = delayReson;
    }
    
    @Column(name="NODE_CD", length=20)
    public String getNodeCd() {
        return this.nodeCd;
    }
    
    public void setNodeCd(String nodeCd) {
        this.nodeCd = nodeCd;
    }
    
    @Column(name="USER_CD", length=20)
    public String getUserCd() {
        return this.userCd;
    }
    
    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }
    
    @Column(name="TIME_LIMIT", precision=10, scale=0)
    public Long getTimeLimit() {
        return this.timeLimit;
    }
    
    public void setTimeLimit(Long timeLimit) {
        this.timeLimit = timeLimit;
    }
    
    @Column(name="APPROVE_OPTION_CD", length=10)
    public String getApproveOptionCd() {
        return this.approveOptionCd;
    }
    
    public void setApproveOptionCd(String approveOptionCd) {
        this.approveOptionCd = approveOptionCd;
    }
    
    @Column(name="APPROVE_REMARK", length=2000)
    public String getApproveRemark() {
        return this.approveRemark;
    }
    
    public void setApproveRemark(String approveRemark) {
        this.approveRemark = approveRemark;
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

