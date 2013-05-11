// 
package com.hhz.ump.entity.oa;
// Generated 2010-9-20 11:11:30 by Hibernate Tools 3.2.4.GA


import java.sql.Clob;
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
 * OaMeetingFolder generated by hbm2java
 */
@Entity
@Table(name="OA_MEETING_FOLDER"
    ,schema="POWERDESK"
)
public class OaMeetingFolder  implements java.io.Serializable {


     private String oaMeetingFolderId;
     private Clob visibleToPersons;
     private String bizModuleCd;
     private String parentFolderId;
     private String folderName;
     private String disabledFlg;
     private String deletedFlg;
     private String ownerDeptCd;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private long sequenceNo;
     private List<OaMeetingFile> oaMeetingFiles = new ArrayList<OaMeetingFile>();

    public OaMeetingFolder() {
    }

	
    public OaMeetingFolder(String oaMeetingFolderId, long recordVersion) {
        this.oaMeetingFolderId = oaMeetingFolderId;
        this.recordVersion = recordVersion;
    }
    public OaMeetingFolder(String oaMeetingFolderId, Clob visibleToPersons, String bizModuleCd, String parentFolderId, String folderName, String disabledFlg, String deletedFlg, String ownerDeptCd, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion,long sequenceNo, List<OaMeetingFile> oaMeetingFiles) {
       this.oaMeetingFolderId = oaMeetingFolderId;
       this.visibleToPersons = visibleToPersons;
       this.bizModuleCd = bizModuleCd;
       this.parentFolderId = parentFolderId;
       this.folderName = folderName;
       this.disabledFlg = disabledFlg;
       this.deletedFlg = deletedFlg;
       this.ownerDeptCd = ownerDeptCd;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.sequenceNo = sequenceNo;
       this.oaMeetingFiles = oaMeetingFiles;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="OA_MEETING_FOLDER_ID", unique=true, nullable=false, length=50)
    public String getOaMeetingFolderId() {
        return this.oaMeetingFolderId;
    }
    
    public void setOaMeetingFolderId(String oaMeetingFolderId) {
        this.oaMeetingFolderId = oaMeetingFolderId;
    }

    
    @Column(name="VISIBLE_TO_PERSONS")
    public Clob getVisibleToPersons() {
        return this.visibleToPersons;
    }
    
    public void setVisibleToPersons(Clob visibleToPersons) {
        this.visibleToPersons = visibleToPersons;
    }

    
    @Column(name="BIZ_MODULE_CD", length=50)
    public String getBizModuleCd() {
        return this.bizModuleCd;
    }
    
    public void setBizModuleCd(String bizModuleCd) {
        this.bizModuleCd = bizModuleCd;
    }

    
    @Column(name="PARENT_FOLDER_ID", length=50)
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    
    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    
    @Column(name="FOLDER_NAME", length=200)
    public String getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    
    @Column(name="DISABLED_FLG", length=1)
    public String getDisabledFlg() {
        return this.disabledFlg;
    }
    
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    
    @Column(name="DELETED_FLG", length=1)
    public String getDeletedFlg() {
        return this.deletedFlg;
    }
    
    public void setDeletedFlg(String deletedFlg) {
        this.deletedFlg = deletedFlg;
    }

    
    @Column(name="OWNER_DEPT_CD", length=20)
    public String getOwnerDeptCd() {
        return this.ownerDeptCd;
    }
    
    public void setOwnerDeptCd(String ownerDeptCd) {
        this.ownerDeptCd = ownerDeptCd;
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
    
    @Column(name="SEQUENCE_NO", nullable=false, precision=10, scale=0)
    public long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="oaMeetingFolder")
    @BatchSize(size=10)
public List<OaMeetingFile> getOaMeetingFiles() {
        return this.oaMeetingFiles;
    }
    
    public void setOaMeetingFiles(List<OaMeetingFile> oaMeetingFiles) {
        this.oaMeetingFiles = oaMeetingFiles;
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

