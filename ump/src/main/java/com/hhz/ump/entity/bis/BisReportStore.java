// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-24 19:13:28 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BisReportStore generated by hbm2java
 */
@Entity
@Table(name="BIS_REPORT_STORE"
    
)
public class BisReportStore  implements java.io.Serializable {


     private String bisReportStoreId;
     private String bisProjectId;
     private String bisTenantId;
     private Date reportMonth;
     private Date statDate;
     private String bisShopName;
     private String bisStoreNos;
     private BigDecimal square;
     private String chargeTypeCd;
     private String yearCompare;
     private String monthCompare;
     private BigDecimal yearDebtThis;
     private BigDecimal yearDebtBefore;
     private BigDecimal monthDebt;
     private String remark;

    public BisReportStore() {
    }

	
    public BisReportStore(String bisReportStoreId, String bisProjectId, String bisTenantId) {
        this.bisReportStoreId = bisReportStoreId;
        this.bisProjectId = bisProjectId;
        this.bisTenantId = bisTenantId;
    }
    public BisReportStore(String bisReportStoreId, String bisProjectId, String bisTenantId, Date reportMonth, Date statDate, String bisShopName, String bisStoreNos, BigDecimal square, String chargeTypeCd, String yearCompare, String monthCompare, BigDecimal yearDebtThis, BigDecimal yearDebtBefore, BigDecimal monthDebt, String remark) {
       this.bisReportStoreId = bisReportStoreId;
       this.bisProjectId = bisProjectId;
       this.bisTenantId = bisTenantId;
       this.reportMonth = reportMonth;
       this.statDate = statDate;
       this.bisShopName = bisShopName;
       this.bisStoreNos = bisStoreNos;
       this.square = square;
       this.chargeTypeCd = chargeTypeCd;
       this.yearCompare = yearCompare;
       this.monthCompare = monthCompare;
       this.yearDebtThis = yearDebtThis;
       this.yearDebtBefore = yearDebtBefore;
       this.monthDebt = monthDebt;
       this.remark = remark;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_REPORT_STORE_ID", unique=true, nullable=false, length=50)
    public String getBisReportStoreId() {
        return this.bisReportStoreId;
    }
    
    public void setBisReportStoreId(String bisReportStoreId) {
        this.bisReportStoreId = bisReportStoreId;
    }
    
    @Column(name="BIS_PROJECT_ID", nullable=false, length=50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }
    
    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }
    
    @Column(name="BIS_TENANT_ID", nullable=false, length=50)
    public String getBisTenantId() {
        return this.bisTenantId;
    }
    
    public void setBisTenantId(String bisTenantId) {
        this.bisTenantId = bisTenantId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REPORT_MONTH", length=7)
    public Date getReportMonth() {
        return this.reportMonth;
    }
    
    public void setReportMonth(Date reportMonth) {
        this.reportMonth = reportMonth;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="STAT_DATE", length=7)
    public Date getStatDate() {
        return this.statDate;
    }
    
    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }
    
    @Column(name="BIS_SHOP_NAME", length=200)
    public String getBisShopName() {
        return this.bisShopName;
    }
    
    public void setBisShopName(String bisShopName) {
        this.bisShopName = bisShopName;
    }
    
    @Column(name="BIS_STORE_NOS", length=500)
    public String getBisStoreNos() {
        return this.bisStoreNos;
    }
    
    public void setBisStoreNos(String bisStoreNos) {
        this.bisStoreNos = bisStoreNos;
    }
    
    @Column(name="SQUARE", precision=10)
    public BigDecimal getSquare() {
        return this.square;
    }
    
    public void setSquare(BigDecimal square) {
        this.square = square;
    }
    
    @Column(name="CHARGE_TYPE_CD", length=1)
    public String getChargeTypeCd() {
        return this.chargeTypeCd;
    }
    
    public void setChargeTypeCd(String chargeTypeCd) {
        this.chargeTypeCd = chargeTypeCd;
    }
    
    @Column(name="YEAR_COMPARE", length=50)
    public String getYearCompare() {
        return this.yearCompare;
    }
    
    public void setYearCompare(String yearCompare) {
        this.yearCompare = yearCompare;
    }
    
    @Column(name="MONTH_COMPARE", length=50)
    public String getMonthCompare() {
        return this.monthCompare;
    }
    
    public void setMonthCompare(String monthCompare) {
        this.monthCompare = monthCompare;
    }
    
    @Column(name="YEAR_DEBT_THIS", precision=10)
    public BigDecimal getYearDebtThis() {
        return this.yearDebtThis;
    }
    
    public void setYearDebtThis(BigDecimal yearDebtThis) {
        this.yearDebtThis = yearDebtThis;
    }
    
    @Column(name="YEAR_DEBT_BEFORE", precision=10)
    public BigDecimal getYearDebtBefore() {
        return this.yearDebtBefore;
    }
    
    public void setYearDebtBefore(BigDecimal yearDebtBefore) {
        this.yearDebtBefore = yearDebtBefore;
    }
    
    @Column(name="MONTH_DEBT", precision=10)
    public BigDecimal getMonthDebt() {
        return this.monthDebt;
    }
    
    public void setMonthDebt(BigDecimal monthDebt) {
        this.monthDebt = monthDebt;
    }
    
    @Column(name="REMARK", length=200)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }




}

