// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-3 22:32:28 by Hibernate Tools 3.2.2.GA


import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * BisFact generated by hbm2java
 */
@Entity
@Table(name = "BIS_FACT"
        , schema = "POWERDESK"
)
public class BisFact implements java.io.Serializable {


    private String bisFactId;
    private String chargeTypeCd;
    private String factYear;
    private String factMonth;
    private BigDecimal money;
    private Date factDate;
    private String describe;
    private String checkUserCd;
    private Date checkDate;
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
    private String bisShopId;
    private String bisFlatId;
    private String bisMultiId;
    private String bisContId;
    private String bisTenantId;
    private String bisStoreId;
    private String bisProjectId;
    private BigDecimal disposableMoney;
    private BigDecimal deductMoney;
    private String parentId;
    private String attachFlg;
    private Long sequenceNo;
    private String bisFloorId;
    private String typeCd;
    private String floorType;
    private BigDecimal totalFactMoney;
    private BigDecimal totalMustMoney;
    private String bisFactYuSId;
    private List<BisFactStore> bisFactStores = new ArrayList<BisFactStore>();

    public BisFact() {
    }


    public BisFact(String bisFactId, long recordVersion) {
        this.bisFactId = bisFactId;
        this.recordVersion = recordVersion;
    }

    public BisFact(String bisFactId, String chargeTypeCd, String factYear, String factMonth, BigDecimal money, Date factDate, String describe, String checkUserCd, Date checkDate, String statusCd, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, String bisShopId, String bisFlatId, String bisMultiId, String bisContId, String bisTenantId, String bisStoreId, String bisProjectId, BigDecimal disposableMoney, BigDecimal deductMoney, String parentId, List<BisFactStore> bisFactStores) {
        this.bisFactId = bisFactId;
        this.chargeTypeCd = chargeTypeCd;
        this.factYear = factYear;
        this.factMonth = factMonth;
        this.money = money;
        this.factDate = factDate;
        this.describe = describe;
        this.checkUserCd = checkUserCd;
        this.checkDate = checkDate;
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
        this.bisShopId = bisShopId;
        this.bisFlatId = bisFlatId;
        this.bisMultiId = bisMultiId;
        this.bisContId = bisContId;
        this.bisTenantId = bisTenantId;
        this.bisStoreId = bisStoreId;
        this.bisProjectId = bisProjectId;
        this.disposableMoney = disposableMoney;
        this.deductMoney = deductMoney;
        this.parentId = parentId;
        this.bisFactStores = bisFactStores;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")

    @Column(name = "BIS_FACT_ID", unique = true, nullable = false, length = 50)
    public String getBisFactId() {
        return this.bisFactId;
    }

    public void setBisFactId(String bisFactId) {
        this.bisFactId = bisFactId;
    }

    @Column(name = "BIS_FACT_YU_S_ID", length = 50)
    public String getBisFactYuSId() {
        return this.bisFactYuSId;
    }

    public void setBisFactYuSId(String bisFactYuSId) {
        this.bisFactYuSId = bisFactYuSId;
    }

    @Column(name = "CHARGE_TYPE_CD", length = 20)
    public String getChargeTypeCd() {
        return this.chargeTypeCd;
    }

    public void setChargeTypeCd(String chargeTypeCd) {
        this.chargeTypeCd = chargeTypeCd;
    }

    @Column(name = "FACT_YEAR", length = 4)
    public String getFactYear() {
        return this.factYear;
    }

    public void setFactYear(String factYear) {
        this.factYear = factYear;
    }

    @Column(name = "FACT_MONTH", length = 2)
    public String getFactMonth() {
        return this.factMonth;
    }

    public void setFactMonth(String factMonth) {
        this.factMonth = factMonth;
    }

    @Column(name = "MONEY", precision = 10)
    public BigDecimal getMoney() {
        return this.money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FACT_DATE", length = 7)
    public Date getFactDate() {
        return this.factDate;
    }

    public void setFactDate(Date factDate) {
        this.factDate = factDate;
    }

    @Column(name = "DESCRIBE", length = 300)
    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Column(name = "CHECK_USER_CD", length = 20)
    public String getCheckUserCd() {
        return this.checkUserCd;
    }

    public void setCheckUserCd(String checkUserCd) {
        this.checkUserCd = checkUserCd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CHECK_DATE", length = 7)
    public Date getCheckDate() {
        return this.checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    @Column(name = "STATUS_CD", length = 20)
    public String getStatusCd() {
        return this.statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    @Column(name = "REMARK", length = 200)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "CREATOR", length = 20)
    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Column(name = "CREATED_CENTER_CD", length = 20)
    public String getCreatedCenterCd() {
        return this.createdCenterCd;
    }

    public void setCreatedCenterCd(String createdCenterCd) {
        this.createdCenterCd = createdCenterCd;
    }

    @Column(name = "CREATED_DEPT_CD", length = 20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }

    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
    }

    @Column(name = "CREATED_POSITION_CD", length = 20)
    public String getCreatedPositionCd() {
        return this.createdPositionCd;
    }

    public void setCreatedPositionCd(String createdPositionCd) {
        this.createdPositionCd = createdPositionCd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", length = 7)
    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "UPDATOR", length = 20)
    public String getUpdator() {
        return this.updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    @Column(name = "UPDATED_CENTER_CD", length = 20)
    public String getUpdatedCenterCd() {
        return this.updatedCenterCd;
    }

    public void setUpdatedCenterCd(String updatedCenterCd) {
        this.updatedCenterCd = updatedCenterCd;
    }

    @Column(name = "UPDATED_DEPT_CD", length = 20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }

    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
    }

    @Column(name = "UPDATED_POSITION_CD", length = 20)
    public String getUpdatedPositionCd() {
        return this.updatedPositionCd;
    }

    public void setUpdatedPositionCd(String updatedPositionCd) {
        this.updatedPositionCd = updatedPositionCd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE", length = 7)
    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Column(name = "RECORD_VERSION", nullable = false, precision = 10, scale = 0)
    @Version
    public long getRecordVersion() {
        return this.recordVersion;
    }

    public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }

    @Column(name = "BIS_SHOP_ID", length = 50)
    public String getBisShopId() {
        return this.bisShopId;
    }

    public void setBisShopId(String bisShopId) {
        this.bisShopId = bisShopId;
    }

    @Column(name = "BIS_FLAT_ID", length = 50)
    public String getBisFlatId() {
        return this.bisFlatId;
    }

    public void setBisFlatId(String bisFlatId) {
        this.bisFlatId = bisFlatId;
    }

    @Column(name = "BIS_MULTI_ID", length = 50)
    public String getBisMultiId() {
        return this.bisMultiId;
    }

    public void setBisMultiId(String bisMultiId) {
        this.bisMultiId = bisMultiId;
    }

    @Column(name = "BIS_CONT_ID", length = 50)
    public String getBisContId() {
        return this.bisContId;
    }

    public void setBisContId(String bisContId) {
        this.bisContId = bisContId;
    }

    @Column(name = "BIS_TENANT_ID", length = 50)
    public String getBisTenantId() {
        return this.bisTenantId;
    }

    public void setBisTenantId(String bisTenantId) {
        this.bisTenantId = bisTenantId;
    }

    @Column(name = "BIS_STORE_ID", length = 300)
    public String getBisStoreId() {
        return this.bisStoreId;
    }

    public void setBisStoreId(String bisStoreId) {
        this.bisStoreId = bisStoreId;
    }

    @Column(name = "BIS_PROJECT_ID", length = 50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }

    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }

    @Column(name = "DISPOSABLE_MONEY", precision = 10)
    public BigDecimal getDisposableMoney() {
        return this.disposableMoney;
    }

    public void setDisposableMoney(BigDecimal disposableMoney) {
        this.disposableMoney = disposableMoney;
    }

    @Column(name = "DEDUCT_MONEY", precision = 10)
    public BigDecimal getDeductMoney() {
        return this.deductMoney;
    }

    public void setDeductMoney(BigDecimal deductMoney) {
        this.deductMoney = deductMoney;
    }

    @Column(name = "PARENT_ID", length = 50)
    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bisFact")
    @BatchSize(size = 10)
    public List<BisFactStore> getBisFactStores() {
        return this.bisFactStores;
    }

    public void setBisFactStores(List<BisFactStore> bisFactStores) {
        this.bisFactStores = bisFactStores;
    }


    @Column(name = "ATTACH_FLG", length = 1)
    public String getAttachFlg() {
        return this.attachFlg;
    }

    public void setAttachFlg(String attachFlg) {
        this.attachFlg = attachFlg;
    }

    @Column(name = "SEQUENCE_NO", precision = 10, scale = 0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }

    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    @Column(name = "BIS_FLOOR_ID", length = 50)
    public String getBisFloorId() {
        return this.bisFloorId;
    }

    public void setBisFloorId(String bisFloorId) {
        this.bisFloorId = bisFloorId;
    }

    @Column(name = "TYPE_CD", length = 1)
    public String getTypeCd() {
        return this.typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    @Column(name = "FLOOR_TYPE", length = 1)
    public String getFloorType() {
        return this.floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    @Column(name = "TOTAL_FACT_MONEY", precision = 10)
    public BigDecimal getTotalFactMoney() {
        return this.totalFactMoney;
    }

    public void setTotalFactMoney(BigDecimal totalFactMoney) {
        this.totalFactMoney = totalFactMoney;
    }

    @Column(name = "TOTAL_MUST_MONEY", precision = 10)
    public BigDecimal getTotalMustMoney() {
        return totalMustMoney;
    }


    public void setTotalMustMoney(BigDecimal totalMustMoney) {
        this.totalMustMoney = totalMustMoney;
    }


}


