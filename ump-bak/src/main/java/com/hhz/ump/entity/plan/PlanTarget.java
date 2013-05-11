// 
package com.hhz.ump.entity.plan;
// Generated 2012-5-8 14:17:19 by Hibernate Tools 3.2.2.GA


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
import org.hibernate.annotations.OrderBy;

/**
 * PlanTarget generated by hbm2java
 */
@Entity
@Table(name="PLAN_TARGET"
    ,schema="POWERDESK"
)
public class PlanTarget implements java.io.Serializable {


     private String planTargetId;
     private String yearFlg;
     private String monthFlg;
     private String workCenterFlg;
     private String planNumber;
     private String planType;
     private String content;
     private String center;
     private Date startDate;
     private Date targetDate;
     private String status;
     private String attachFlg;
     private String sysStatusFlg;
     private String principalCd;
     private Integer targetYear;
     private Integer targetMonth;
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
     private String parentTargetId;
     private String sequenceNumber;
     private String yearTarget; 
     private String yearId;
     private List<PlanMessage> planMessages = new ArrayList<PlanMessage>();

    public PlanTarget() {
    }

	
    public PlanTarget(String planTargetId, long recordVersion) {
        this.planTargetId = planTargetId;
        this.recordVersion = recordVersion;
    }
    public PlanTarget(String planTargetId, String yearFlg, String monthFlg, String workCenterFlg, String planNumber, String planType, String content, String center, Date startDate, Date targetDate, String status, String attachFlg, String sysStatusFlg, String principalCd, Integer targetYear, Integer targetMonth, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<PlanMessage> planMessages,String parentTargetId,String yearTarget,String yearId) {
       this.planTargetId = planTargetId;
       this.yearFlg = yearFlg;
       this.monthFlg = monthFlg;
       this.workCenterFlg = workCenterFlg;
       this.planNumber = planNumber;
       this.planType = planType;
       this.content = content;
       this.center = center;
       this.startDate = startDate;
       this.targetDate = targetDate;
       this.status = status;
       this.attachFlg = attachFlg;
       this.sysStatusFlg = sysStatusFlg;
       this.principalCd = principalCd;
       this.targetYear = targetYear;
       this.targetMonth = targetMonth;
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
       this.planMessages = planMessages;
       this.parentTargetId = parentTargetId;
       this.yearTarget = yearTarget;
       this.yearId = yearId;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAN_TARGET_ID", unique=true, nullable=false, length=50)
    public String getPlanTargetId() {
        return this.planTargetId;
    }
    
    public void setPlanTargetId(String planTargetId) {
        this.planTargetId = planTargetId;
    }
    
    @Column(name="YEAR_FLG", length=1)
    public String getYearFlg() {
        return this.yearFlg;
    }
    
    public void setYearFlg(String yearFlg) {
        this.yearFlg = yearFlg;
    }
    
    @Column(name="MONTH_FLG", length=1)
    public String getMonthFlg() {
        return this.monthFlg;
    }
    
    public void setMonthFlg(String monthFlg) {
        this.monthFlg = monthFlg;
    }
    
    @Column(name="WORK_CENTER_FLG", length=1)
    public String getWorkCenterFlg() {
        return this.workCenterFlg;
    }
    
    public void setWorkCenterFlg(String workCenterFlg) {
        this.workCenterFlg = workCenterFlg;
    }
    
    @Column(name="PLAN_NUMBER", length=50)
    public String getPlanNumber() {
        return this.planNumber;
    }
    
    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }
    
    @Column(name="PLAN_TYPE", length=20)
    public String getPlanType() {
        return this.planType;
    }
    
    public void setPlanType(String planType) {
        this.planType = planType;
    }
    
    @Column(name="CONTENT", length=400)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="CENTER", length=50)
    public String getCenter() {
        return this.center;
    }
    
    public void setCenter(String center) {
        this.center = center;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_DATE", length=7)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TARGET_DATE", length=7)
    public Date getTargetDate() {
        return this.targetDate;
    }
    
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
    
    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="ATTACH_FLG", length=1)
    public String getAttachFlg() {
		return attachFlg;
	}
    
	public void setAttachFlg(String attachFlg) {
		this.attachFlg = attachFlg;
	}

    
    @Column(name="SYS_STATUS_FLG", length=1)
    public String getSysStatusFlg() {
        return this.sysStatusFlg;
    }

	public void setSysStatusFlg(String sysStatusFlg) {
        this.sysStatusFlg = sysStatusFlg;
    }
    
    @Column(name="PRINCIPAL_CD", length=50)
    public String getPrincipalCd() {
        return this.principalCd;
    }
    
    public void setPrincipalCd(String principalCd) {
        this.principalCd = principalCd;
    }

    @Column(name="TARGET_YEAR", length=4)
    public Integer getTargetYear() {
		return targetYear;
	}

	public void setTargetYear(Integer targetYear) {
		this.targetYear = targetYear;
	}

    @Column(name="TARGET_MONTH", length=2)
	public Integer getTargetMonth() {
		return targetMonth;
	}

	public void setTargetMonth(Integer targetMonth) {
		this.targetMonth = targetMonth;
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
    @OneToMany(fetch=FetchType.LAZY, mappedBy="planTarget")
    @BatchSize(size=10)
	@OrderBy(clause="CREATED_DATE desc")
    public List<PlanMessage> getPlanMessages() {
        return this.planMessages;
    }
    
    public void setPlanMessages(List<PlanMessage> planMessages) {
        this.planMessages = planMessages;
    }

    @Column(name="PARENT_TARGET_ID", length=50)
	public String getParentTargetId() {
		return parentTargetId;
	}

	public void setParentTargetId(String parentTargetId) {
		this.parentTargetId = parentTargetId;
	}

    @Column(name="SEQUENCE_NUMBER", length=20)
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@Column(name="YEAR_TARGET", length=200)
	public String getYearTarget() {
		return yearTarget;
	}


	public void setYearTarget(String yearTarget) {
		this.yearTarget = yearTarget;
	}


	@Column(name="YEAR_ID", length=50)
	public String getYearId() {
		return yearId;
	}


	public void setYearId(String yearId) {
		this.yearId = yearId;
	}




}


