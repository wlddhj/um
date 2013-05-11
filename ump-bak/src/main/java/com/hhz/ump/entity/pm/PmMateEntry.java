// 
package com.hhz.ump.entity.pm;
// Generated 2012-6-19 17:48:25 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * PmMateEntry generated by hbm2java
 */
@Entity
@Table(name="PM_MATE_ENTRY"
    ,schema="POWERDESK"
)
public class PmMateEntry  implements java.io.Serializable {


     private String pmMateEntryId;
     private String pmMateEntryNo;
     private PmMateModu pmMateModu;
     private Boolean statusCd;
     private String activeTitle;
     private String activeContent;
     private String activePeriod;
     private BigDecimal expensesBudget;
     private String properties;
     private String meichen;
     private String present;
     private String medium;
     private String operatorGuide;
     private String expectedResults;
     private BigDecimal uploadPicFlg;
     private BigDecimal uploadPrjFlg;
     private String creator;
     private String createdCenterCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private BigDecimal sequenceNo;
     private BigDecimal recordVersion;
     private List<PmExecDetail> pmExecDetails = new ArrayList<PmExecDetail>();

    public PmMateEntry() {
    }

	
    public PmMateEntry(String pmMateEntryId,String pmMateEntryNo,PmMateModu pmMateModu, String updatedCenterCd) {
        this.pmMateEntryNo = pmMateEntryNo;
    	this.pmMateEntryId = pmMateEntryId;
        this.pmMateModu = pmMateModu;
        this.updatedCenterCd = updatedCenterCd;
    }
    public PmMateEntry(String pmMateEntryId,String pmMateEntryNo, PmMateModu pmMateModu, Boolean statusCd, String activeTitle, String activeContent, String activePeriod, BigDecimal expensesBudget, String properties, String meichen, String present, String medium, String operatorGuide, String expectedResults,BigDecimal uploadPicFlg,BigDecimal uploadPrjFlg, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, BigDecimal sequenceNo, BigDecimal recordVersion, List<PmExecDetail> pmExecDetails) {
       this.pmMateEntryNo = pmMateEntryNo;
       this.pmMateEntryId = pmMateEntryId;
       this.pmMateModu = pmMateModu;
       this.statusCd = statusCd;
       this.activeTitle = activeTitle;
       this.activeContent = activeContent;
       this.activePeriod = activePeriod;
       this.expensesBudget = expensesBudget;
       this.properties = properties;
       this.meichen = meichen;
       this.present = present;
       this.medium = medium;
       this.operatorGuide = operatorGuide;
       this.expectedResults = expectedResults;
       this.uploadPicFlg=uploadPicFlg;
       this.uploadPrjFlg=uploadPrjFlg;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.sequenceNo = sequenceNo;
       this.recordVersion = recordVersion;
       this.pmExecDetails = pmExecDetails;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PM_MATE_ENTRY_ID", unique=true, nullable=false, length=50)
    public String getPmMateEntryId() {
        return this.pmMateEntryId;
    }
    
    public void setPmMateEntryId(String pmMateEntryId) {
        this.pmMateEntryId = pmMateEntryId;
    }
    
    @Column(name="PM_MATE_ENTRY_NO", length=50)
    public String getPmMateEntryNo() {
		return pmMateEntryNo;
	}


	public void setPmMateEntryNo(String pmMateEntryNo) {
		this.pmMateEntryNo = pmMateEntryNo;
	}


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PM_MATE_MODU_ID", nullable=false)
    public PmMateModu getPmMateModu() {
        return this.pmMateModu;
    }
    
    public void setPmMateModu(PmMateModu pmMateModu) {
        this.pmMateModu = pmMateModu;
    }
    
    @Column(name="STATUS_CD", precision=1, scale=0)
    public Boolean getStatusCd() {
        return this.statusCd;
    }
    
    public void setStatusCd(Boolean statusCd) {
        this.statusCd = statusCd;
    }
    
    @Column(name="ACTIVE_TITLE", length=100)
    public String getActiveTitle() {
        return this.activeTitle;
    }
    
    public void setActiveTitle(String activeTitle) {
        this.activeTitle = activeTitle;
    }
    
    @Column(name="ACTIVE_CONTENT", length=1000)
    public String getActiveContent() {
        return this.activeContent;
    }
    
    public void setActiveContent(String activeContent) {
        this.activeContent = activeContent;
    }
    
    @Column(name="ACTIVE_PERIOD", length=200)
    public String getActivePeriod() {
        return this.activePeriod;
    }
    
    public void setActivePeriod(String activePeriod) {
        this.activePeriod = activePeriod;
    }
    
    @Column(name="EXPENSES_BUDGET", precision=18)
    public BigDecimal getExpensesBudget() {
        return this.expensesBudget;
    }
    
    public void setExpensesBudget(BigDecimal expensesBudget) {
        this.expensesBudget = expensesBudget;
    }
    
    @Column(name="PROPERTIES", length=100)
    public String getProperties() {
        return this.properties;
    }
    
    public void setProperties(String properties) {
        this.properties = properties;
    }
    
    @Column(name="MEICHEN", length=100)
    public String getMeichen() {
        return this.meichen;
    }
    
    public void setMeichen(String meichen) {
        this.meichen = meichen;
    }
    
    @Column(name="PRESENT", length=100)
    public String getPresent() {
        return this.present;
    }
    
    public void setPresent(String present) {
        this.present = present;
    }
    
    @Column(name="MEDIUM", length=100)
    public String getMedium() {
        return this.medium;
    }
    
    public void setMedium(String medium) {
        this.medium = medium;
    }
    
    @Column(name="OPERATOR_GUIDE", length=1000)
    public String getOperatorGuide() {
        return this.operatorGuide;
    }
    
    public void setOperatorGuide(String operatorGuide) {
        this.operatorGuide = operatorGuide;
    }
    
    @Column(name="EXPECTED_RESULTS", length=1000)
    public String getExpectedResults() {
        return this.expectedResults;
    }
    
    public void setExpectedResults(String expectedResults) {
        this.expectedResults = expectedResults;
    }
    
    @Column(name="UPLOAD_PIC_FLG", precision=1, scale=0)
    public BigDecimal getUploadPicFlg() {
		return uploadPicFlg;
	}


	public void setUploadPicFlg(BigDecimal uploadPicFlg) {
		this.uploadPicFlg = uploadPicFlg;
	}


	@Column(name="UPLOAD_PRJ_FLG", precision=1, scale=0)
	public BigDecimal getUploadPrjFlg() {
		return uploadPrjFlg;
	}


	public void setUploadPrjFlg(BigDecimal uploadPrjFlg) {
		this.uploadPrjFlg = uploadPrjFlg;
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
    
    @Column(name="UPDATED_CENTER_CD", nullable=false, length=20)
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
    
    @Column(name="SEQUENCE_NO", precision=38, scale=0)
    public BigDecimal getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="RECORD_VERSION", precision=10, scale=0)
    public BigDecimal getRecordVersion() {
        return this.recordVersion;
    }
    
    public void setRecordVersion(BigDecimal recordVersion) {
        this.recordVersion = recordVersion;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="pmMateEntry")
    @BatchSize(size=10)
public List<PmExecDetail> getPmExecDetails() {
        return this.pmExecDetails;
    }
    
    public void setPmExecDetails(List<PmExecDetail> pmExecDetails) {
        this.pmExecDetails = pmExecDetails;
    }


    


}


