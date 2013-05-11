// 
package com.hhz.ump.entity.plan;
// Generated 2010-8-9 15:22:34 by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * PlanPeriod generated by hbm2java
 */
@Entity
@Table(name="PLAN_PERIOD"
    
)
public class PlanPeriod  implements java.io.Serializable {


     private String planPeriodId;
     private BigDecimal planYear;
     private String yearNumber;
     private BigDecimal periodSerialNumber;
     private String periodTypeCd;
     private Date startDate;
     private Date endDate;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;

    public PlanPeriod() {
    }

	
    public PlanPeriod(String planPeriodId, Date startDate, Date endDate, long recordVersion) {
        this.planPeriodId = planPeriodId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recordVersion = recordVersion;
    }
    public PlanPeriod(String planPeriodId, BigDecimal planYear, String yearNumber, BigDecimal periodSerialNumber, String periodTypeCd, Date startDate, Date endDate, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion) {
       this.planPeriodId = planPeriodId;
       this.planYear = planYear;
       this.yearNumber = yearNumber;
       this.periodSerialNumber = periodSerialNumber;
       this.periodTypeCd = periodTypeCd;
       this.startDate = startDate;
       this.endDate = endDate;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="PLAN_PERIOD_ID", unique=true, nullable=false, length=50)
    public String getPlanPeriodId() {
        return this.planPeriodId;
    }
    
    public void setPlanPeriodId(String planPeriodId) {
        this.planPeriodId = planPeriodId;
    }

    
    @Column(name="PLAN_YEAR", precision=38, scale=0)
    public BigDecimal getPlanYear() {
        return this.planYear;
    }
    
    public void setPlanYear(BigDecimal planYear) {
        this.planYear = planYear;
    }

    
    @Column(name="YEAR_NUMBER", length=20)
    public String getYearNumber() {
        return this.yearNumber;
    }
    
    public void setYearNumber(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    
    @Column(name="PERIOD_SERIAL_NUMBER", precision=38, scale=0)
    public BigDecimal getPeriodSerialNumber() {
        return this.periodSerialNumber;
    }
    
    public void setPeriodSerialNumber(BigDecimal periodSerialNumber) {
        this.periodSerialNumber = periodSerialNumber;
    }

    
    @Column(name="PERIOD_TYPE_CD", length=20)
    public String getPeriodTypeCd() {
        return this.periodTypeCd;
    }
    
    public void setPeriodTypeCd(String periodTypeCd) {
        this.periodTypeCd = periodTypeCd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_DATE", nullable=false, length=7)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_DATE", nullable=false, length=7)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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


