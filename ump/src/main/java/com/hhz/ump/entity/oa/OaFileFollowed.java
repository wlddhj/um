// 
package com.hhz.ump.entity.oa;
// Generated 2010-9-15 10:07:46 by Hibernate Tools 3.2.4.GA


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
 * OaFileFollowed generated by hbm2java
 */
@Entity
@Table(name="OA_FILE_FOLLOWED"
    
)
public class OaFileFollowed  implements java.io.Serializable {


     private String oaFileFollowId;
     private String serialNumber;
     private String content;
     private String centerDeptSn;
     private String scheduleDescribe;
     private BigDecimal status;
     private String deleteFlg;
     private BigDecimal serialNumberNum;
     private String projectSn;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String currentUiid;
     private String scheduleDescribe2;
     private String receiver;
     private String acrossDeptCd;

    public OaFileFollowed() {
    }

	
    public OaFileFollowed(String oaFileFollowId, long recordVersion) {
        this.oaFileFollowId = oaFileFollowId;
        this.recordVersion = recordVersion;
    }
    public OaFileFollowed(String oaFileFollowId, String serialNumber, String content, String centerDeptSn, String scheduleDescribe, BigDecimal status, String deleteFlg, BigDecimal serialNumberNum, String projectSn, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String currentUiid, String scheduleDescribe2, String receiver, String acrossDeptCd) {
       this.oaFileFollowId = oaFileFollowId;
       this.serialNumber = serialNumber;
       this.content = content;
       this.centerDeptSn = centerDeptSn;
       this.scheduleDescribe = scheduleDescribe;
       this.status = status;
       this.deleteFlg = deleteFlg;
       this.serialNumberNum = serialNumberNum;
       this.projectSn = projectSn;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.currentUiid = currentUiid;
       this.scheduleDescribe2 = scheduleDescribe2;
       this.receiver = receiver;
       this.acrossDeptCd = acrossDeptCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="OA_FILE_FOLLOW_ID", unique=true, nullable=false, length=50)
    public String getOaFileFollowId() {
        return this.oaFileFollowId;
    }
    
    public void setOaFileFollowId(String oaFileFollowId) {
        this.oaFileFollowId = oaFileFollowId;
    }

    
    @Column(name="SERIAL_NUMBER", length=50)
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    
    @Column(name="CONTENT", length=600)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    
    @Column(name="CENTER_DEPT_SN", length=50)
    public String getCenterDeptSn() {
        return this.centerDeptSn;
    }
    
    public void setCenterDeptSn(String centerDeptSn) {
        this.centerDeptSn = centerDeptSn;
    }

    
    @Column(name="SCHEDULE_DESCRIBE", length=4000)
    public String getScheduleDescribe() {
        return this.scheduleDescribe;
    }
    
    public void setScheduleDescribe(String scheduleDescribe) {
        this.scheduleDescribe = scheduleDescribe;
    }

    
    @Column(name="STATUS", precision=38, scale=0)
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    
    @Column(name="DELETE_FLG", length=1)
    public String getDeleteFlg() {
        return this.deleteFlg;
    }
    
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    
    @Column(name="SERIAL_NUMBER_NUM", precision=38, scale=0)
    public BigDecimal getSerialNumberNum() {
        return this.serialNumberNum;
    }
    
    public void setSerialNumberNum(BigDecimal serialNumberNum) {
        this.serialNumberNum = serialNumberNum;
    }

    
    @Column(name="PROJECT_SN", length=50)
    public String getProjectSn() {
        return this.projectSn;
    }
    
    public void setProjectSn(String projectSn) {
        this.projectSn = projectSn;
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

    
    @Column(name="CURRENT_UIID", length=50)
    public String getCurrentUiid() {
        return this.currentUiid;
    }
    
    public void setCurrentUiid(String currentUiid) {
        this.currentUiid = currentUiid;
    }

    
    @Column(name="SCHEDULE_DESCRIBE2", length=4000)
    public String getScheduleDescribe2() {
        return this.scheduleDescribe2;
    }
    
    public void setScheduleDescribe2(String scheduleDescribe2) {
        this.scheduleDescribe2 = scheduleDescribe2;
    }

    
    @Column(name="RECEIVER", length=50)
    public String getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    
    @Column(name="ACROSS_DEPT_CD", length=100)
    public String getAcrossDeptCd() {
        return this.acrossDeptCd;
    }
    
    public void setAcrossDeptCd(String acrossDeptCd) {
        this.acrossDeptCd = acrossDeptCd;
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


