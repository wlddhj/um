// 
package com.hhz.ump.entity.app;
// Generated 2010-8-4 13:27:58 by Hibernate Tools 3.2.4.GA


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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * AppParam generated by hbm2java
 */
@Entity
@Table(name="APP_PARAM"
    
)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AppParam  implements java.io.Serializable {


     private String appParamId;
     private String paramCd;
     private String paramName;
     private String paramValue;
     private BigDecimal dispOrderNo;
     private String defaultFlg;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;

    public AppParam() {
    }

	
    public AppParam(String appParamId, long recordVersion) {
        this.appParamId = appParamId;
        this.recordVersion = recordVersion;
    }
    public AppParam(String appParamId, String paramCd, String paramName, String paramValue, BigDecimal dispOrderNo, String defaultFlg, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion) {
       this.appParamId = appParamId;
       this.paramCd = paramCd;
       this.paramName = paramName;
       this.paramValue = paramValue;
       this.dispOrderNo = dispOrderNo;
       this.defaultFlg = defaultFlg;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="APP_PARAM_ID", unique=true, nullable=false, length=50)
    public String getAppParamId() {
        return this.appParamId;
    }
    
    public void setAppParamId(String appParamId) {
        this.appParamId = appParamId;
    }

    
    @Column(name="PARAM_CD", length=50)
    public String getParamCd() {
        return this.paramCd;
    }
    
    public void setParamCd(String paramCd) {
        this.paramCd = paramCd;
    }

    
    @Column(name="PARAM_NAME", length=50)
    public String getParamName() {
        return this.paramName;
    }
    
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    
    @Column(name="PARAM_VALUE", length=50)
    public String getParamValue() {
        return this.paramValue;
    }
    
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    
    @Column(name="DISP_ORDER_NO", precision=38, scale=0)
    public BigDecimal getDispOrderNo() {
        return this.dispOrderNo;
    }
    
    public void setDispOrderNo(BigDecimal dispOrderNo) {
        this.dispOrderNo = dispOrderNo;
    }

    
    @Column(name="DEFAULT_FLG", length=1)
    public String getDefaultFlg() {
        return this.defaultFlg;
    }
    
    public void setDefaultFlg(String defaultFlg) {
        this.defaultFlg = defaultFlg;
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


