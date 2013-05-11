// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-3 22:32:28 by Hibernate Tools 3.2.2.GA


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
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * BisFlat generated by hbm2java
 */
@Entity
@Table(name="BIS_FLAT"
    ,schema="POWERDESK"
)
public class BisFlat  implements java.io.Serializable {


	 private String bisFlatId;
	 private BisFloor bisFloor;
	 private String flatNo;
	 private BigDecimal square;
	 private BigDecimal innerSquare;
	 private BigDecimal publicSquare;
	 private Date openDate;
	 private String layoutCd;
	 private String houseStruCd;
	 private String statusCd;
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
	 private String bisProjectId;
	 //----start--- // add by liuzhihui 2012-05-28
	 private String houseShopFlag; //住宅底商(0:是，1:否)
	 private String customerName; //客户名称
	 private BigDecimal actualSquare; //实测建筑面积㎡
	 private BigDecimal actualInnerSquare; //实测套内面积㎡
	 private BigDecimal monPromanfeePrice; //月物管费单价(元/月)
	 private BigDecimal annualYsMan; //	以前年度累计应收（物管费）
	 private BigDecimal annualSsMan; //	以前年度累计实收（物管费）
	 private BigDecimal annualYusMan; // 以前年度累计预收（物管费）
	 private BigDecimal annualQsMan;  // 以前年度累计欠收（物管费）
	 private BigDecimal annualYsWater; //	以前年度累计应收（水费）
	 private BigDecimal annualSsWater; //	以前年度累计实收（水费）
	 private BigDecimal annualYusWater; //	以前年度累计预收（水费）
	 private BigDecimal annualQsWater; //	以前年度累计欠收（水费）
	 private BigDecimal annualYsElec; //	以前年度累计应收（电费）
	 private BigDecimal annualSsElec; //	以前年度累计实收（电费）
	 private BigDecimal annualYusElec; //	以前年度累计预收（电费）
	 private BigDecimal annualQsElec; //	以前年度累计欠收（电费）
	 //---end---//
	 
	 private List<BisFlatContRel> bisFlatContRels = new ArrayList<BisFlatContRel>();

    public BisFlat() {
    }

	
    public BisFlat(String bisFlatId, String flatNo, long recordVersion) {
        this.bisFlatId = bisFlatId;
        this.flatNo = flatNo;
        this.recordVersion = recordVersion;
    }
    public BisFlat(String bisFlatId, BisFloor bisFloor, String flatNo, BigDecimal square, BigDecimal innerSquare, BigDecimal publicSquare, Date openDate, String layoutCd, String houseStruCd, String statusCd, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, String bisProjectId, String houseShopFlag, String customerName, BigDecimal actualSquare, BigDecimal actualInnerSquare, BigDecimal monPromanfeePrice, BigDecimal annualYsMan, BigDecimal annualSsMan, BigDecimal annualYusMan, BigDecimal annualQsMan, BigDecimal annualYsWater, BigDecimal annualSsWater, BigDecimal annualYusWater, BigDecimal annualQsWater, BigDecimal annualYsElec, BigDecimal annualSsElec, BigDecimal annualYusElec, BigDecimal annualQsElec, List<BisFlatContRel> bisFlatContRels) {
       this.bisFlatId = bisFlatId;
       this.bisFloor = bisFloor;
       this.flatNo = flatNo;
       this.square = square;
       this.innerSquare = innerSquare;
       this.publicSquare = publicSquare;
       this.openDate = openDate;
       this.layoutCd = layoutCd;
       this.houseStruCd = houseStruCd;
       this.statusCd = statusCd;
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
       this.bisProjectId = bisProjectId;
       this.houseShopFlag = houseShopFlag;
       this.customerName = customerName;
       this.actualSquare = actualSquare;
       this.actualInnerSquare = actualInnerSquare;
       this.monPromanfeePrice = monPromanfeePrice;
       this.annualYsMan = annualYsMan;
       this.annualSsMan = annualSsMan;
       this.annualYusMan = annualYusMan;
       this.annualQsMan = annualQsMan;
       this.annualYsWater = annualYsWater;
       this.annualSsWater = annualSsWater;
       this.annualYusWater = annualYusWater;
       this.annualQsWater = annualQsWater;
       this.annualYsElec = annualYsElec;
       this.annualSsElec = annualSsElec;
       this.annualYusElec = annualYusElec;
       this.annualQsElec = annualQsElec;
       this.bisFlatContRels = bisFlatContRels;
       
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_FLAT_ID", unique=true, nullable=false, length=50)
    public String getBisFlatId() {
        return this.bisFlatId;
    }
    
    public void setBisFlatId(String bisFlatId) {
        this.bisFlatId = bisFlatId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_FLOOR_ID")
    public BisFloor getBisFloor() {
        return this.bisFloor;
    }
    
    public void setBisFloor(BisFloor bisFloor) {
        this.bisFloor = bisFloor;
    }
    
    @Column(name="FLAT_NO", nullable=false, length=100)
    public String getFlatNo() {
        return this.flatNo;
    }
    
    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }
    
    @Column(name="SQUARE", precision=10)
    public BigDecimal getSquare() {
        return this.square;
    }
    
    public void setSquare(BigDecimal square) {
        this.square = square;
    }
    
    @Column(name="INNER_SQUARE", precision=10)
    public BigDecimal getInnerSquare() {
        return this.innerSquare;
    }
    
    public void setInnerSquare(BigDecimal innerSquare) {
        this.innerSquare = innerSquare;
    }
    
    @Column(name="PUBLIC_SQUARE", precision=10)
    public BigDecimal getPublicSquare() {
        return this.publicSquare;
    }
    
    public void setPublicSquare(BigDecimal publicSquare) {
        this.publicSquare = publicSquare;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OPEN_DATE", length=7)
    public Date getOpenDate() {
        return this.openDate;
    }
    
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    
    @Column(name="LAYOUT_CD", length=20)
    public String getLayoutCd() {
        return this.layoutCd;
    }
    
    public void setLayoutCd(String layoutCd) {
        this.layoutCd = layoutCd;
    }
    
    @Column(name="HOUSE_STRU_CD", length=20)
    public String getHouseStruCd() {
        return this.houseStruCd;
    }
    
    public void setHouseStruCd(String houseStruCd) {
        this.houseStruCd = houseStruCd;
    }
    
    @Column(name="STATUS_CD", length=20)
    public String getStatusCd() {
        return this.statusCd;
    }
    
    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
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
    
    @Column(name="BIS_PROJECT_ID", length=50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }
    
    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }
    
    @Column(name="HOUSE_SHOP_FLAG", length=20)
    public String getHouseShopFlag() {
        return this.houseShopFlag;
    }
    
    public void setHouseShopFlag(String houseShopFlag) {
        this.houseShopFlag = houseShopFlag;
    }
    
    @Column(name="CUSTOMER_NAME", length=100)
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Column(name="ACTUAL_SQUARE", precision=10)
    public BigDecimal getActualSquare() {
        return this.actualSquare;
    }
    
    public void setActualSquare(BigDecimal actualSquare) {
        this.actualSquare = actualSquare;
    }
    
    @Column(name="ACTUAL_INNER_SQUARE", precision=10)
    public BigDecimal getActualInnerSquare() {
        return this.actualInnerSquare;
    }
    
    public void setActualInnerSquare(BigDecimal actualInnerSquare) {
        this.actualInnerSquare = actualInnerSquare;
    }
    
    @Column(name="MON_PROMANFEE_PRICE", precision=18)
    public BigDecimal getMonPromanfeePrice() {
        return this.monPromanfeePrice;
    }
    
    public void setMonPromanfeePrice(BigDecimal monPromanfeePrice) {
        this.monPromanfeePrice = monPromanfeePrice;
    }
    
    @Column(name="ANNUAL_YS_MAN", precision=18)
    public BigDecimal getAnnualYsMan() {
        return this.annualYsMan;
    }
    
    public void setAnnualYsMan(BigDecimal annualYsMan) {
        this.annualYsMan = annualYsMan;
    }
    
    @Column(name="ANNUAL_SS_MAN", precision=18)
    public BigDecimal getAnnualSsMan() {
        return this.annualSsMan;
    }
    
    public void setAnnualSsMan(BigDecimal annualSsMan) {
        this.annualSsMan = annualSsMan;
    }
    
    @Column(name="ANNUAL_YUS_MAN", precision=18)
    public BigDecimal getAnnualYusMan() {
        return this.annualYusMan;
    }
    
    public void setAnnualYusMan(BigDecimal annualYusMan) {
        this.annualYusMan = annualYusMan;
    }
    
    @Column(name="ANNUAL_QS_MAN", precision=18)
    public BigDecimal getAnnualQsMan() {
        return this.annualQsMan;
    }
    
    public void setAnnualQsMan(BigDecimal annualQsMan) {
        this.annualQsMan = annualQsMan;
    }
    
    @Column(name="ANNUAL_YS_WATER", precision=18)
    public BigDecimal getAnnualYsWater() {
        return this.annualYsWater;
    }
    
    public void setAnnualYsWater(BigDecimal annualYsWater) {
        this.annualYsWater = annualYsWater;
    }
    
    @Column(name="ANNUAL_SS_WATER", precision=18)
    public BigDecimal getAnnualSsWater() {
        return this.annualSsWater;
    }
    
    public void setAnnualSsWater(BigDecimal annualSsWater) {
        this.annualSsWater = annualSsWater;
    }
    
    @Column(name="ANNUAL_YUS_WATER", precision=18)
    public BigDecimal getAnnualYusWater() {
        return this.annualYusWater;
    }
    
    public void setAnnualYusWater(BigDecimal annualYusWater) {
        this.annualYusWater = annualYusWater;
    }
    
    @Column(name="ANNUAL_QS_WATER", precision=18)
    public BigDecimal getAnnualQsWater() {
        return this.annualQsWater;
    }
    
    public void setAnnualQsWater(BigDecimal annualQsWater) {
        this.annualQsWater = annualQsWater;
    }
    
    @Column(name="ANNUAL_YS_ELEC", precision=18)
    public BigDecimal getAnnualYsElec() {
        return this.annualYsElec;
    }
    
    public void setAnnualYsElec(BigDecimal annualYsElec) {
        this.annualYsElec = annualYsElec;
    }
    
    @Column(name="ANNUAL_SS_ELEC", precision=18)
    public BigDecimal getAnnualSsElec() {
        return this.annualSsElec;
    }
    
    public void setAnnualSsElec(BigDecimal annualSsElec) {
        this.annualSsElec = annualSsElec;
    }
    
    @Column(name="ANNUAL_YUS_ELEC", precision=18)
    public BigDecimal getAnnualYusElec() {
        return this.annualYusElec;
    }
    
    public void setAnnualYusElec(BigDecimal annualYusElec) {
        this.annualYusElec = annualYusElec;
    }
    
    @Column(name="ANNUAL_QS_ELEC", precision=18)
    public BigDecimal getAnnualQsElec() {
        return this.annualQsElec;
    }
    
    public void setAnnualQsElec(BigDecimal annualQsElec) {
        this.annualQsElec = annualQsElec;
    }
    
@OneToMany(fetch=FetchType.LAZY, mappedBy="bisFlat")
    @BatchSize(size=10)
public List<BisFlatContRel> getBisFlatContRels() {
        return this.bisFlatContRels;
    }
    
    public void setBisFlatContRels(List<BisFlatContRel> bisFlatContRels) {
        this.bisFlatContRels = bisFlatContRels;
    }




}


