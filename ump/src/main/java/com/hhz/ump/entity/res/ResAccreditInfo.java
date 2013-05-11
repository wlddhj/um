// 
package com.hhz.ump.entity.res;
// Generated 2011-3-30 13:29:48 by Hibernate Tools 3.2.2.GA


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
 * ResAccreditInfo generated by hbm2java
 */
@Entity
@Table(name="RES_ACCREDIT_INFO"
    
)
public class ResAccreditInfo  implements java.io.Serializable {


     private String resAccreditInfoId;
     private String userCd;
     private String userName;
     private String accUserCd;
     private String accUserName;
     private String activeFlg;
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
     private Boolean isJbpm;
     private Boolean isFile;
     private Boolean isRes;
     private String accTypeCd;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;

    public ResAccreditInfo() {
    }

	
    public ResAccreditInfo(String resAccreditInfoId, long recordVersion) {
        this.resAccreditInfoId = resAccreditInfoId;
        this.recordVersion = recordVersion;
    }
    public ResAccreditInfo(String resAccreditInfoId, String userCd, String userName, String accUserCd, String accUserName, String activeFlg, Date startDate, Date endDate, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, Boolean isJbpm, Boolean isFile, Boolean isRes,String accTypeCd, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd) {
       this.resAccreditInfoId = resAccreditInfoId;
       this.userCd = userCd;
       this.userName = userName;
       this.accUserCd = accUserCd;
       this.accUserName = accUserName;
       this.activeFlg = activeFlg;
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
       this.isJbpm = isJbpm;
       this.isFile = isFile;
       this.isRes = isRes;
       this.accTypeCd = accTypeCd;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="RES_ACCREDIT_INFO_ID", unique=true, nullable=false, length=50)
    public String getResAccreditInfoId() {
        return this.resAccreditInfoId;
    }
    
    public void setResAccreditInfoId(String resAccreditInfoId) {
        this.resAccreditInfoId = resAccreditInfoId;
    }
    
    @Column(name="USER_CD", length=20)
    public String getUserCd() {
        return this.userCd;
    }
    
    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }
    
    @Column(name="USER_NAME", length=50)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="ACC_USER_CD", length=20)
    public String getAccUserCd() {
        return this.accUserCd;
    }
    
    public void setAccUserCd(String accUserCd) {
        this.accUserCd = accUserCd;
    }
    
    @Column(name="ACC_USER_NAME", length=50)
    public String getAccUserName() {
        return this.accUserName;
    }
    
    public void setAccUserName(String accUserName) {
        this.accUserName = accUserName;
    }
    
    @Column(name="ACTIVE_FLG", length=1)
    public String getActiveFlg() {
        return this.activeFlg;
    }
    
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
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
    @Column(name="END_DATE", length=7)
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
    
    @Column(name="IS_JBPM", precision=1, scale=0)
    public Boolean getIsJbpm() {
        return this.isJbpm;
    }
    
    public void setIsJbpm(Boolean isJbpm) {
        this.isJbpm = isJbpm;
    }
    
    @Column(name="IS_FILE", precision=1, scale=0)
    public Boolean getIsFile() {
        return this.isFile;
    }
    
    public void setIsFile(Boolean isFile) {
        this.isFile = isFile;
    }
    
    @Column(name="IS_RES", precision=1, scale=0)
    public Boolean getIsRes() {
        return this.isRes;
    }
    
    public void setIsRes(Boolean isRes) {
        this.isRes = isRes;
    }
    
    @Column(name="ACC_TYPE_CD", length=20)
    public String getAccTypeCd() {
        return this.accTypeCd;
    }
    
    public void setAccTypeCd(String accTypeCd) {
        this.accTypeCd = accTypeCd;
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




}


