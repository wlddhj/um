// 
package com.hhz.uums.entity.app;
// Generated 2011-1-28 17:14:32 by Hibernate Tools 3.2.2.GA


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
 * AppAttachFile generated by hbm2java
 */
@Entity
@Table(name="APP_ATTACH_FILE"
    
)
public class AppAttachFile  implements java.io.Serializable {


     private String appAttachFileId;
     private String bizEntityId;
     private String bizModuleCd;
     private String fileName;
     private String realFileName;
     private String filePath;
     private String fileTypeName;
     private BigDecimal fileSize;
     private Boolean mainFlg;
     private String smallPicName;
     private String statusCd;
     private String remark;
     private String creator;
     private Date createdDate;
     private String updator;
     private Date updatedDate;
     private long recordVersion;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;

    public AppAttachFile() {
    }

	
    public AppAttachFile(String appAttachFileId, String bizEntityId, String fileName, String realFileName, String filePath, String fileTypeName, BigDecimal fileSize, long recordVersion) {
        this.appAttachFileId = appAttachFileId;
        this.bizEntityId = bizEntityId;
        this.fileName = fileName;
        this.realFileName = realFileName;
        this.filePath = filePath;
        this.fileTypeName = fileTypeName;
        this.fileSize = fileSize;
        this.recordVersion = recordVersion;
    }
    public AppAttachFile(String appAttachFileId, String bizEntityId, String bizModuleCd, String fileName, String realFileName, String filePath, String fileTypeName, BigDecimal fileSize, Boolean mainFlg, String smallPicName, String statusCd, String remark, String creator, Date createdDate, String updator, Date updatedDate, long recordVersion, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd) {
       this.appAttachFileId = appAttachFileId;
       this.bizEntityId = bizEntityId;
       this.bizModuleCd = bizModuleCd;
       this.fileName = fileName;
       this.realFileName = realFileName;
       this.filePath = filePath;
       this.fileTypeName = fileTypeName;
       this.fileSize = fileSize;
       this.mainFlg = mainFlg;
       this.smallPicName = smallPicName;
       this.statusCd = statusCd;
       this.remark = remark;
       this.creator = creator;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="APP_ATTACH_FILE_ID", unique=true, nullable=false, length=50)
    public String getAppAttachFileId() {
        return this.appAttachFileId;
    }
    
    public void setAppAttachFileId(String appAttachFileId) {
        this.appAttachFileId = appAttachFileId;
    }
    
    @Column(name="BIZ_ENTITY_ID", nullable=false, length=50)
    public String getBizEntityId() {
        return this.bizEntityId;
    }
    
    public void setBizEntityId(String bizEntityId) {
        this.bizEntityId = bizEntityId;
    }
    
    @Column(name="BIZ_MODULE_CD", length=20)
    public String getBizModuleCd() {
        return this.bizModuleCd;
    }
    
    public void setBizModuleCd(String bizModuleCd) {
        this.bizModuleCd = bizModuleCd;
    }
    
    @Column(name="FILE_NAME", nullable=false, length=500)
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Column(name="REAL_FILE_NAME", nullable=false, length=500)
    public String getRealFileName() {
        return this.realFileName;
    }
    
    public void setRealFileName(String realFileName) {
        this.realFileName = realFileName;
    }
    
    @Column(name="FILE_PATH", nullable=false, length=500)
    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    @Column(name="FILE_TYPE_NAME", nullable=false, length=100)
    public String getFileTypeName() {
        return this.fileTypeName;
    }
    
    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
    }
    
    @Column(name="FILE_SIZE", nullable=false, scale=4)
    public BigDecimal getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }
    
    @Column(name="MAIN_FLG", precision=1, scale=0)
    public Boolean getMainFlg() {
        return this.mainFlg;
    }
    
    public void setMainFlg(Boolean mainFlg) {
        this.mainFlg = mainFlg;
    }
    
    @Column(name="SMALL_PIC_NAME", length=50)
    public String getSmallPicName() {
        return this.smallPicName;
    }
    
    public void setSmallPicName(String smallPicName) {
        this.smallPicName = smallPicName;
    }
    
    @Column(name="STATUS_CD", length=20)
    public String getStatusCd() {
        return this.statusCd;
    }
    
    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
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

    private String createdDeptCd;
    private String updatedDeptCd;
    @Column(name="CREATED_DEPT_CD", length=20)
	public String getCreatedDeptCd() {
		return createdDeptCd;
	}


	public void setCreatedDeptCd(String createdDeptCd) {
		this.createdDeptCd = createdDeptCd;
	}

	@Column(name="UPDATED_DEPT_CD", length=20)
	public String getUpdatedDeptCd() {
		return updatedDeptCd;
	}


	public void setUpdatedDeptCd(String updatedDeptCd) {
		this.updatedDeptCd = updatedDeptCd;
	}



}


