// 
package com.hhz.ump.entity.ctdb;
// Generated 2011-12-19 15:49:26 by Hibernate Tools 3.2.2.GA


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
 * CtdbBillingApp generated by hbm2java
 */
@Entity
@Table(name="CTDB_BILLING_APP"
    ,schema="POWERDESK"
)
public class CtdbBillingApp  implements java.io.Serializable {


     private String billingAppId;
     private String projectName;
     private String projectCd;
     private String ctName;
     private String ctNameCd;
     private String impSupName;
     private String impSupCd;
     private String ctArea;
     private String ctProperty;
     private BigDecimal area;
     private BigDecimal billingPrice;
     private BigDecimal unitPrice;
     private Date billingDate;
     private String billingResCd;
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
     private String importType;
     private String approveCd;
     private String authTypeCd;

    public CtdbBillingApp() {
    }

	
    public CtdbBillingApp(String billingAppId, long recordVersion) {
        this.billingAppId = billingAppId;
        this.recordVersion = recordVersion;
    }
    public CtdbBillingApp(String billingAppId, String projectName, String projectCd, String ctName, String ctNameCd, String impSupName, String impSupCd, String ctArea, String ctProperty, BigDecimal area, BigDecimal billingPrice, BigDecimal unitPrice, Date billingDate, String billingResCd, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion,String importType,String approveCd,String authTypeCd) {
       this.billingAppId = billingAppId;
       this.projectName = projectName;
       this.projectCd = projectCd;
       this.ctName = ctName;
       this.ctNameCd = ctNameCd;
       this.impSupName = impSupName;
       this.impSupCd = impSupCd;
       this.ctArea = ctArea;
       this.ctProperty = ctProperty;
       this.area = area;
       this.billingPrice = billingPrice;
       this.unitPrice = unitPrice;
       this.billingDate = billingDate;
       this.billingResCd = billingResCd;
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
       this.importType=importType;
       this.approveCd=approveCd;
       this.authTypeCd=authTypeCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BILLING_APP_ID", unique=true, nullable=false, length=50)
    public String getBillingAppId() {
        return this.billingAppId;
    }
    
    public void setBillingAppId(String billingAppId) {
        this.billingAppId = billingAppId;
    }
    
    @Column(name="PROJECT_NAME", length=100)
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    @Column(name="PROJECT_CD", length=100)
    public String getProjectCd() {
        return this.projectCd;
    }
    
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }
    
    @Column(name="CT_NAME", length=100)
    public String getCtName() {
        return this.ctName;
    }
    
    public void setCtName(String ctName) {
        this.ctName = ctName;
    }
    
    @Column(name="CT_NAME_CD", length=100)
    public String getCtNameCd() {
        return this.ctNameCd;
    }
    
    public void setCtNameCd(String ctNameCd) {
        this.ctNameCd = ctNameCd;
    }
    
    @Column(name="IMP_SUP_NAME", length=100)
    public String getImpSupName() {
        return this.impSupName;
    }
    
    public void setImpSupName(String impSupName) {
        this.impSupName = impSupName;
    }
    
    @Column(name="IMP_SUP_CD", length=100)
    public String getImpSupCd() {
        return this.impSupCd;
    }
    
    public void setImpSupCd(String impSupCd) {
        this.impSupCd = impSupCd;
    }
    
    @Column(name="CT_AREA", length=500)
    public String getCtArea() {
        return this.ctArea;
    }
    
    public void setCtArea(String ctArea) {
        this.ctArea = ctArea;
    }
    
    @Column(name="CT_PROPERTY", length=20)
    public String getCtProperty() {
        return this.ctProperty;
    }
    
    public void setCtProperty(String ctProperty) {
        this.ctProperty = ctProperty;
    }
    
    @Column(name="AREA", precision=18, scale=6)
    public BigDecimal getArea() {
        return this.area;
    }
    
    public void setArea(BigDecimal area) {
        this.area = area;
    }
    
    @Column(name="BILLING_PRICE", precision=18, scale=6)
    public BigDecimal getBillingPrice() {
        return this.billingPrice;
    }
    
    public void setBillingPrice(BigDecimal billingPrice) {
        this.billingPrice = billingPrice;
    }
    
    @Column(name="UNIT_PRICE", precision=18, scale=6)
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BILLING_DATE", length=7)
    public Date getBillingDate() {
        return this.billingDate;
    }
    
    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }
    
    @Column(name="BILLING_RES_CD", length=50)
    public String getBillingResCd() {
        return this.billingResCd;
    }
    
    public void setBillingResCd(String billingResCd) {
        this.billingResCd = billingResCd;
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

    @Column(name="IMPORT_TYPE", length=50)
	public String getImportType() {
		return importType;
	}


	public void setImportType(String importType) {
		this.importType = importType;
	}
	@Column(name="APPROVE_CD", length=50)
	public String getApproveCd() {
		return approveCd;
	}


	public void setApproveCd(String approveCd) {
		this.approveCd = approveCd;
	}
	@Column(name="AUTH_TYPE_CD", length=50)
	public String getAuthTypeCd() {
		return authTypeCd;
	}


	public void setAuthTypeCd(String authTypeCd) {
		this.authTypeCd = authTypeCd;
	}

}

