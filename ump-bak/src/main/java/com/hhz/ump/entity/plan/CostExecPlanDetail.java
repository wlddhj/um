// 
package com.hhz.ump.entity.plan;
// Generated 2010-8-9 15:22:34 by Hibernate Tools 3.2.4.GA


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
 * PlanExecPlanDetail generated by hbm2java
 */
@Entity
@Table(name="COST_EXEC_PLAN_DETAIL"
    ,schema="POWERDESK"
)
public class CostExecPlanDetail  implements java.io.Serializable {


     private String costExecPlanDetailId;
     private CostProjectNodeRel costProjectNodeRel;
     private String infoConfirmedFlg;
     private String status;
     private String executionPlanCd;
     private Date realStartDate;
     private Date realEndDate;
     private Date scheduleStartDate;
     private Date scheduleEndDate;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String costCtrlBidPurcId;

    public CostExecPlanDetail() {
    }

	
    public CostExecPlanDetail(String costExecPlanDetailId, CostProjectNodeRel costProjectNodeRel, long recordVersion) {
        this.costExecPlanDetailId = costExecPlanDetailId;
        this.costProjectNodeRel = costProjectNodeRel;
        this.recordVersion = recordVersion;
    }
    public CostExecPlanDetail(String costExecPlanDetailId, CostProjectNodeRel costProjectNodeRel, String infoConfirmedFlg, String status, String executionPlanCd, Date realStartDate, Date realEndDate, Date scheduleStartDate, Date scheduleEndDate, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion,String costCtrlBidPurcId) {
       this.costExecPlanDetailId = costExecPlanDetailId;
       this.costProjectNodeRel = costProjectNodeRel;
       this.infoConfirmedFlg = infoConfirmedFlg;
       this.status = status;
       this.executionPlanCd = executionPlanCd;
       this.realStartDate = realStartDate;
       this.realEndDate = realEndDate;
       this.scheduleStartDate = scheduleStartDate;
       this.scheduleEndDate = scheduleEndDate;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.costCtrlBidPurcId =costCtrlBidPurcId;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="COST_EXEC_PLAN_DETAIL_ID", unique=true, nullable=false, length=50)
    
    public String getCostExecPlanDetailId() {
		return costExecPlanDetailId;
	}


	public void setCostExecPlanDetailId(String costExecPlanDetailId) {
		this.costExecPlanDetailId = costExecPlanDetailId;
	}


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_PROJECT_NODE_REL_ID", nullable=false)
	public CostProjectNodeRel getCostProjectNodeRel() {
        return this.costProjectNodeRel;
    }
    

	public void setCostProjectNodeRel(CostProjectNodeRel costProjectNodeRel) {
        this.costProjectNodeRel = costProjectNodeRel;
    }

    
    @Column(name="INFO_CONFIRMED_FLG", length=1)
    public String getInfoConfirmedFlg() {
        return this.infoConfirmedFlg;
    }
    
    public void setInfoConfirmedFlg(String infoConfirmedFlg) {
        this.infoConfirmedFlg = infoConfirmedFlg;
    }

    
    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="EXECUTION_PLAN_CD", length=20)
    public String getExecutionPlanCd() {
        return this.executionPlanCd;
    }
    
    public void setExecutionPlanCd(String executionPlanCd) {
        this.executionPlanCd = executionPlanCd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REAL_START_DATE", length=7)
    public Date getRealStartDate() {
        return this.realStartDate;
    }
    
    public void setRealStartDate(Date realStartDate) {
        this.realStartDate = realStartDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REAL_END_DATE", length=7)
    public Date getRealEndDate() {
        return this.realEndDate;
    }
    
    public void setRealEndDate(Date realEndDate) {
        this.realEndDate = realEndDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SCHEDULE_START_DATE", length=7)
    public Date getScheduleStartDate() {
        return this.scheduleStartDate;
    }
    
    public void setScheduleStartDate(Date scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SCHEDULE_END_DATE", length=7)
    public Date getScheduleEndDate() {
        return this.scheduleEndDate;
    }
    
    public void setScheduleEndDate(Date scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
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


    @Column(name="COST_CTRL_BID_PURC_ID", length=50)
	public String getCostCtrlBidPurcId() {
		return costCtrlBidPurcId;
	}


	public void setCostCtrlBidPurcId(String costCtrlBidPurcId) {
		this.costCtrlBidPurcId = costCtrlBidPurcId;
	}


    private String createdCenterCd;
    private String createdPositionCd;
    private String updatedCenterCd;
    private String updatedPositionCd;
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


