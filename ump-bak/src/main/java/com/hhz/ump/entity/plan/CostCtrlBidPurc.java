// 
package com.hhz.ump.entity.plan;
// Generated 2011-3-28 16:43:13 by Hibernate Tools 3.2.2.GA


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
 * CostCtrlBidPurc generated by hbm2java
 */
@Entity
@Table(name="COST_CTRL_BID_PURC"
    ,schema="POWERDESK"
)
public class CostCtrlBidPurc  implements java.io.Serializable {


     private String costCtrlBidPurcId;
     private String dataTypeCd;
     private String projectCd;
     private String serialType;
     private Long serialNo;
     private String importantTypeCd;
     private String planTypeCd;
     private String planContentDesc;
     private String ownerCds;
     private String ownerNames;
     private String isCompletedFlag;
     private String updateContentDesc;
     private String isSuppCompleteFlag;
     private String scheduleStatusCd;
     private String isWaitProjectFlag;
     private String waitProjectDesc;
     private String isWaitTechFlag;
     private String waitTechDesc;
     private String isWaitOtherFlag;
     private String waitDeptCd;
     private String waitDeptName;
     private String waitDesc;
     private Date bidDate;
     private String contractStatusCd;
     private String bidCheckStatusCd;
     private String bidStatusCd;
     private String dataSrcTypeCd;
     private String dataSrcId;
     private String dataSrcStatusCd;
     private String dataSrcDesc;
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
     private String deleteFlg;
     private String resApproveCd;
     private String resApproveId;
     private List<CostCtrlSchedule> costCtrlSchedules = new ArrayList<CostCtrlSchedule>();
     private List<CostCtrlSuppliers> costCtrlSupplierses = new ArrayList<CostCtrlSuppliers>();
     private List<CostCtrlMessage> costCtrlMessages = new ArrayList<CostCtrlMessage>();

     private String inviteResId;
     private String inviteResAttachId;
     private String callResId;
     private String callResAttachId;
     private String bidResId;
     
    public CostCtrlBidPurc() {
    }

	
    public CostCtrlBidPurc(String costCtrlBidPurcId, long recordVersion) {
        this.costCtrlBidPurcId = costCtrlBidPurcId;
        this.recordVersion = recordVersion;
    }
    public CostCtrlBidPurc(String costCtrlBidPurcId, String dataTypeCd, String projectCd, String serialType, Long serialNo, String importantTypeCd, String planTypeCd, String planContentDesc, String ownerCds, String ownerNames, String isCompletedFlag, String updateContentDesc, String isSuppCompleteFlag, String scheduleStatusCd, String isWaitProjectFlag, String waitProjectDesc, String isWaitTechFlag, String waitTechDesc, String isWaitOtherFlag, String waitDeptCd, String waitDeptName, String waitDesc, Date bidDate, String contractStatusCd, String bidCheckStatusCd, String bidStatusCd, String dataSrcTypeCd, String dataSrcId, String dataSrcStatusCd, String dataSrcDesc, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<CostCtrlSchedule> costCtrlSchedules, List<CostCtrlSuppliers> costCtrlSupplierses, List<CostCtrlMessage> costCtrlMessages,String resApproveCd,String resApproveId, String inviteResId, String inviteResAttachId,String callResId, String callResAttachId,String bidResId) {
       this.costCtrlBidPurcId = costCtrlBidPurcId;
       this.dataTypeCd = dataTypeCd;
       this.projectCd = projectCd;
       this.serialType = serialType;
       this.serialNo = serialNo;
       this.importantTypeCd = importantTypeCd;
       this.planTypeCd = planTypeCd;
       this.planContentDesc = planContentDesc;
       this.ownerCds = ownerCds;
       this.ownerNames = ownerNames;
       this.isCompletedFlag = isCompletedFlag;
       this.updateContentDesc = updateContentDesc;
       this.isSuppCompleteFlag = isSuppCompleteFlag;
       this.scheduleStatusCd = scheduleStatusCd;
       this.isWaitProjectFlag = isWaitProjectFlag;
       this.waitProjectDesc = waitProjectDesc;
       this.isWaitTechFlag = isWaitTechFlag;
       this.waitTechDesc = waitTechDesc;
       this.isWaitOtherFlag = isWaitOtherFlag;
       this.waitDeptCd = waitDeptCd;
       this.waitDeptName = waitDeptName;
       this.waitDesc = waitDesc;
       this.bidDate = bidDate;
       this.contractStatusCd = contractStatusCd;
       this.bidCheckStatusCd = bidCheckStatusCd;
       this.bidStatusCd = bidStatusCd;
       this.dataSrcTypeCd = dataSrcTypeCd;
       this.dataSrcId = dataSrcId;
       this.dataSrcStatusCd = dataSrcStatusCd;
       this.dataSrcDesc = dataSrcDesc;
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
       this.costCtrlSchedules = costCtrlSchedules;
       this.costCtrlSupplierses = costCtrlSupplierses;
       this.costCtrlMessages = costCtrlMessages;
       this.resApproveCd = resApproveCd;
       this.resApproveId = resApproveId;
       this.inviteResId = inviteResId;
       this.inviteResAttachId = inviteResAttachId;
       this.callResId = callResId;
       this.callResAttachId = callResAttachId;
       this.bidResId  = bidResId;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="COST_CTRL_BID_PURC_ID", unique=true, nullable=false, length=50)
    public String getCostCtrlBidPurcId() {
        return this.costCtrlBidPurcId;
    }
    
    public void setCostCtrlBidPurcId(String costCtrlBidPurcId) {
        this.costCtrlBidPurcId = costCtrlBidPurcId;
    }
    
    @Column(name="DATA_TYPE_CD", length=1)
    public String getDataTypeCd() {
        return this.dataTypeCd;
    }
    
    public void setDataTypeCd(String dataTypeCd) {
        this.dataTypeCd = dataTypeCd;
    }
    
    @Column(name="PROJECT_CD", length=50)
    public String getProjectCd() {
        return this.projectCd;
    }
    
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }
    
    @Column(name="SERIAL_TYPE", length=50)
    public String getSerialType() {
        return this.serialType;
    }
    
    public void setSerialType(String serialType) {
        this.serialType = serialType;
    }
    
    @Column(name="SERIAL_NO", precision=10, scale=0)
    public Long getSerialNo() {
        return this.serialNo;
    }
    
    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }
    
    @Column(name="IMPORTANT_TYPE_CD", length=1)
    public String getImportantTypeCd() {
        return this.importantTypeCd;
    }
    
    public void setImportantTypeCd(String importantTypeCd) {
        this.importantTypeCd = importantTypeCd;
    }
    
    @Column(name="PLAN_TYPE_CD", length=1)
    public String getPlanTypeCd() {
        return this.planTypeCd;
    }
    
    public void setPlanTypeCd(String planTypeCd) {
        this.planTypeCd = planTypeCd;
    }
    
    @Column(name="PLAN_CONTENT_DESC", length=200)
    public String getPlanContentDesc() {
        return this.planContentDesc;
    }
    
    public void setPlanContentDesc(String planContentDesc) {
        this.planContentDesc = planContentDesc;
    }
    
    @Column(name="OWNER_CDS", length=50)
    public String getOwnerCds() {
        return this.ownerCds;
    }
    
    public void setOwnerCds(String ownerCds) {
        this.ownerCds = ownerCds;
    }
    
    @Column(name="OWNER_NAMES", length=100)
    public String getOwnerNames() {
        return this.ownerNames;
    }
    
    public void setOwnerNames(String ownerNames) {
        this.ownerNames = ownerNames;
    }
    
    @Column(name="IS_COMPLETED_FLAG", length=1)
    public String getIsCompletedFlag() {
        return this.isCompletedFlag;
    }
    
    public void setIsCompletedFlag(String isCompletedFlag) {
        this.isCompletedFlag = isCompletedFlag;
    }
    
    @Column(name="UPDATE_CONTENT_DESC", length=50)
    public String getUpdateContentDesc() {
        return this.updateContentDesc;
    }
    
    public void setUpdateContentDesc(String updateContentDesc) {
        this.updateContentDesc = updateContentDesc;
    }
    
    @Column(name="IS_SUPP_COMPLETE_FLAG", length=1)
    public String getIsSuppCompleteFlag() {
        return this.isSuppCompleteFlag;
    }
    
    public void setIsSuppCompleteFlag(String isSuppCompleteFlag) {
        this.isSuppCompleteFlag = isSuppCompleteFlag;
    }
    
    @Column(name="SCHEDULE_STATUS_CD", length=20)
    public String getScheduleStatusCd() {
        return this.scheduleStatusCd;
    }
    
    public void setScheduleStatusCd(String scheduleStatusCd) {
        this.scheduleStatusCd = scheduleStatusCd;
    }
    
    @Column(name="IS_WAIT_PROJECT_FLAG", length=1)
    public String getIsWaitProjectFlag() {
        return this.isWaitProjectFlag;
    }
    
    public void setIsWaitProjectFlag(String isWaitProjectFlag) {
        this.isWaitProjectFlag = isWaitProjectFlag;
    }
    
    @Column(name="WAIT_PROJECT_DESC", length=100)
    public String getWaitProjectDesc() {
        return this.waitProjectDesc;
    }
    
    public void setWaitProjectDesc(String waitProjectDesc) {
        this.waitProjectDesc = waitProjectDesc;
    }
    
    @Column(name="IS_WAIT_TECH_FLAG", length=1)
    public String getIsWaitTechFlag() {
        return this.isWaitTechFlag;
    }
    
    public void setIsWaitTechFlag(String isWaitTechFlag) {
        this.isWaitTechFlag = isWaitTechFlag;
    }
    
    @Column(name="WAIT_TECH_DESC", length=100)
    public String getWaitTechDesc() {
        return this.waitTechDesc;
    }
    
    public void setWaitTechDesc(String waitTechDesc) {
        this.waitTechDesc = waitTechDesc;
    }
    
    @Column(name="IS_WAIT_OTHER_FLAG", length=1)
    public String getIsWaitOtherFlag() {
        return this.isWaitOtherFlag;
    }
    
    public void setIsWaitOtherFlag(String isWaitOtherFlag) {
        this.isWaitOtherFlag = isWaitOtherFlag;
    }
    
    @Column(name="WAIT_DEPT_CD", length=200)
    public String getWaitDeptCd() {
        return this.waitDeptCd;
    }
    
    public void setWaitDeptCd(String waitDeptCd) {
        this.waitDeptCd = waitDeptCd;
    }
    
    @Column(name="WAIT_DEPT_NAME", length=500)
    public String getWaitDeptName() {
        return this.waitDeptName;
    }
    
    public void setWaitDeptName(String waitDeptName) {
        this.waitDeptName = waitDeptName;
    }
    
    @Column(name="WAIT_DESC", length=100)
    public String getWaitDesc() {
        return this.waitDesc;
    }
    
    public void setWaitDesc(String waitDesc) {
        this.waitDesc = waitDesc;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BID_DATE", length=7)
    public Date getBidDate() {
        return this.bidDate;
    }
    
    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }
    
    @Column(name="CONTRACT_STATUS_CD", length=1)
    public String getContractStatusCd() {
        return this.contractStatusCd;
    }
    
    public void setContractStatusCd(String contractStatusCd) {
        this.contractStatusCd = contractStatusCd;
    }
    @Column(name="BID_CHECK_STATUS_CD", length=1)
    public String getBidCheckStatusCd() {
    	return this.bidCheckStatusCd;
    }
    
    public void setBidCheckStatusCd(String bidCheckStatusCd) {
    	this.bidCheckStatusCd = bidCheckStatusCd;
    }
    
    @Column(name="BID_STATUS_CD", length=1)
    public String getBidStatusCd() {
        return this.bidStatusCd;
    }
    
    public void setBidStatusCd(String bidStatusCd) {
        this.bidStatusCd = bidStatusCd;
    }
    
    @Column(name="DATA_SRC_TYPE_CD", length=20)
    public String getDataSrcTypeCd() {
        return this.dataSrcTypeCd;
    }
    
    public void setDataSrcTypeCd(String dataSrcTypeCd) {
        this.dataSrcTypeCd = dataSrcTypeCd;
    }
    
    @Column(name="DATA_SRC_ID", length=40)
    public String getDataSrcId() {
        return this.dataSrcId;
    }
    
    public void setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
    }
    
    @Column(name="DATA_SRC_STATUS_CD", length=50)
    public String getDataSrcStatusCd() {
        return this.dataSrcStatusCd;
    }
    
    public void setDataSrcStatusCd(String dataSrcStatusCd) {
        this.dataSrcStatusCd = dataSrcStatusCd;
    }
    
    @Column(name="DATA_SRC_DESC", length=100)
    public String getDataSrcDesc() {
        return this.dataSrcDesc;
    }
    
    public void setDataSrcDesc(String dataSrcDesc) {
        this.dataSrcDesc = dataSrcDesc;
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
    
    
    @Column(name="DELETE_FLG", length=1)
    public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costCtrlBidPurc")
    @BatchSize(size=10)
    @OrderBy(clause="SERIAL_NO ASC")
public List<CostCtrlSchedule> getCostCtrlSchedules() {
        return this.costCtrlSchedules;
    }
    
    public void setCostCtrlSchedules(List<CostCtrlSchedule> costCtrlSchedules) {
        this.costCtrlSchedules = costCtrlSchedules;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costCtrlBidPurc")
    @BatchSize(size=10)
public List<CostCtrlSuppliers> getCostCtrlSupplierses() {
        return this.costCtrlSupplierses;
    }
    
    public void setCostCtrlSupplierses(List<CostCtrlSuppliers> costCtrlSupplierses) {
        this.costCtrlSupplierses = costCtrlSupplierses;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="costCtrlBidPurc")
    @BatchSize(size=10)
    @OrderBy(clause="CREATED_DATE DESC")
public List<CostCtrlMessage> getCostCtrlMessages() {
        return this.costCtrlMessages;
    }
    
    public void setCostCtrlMessages(List<CostCtrlMessage> costCtrlMessages) {
        this.costCtrlMessages = costCtrlMessages;
    }

    @Column(name="RES_APPROVE_CD", length=50)
	public String getResApproveCd() {
		return resApproveCd;
	}
	public void setResApproveCd(String resApproveCd) {
		this.resApproveCd = resApproveCd;
	}

	
	@Column(name="RES_APPROVE_ID", length=50)
	public String getResApproveId() {
		return resApproveId;
	}
	public void setResApproveId(String resApproveId) {
		this.resApproveId = resApproveId;
	}

	@Column(name="INVITE_RES_ID", length=50)
	public String getInviteResId() {
		return inviteResId;
	}


	public void setInviteResId(String inviteResId) {
		this.inviteResId = inviteResId;
	}

	@Column(name="INVITE_RES_ATTACH_ID", length=50)
	public String getInviteResAttachId() {
		return inviteResAttachId;
	}

	public void setInviteResAttachId(String inviteResAttachId) {
		this.inviteResAttachId = inviteResAttachId;
	}

	@Column(name="CALL_RES_ID", length=50)
	public String getCallResId() {
		return callResId;
	}


	public void setCallResId(String callResId) {
		this.callResId = callResId;
	}

	@Column(name="CALL_RES_ATTACH_ID", length=50)
	public String getCallResAttachId() {
		return callResAttachId;
	}

	public void setCallResAttachId(String callResAttachId) {
		this.callResAttachId = callResAttachId;
	}

	@Column(name="BID_RES_ID", length=50)
	public String getBidResId() {
		return bidResId;
	}


	public void setBidResId(String bidResId) {
		this.bidResId = bidResId;
	}

}


