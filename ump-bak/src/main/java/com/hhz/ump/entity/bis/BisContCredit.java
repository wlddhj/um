// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-3 22:32:28 by Hibernate Tools 3.2.2.GA


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
 * BisContCredit generated by hbm2java
 */
@Entity
@Table(name="BIS_CONT_CREDIT"
    ,schema="POWERDESK"
)
public class BisContCredit  implements java.io.Serializable {


     private String bisContCreditId;
     private BisCont bisCont;
     private Long sequenceNo;
     private String infoName;
     private String infoLimit;
     private String attachFlg;
     private String entityTmpId;
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

    public BisContCredit() {
    }

	
    public BisContCredit(String bisContCreditId, BisCont bisCont, long recordVersion) {
        this.bisContCreditId = bisContCreditId;
        this.bisCont = bisCont;
        this.recordVersion = recordVersion;
    }
    public BisContCredit(String bisContCreditId, BisCont bisCont, Long sequenceNo, String infoName, String infoLimit, String attachFlg, String entityTmpId, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.bisContCreditId = bisContCreditId;
       this.bisCont = bisCont;
       this.sequenceNo = sequenceNo;
       this.infoName = infoName;
       this.infoLimit = infoLimit;
       this.attachFlg = attachFlg;
       this.entityTmpId = entityTmpId;
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
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_CONT_CREDIT_ID", unique=true, nullable=false, length=50)
    public String getBisContCreditId() {
        return this.bisContCreditId;
    }
    
    public void setBisContCreditId(String bisContCreditId) {
        this.bisContCreditId = bisContCreditId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_CONT_ID", nullable=false)
    public BisCont getBisCont() {
        return this.bisCont;
    }
    
    public void setBisCont(BisCont bisCont) {
        this.bisCont = bisCont;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="INFO_NAME", length=100)
    public String getInfoName() {
        return this.infoName;
    }
    
    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }
    
    @Column(name="INFO_LIMIT", length=100)
    public String getInfoLimit() {
        return this.infoLimit;
    }
    
    public void setInfoLimit(String infoLimit) {
        this.infoLimit = infoLimit;
    }
    
    @Column(name="ATTACH_FLG", length=1)
    public String getAttachFlg() {
        return this.attachFlg;
    }
    
    public void setAttachFlg(String attachFlg) {
        this.attachFlg = attachFlg;
    }
    
    @Column(name="ENTITY_TMP_ID", length=50)
    public String getEntityTmpId() {
        return this.entityTmpId;
    }
    
    public void setEntityTmpId(String entityTmpId) {
        this.entityTmpId = entityTmpId;
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




}


