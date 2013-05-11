// 
package com.hhz.ump.entity.prod;
// Generated 2011-11-10 13:11:29 by Hibernate Tools 3.2.2.GA


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
 * ProdVersionDetail generated by hbm2java
 */
@Entity
@Table(name="PROD_VERSION_DETAIL"
    ,schema="POWERDESK"
)
public class ProdVersionDetail  implements java.io.Serializable {


     private String prodVersionDetailId;
     private ProdBasicVersion prodBasicVersion;
     private String bussinessCd;
     private String materialZoneCd;
     private BigDecimal permeterQuantity;
     private BigDecimal price;
     private BigDecimal estimatePrice;
     private String active;
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
     private String areaCd;

    public ProdVersionDetail() {
    }

	
    public ProdVersionDetail(String prodVersionDetailId, String bussinessCd, String materialZoneCd, long recordVersion) {
        this.prodVersionDetailId = prodVersionDetailId;
        this.bussinessCd = bussinessCd;
        this.materialZoneCd = materialZoneCd;
        this.recordVersion = recordVersion;
    }
    public ProdVersionDetail(String prodVersionDetailId, ProdBasicVersion prodBasicVersion, String bussinessCd, String materialZoneCd, BigDecimal permeterQuantity, BigDecimal price, BigDecimal estimatePrice, String active, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion,String areaCd) {
       this.prodVersionDetailId = prodVersionDetailId;
       this.prodBasicVersion = prodBasicVersion;
       this.bussinessCd = bussinessCd;
       this.materialZoneCd = materialZoneCd;
       this.permeterQuantity = permeterQuantity;
       this.price = price;
       this.estimatePrice = estimatePrice;
       this.active = active;
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
       this.areaCd=areaCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PROD_VERSION_DETAIL_ID", unique=true, nullable=false, length=50)
    public String getProdVersionDetailId() {
        return this.prodVersionDetailId;
    }
    
    public void setProdVersionDetailId(String prodVersionDetailId) {
        this.prodVersionDetailId = prodVersionDetailId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROD_BASIC_VERSION_ID")
    public ProdBasicVersion getProdBasicVersion() {
        return this.prodBasicVersion;
    }
    
    public void setProdBasicVersion(ProdBasicVersion prodBasicVersion) {
        this.prodBasicVersion = prodBasicVersion;
    }
    
    @Column(name="BUSSINESS_CD", nullable=false, length=30)
    public String getBussinessCd() {
        return this.bussinessCd;
    }
    
    public void setBussinessCd(String bussinessCd) {
        this.bussinessCd = bussinessCd;
    }
    
    @Column(name="MATERIAL_ZONE_CD", nullable=false, length=30)
    public String getMaterialZoneCd() {
        return this.materialZoneCd;
    }
    
    public void setMaterialZoneCd(String materialZoneCd) {
        this.materialZoneCd = materialZoneCd;
    }
    
    
    @Column(name="AREA_CD", length=30)
    public String getAreaCd() {
		return areaCd;
	}


	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}


	@Column(name="PERMETER_QUANTITY", precision=10)
    public BigDecimal getPermeterQuantity() {
        return this.permeterQuantity;
    }
    
    public void setPermeterQuantity(BigDecimal permeterQuantity) {
        this.permeterQuantity = permeterQuantity;
    }
    
    @Column(name="PRICE", precision=10)
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    @Column(name="ESTIMATE_PRICE", precision=10)
    public BigDecimal getEstimatePrice() {
        return this.estimatePrice;
    }
    
    public void setEstimatePrice(BigDecimal estimatePrice) {
        this.estimatePrice = estimatePrice;
    }
    
    @Column(name="ACTIVE", length=2)
    public String getActive() {
        return this.active;
    }
    
    public void setActive(String active) {
        this.active = active;
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


