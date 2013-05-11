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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CostContPlanTpl generated by hbm2java
 */
@Entity
@Table(name="COST_CONT_PLAN_TPL"
    ,schema="POWERDESK"
)
public class CostContPlanTpl  implements java.io.Serializable {


     private String costContPlanTplId;
     private String tplName;
     private Date editDate;
     private BigDecimal tplVersion;
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
     private List<CostContPlan> costContPlans = new ArrayList<CostContPlan>();
     private List<CostContPlanTplDetail> costContPlanTplDetails = new ArrayList<CostContPlanTplDetail>();
     private List<CostContPlanTplStat> costContPlanTplStats = new ArrayList<CostContPlanTplStat>();

    public CostContPlanTpl() {
    }

	
    public CostContPlanTpl(String costContPlanTplId, long recordVersion) {
        this.costContPlanTplId = costContPlanTplId;
        this.recordVersion = recordVersion;
    }
    public CostContPlanTpl(String costContPlanTplId, String tplName, Date editDate, BigDecimal tplVersion, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<CostContPlan> costContPlans, List<CostContPlanTplDetail> costContPlanTplDetails, List<CostContPlanTplStat> costContPlanTplStats) {
       this.costContPlanTplId = costContPlanTplId;
       this.tplName = tplName;
       this.editDate = editDate;
       this.tplVersion = tplVersion;
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
       this.costContPlans = costContPlans;
       this.costContPlanTplDetails = costContPlanTplDetails;
       this.costContPlanTplStats = costContPlanTplStats;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="COST_CONT_PLAN_TPL_ID", unique=true, nullable=false, length=50)
    public String getCostContPlanTplId() {
        return this.costContPlanTplId;
    }
    
    public void setCostContPlanTplId(String costContPlanTplId) {
        this.costContPlanTplId = costContPlanTplId;
    }
    
    @Column(name="TPL_NAME", length=200)
    public String getTplName() {
        return this.tplName;
    }
    
    public void setTplName(String tplName) {
        this.tplName = tplName;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EDIT_DATE", length=7)
    public Date getEditDate() {
        return this.editDate;
    }
    
    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
    
    @Column(name="TPL_VERSION", precision=18)
    public BigDecimal getTplVersion() {
        return this.tplVersion;
    }
    
    public void setTplVersion(BigDecimal tplVersion) {
        this.tplVersion = tplVersion;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="costContPlanTpl")
    @BatchSize(size=10)
public List<CostContPlan> getCostContPlans() {
        return this.costContPlans;
    }
    
    public void setCostContPlans(List<CostContPlan> costContPlans) {
        this.costContPlans = costContPlans;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costContPlanTpl")
    @BatchSize(size=10)
public List<CostContPlanTplDetail> getCostContPlanTplDetails() {
        return this.costContPlanTplDetails;
    }
    
    public void setCostContPlanTplDetails(List<CostContPlanTplDetail> costContPlanTplDetails) {
        this.costContPlanTplDetails = costContPlanTplDetails;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costContPlanTpl")
    @BatchSize(size=10)
public List<CostContPlanTplStat> getCostContPlanTplStats() {
        return this.costContPlanTplStats;
    }
    
    public void setCostContPlanTplStats(List<CostContPlanTplStat> costContPlanTplStats) {
        this.costContPlanTplStats = costContPlanTplStats;
    }




}


