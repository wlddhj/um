// 
package com.hhz.ump.entity.plan;
// Generated 2011-3-28 16:43:13 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CostCtrlSuppliers generated by hbm2java
 */
@Entity
@Table(name="COST_CTRL_SUPPLIERS"
    ,schema="POWERDESK"
)
public class CostCtrlSuppliers  implements java.io.Serializable {


     private String costctrlsuppliersId;
     private CostCtrlBidPurc costCtrlBidPurc;
     private String supTypeCd;
     private String supplierNo;
     private String supMaterAreaDesc;
     private String handlerName;
     private String supOwnerName;
     private String bidProjectName;
     private String projectRangeDesc;
     private String qualityStandardDesc;
     private String techStandardDesc;
     private String projectPeriodDesc;
     private String priceMethodDesc;
     private String bidSecurityDesc;
     private String payConditionDesc;
     private String drawingProgressDesc;
     private String otherProgressDesc;
     private String materialSerialNoDesc;
     private String materialQuantityDesc;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private long recordVersion;

    public CostCtrlSuppliers() {
    }

	
    public CostCtrlSuppliers(String costctrlsuppliersId, CostCtrlBidPurc costCtrlBidPurc, long recordVersion) {
        this.costctrlsuppliersId = costctrlsuppliersId;
        this.costCtrlBidPurc = costCtrlBidPurc;
        this.recordVersion = recordVersion;
    }
    public CostCtrlSuppliers(String costctrlsuppliersId, CostCtrlBidPurc costCtrlBidPurc, String supTypeCd, String supplierNo, String supMaterAreaDesc, String handlerName, String supOwnerName, String bidProjectName, String projectRangeDesc, String qualityStandardDesc, String techStandardDesc, String projectPeriodDesc, String priceMethodDesc, String bidSecurityDesc, String payConditionDesc, String drawingProgressDesc, String otherProgressDesc, String materialSerialNoDesc, String materialQuantityDesc, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.costctrlsuppliersId = costctrlsuppliersId;
       this.costCtrlBidPurc = costCtrlBidPurc;
       this.supTypeCd = supTypeCd;
       this.supplierNo = supplierNo;
       this.supMaterAreaDesc = supMaterAreaDesc;
       this.handlerName = handlerName;
       this.supOwnerName = supOwnerName;
       this.bidProjectName = bidProjectName;
       this.projectRangeDesc = projectRangeDesc;
       this.qualityStandardDesc = qualityStandardDesc;
       this.techStandardDesc = techStandardDesc;
       this.projectPeriodDesc = projectPeriodDesc;
       this.priceMethodDesc = priceMethodDesc;
       this.bidSecurityDesc = bidSecurityDesc;
       this.payConditionDesc = payConditionDesc;
       this.drawingProgressDesc = drawingProgressDesc;
       this.otherProgressDesc = otherProgressDesc;
       this.materialSerialNoDesc = materialSerialNoDesc;
       this.materialQuantityDesc = materialQuantityDesc;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="COSTCTRLSUPPLIERS_ID", unique=true, nullable=false, length=50)
    public String getCostctrlsuppliersId() {
        return this.costctrlsuppliersId;
    }
    
    public void setCostctrlsuppliersId(String costctrlsuppliersId) {
        this.costctrlsuppliersId = costctrlsuppliersId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_CTRL_BID_PURC_ID", nullable=false)
    public CostCtrlBidPurc getCostCtrlBidPurc() {
        return this.costCtrlBidPurc;
    }
    
    public void setCostCtrlBidPurc(CostCtrlBidPurc costCtrlBidPurc) {
        this.costCtrlBidPurc = costCtrlBidPurc;
    }
    
    @Column(name="SUP_TYPE_CD", length=2)
    public String getSupTypeCd() {
        return this.supTypeCd;
    }
    
    public void setSupTypeCd(String supTypeCd) {
        this.supTypeCd = supTypeCd;
    }
    
    @Column(name="SUPPLIER_NO", length=50)
    public String getSupplierNo() {
        return this.supplierNo;
    }
    
    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }
    
    @Column(name="SUP_MATER_AREA_DESC", length=50)
    public String getSupMaterAreaDesc() {
        return this.supMaterAreaDesc;
    }
    
    public void setSupMaterAreaDesc(String supMaterAreaDesc) {
        this.supMaterAreaDesc = supMaterAreaDesc;
    }
    
    @Column(name="HANDLER_NAME", length=50)
    public String getHandlerName() {
        return this.handlerName;
    }
    
    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
    
    @Column(name="SUP_OWNER_NAME", length=50)
    public String getSupOwnerName() {
        return this.supOwnerName;
    }
    
    public void setSupOwnerName(String supOwnerName) {
        this.supOwnerName = supOwnerName;
    }
    
    @Column(name="BID_PROJECT_NAME", length=100)
    public String getBidProjectName() {
        return this.bidProjectName;
    }
    
    public void setBidProjectName(String bidProjectName) {
        this.bidProjectName = bidProjectName;
    }
    
    @Column(name="PROJECT_RANGE_DESC", length=200)
    public String getProjectRangeDesc() {
        return this.projectRangeDesc;
    }
    
    public void setProjectRangeDesc(String projectRangeDesc) {
        this.projectRangeDesc = projectRangeDesc;
    }
    
    @Column(name="QUALITY_STANDARD_DESC", length=50)
    public String getQualityStandardDesc() {
        return this.qualityStandardDesc;
    }
    
    public void setQualityStandardDesc(String qualityStandardDesc) {
        this.qualityStandardDesc = qualityStandardDesc;
    }
    
    @Column(name="TECH_STANDARD_DESC", length=50)
    public String getTechStandardDesc() {
        return this.techStandardDesc;
    }
    
    public void setTechStandardDesc(String techStandardDesc) {
        this.techStandardDesc = techStandardDesc;
    }
    
    @Column(name="PROJECT_PERIOD_DESC", length=50)
    public String getProjectPeriodDesc() {
        return this.projectPeriodDesc;
    }
    
    public void setProjectPeriodDesc(String projectPeriodDesc) {
        this.projectPeriodDesc = projectPeriodDesc;
    }
    
    @Column(name="PRICE_METHOD_DESC", length=100)
    public String getPriceMethodDesc() {
        return this.priceMethodDesc;
    }
    
    public void setPriceMethodDesc(String priceMethodDesc) {
        this.priceMethodDesc = priceMethodDesc;
    }
    
    @Column(name="BID_SECURITY_DESC", length=50)
    public String getBidSecurityDesc() {
        return this.bidSecurityDesc;
    }
    
    public void setBidSecurityDesc(String bidSecurityDesc) {
        this.bidSecurityDesc = bidSecurityDesc;
    }
    
    @Column(name="PAY_CONDITION_DESC", length=50)
    public String getPayConditionDesc() {
        return this.payConditionDesc;
    }
    
    public void setPayConditionDesc(String payConditionDesc) {
        this.payConditionDesc = payConditionDesc;
    }
    
    @Column(name="DRAWING_PROGRESS_DESC", length=100)
    public String getDrawingProgressDesc() {
        return this.drawingProgressDesc;
    }
    
    public void setDrawingProgressDesc(String drawingProgressDesc) {
        this.drawingProgressDesc = drawingProgressDesc;
    }
    
    @Column(name="OTHER_PROGRESS_DESC", length=100)
    public String getOtherProgressDesc() {
        return this.otherProgressDesc;
    }
    
    public void setOtherProgressDesc(String otherProgressDesc) {
        this.otherProgressDesc = otherProgressDesc;
    }
    
    @Column(name="MATERIAL_SERIAL_NO_DESC", length=50)
    public String getMaterialSerialNoDesc() {
        return this.materialSerialNoDesc;
    }
    
    public void setMaterialSerialNoDesc(String materialSerialNoDesc) {
        this.materialSerialNoDesc = materialSerialNoDesc;
    }
    
    @Column(name="MATERIAL_QUANTITY_DESC", length=50)
    public String getMaterialQuantityDesc() {
        return this.materialQuantityDesc;
    }
    
    public void setMaterialQuantityDesc(String materialQuantityDesc) {
        this.materialQuantityDesc = materialQuantityDesc;
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


