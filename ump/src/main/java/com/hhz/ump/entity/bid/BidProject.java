// 
package com.hhz.ump.entity.bid;
// Generated 2012-6-27 11:01:25 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BidProject generated by hbm2java
 */
@Entity
@Table(name="BID_PROJECT"
    
)
public class BidProject  implements java.io.Serializable {


     private String bidProjectId;
     private BidLedger bidLedger;
     private String projectName;
     private String projectDesc;
     private String attachFlg;
     private Long dispOrderNo;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private String deleteFlg;
     private long recordVersion;
     private List<BidMeasureSupRel2> bidMeasureSupRel2s = new ArrayList<BidMeasureSupRel2>();
     private List<BidOtherItemRel> bidOtherItemRels = new ArrayList<BidOtherItemRel>();
     private List<BidMeasureSupRel> bidMeasureSupRels = new ArrayList<BidMeasureSupRel>();
     private List<BidSporadicSupRel> bidSporadicSupRels = new ArrayList<BidSporadicSupRel>();
     private List<BidDivisitonCust> bidDivisitonCusts = new ArrayList<BidDivisitonCust>();
     private List<BidFeesSupRel> bidFeesSupRels = new ArrayList<BidFeesSupRel>();
     private List<BidDivisionSupRel> bidDivisionSupRels = new ArrayList<BidDivisionSupRel>();
     private List<BidTaxsSupRel> bidTaxsSupRels = new ArrayList<BidTaxsSupRel>();
     private List<BidDivisiton> bidDivisitons = new ArrayList<BidDivisiton>();

    public BidProject() {
    }

	
    public BidProject(String bidProjectId, BidLedger bidLedger, long recordVersion) {
        this.bidProjectId = bidProjectId;
        this.bidLedger = bidLedger;
        this.recordVersion = recordVersion;
    }
    public BidProject(String bidProjectId, BidLedger bidLedger, String projectName, String projectDesc, String attachFlg, Long dispOrderNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, String deleteFlg, long recordVersion, List<BidMeasureSupRel2> bidMeasureSupRel2s, List<BidOtherItemRel> bidOtherItemRels, List<BidMeasureSupRel> bidMeasureSupRels, List<BidSporadicSupRel> bidSporadicSupRels, List<BidDivisitonCust> bidDivisitonCusts, List<BidFeesSupRel> bidFeesSupRels, List<BidDivisionSupRel> bidDivisionSupRels, List<BidTaxsSupRel> bidTaxsSupRels, List<BidDivisiton> bidDivisitons) {
       this.bidProjectId = bidProjectId;
       this.bidLedger = bidLedger;
       this.projectName = projectName;
       this.projectDesc = projectDesc;
       this.attachFlg = attachFlg;
       this.dispOrderNo = dispOrderNo;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.deleteFlg = deleteFlg;
       this.recordVersion = recordVersion;
       this.bidMeasureSupRel2s = bidMeasureSupRel2s;
       this.bidOtherItemRels = bidOtherItemRels;
       this.bidMeasureSupRels = bidMeasureSupRels;
       this.bidSporadicSupRels = bidSporadicSupRels;
       this.bidDivisitonCusts = bidDivisitonCusts;
       this.bidFeesSupRels = bidFeesSupRels;
       this.bidDivisionSupRels = bidDivisionSupRels;
       this.bidTaxsSupRels = bidTaxsSupRels;
       this.bidDivisitons = bidDivisitons;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BID_PROJECT_ID", unique=true, nullable=false, length=50)
    public String getBidProjectId() {
        return this.bidProjectId;
    }
    
    public void setBidProjectId(String bidProjectId) {
        this.bidProjectId = bidProjectId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BID_LEDGER_ID", nullable=false)
    public BidLedger getBidLedger() {
        return this.bidLedger;
    }
    
    public void setBidLedger(BidLedger bidLedger) {
        this.bidLedger = bidLedger;
    }
    
    @Column(name="PROJECT_NAME", length=100)
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    @Column(name="PROJECT_DESC", length=1000)
    public String getProjectDesc() {
        return this.projectDesc;
    }
    
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }
    
    @Column(name="ATTACH_FLG", length=1)
    public String getAttachFlg() {
        return this.attachFlg;
    }
    
    public void setAttachFlg(String attachFlg) {
        this.attachFlg = attachFlg;
    }
    
    @Column(name="DISP_ORDER_NO", precision=18, scale=0)
    public Long getDispOrderNo() {
        return this.dispOrderNo;
    }
    
    public void setDispOrderNo(Long dispOrderNo) {
        this.dispOrderNo = dispOrderNo;
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
    
    @Column(name="DELETE_FLG", length=1)
    public String getDeleteFlg() {
        return this.deleteFlg;
    }
    
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
    
    @Column(name="RECORD_VERSION", nullable=false, precision=10, scale=0)
    @Version 
    public long getRecordVersion() {
        return this.recordVersion;
    }
    
    public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidMeasureSupRel2> getBidMeasureSupRel2s() {
        return this.bidMeasureSupRel2s;
    }
    
    public void setBidMeasureSupRel2s(List<BidMeasureSupRel2> bidMeasureSupRel2s) {
        this.bidMeasureSupRel2s = bidMeasureSupRel2s;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidOtherItemRel> getBidOtherItemRels() {
        return this.bidOtherItemRels;
    }
    
    public void setBidOtherItemRels(List<BidOtherItemRel> bidOtherItemRels) {
        this.bidOtherItemRels = bidOtherItemRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidMeasureSupRel> getBidMeasureSupRels() {
        return this.bidMeasureSupRels;
    }
    
    public void setBidMeasureSupRels(List<BidMeasureSupRel> bidMeasureSupRels) {
        this.bidMeasureSupRels = bidMeasureSupRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidSporadicSupRel> getBidSporadicSupRels() {
        return this.bidSporadicSupRels;
    }
    
    public void setBidSporadicSupRels(List<BidSporadicSupRel> bidSporadicSupRels) {
        this.bidSporadicSupRels = bidSporadicSupRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidDivisitonCust> getBidDivisitonCusts() {
        return this.bidDivisitonCusts;
    }
    
    public void setBidDivisitonCusts(List<BidDivisitonCust> bidDivisitonCusts) {
        this.bidDivisitonCusts = bidDivisitonCusts;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidFeesSupRel> getBidFeesSupRels() {
        return this.bidFeesSupRels;
    }
    
    public void setBidFeesSupRels(List<BidFeesSupRel> bidFeesSupRels) {
        this.bidFeesSupRels = bidFeesSupRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidDivisionSupRel> getBidDivisionSupRels() {
        return this.bidDivisionSupRels;
    }
    
    public void setBidDivisionSupRels(List<BidDivisionSupRel> bidDivisionSupRels) {
        this.bidDivisionSupRels = bidDivisionSupRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidTaxsSupRel> getBidTaxsSupRels() {
        return this.bidTaxsSupRels;
    }
    
    public void setBidTaxsSupRels(List<BidTaxsSupRel> bidTaxsSupRels) {
        this.bidTaxsSupRels = bidTaxsSupRels;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bidProject")
    @BatchSize(size=10)
public List<BidDivisiton> getBidDivisitons() {
        return this.bidDivisitons;
    }
    
    public void setBidDivisitons(List<BidDivisiton> bidDivisitons) {
        this.bidDivisitons = bidDivisitons;
    }




}

