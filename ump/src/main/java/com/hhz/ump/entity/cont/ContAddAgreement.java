// 
package com.hhz.ump.entity.cont;
// Generated 2010-12-2 14:39:58 by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
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
 * ContAddAgreement generated by hbm2java
 */
@Entity
@Table(name="CONT_ADD_AGREEMENT"
    
)
public class ContAddAgreement  implements java.io.Serializable {


     private String contAddAgreementId;
     private ContLedger contLedger;
     private String addAgreementNo;
     private BigDecimal amountUpdate;
     private String content;
     private String cause;
     private String attaBizId;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private BigDecimal groupCheckFee;
     private BigDecimal contTempMoney;
     private String resApproveCd;
     private String resApproveId;

    public ContAddAgreement() {
    }

	
    public ContAddAgreement(String contAddAgreementId, ContLedger contLedger, long recordVersion) {
        this.contAddAgreementId = contAddAgreementId;
        this.contLedger = contLedger;
        this.recordVersion = recordVersion;
    }
    public ContAddAgreement(String contAddAgreementId, ContLedger contLedger, String addAgreementNo, BigDecimal amountUpdate, String content, String cause, String attaBizId, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion,BigDecimal groupCheckFee,BigDecimal contTempMoney,String resApproveCd,String resApproveId) {
       this.contAddAgreementId = contAddAgreementId;
       this.contLedger = contLedger;
       this.addAgreementNo = addAgreementNo;
       this.amountUpdate = amountUpdate;
       this.content = content;
       this.cause = cause;
       this.attaBizId = attaBizId;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.groupCheckFee = groupCheckFee;
       this.contTempMoney = contTempMoney;
       this.resApproveCd = resApproveCd;
       this.resApproveId = resApproveId;
    }
   
     @Id
     @GeneratedValue(generator = "system-uuid")
     @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="CONT_ADD_AGREEMENT_ID", unique=true, nullable=false, length=50)
    public String getContAddAgreementId() {
        return this.contAddAgreementId;
    }
    
    public void setContAddAgreementId(String contAddAgreementId) {
        this.contAddAgreementId = contAddAgreementId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONT_LEDGER_ID", nullable=false)
    public ContLedger getContLedger() {
        return this.contLedger;
    }
    
    public void setContLedger(ContLedger contLedger) {
        this.contLedger = contLedger;
    }

    
    @Column(name="ADD_AGREEMENT_NO", length=50)
    public String getAddAgreementNo() {
        return this.addAgreementNo;
    }
    
    public void setAddAgreementNo(String addAgreementNo) {
        this.addAgreementNo = addAgreementNo;
    }

    
    @Column(name="AMOUNT_UPDATE", precision=18, scale=2)
    public BigDecimal getAmountUpdate() {
        return this.amountUpdate;
    }
    
    public void setAmountUpdate(BigDecimal amountUpdate) {
        this.amountUpdate = amountUpdate;
    }

    
    @Column(name="CONTENT", length=200)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    
    @Column(name="CAUSE", length=200)
    public String getCause() {
        return this.cause;
    }
    
    public void setCause(String cause) {
        this.cause = cause;
    }

    
    @Column(name="ATTA_BIZ_ID", length=100)
    public String getAttaBizId() {
        return this.attaBizId;
    }
    
    public void setAttaBizId(String attaBizId) {
        this.attaBizId = attaBizId;
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


    @Column(name="GROUP_CHECK_FEE", precision=18, scale=2)
	public BigDecimal getGroupCheckFee() {
		return groupCheckFee;
	}


	public void setGroupCheckFee(BigDecimal groupCheckFee) {
		this.groupCheckFee = groupCheckFee;
	}


	@Column(name="CONT_TEMP_MONEY", precision=18, scale=2)
	public BigDecimal getContTempMoney() {
		return contTempMoney;
	}


	public void setContTempMoney(BigDecimal contTempMoney) {
		this.contTempMoney = contTempMoney;
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


