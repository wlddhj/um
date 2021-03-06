// 
package com.hhz.ump.entity.cost;
// Generated 2012-3-29 14:45:31 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CostContPlan generated by hbm2java
 */
@Entity
@Table(name="COST_CONT_PLAN"
    
)
public class CostContPlan  implements java.io.Serializable {


     private String costContPlanId;
     private CostContPlanTpl costContPlanTpl;
     private String projectCd;
     private String projectName;
     private String sectBirefName;
     private String sectName;
     private String costProjectSectionId;
     private Date editDate;
     private BigDecimal planVersion;
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
     private List<CostContPlanStat> costContPlanStats = new ArrayList<CostContPlanStat>();
     private List<CostContPlanDetail> costContPlanDetails = new ArrayList<CostContPlanDetail>();

    public CostContPlan() {
    }

	
    public CostContPlan(String costContPlanId, CostContPlanTpl costContPlanTpl, long recordVersion) {
        this.costContPlanId = costContPlanId;
        this.costContPlanTpl = costContPlanTpl;
        this.recordVersion = recordVersion;
    }
    public CostContPlan(String costContPlanId, CostContPlanTpl costContPlanTpl, String projectCd, String projectName, String sectBirefName, String sectName, String costProjectSectionId, Date editDate, BigDecimal planVersion, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<CostContPlanStat> costContPlanStats, List<CostContPlanDetail> costContPlanDetails) {
       this.costContPlanId = costContPlanId;
       this.costContPlanTpl = costContPlanTpl;
       this.projectCd = projectCd;
       this.projectName = projectName;
       this.sectBirefName = sectBirefName;
       this.sectName = sectName;
       this.costProjectSectionId = costProjectSectionId;
       this.editDate = editDate;
       this.planVersion = planVersion;
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
       this.costContPlanStats = costContPlanStats;
       this.costContPlanDetails = costContPlanDetails;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="COST_CONT_PLAN_ID", unique=true, nullable=false, length=50)
    public String getCostContPlanId() {
        return this.costContPlanId;
    }
    
    public void setCostContPlanId(String costContPlanId) {
        this.costContPlanId = costContPlanId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_CONT_PLAN_TPL_ID", nullable=false)
    public CostContPlanTpl getCostContPlanTpl() {
        return this.costContPlanTpl;
    }
    
    public void setCostContPlanTpl(CostContPlanTpl costContPlanTpl) {
        this.costContPlanTpl = costContPlanTpl;
    }
    
    @Column(name="PROJECT_CD", length=20)
    public String getProjectCd() {
        return this.projectCd;
    }
    
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }
    
    @Column(name="PROJECT_NAME", length=100)
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    @Column(name="SECT_BIREF_NAME", length=100)
    public String getSectBirefName() {
        return this.sectBirefName;
    }
    
    public void setSectBirefName(String sectBirefName) {
        this.sectBirefName = sectBirefName;
    }
    
    @Column(name="SECT_NAME", length=100)
    public String getSectName() {
        return this.sectName;
    }
    
    public void setSectName(String sectName) {
        this.sectName = sectName;
    }
    
    @Column(name="COST_PROJECT_SECTION_ID", length=50)
    public String getCostProjectSectionId() {
        return this.costProjectSectionId;
    }
    
    public void setCostProjectSectionId(String costProjectSectionId) {
        this.costProjectSectionId = costProjectSectionId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EDIT_DATE", length=7)
    public Date getEditDate() {
        return this.editDate;
    }
    
    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
    
    @Column(name="PLAN_VERSION", precision=18)
    public BigDecimal getPlanVersion() {
        return this.planVersion;
    }
    
    public void setPlanVersion(BigDecimal planVersion) {
        this.planVersion = planVersion;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="costContPlan")
    @BatchSize(size=10)
public List<CostContPlanStat> getCostContPlanStats() {
        return this.costContPlanStats;
    }
    
    public void setCostContPlanStats(List<CostContPlanStat> costContPlanStats) {
        this.costContPlanStats = costContPlanStats;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costContPlan")
    @BatchSize(size=10)
public List<CostContPlanDetail> getCostContPlanDetails() {
        return this.costContPlanDetails;
    }
    
    public void setCostContPlanDetails(List<CostContPlanDetail> costContPlanDetails) {
        this.costContPlanDetails = costContPlanDetails;
    }




}


