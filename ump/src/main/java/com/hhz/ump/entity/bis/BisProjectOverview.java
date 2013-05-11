// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-25 19:43:56 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * BisProjectOverview generated by hbm2java
 */
@Entity
@Table(name="BIS_PROJECT_OVERVIEW"
    
)
public class BisProjectOverview  implements java.io.Serializable {


     private String bisProjectOverviewId;
     private String bisProjectId;
     private String dataType;
     private String bisFloorId;
     private BigDecimal square;
     private BigDecimal propLeave;
     private BigDecimal propSell;
     private BigDecimal propUnitPrice;
     private BigDecimal rentRate;
     private BigDecimal rentUnitPrice;
     private BigDecimal backRate;
     private BigDecimal backUnitPrice;
     private BigDecimal backPayBalance;
     private BigDecimal rentCollectRate;
     private BigDecimal energyCollectRate;
     private BigDecimal propCollectRate;
     private String projectLayout;
     private Integer storeCount;
     private Date reportMonth;
     private Date statDate;
     private String remark;
     private String floorUrl;
     private String buildingNum;
     private String floorNum;
     private Long sequenceNo;

    public BisProjectOverview() {
    }

	
    public BisProjectOverview(String bisProjectOverviewId, String bisProjectId) {
        this.bisProjectOverviewId = bisProjectOverviewId;
        this.bisProjectId = bisProjectId;
    }
    public BisProjectOverview(String bisProjectOverviewId, String bisProjectId, String dataType, String bisFloorId, BigDecimal square, BigDecimal propLeave, BigDecimal propSell, BigDecimal propUnitPrice, BigDecimal rentRate, BigDecimal rentUnitPrice, BigDecimal backRate, BigDecimal backUnitPrice, BigDecimal backPayBalance, BigDecimal rentCollectRate, BigDecimal energyCollectRate, BigDecimal propCollectRate, String projectLayout, Integer storeCount, Date statDate, String remark, String floorUrl, String buildingNum, String floorNum) {
       this.bisProjectOverviewId = bisProjectOverviewId;
       this.bisProjectId = bisProjectId;
       this.dataType = dataType;
       this.bisFloorId = bisFloorId;
       this.square = square;
       this.propLeave = propLeave;
       this.propSell = propSell;
       this.propUnitPrice = propUnitPrice;
       this.rentRate = rentRate;
       this.rentUnitPrice = rentUnitPrice;
       this.backRate = backRate;
       this.backUnitPrice = backUnitPrice;
       this.backPayBalance = backPayBalance;
       this.rentCollectRate = rentCollectRate;
       this.energyCollectRate = energyCollectRate;
       this.propCollectRate = propCollectRate;
       this.projectLayout = projectLayout;
       this.storeCount = storeCount;
       this.statDate = statDate;
       this.remark = remark;
       this.floorUrl = floorUrl;
       this.buildingNum = buildingNum;
       this.floorNum = floorNum;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_PROJECT_OVERVIEW_ID", unique=true, nullable=false, length=50)
    public String getBisProjectOverviewId() {
        return this.bisProjectOverviewId;
    }
    
    public void setBisProjectOverviewId(String bisProjectOverviewId) {
        this.bisProjectOverviewId = bisProjectOverviewId;
    }
    
    @Column(name="BIS_PROJECT_ID", nullable=false, length=50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }
    
    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }
    
    @Column(name="DATA_TYPE", length=1)
    public String getDataType() {
        return this.dataType;
    }
    
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    @Column(name="BIS_FLOOR_ID", length=50)
    public String getBisFloorId() {
        return this.bisFloorId;
    }
    
    public void setBisFloorId(String bisFloorId) {
        this.bisFloorId = bisFloorId;
    }
    
    @Column(name="SQUARE", precision=10)
    public BigDecimal getSquare() {
        return this.square;
    }
    
    public void setSquare(BigDecimal square) {
        this.square = square;
    }
    
    @Column(name="PROP_LEAVE", precision=10)
    public BigDecimal getPropLeave() {
        return this.propLeave;
    }
    
    public void setPropLeave(BigDecimal propLeave) {
        this.propLeave = propLeave;
    }
    
    @Column(name="PROP_SELL", precision=10)
    public BigDecimal getPropSell() {
        return this.propSell;
    }
    
    public void setPropSell(BigDecimal propSell) {
        this.propSell = propSell;
    }
    
    @Column(name="PROP_UNIT_PRICE", precision=10)
    public BigDecimal getPropUnitPrice() {
        return this.propUnitPrice;
    }
    
    public void setPropUnitPrice(BigDecimal propUnitPrice) {
        this.propUnitPrice = propUnitPrice;
    }
    
    @Column(name="RENT_RATE", precision=10)
    public BigDecimal getRentRate() {
        return this.rentRate;
    }
    
    public void setRentRate(BigDecimal rentRate) {
        this.rentRate = rentRate;
    }
    
    @Column(name="RENT_UNIT_PRICE", precision=10)
    public BigDecimal getRentUnitPrice() {
        return this.rentUnitPrice;
    }
    
    public void setRentUnitPrice(BigDecimal rentUnitPrice) {
        this.rentUnitPrice = rentUnitPrice;
    }
    
    @Column(name="BACK_RATE", precision=10)
    public BigDecimal getBackRate() {
        return this.backRate;
    }
    
    public void setBackRate(BigDecimal backRate) {
        this.backRate = backRate;
    }
    
    @Column(name="BACK_UNIT_PRICE", precision=10)
    public BigDecimal getBackUnitPrice() {
        return this.backUnitPrice;
    }
    
    public void setBackUnitPrice(BigDecimal backUnitPrice) {
        this.backUnitPrice = backUnitPrice;
    }
    
    @Column(name="BACK_PAY_BALANCE", precision=10)
    public BigDecimal getBackPayBalance() {
        return this.backPayBalance;
    }
    
    public void setBackPayBalance(BigDecimal backPayBalance) {
        this.backPayBalance = backPayBalance;
    }
    
    @Column(name="RENT_COLLECT_RATE", precision=10)
    public BigDecimal getRentCollectRate() {
        return this.rentCollectRate;
    }
    
    public void setRentCollectRate(BigDecimal rentCollectRate) {
        this.rentCollectRate = rentCollectRate;
    }
    
    @Column(name="ENERGY_COLLECT_RATE", precision=10)
    public BigDecimal getEnergyCollectRate() {
        return this.energyCollectRate;
    }
    
    public void setEnergyCollectRate(BigDecimal energyCollectRate) {
        this.energyCollectRate = energyCollectRate;
    }
    
    @Column(name="PROP_COLLECT_RATE", precision=10)
    public BigDecimal getPropCollectRate() {
        return this.propCollectRate;
    }
    
    public void setPropCollectRate(BigDecimal propCollectRate) {
        this.propCollectRate = propCollectRate;
    }
    
    @Column(name="PROJECT_LAYOUT", length=200)
    public String getProjectLayout() {
        return this.projectLayout;
    }
    
    public void setProjectLayout(String projectLayout) {
        this.projectLayout = projectLayout;
    }
    
    @Column(name="STORE_COUNT", precision=8, scale=0)
    public Integer getStoreCount() {
        return this.storeCount;
    }
    
    public void setStoreCount(Integer storeCount) {
        this.storeCount = storeCount;
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
    
    @Column(name="REMARK", length=200)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="FLOOR_URL", length=100)
    public String getFloorUrl() {
        return this.floorUrl;
    }
    
    public void setFloorUrl(String floorUrl) {
        this.floorUrl = floorUrl;
    }
    
    @Column(name="BUILDING_NUM", length=100)
    public String getBuildingNum() {
        return this.buildingNum;
    }
    
    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }
    
    @Column(name="FLOOR_NUM", precision=20)
    public String getFloorNum() {
        return this.floorNum;
    }
    
    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


}


