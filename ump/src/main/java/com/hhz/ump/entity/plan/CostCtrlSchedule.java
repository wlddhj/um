// 
package com.hhz.ump.entity.plan;
// Generated 2011-3-28 16:43:13 by Hibernate Tools 3.2.2.GA


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
 * CostCtrlSchedule generated by hbm2java
 */
@Entity
@Table(name="COST_CTRL_SCHEDULE"
    
)
public class CostCtrlSchedule  implements java.io.Serializable {


     private String costCtrlScheduleId;
     private CostCtrlBidPurc costCtrlBidPurc;
     private Integer serialNo;
     private String scheduleTypeCd;
     private String scheduleTypeName;
     private Date targetDate;
     private Date completeDate;
     private String completeStatusCd;
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

    public CostCtrlSchedule() {
    }

	
    public CostCtrlSchedule(String costCtrlScheduleId, CostCtrlBidPurc costCtrlBidPurc, long recordVersion) {
        this.costCtrlScheduleId = costCtrlScheduleId;
        this.costCtrlBidPurc = costCtrlBidPurc;
        this.recordVersion = recordVersion;
    }
    public CostCtrlSchedule(String costCtrlScheduleId, CostCtrlBidPurc costCtrlBidPurc, Integer serialNo, String scheduleTypeCd, Date targetDate, Date completeDate, String completeStatusCd, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.costCtrlScheduleId = costCtrlScheduleId;
       this.costCtrlBidPurc = costCtrlBidPurc;
       this.serialNo = serialNo;
       this.scheduleTypeCd = scheduleTypeCd;
       this.targetDate = targetDate;
       this.completeDate = completeDate;
       this.completeStatusCd = completeStatusCd;
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
    
    @Column(name="COST_CTRL_SCHEDULE_ID", unique=true, nullable=false, length=50)
    public String getCostCtrlScheduleId() {
        return this.costCtrlScheduleId;
    }
    
    public void setCostCtrlScheduleId(String costCtrlScheduleId) {
        this.costCtrlScheduleId = costCtrlScheduleId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_CTRL_BID_PURC_ID", nullable=false)
    public CostCtrlBidPurc getCostCtrlBidPurc() {
        return this.costCtrlBidPurc;
    }
    
    public void setCostCtrlBidPurc(CostCtrlBidPurc costCtrlBidPurc) {
        this.costCtrlBidPurc = costCtrlBidPurc;
    }
    
    @Column(name="SERIAL_NO", precision=5, scale=0)
    public Integer getSerialNo() {
        return this.serialNo;
    }
    
    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }
    
    @Column(name="SCHEDULE_TYPE_CD", length=20)
    public String getScheduleTypeCd() {
        return this.scheduleTypeCd;
    }
    
    public void setScheduleTypeCd(String scheduleTypeCd) {
        this.scheduleTypeCd = scheduleTypeCd;
    }
    
    @Column(name="SCHEDULE_TYPE_NAME", length=50)
    public String getScheduleTypeName() {
		return scheduleTypeName;
	}

	public void setScheduleTypeName(String scheduleTypeName) {
		this.scheduleTypeName = scheduleTypeName;
	}


	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="TARGET_DATE", length=7)
    public Date getTargetDate() {
        return this.targetDate;
    }
    
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="COMPLETE_DATE", length=7)
    public Date getCompleteDate() {
        return this.completeDate;
    }
    
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
    
    @Column(name="COMPLETE_STATUS_CD", length=1)
    public String getCompleteStatusCd() {
        return this.completeStatusCd;
    }
    
    public void setCompleteStatusCd(String completeStatusCd) {
        this.completeStatusCd = completeStatusCd;
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


