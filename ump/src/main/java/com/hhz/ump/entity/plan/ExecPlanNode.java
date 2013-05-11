// 
package com.hhz.ump.entity.plan;
// Generated 2011-8-14 16:43:29 by Hibernate Tools 3.2.2.GA


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
 * ExecPlanNode generated by hbm2java
 */
@Entity
@Table(name="EXEC_PLAN_NODE"
    
)
public class ExecPlanNode  implements java.io.Serializable {


     private String execPlanNodeId;
     private String periodName;
     private String planTypeCd;
     private String activeFlg;
     private String nodeCd;
     private Long sequenceNo;
     private Long pointLevel;
     private String resOrgCd;
     private String resOrgName;
     private String outputFiles;
     private String corOrgCd;
     private String corOrgName;
     private String controlNodeFlg;
     private String nodeName;
     private String treeParentNodeId;
     private String remark;
     private Boolean ifParentSame;
     private String parentId15;
     private String standardStartDate;
     private String standardEndDate;
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
     private List<ExecPlanDetail> execPlanDetails = new ArrayList<ExecPlanDetail>();

    public ExecPlanNode() {
    }

	
    public ExecPlanNode(String execPlanNodeId, long recordVersion) {
        this.execPlanNodeId = execPlanNodeId;
        this.recordVersion = recordVersion;
    }
    public ExecPlanNode(String execPlanNodeId, String periodName, String planTypeCd, String activeFlg, String nodeCd, Long sequenceNo, Long pointLevel, String resOrgCd, String resOrgName, String outputFiles, String corOrgCd, String corOrgName, String controlNodeFlg, String nodeName, String treeParentNodeId, String remark, boolean ifParentSame,String parentId15,String standardStartDate,String standardEndDate, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd, List<ExecPlanDetail> execPlanDetails) {
       this.execPlanNodeId = execPlanNodeId;
       this.periodName = periodName;
       this.planTypeCd = planTypeCd;
       this.activeFlg = activeFlg;
       this.nodeCd = nodeCd;
       this.sequenceNo = sequenceNo;
       this.pointLevel = pointLevel;
       this.resOrgCd = resOrgCd;
       this.resOrgName = resOrgName;
       this.outputFiles = outputFiles;
       this.corOrgCd = corOrgCd;
       this.corOrgName = corOrgName;
       this.controlNodeFlg = controlNodeFlg;
       this.nodeName = nodeName;
       this.treeParentNodeId = treeParentNodeId;
       this.remark = remark;
       this.ifParentSame = ifParentSame;
       this.parentId15 = parentId15;
       this.standardStartDate = standardStartDate;
       this.standardEndDate = standardEndDate;
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
       this.execPlanDetails = execPlanDetails;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="EXEC_PLAN_NODE_ID", unique=true, nullable=false, length=50)
    public String getExecPlanNodeId() {
        return this.execPlanNodeId;
    }
    
    public void setExecPlanNodeId(String execPlanNodeId) {
        this.execPlanNodeId = execPlanNodeId;
    }
    
    @Column(name="PERIOD_NAME", length=50)
    public String getPeriodName() {
        return this.periodName;
    }
    
    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }
    
    @Column(name="PLAN_TYPE_CD", length=20)
    public String getPlanTypeCd() {
        return this.planTypeCd;
    }
    
    public void setPlanTypeCd(String planTypeCd) {
        this.planTypeCd = planTypeCd;
    }
    
    @Column(name="ACTIVE_FLG", length=1)
    public String getActiveFlg() {
        return this.activeFlg;
    }
    
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
    }
    
    @Column(name="NODE_CD", length=20)
    public String getNodeCd() {
        return this.nodeCd;
    }
    
    public void setNodeCd(String nodeCd) {
        this.nodeCd = nodeCd;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="POINT_LEVEL", precision=10, scale=0)
    public Long getPointLevel() {
        return this.pointLevel;
    }
    
    public void setPointLevel(Long pointLevel) {
        this.pointLevel = pointLevel;
    }
    
    @Column(name="RES_ORG_CD", length=50)
    public String getResOrgCd() {
        return this.resOrgCd;
    }
    
    public void setResOrgCd(String resOrgCd) {
        this.resOrgCd = resOrgCd;
    }
    
    @Column(name="RES_ORG_NAME", length=100)
    public String getResOrgName() {
        return this.resOrgName;
    }
    
    public void setResOrgName(String resOrgName) {
        this.resOrgName = resOrgName;
    }
    
    @Column(name="OUTPUT_FILES", length=200)
    public String getOutputFiles() {
        return this.outputFiles;
    }
    
    public void setOutputFiles(String outputFiles) {
        this.outputFiles = outputFiles;
    }
    
    @Column(name="COR_ORG_CD", length=50)
    public String getCorOrgCd() {
        return this.corOrgCd;
    }
    
    public void setCorOrgCd(String corOrgCd) {
        this.corOrgCd = corOrgCd;
    }
    
    @Column(name="COR_ORG_NAME", length=100)
    public String getCorOrgName() {
        return this.corOrgName;
    }
    
    public void setCorOrgName(String corOrgName) {
        this.corOrgName = corOrgName;
    }
    
    @Column(name="CONTROL_NODE_FLG", length=1)
    public String getControlNodeFlg() {
        return this.controlNodeFlg;
    }
    
    public void setControlNodeFlg(String controlNodeFlg) {
        this.controlNodeFlg = controlNodeFlg;
    }
    
    @Column(name="NODE_NAME", length=100)
    public String getNodeName() {
        return this.nodeName;
    }
    
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
    @Column(name="TREE_PARENT_NODE_ID", length=50)
    public String getTreeParentNodeId() {
        return this.treeParentNodeId;
    }
    
    public void setTreeParentNodeId(String treeParentNodeId) {
        this.treeParentNodeId = treeParentNodeId;
    }
    
    @Column(name="REMARK", length=200)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="IF_PARENT_SAME", precision=1, scale=0)
    public Boolean getIfParentSame() {
        return this.ifParentSame;
    }
    
    public void setIfParentSame(Boolean ifParentSame) {
        this.ifParentSame = ifParentSame;
    }
    
    @Column(name="PARENT_ID15", length=20)
    public String getParentId15() {
        return this.parentId15;
    }
    
    public void setParentId15(String parentId15) {
        this.parentId15 = parentId15;
    }
    
    @Column(name="STANDARD_START_DATE", length=20)
    public String getStandardStartDate() {
        return this.standardStartDate;
    }
    
    public void setStandardStartDate(String standardStartDate) {
        this.standardStartDate = standardStartDate;
    }
    
    @Column(name="STANDARD_END_DATE", length=20)
    public String getStandardEndDate() {
        return this.standardEndDate;
    }
    
    public void setStandardEndDate(String standardEndDate) {
        this.standardEndDate = standardEndDate;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="execPlanNode")
    @BatchSize(size=10)
public List<ExecPlanDetail> getExecPlanDetails() {
        return this.execPlanDetails;
    }
    
    public void setExecPlanDetails(List<ExecPlanDetail> execPlanDetails) {
        this.execPlanDetails = execPlanDetails;
    }




}


