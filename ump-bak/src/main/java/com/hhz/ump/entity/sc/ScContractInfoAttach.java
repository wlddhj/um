// 
package com.hhz.ump.entity.sc;
// Generated 2012-2-23 18:19:11 by Hibernate Tools 3.2.2.GA


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
 * ScContractInfoAttach generated by hbm2java
 */
@Entity
@Table(name="SC_CONTRACT_INFO_ATTACH"
    ,schema="POWERDESK"
)
public class ScContractInfoAttach  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 6891991349167676818L;
	private String scContractInfoAttachId;
     private ScContractTempletHis scContractTempletHis;
     private ScContractTempletInfo scContractTempletInfo;
     private String attachName;
     private String realFileName;
     private String attachTypeCd;
	 private Long sequenceNo;
     private String attachPath;
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
     private Boolean ifDelete;

    public ScContractInfoAttach() {
    }

	
    public ScContractInfoAttach(String scContractInfoAttachId, ScContractTempletHis scContractTempletHis, ScContractTempletInfo scContractTempletInfo, long recordVersion) {
        this.scContractInfoAttachId = scContractInfoAttachId;
        this.scContractTempletHis = scContractTempletHis;
        this.scContractTempletInfo = scContractTempletInfo;
        this.recordVersion = recordVersion;
    }
    public ScContractInfoAttach(String scContractInfoAttachId, ScContractTempletHis scContractTempletHis, ScContractTempletInfo scContractTempletInfo, String attachName,String realFileName, Long sequenceNo, String attachPath, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, boolean ifDelete) {
       this.scContractInfoAttachId = scContractInfoAttachId;
       this.scContractTempletHis = scContractTempletHis;
       this.scContractTempletInfo = scContractTempletInfo;
       this.attachName = attachName;
       this.realFileName = realFileName;
       this.sequenceNo = sequenceNo;
       this.attachPath = attachPath;
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
       this.ifDelete = ifDelete;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="SC_CONTRACT_INFO_ATTACH_ID", unique=true, nullable=false, length=50)
    public String getScContractInfoAttachId() {
        return this.scContractInfoAttachId;
    }
    
    public void setScContractInfoAttachId(String scContractInfoAttachId) {
        this.scContractInfoAttachId = scContractInfoAttachId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRACT_TEMPLET_HIS_ID", nullable=false)
    public ScContractTempletHis getScContractTempletHis() {
        return this.scContractTempletHis;
    }
    
    public void setScContractTempletHis(ScContractTempletHis scContractTempletHis) {
        this.scContractTempletHis = scContractTempletHis;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRACT_TEMPLET_INFO_ID", nullable=false)
    public ScContractTempletInfo getScContractTempletInfo() {
        return this.scContractTempletInfo;
    }
    
    public void setScContractTempletInfo(ScContractTempletInfo scContractTempletInfo) {
        this.scContractTempletInfo = scContractTempletInfo;
    }
    
    @Column(name="ATTACH_NAME", length=200)
    public String getAttachName() {
        return this.attachName;
    }
    
    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }
    
    @Column(name="REAL_FILE_NAME", nullable=false, length=500)
    public String getRealFileName() {
        return this.realFileName;
    }
    
    public void setRealFileName(String realFileName) {
        this.realFileName = realFileName;
    }

    @Column(name="SEQUENCE_NO", precision=18, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="ATTACH_PATH", length=500)
    public String getAttachPath() {
        return this.attachPath;
    }
    
    public void setAttachPath(String attachPath) {
        this.attachPath = attachPath;
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


    /**
	 * @return the attachTypeCd
	 */
    @Column(name="ATTACH_TYPE_CD", precision=18, scale=0)
	public String getAttachTypeCd() {
		return attachTypeCd;
	}


	/**
	 * @param attachTypeCd the attachTypeCd to set
	 */
	public void setAttachTypeCd(String attachTypeCd) {
		this.attachTypeCd = attachTypeCd;
	}
    
    @Column(name="IF_DELETE", precision=1, scale=0)
    public Boolean getIfDelete() {
        return this.ifDelete;
    }
    
    public void setIfDelete(Boolean ifDelete) {
        this.ifDelete = ifDelete;
    }


}


