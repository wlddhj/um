// 
package com.hhz.ump.entity.plan;
// Generated 2011-3-28 16:43:13 by Hibernate Tools 3.2.2.GA


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
 * CostCtrlMessage generated by hbm2java
 */
@Entity
@Table(name="COST_CTRL_MESSAGE"
    
)
public class CostCtrlMessage  implements java.io.Serializable {


     private String costCtrlMessageId;
     private CostCtrlBidPurc costCtrlBidPurc;
     private String msgContentDesc;
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

    public CostCtrlMessage() {
    }

	
    public CostCtrlMessage(String costCtrlMessageId, CostCtrlBidPurc costCtrlBidPurc, long recordVersion) {
        this.costCtrlMessageId = costCtrlMessageId;
        this.costCtrlBidPurc = costCtrlBidPurc;
        this.recordVersion = recordVersion;
    }
    public CostCtrlMessage(String costCtrlMessageId, CostCtrlBidPurc costCtrlBidPurc, String msgContentDesc, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.costCtrlMessageId = costCtrlMessageId;
       this.costCtrlBidPurc = costCtrlBidPurc;
       this.msgContentDesc = msgContentDesc;
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
    
    @Column(name="COST_CTRL_MESSAGE_ID", unique=true, nullable=false, length=50)
    public String getCostCtrlMessageId() {
        return this.costCtrlMessageId;
    }
    
    public void setCostCtrlMessageId(String costCtrlMessageId) {
        this.costCtrlMessageId = costCtrlMessageId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_CTRL_BID_PURC_ID", nullable=false)
    public CostCtrlBidPurc getCostCtrlBidPurc() {
        return this.costCtrlBidPurc;
    }
    
    public void setCostCtrlBidPurc(CostCtrlBidPurc costCtrlBidPurc) {
        this.costCtrlBidPurc = costCtrlBidPurc;
    }
    
    @Column(name="MSG_CONTENT_DESC", length=500)
    public String getMsgContentDesc() {
        return this.msgContentDesc;
    }
    
    public void setMsgContentDesc(String msgContentDesc) {
        this.msgContentDesc = msgContentDesc;
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


