// 
package com.hhz.uums.entity.plas;
// Generated 2012-2-1 13:27:05 by Hibernate Tools 3.2.2.GA


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
 * PlasSysPosition generated by hbm2java
 */
@Entity
@Table(name="PLAS_SYS_POSITION"
    
)
public class PlasSysPosition  implements java.io.Serializable {


     private String plasSysPositionId;
     private PlasAcct plasAcct;
     private PlasOrg plasOrg;
     private String sysPosCd;
     private String sysPosName;
     private Boolean activeBl;
     private BigDecimal sequenceNo;
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
     private String createdDeptCd;
     private String updatedDeptCd;
     private String shortName;
     private Boolean tmpPosFlg;
     private Date endDate;
     private Boolean beyondFlg;
     private Boolean outStatFlg;
     private Boolean visableFlg;
     private List<PlasSysPosRoleRel> plasSysPosRoleRels = new ArrayList<PlasSysPosRoleRel>();
     private List<PlasOrgMgrRel> plasOrgMgrRels = new ArrayList<PlasOrgMgrRel>();
     private List<PlasRolePackPosRel> plasRolePackPosRels = new ArrayList<PlasRolePackPosRel>();

    public PlasSysPosition() {
    }

	
    public PlasSysPosition(String plasSysPositionId, PlasOrg plasOrg, String sysPosName, long recordVersion) {
        this.plasSysPositionId = plasSysPositionId;
        this.plasOrg = plasOrg;
        this.sysPosName = sysPosName;
        this.recordVersion = recordVersion;
    }
    public PlasSysPosition(String plasSysPositionId, PlasAcct plasAcct, PlasOrg plasOrg, String sysPosCd, String sysPosName, Boolean activeBl, BigDecimal sequenceNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, String createdDeptCd, String updatedDeptCd, String shortName, Boolean tmpPosFlg, Date endDate, Boolean beyondFlg, Boolean outStatFlg, Boolean visableFlg, List<PlasSysPosRoleRel> plasSysPosRoleRels, List<PlasOrgMgrRel> plasOrgMgrRels, List<PlasRolePackPosRel> plasRolePackPosRels) {
       this.plasSysPositionId = plasSysPositionId;
       this.plasAcct = plasAcct;
       this.plasOrg = plasOrg;
       this.sysPosCd = sysPosCd;
       this.sysPosName = sysPosName;
       this.activeBl = activeBl;
       this.sequenceNo = sequenceNo;
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
       this.createdDeptCd = createdDeptCd;
       this.updatedDeptCd = updatedDeptCd;
       this.shortName = shortName;
       this.tmpPosFlg = tmpPosFlg;
       this.endDate = endDate;
       this.beyondFlg = beyondFlg;
       this.outStatFlg = outStatFlg;
       this.visableFlg = visableFlg;
       this.plasSysPosRoleRels = plasSysPosRoleRels;
       this.plasOrgMgrRels = plasOrgMgrRels;
       this.plasRolePackPosRels = plasRolePackPosRels;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_SYS_POSITION_ID", unique=true, nullable=false, length=50)
    public String getPlasSysPositionId() {
        return this.plasSysPositionId;
    }
    
    public void setPlasSysPositionId(String plasSysPositionId) {
        this.plasSysPositionId = plasSysPositionId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PLAS_ACCT_ID")
    public PlasAcct getPlasAcct() {
        return this.plasAcct;
    }
    
    public void setPlasAcct(PlasAcct plasAcct) {
        this.plasAcct = plasAcct;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PLAS_ORG_ID", nullable=false)
    public PlasOrg getPlasOrg() {
        return this.plasOrg;
    }
    
    public void setPlasOrg(PlasOrg plasOrg) {
        this.plasOrg = plasOrg;
    }
    
    @Column(name="SYS_POS_CD", length=50)
    public String getSysPosCd() {
        return this.sysPosCd;
    }
    
    public void setSysPosCd(String sysPosCd) {
        this.sysPosCd = sysPosCd;
    }
    
    @Column(name="SYS_POS_NAME", nullable=false, length=50)
    public String getSysPosName() {
        return this.sysPosName;
    }
    
    public void setSysPosName(String sysPosName) {
        this.sysPosName = sysPosName;
    }
    
    @Column(name="ACTIVE_BL", precision=1, scale=0)
    public Boolean getActiveBl() {
        return this.activeBl;
    }
    
    public void setActiveBl(Boolean activeBl) {
        this.activeBl = activeBl;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public BigDecimal getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
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
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
    }
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
    }
    
    @Column(name="SHORT_NAME", length=50)
    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    @Column(name="TMP_POS_FLG", precision=1, scale=0)
    public Boolean getTmpPosFlg() {
        return this.tmpPosFlg;
    }
    
    public void setTmpPosFlg(Boolean tmpPosFlg) {
        this.tmpPosFlg = tmpPosFlg;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_DATE", length=7)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    @Column(name="BEYOND_FLG", precision=1, scale=0)
    public Boolean getBeyondFlg() {
        return this.beyondFlg;
    }
    
    public void setBeyondFlg(Boolean beyondFlg) {
        this.beyondFlg = beyondFlg;
    }
    
    @Column(name="OUT_STAT_FLG", precision=1, scale=0)
    public Boolean getOutStatFlg() {
        return this.outStatFlg;
    }
    
    public void setOutStatFlg(Boolean outStatFlg) {
        this.outStatFlg = outStatFlg;
    }
    
    @Column(name="VISABLE_FLG", precision=1, scale=0)
    public Boolean getVisableFlg() {
        return this.visableFlg;
    }
    
    public void setVisableFlg(Boolean visableFlg) {
        this.visableFlg = visableFlg;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasSysPosition")
    @BatchSize(size=10)
public List<PlasSysPosRoleRel> getPlasSysPosRoleRels() {
        return this.plasSysPosRoleRels;
    }
    
    public void setPlasSysPosRoleRels(List<PlasSysPosRoleRel> plasSysPosRoleRels) {
        this.plasSysPosRoleRels = plasSysPosRoleRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasSysPosition")
    @BatchSize(size=10)
public List<PlasOrgMgrRel> getPlasOrgMgrRels() {
        return this.plasOrgMgrRels;
    }
    
    public void setPlasOrgMgrRels(List<PlasOrgMgrRel> plasOrgMgrRels) {
        this.plasOrgMgrRels = plasOrgMgrRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasSysPosition")
    @BatchSize(size=10)
public List<PlasRolePackPosRel> getPlasRolePackPosRels() {
        return this.plasRolePackPosRels;
    }
    
    public void setPlasRolePackPosRels(List<PlasRolePackPosRel> plasRolePackPosRels) {
        this.plasRolePackPosRels = plasRolePackPosRels;
    }




}

