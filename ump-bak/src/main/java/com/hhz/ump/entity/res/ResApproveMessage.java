// 
package com.hhz.ump.entity.res;
// Generated 2011-3-30 13:29:48 by Hibernate Tools 3.2.2.GA


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
 * ResApproveMessage generated by hbm2java
 */
@Entity
@Table(name="RES_APPROVE_MESSAGE"
    ,schema="POWERDESK"
)
public class ResApproveMessage  implements java.io.Serializable {


     private String resApproveMessageId;
     private ResApproveInfo resApproveInfo;
     private String msgContent;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String toUserCds;
     private String referMsgId;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Integer msgType;//信息类别字段，区别普通留言和共享留言及共享回复
     private String resApproveNodeId;

    public ResApproveMessage() {
    }

	
    public ResApproveMessage(String resApproveMessageId, ResApproveInfo resApproveInfo, long recordVersion) {
        this.resApproveMessageId = resApproveMessageId;
        this.resApproveInfo = resApproveInfo;
        this.recordVersion = recordVersion;
    }
    public ResApproveMessage(String resApproveMessageId, ResApproveInfo resApproveInfo, String msgContent, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String toUserCds, String referMsgId, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd,Integer msgType) {
       this.resApproveMessageId = resApproveMessageId;
       this.resApproveInfo = resApproveInfo;
       this.msgContent = msgContent;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.toUserCds = toUserCds;
       this.referMsgId = referMsgId;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.msgType = msgType;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="RES_APPROVE_MESSAGE_ID", unique=true, nullable=false, length=50)
    public String getResApproveMessageId() {
        return this.resApproveMessageId;
    }
    
    public void setResApproveMessageId(String resApproveMessageId) {
        this.resApproveMessageId = resApproveMessageId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RES_APPROVE_INFO_ID", nullable=false)
    public ResApproveInfo getResApproveInfo() {
        return this.resApproveInfo;
    }
    
    public void setResApproveInfo(ResApproveInfo resApproveInfo) {
        this.resApproveInfo = resApproveInfo;
    }
    
    @Column(name="MSG_CONTENT", length=1000)
    public String getMsgContent() {
        return this.msgContent;
    }
    
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
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
    
    @Column(name="TO_USER_CDS", length=200)
    public String getToUserCds() {
        return this.toUserCds;
    }
    
    public void setToUserCds(String toUserCds) {
        this.toUserCds = toUserCds;
    }
    
    @Column(name="REFER_MSG_ID", length=50)
    public String getReferMsgId() {
        return this.referMsgId;
    }
    
    public void setReferMsgId(String referMsgId) {
        this.referMsgId = referMsgId;
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
    
    @Column(name="MSG_TYPE", length=2)
    public Integer getMsgType() {
		return msgType;
	}


	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}


	@Column(name="UPDATED_POSITION_CD", length=20)
    public String getUpdatedPositionCd() {
        return this.updatedPositionCd;
    }
    
    public void setUpdatedPositionCd(String updatedPositionCd) {
        this.updatedPositionCd = updatedPositionCd;
    }


	@Column(name="RES_APPROVE_NODE_ID", length=20)
    public String getResApproveNodeId() {
        return this.resApproveNodeId;
    }
    
    public void setResApproveNodeId(String resApproveNodeId) {
        this.resApproveNodeId = resApproveNodeId;
    }

   



}


