// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-12 15:06:32 by Hibernate Tools 3.2.2.GA


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
 * BisContShopProp generated by hbm2java
 */
@Entity
@Table(name="BIS_CONT_SHOP_PROP"
    
)
public class BisContShopProp  implements java.io.Serializable {


     private String bisContShopPropId;
     private BisCont bisCont;
     private String storeNo;
     private BigDecimal performanceBond;
     private BigDecimal operationBond;
     private BigDecimal integMoneyStandard;
     private BigDecimal manageFee1;
     private BigDecimal manageFee2;
     private BigDecimal manageFee3;
     private BigDecimal manageFee4;
     private BigDecimal manageFee5;
     private BigDecimal manageFee6;
     private BigDecimal manageFee7;
     private BigDecimal manageFee8;
     private BigDecimal manageFee9;
     private BigDecimal manageFee10;
     private Date integMoneyFirstRentDay;
     private String integMoneyFreeRentPeriod;
     private String contDeadline;
     private String paymentModeCd;
     private String paymentTime;
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
     private Boolean inPoolBl;

    public BisContShopProp() {
    }

	
    public BisContShopProp(String bisContShopPropId, BisCont bisCont, String storeNo, long recordVersion) {
        this.bisContShopPropId = bisContShopPropId;
        this.bisCont = bisCont;
        this.storeNo = storeNo;
        this.recordVersion = recordVersion;
    }
    public BisContShopProp(String bisContShopPropId, BisCont bisCont, String storeNo, BigDecimal performanceBond, BigDecimal operationBond, BigDecimal integMoneyStandard, BigDecimal manageFee1, BigDecimal manageFee2, BigDecimal manageFee3, BigDecimal manageFee4, BigDecimal manageFee5, BigDecimal manageFee6, BigDecimal manageFee7, BigDecimal manageFee8, BigDecimal manageFee9, BigDecimal manageFee10, Date integMoneyFirstRentDay, String integMoneyFreeRentPeriod, String contDeadline, String paymentModeCd, String paymentTime, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.bisContShopPropId = bisContShopPropId;
       this.bisCont = bisCont;
       this.storeNo = storeNo;
       this.performanceBond = performanceBond;
       this.operationBond = operationBond;
       this.integMoneyStandard = integMoneyStandard;
       this.manageFee1 = manageFee1;
       this.manageFee2 = manageFee2;
       this.manageFee3 = manageFee3;
       this.manageFee4 = manageFee4;
       this.manageFee5 = manageFee5;
       this.manageFee6 = manageFee6;
       this.manageFee7 = manageFee7;
       this.manageFee8 = manageFee8;
       this.manageFee9 = manageFee9;
       this.manageFee10 = manageFee10;
       this.integMoneyFirstRentDay = integMoneyFirstRentDay;
       this.integMoneyFreeRentPeriod = integMoneyFreeRentPeriod;
       this.contDeadline = contDeadline;
       this.paymentModeCd = paymentModeCd;
       this.paymentTime = paymentTime;
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
    
    @Column(name="BIS_CONT_SHOP_PROP_ID", unique=true, nullable=false, length=50)
    public String getBisContShopPropId() {
        return this.bisContShopPropId;
    }
    
    public void setBisContShopPropId(String bisContShopPropId) {
        this.bisContShopPropId = bisContShopPropId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_CONT_ID", nullable=false)
    public BisCont getBisCont() {
        return this.bisCont;
    }
    
    public void setBisCont(BisCont bisCont) {
        this.bisCont = bisCont;
    }
    
    @Column(name="STORE_NO", nullable=false, length=100)
    public String getStoreNo() {
        return this.storeNo;
    }
    
    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }
    
    @Column(name="PERFORMANCE_BOND", precision=10)
    public BigDecimal getPerformanceBond() {
        return this.performanceBond;
    }
    
    public void setPerformanceBond(BigDecimal performanceBond) {
        this.performanceBond = performanceBond;
    }
    
    @Column(name="OPERATION_BOND", precision=10)
    public BigDecimal getOperationBond() {
        return this.operationBond;
    }
    
    public void setOperationBond(BigDecimal operationBond) {
        this.operationBond = operationBond;
    }
    
    @Column(name="INTEG_MONEY_STANDARD", precision=10)
    public BigDecimal getIntegMoneyStandard() {
        return this.integMoneyStandard;
    }
    
    public void setIntegMoneyStandard(BigDecimal integMoneyStandard) {
        this.integMoneyStandard = integMoneyStandard;
    }
    
    @Column(name="MANAGE_FEE1", precision=10)
    public BigDecimal getManageFee1() {
        return this.manageFee1;
    }
    
    public void setManageFee1(BigDecimal manageFee1) {
        this.manageFee1 = manageFee1;
    }
    
    @Column(name="MANAGE_FEE2", precision=10)
    public BigDecimal getManageFee2() {
        return this.manageFee2;
    }
    
    public void setManageFee2(BigDecimal manageFee2) {
        this.manageFee2 = manageFee2;
    }
    
    @Column(name="MANAGE_FEE3", precision=10)
    public BigDecimal getManageFee3() {
        return this.manageFee3;
    }
    
    public void setManageFee3(BigDecimal manageFee3) {
        this.manageFee3 = manageFee3;
    }
    
    @Column(name="MANAGE_FEE4", precision=10)
    public BigDecimal getManageFee4() {
        return this.manageFee4;
    }
    
    public void setManageFee4(BigDecimal manageFee4) {
        this.manageFee4 = manageFee4;
    }
    
    @Column(name="MANAGE_FEE5", precision=10)
    public BigDecimal getManageFee5() {
        return this.manageFee5;
    }
    
    public void setManageFee5(BigDecimal manageFee5) {
        this.manageFee5 = manageFee5;
    }
    
    @Column(name="MANAGE_FEE6", precision=10)
    public BigDecimal getManageFee6() {
        return this.manageFee6;
    }
    
    public void setManageFee6(BigDecimal manageFee6) {
        this.manageFee6 = manageFee6;
    }
    
    @Column(name="MANAGE_FEE7", precision=10)
    public BigDecimal getManageFee7() {
        return this.manageFee7;
    }
    
    public void setManageFee7(BigDecimal manageFee7) {
        this.manageFee7 = manageFee7;
    }
    
    @Column(name="MANAGE_FEE8", precision=10)
    public BigDecimal getManageFee8() {
        return this.manageFee8;
    }
    
    public void setManageFee8(BigDecimal manageFee8) {
        this.manageFee8 = manageFee8;
    }
    
    @Column(name="MANAGE_FEE9", precision=10)
    public BigDecimal getManageFee9() {
        return this.manageFee9;
    }
    
    public void setManageFee9(BigDecimal manageFee9) {
        this.manageFee9 = manageFee9;
    }
    
    @Column(name="MANAGE_FEE10", precision=10)
    public BigDecimal getManageFee10() {
        return this.manageFee10;
    }
    
    public void setManageFee10(BigDecimal manageFee10) {
        this.manageFee10 = manageFee10;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="INTEG_MONEY_FIRST_RENT_DAY", length=7)
    public Date getIntegMoneyFirstRentDay() {
        return this.integMoneyFirstRentDay;
    }
    
    public void setIntegMoneyFirstRentDay(Date integMoneyFirstRentDay) {
        this.integMoneyFirstRentDay = integMoneyFirstRentDay;
    }
    
    @Column(name="INTEG_MONEY_FREE_RENT_PERIOD", length=100)
    public String getIntegMoneyFreeRentPeriod() {
        return this.integMoneyFreeRentPeriod;
    }
    
    public void setIntegMoneyFreeRentPeriod(String integMoneyFreeRentPeriod) {
        this.integMoneyFreeRentPeriod = integMoneyFreeRentPeriod;
    }
    
    @Column(name="CONT_DEADLINE", length=100)
    public String getContDeadline() {
        return this.contDeadline;
    }
    
    public void setContDeadline(String contDeadline) {
        this.contDeadline = contDeadline;
    }
    
    @Column(name="PAYMENT_MODE_CD", length=20)
    public String getPaymentModeCd() {
        return this.paymentModeCd;
    }
    
    public void setPaymentModeCd(String paymentModeCd) {
        this.paymentModeCd = paymentModeCd;
    }
    
    @Column(name="PAYMENT_TIME", length=100)
    public String getPaymentTime() {
        return this.paymentTime;
    }
    
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
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

    @Column(name="IN_POOL_BL", precision=1, scale=0)
    public Boolean getInPoolBl() {
        return this.inPoolBl;
    }
    
    public void setInPoolBl(Boolean inPoolBl) {
        this.inPoolBl = inPoolBl;
    }



}


