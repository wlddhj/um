// 
package com.hhz.uums.entity.plas;
// Generated 2011-11-21 15:11:29 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * PlasApproveInfo generated by hbm2java
 */
@Entity
@Table(name="PLAS_APPROVE_INFO"
    
)
public class PlasApproveInfo  implements java.io.Serializable {


     private String plasApproveInfoId;
     private String applyTypeCd;
     private String newUiid;
     private String newName;
     private String newLevelCd;
     private String newParentId;
     private String newParentName;
     private String newRelOrgCd;
     private String newCornerOrgCd;
     private String newCornerOrgName;
     private String newWorkDuty;
     private String newSysPosIds;
     private String oldParentId;
     private String oldParentName;
     private String oldRelOrgCd;
     private String oldCornerOrgCd;
     private String oldCornerOrgName;
     private String oldWorkDuty;
     private String oldSysPosIds;
     private String contentDesc;
     private String approveRoleCd;
     private String approveStatusCd;
     private String nextNodeId;
     private String sexCd;
     private Date birthday;
     private String idno;
     private String nationCd;
     private BigDecimal sequenceNo;
     private String nativeProvinceDesc;
     private Boolean activeBl;
     private String nativePlaceDesc;
     private String marrigeStatusCd;
     private String schoolRecordCd;
     private String email;
     private String gradSchoolDesc;
     private String fixedPhone;
     private String majorDesc;
     private String mobilePhone;
     private String mobilePhone2;
     private Date attendWorkDate;
     private String idCardTypeCd;
     private String memberTypeCd;
     private String responsibility;
     private String specialUserFlg;
     private String workDutyDesc;
     private String userTypeCd;
     private String professionTypeCd;
     private String politicsCd;
     private String sourceTypeCd;
     private String defaultCredenc;
     private String otherTypeCd;
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
     private String oldLevelCd;
     private String acctStatusCd;
     private Date effectDate;
     private String flowTypeCd;
     private String applyPartCd;
     private String areaTypeCd;
     private String applyRoleCd;
     private List<PlasApproveNodeArch> plasApproveNodeArchs = new ArrayList<PlasApproveNodeArch>();
     private List<PlasApproveNodeHis> plasApproveNodeHises = new ArrayList<PlasApproveNodeHis>();

    public PlasApproveInfo() {
    }

	
    public PlasApproveInfo(String plasApproveInfoId, long recordVersion) {
        this.plasApproveInfoId = plasApproveInfoId;
        this.recordVersion = recordVersion;
    }
    public PlasApproveInfo(String plasApproveInfoId, String applyTypeCd, String newUiid, String newName, String newLevelCd, String newParentId, String newParentName,String newRelOrgCd, String newCornerOrgCd, String newCornerOrgName, String newWorkDuty, String newSysPosIds, String oldParentId, String oldParentName,String oldRelOrgCd,String oldCornerOrgCd, String oldCornerOrgName, String oldWorkDuty, String oldSysPosIds, String contentDesc, String approveRoleCd, String approveStatusCd,String nextNodeId, String sexCd, Date birthday, String idno, String nationCd, BigDecimal sequenceNo, String nativeProvinceDesc, Boolean activeBl, String nativePlaceDesc, String marrigeStatusCd, String schoolRecordCd, String email, String gradSchoolDesc, String fixedPhone, String majorDesc, String mobilePhone, String mobilePhone2, Date attendWorkDate, String idCardTypeCd, String memberTypeCd, String responsibility, String specialUserFlg, String workDutyDesc, String userTypeCd, String professionTypeCd, String politicsCd, String sourceTypeCd, String defaultCredenc, String otherTypeCd, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, String oldLevelCd, String acctStatusCd, Date effectDate, String flowTypeCd, String applyPartCd, String areaTypeCd, String applyRoleCd, List<PlasApproveNodeArch> plasApproveNodeArchs, List<PlasApproveNodeHis> plasApproveNodeHises) {
       this.plasApproveInfoId = plasApproveInfoId;
       this.applyTypeCd = applyTypeCd;
       this.newUiid = newUiid;
       this.newName = newName;
       this.newLevelCd = newLevelCd;
       this.newParentId = newParentId;
       this.newParentName = newParentName;
       this.newRelOrgCd = newRelOrgCd;
       this.newCornerOrgCd = newCornerOrgCd;
       this.newCornerOrgName = newCornerOrgName;
       this.newWorkDuty = newWorkDuty;
       this.newSysPosIds = newSysPosIds;
       this.oldParentId = oldParentId;
       this.oldParentName = oldParentName;
       this.oldRelOrgCd = oldRelOrgCd;
       this.oldCornerOrgCd = oldCornerOrgCd;
       this.oldCornerOrgName = oldCornerOrgName;
       this.oldWorkDuty = oldWorkDuty;
       this.oldSysPosIds = oldSysPosIds;
       this.contentDesc = contentDesc;
       this.approveRoleCd = approveRoleCd;
       this.approveStatusCd = approveStatusCd;
       this.nextNodeId = nextNodeId;
       this.sexCd = sexCd;
       this.birthday = birthday;
       this.idno = idno;
       this.nationCd = nationCd;
       this.sequenceNo = sequenceNo;
       this.nativeProvinceDesc = nativeProvinceDesc;
       this.activeBl = activeBl;
       this.nativePlaceDesc = nativePlaceDesc;
       this.marrigeStatusCd = marrigeStatusCd;
       this.schoolRecordCd = schoolRecordCd;
       this.email = email;
       this.gradSchoolDesc = gradSchoolDesc;
       this.fixedPhone = fixedPhone;
       this.majorDesc = majorDesc;
       this.mobilePhone = mobilePhone;
       this.mobilePhone2 = mobilePhone2;
       this.attendWorkDate = attendWorkDate;
       this.idCardTypeCd = idCardTypeCd;
       this.memberTypeCd = memberTypeCd;
       this.responsibility = responsibility;
       this.specialUserFlg = specialUserFlg;
       this.workDutyDesc = workDutyDesc;
       this.userTypeCd = userTypeCd;
       this.professionTypeCd = professionTypeCd;
       this.politicsCd = politicsCd;
       this.sourceTypeCd = sourceTypeCd;
       this.defaultCredenc = defaultCredenc;
       this.otherTypeCd = otherTypeCd;
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
       this.oldLevelCd = oldLevelCd;
       this.acctStatusCd = acctStatusCd;
       this.effectDate = effectDate;
       this.flowTypeCd = flowTypeCd;
       this.applyPartCd = applyPartCd;
       this.areaTypeCd = areaTypeCd;
       this.applyRoleCd = applyRoleCd;
       this.plasApproveNodeArchs = plasApproveNodeArchs;
       this.plasApproveNodeHises = plasApproveNodeHises;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_APPROVE_INFO_ID", unique=true, nullable=false, length=50)
    public String getPlasApproveInfoId() {
        return this.plasApproveInfoId;
    }
    
    public void setPlasApproveInfoId(String plasApproveInfoId) {
        this.plasApproveInfoId = plasApproveInfoId;
    }
    
    @Column(name="APPLY_TYPE_CD", length=20)
    public String getApplyTypeCd() {
        return this.applyTypeCd;
    }
    
    public void setApplyTypeCd(String applyTypeCd) {
        this.applyTypeCd = applyTypeCd;
    }
    
    @Column(name="NEW_UIID", length=40)
    public String getNewUiid() {
        return this.newUiid;
    }
    
    public void setNewUiid(String newUiid) {
        this.newUiid = newUiid;
    }
    
    @Column(name="NEW_NAME", length=40)
    public String getNewName() {
        return this.newName;
    }
    
    public void setNewName(String newName) {
        this.newName = newName;
    }
    
    @Column(name="NEW_LEVEL_CD", length=20)
    public String getNewLevelCd() {
        return this.newLevelCd;
    }
    
    public void setNewLevelCd(String newLevelCd) {
        this.newLevelCd = newLevelCd;
    }
    
    @Column(name="NEW_PARENT_ID", length=50)
    public String getNewParentId() {
        return this.newParentId;
    }
    
    public void setNewParentId(String newParentId) {
        this.newParentId = newParentId;
    }
    
    @Column(name="NEW_PARENT_NAME", length=200)
    public String getNewParentName() {
        return this.newParentName;
    }
    
    public void setNewParentName(String newParentName) {
        this.newParentName = newParentName;
    }

    @Column(name="NEW_REL_ORG_CD", length=50)
    public String getNewRelOrgCd() {
        return this.newRelOrgCd;
    }
    
    public void setNewRelOrgCd(String newRelOrgCd) {
        this.newRelOrgCd = newRelOrgCd;
    }
    
    @Column(name="NEW_CORNER_ORG_CD", length=50)
    public String getNewCornerOrgCd() {
        return this.newCornerOrgCd;
    }
    
    public void setNewCornerOrgCd(String newCornerOrgCd) {
        this.newCornerOrgCd = newCornerOrgCd;
    }
    
    @Column(name="NEW_CORNER_ORG_NAME", length=100)
    public String getNewCornerOrgName() {
        return this.newCornerOrgName;
    }
    
    public void setNewCornerOrgName(String newCornerOrgName) {
        this.newCornerOrgName = newCornerOrgName;
    }
    
    @Column(name="NEW_WORK_DUTY", length=200)
    public String getNewWorkDuty() {
        return this.newWorkDuty;
    }
    
    public void setNewWorkDuty(String newWorkDuty) {
        this.newWorkDuty = newWorkDuty;
    }
    
    @Column(name="NEW_SYS_POS_IDS", length=1000)
    public String getNewSysPosIds() {
        return this.newSysPosIds;
    }
    
    public void setNewSysPosIds(String newSysPosIds) {
        this.newSysPosIds = newSysPosIds;
    }
    
    @Column(name="OLD_PARENT_ID", length=50)
    public String getOldParentId() {
        return this.oldParentId;
    }
    
    public void setOldParentId(String oldParentId) {
        this.oldParentId = oldParentId;
    }
    
    @Column(name="OLD_PARENT_NAME", length=200)
    public String getOldParentName() {
        return this.oldParentName;
    }
    
    public void setOldParentName(String oldParentName) {
        this.oldParentName = oldParentName;
    }

    @Column(name="OLD_REL_ORG_CD", length=50)
    public String getOldRelOrgCd() {
        return this.oldRelOrgCd;
    }
    
    public void setOldRelOrgCd(String oldRelOrgCd) {
        this.oldRelOrgCd = oldRelOrgCd;
    }
    
    
    @Column(name="OLD_CORNER_ORG_CD", length=50)
    public String getOldCornerOrgCd() {
        return this.oldCornerOrgCd;
    }
    
    public void setOldCornerOrgCd(String oldCornerOrgCd) {
        this.oldCornerOrgCd = oldCornerOrgCd;
    }
    
    @Column(name="OLD_CORNER_ORG_NAME", length=100)
    public String getOldCornerOrgName() {
        return this.oldCornerOrgName;
    }
    
    public void setOldCornerOrgName(String oldCornerOrgName) {
        this.oldCornerOrgName = oldCornerOrgName;
    }
    
    
    @Column(name="OLD_WORK_DUTY", length=200)
    public String getOldWorkDuty() {
        return this.oldWorkDuty;
    }
    
    public void setOldWorkDuty(String oldWorkDuty) {
        this.oldWorkDuty = oldWorkDuty;
    }
    
    @Column(name="OLD_SYS_POS_IDS", length=1000)
    public String getOldSysPosIds() {
        return this.oldSysPosIds;
    }
    
    public void setOldSysPosIds(String oldSysPosIds) {
        this.oldSysPosIds = oldSysPosIds;
    }
    
    @Column(name="CONTENT_DESC", length=1000)
    public String getContentDesc() {
        return this.contentDesc;
    }
    
    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }
    
    @Column(name="APPROVE_ROLE_CD", length=50)
    public String getApproveRoleCd() {
        return this.approveRoleCd;
    }
    
    public void setApproveRoleCd(String approveRoleCd) {
        this.approveRoleCd = approveRoleCd;
    }

    @Column(name="APPROVE_STATUS_CD", length=20)
    public String getApproveStatusCd() {
        return this.approveStatusCd;
    }
    
    public void setApproveStatusCd(String approveStatusCd) {
        this.approveStatusCd = approveStatusCd;
    }
    @Column(name="NEXT_NODE_ID", length=50)
    public String getNextNodeId() {
        return this.nextNodeId;
    }
    
    public void setNextNodeId(String nextNodeId) {
        this.nextNodeId = nextNodeId;
    }
    
    @Column(name="SEX_CD", length=20)
    public String getSexCd() {
        return this.sexCd;
    }
    
    public void setSexCd(String sexCd) {
        this.sexCd = sexCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BIRTHDAY", length=7)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="IDNO", length=50)
    public String getIdno() {
        return this.idno;
    }
    
    public void setIdno(String idno) {
        this.idno = idno;
    }
    
    @Column(name="NATION_CD", length=20)
    public String getNationCd() {
        return this.nationCd;
    }
    
    public void setNationCd(String nationCd) {
        this.nationCd = nationCd;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public BigDecimal getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
    @Column(name="NATIVE_PROVINCE_DESC", length=200)
    public String getNativeProvinceDesc() {
        return this.nativeProvinceDesc;
    }
    
    public void setNativeProvinceDesc(String nativeProvinceDesc) {
        this.nativeProvinceDesc = nativeProvinceDesc;
    }
    
    @Column(name="ACTIVE_BL", precision=1, scale=0)
    public Boolean getActiveBl() {
        return this.activeBl;
    }
    
    public void setActiveBl(Boolean activeBl) {
        this.activeBl = activeBl;
    }
    
    @Column(name="NATIVE_PLACE_DESC", length=500)
    public String getNativePlaceDesc() {
        return this.nativePlaceDesc;
    }
    
    public void setNativePlaceDesc(String nativePlaceDesc) {
        this.nativePlaceDesc = nativePlaceDesc;
    }
    
    @Column(name="MARRIGE_STATUS_CD", length=20)
    public String getMarrigeStatusCd() {
        return this.marrigeStatusCd;
    }
    
    public void setMarrigeStatusCd(String marrigeStatusCd) {
        this.marrigeStatusCd = marrigeStatusCd;
    }
    
    @Column(name="SCHOOL_RECORD_CD", length=20)
    public String getSchoolRecordCd() {
        return this.schoolRecordCd;
    }
    
    public void setSchoolRecordCd(String schoolRecordCd) {
        this.schoolRecordCd = schoolRecordCd;
    }
    
    @Column(name="EMAIL", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="GRAD_SCHOOL_DESC", length=200)
    public String getGradSchoolDesc() {
        return this.gradSchoolDesc;
    }
    
    public void setGradSchoolDesc(String gradSchoolDesc) {
        this.gradSchoolDesc = gradSchoolDesc;
    }
    
    @Column(name="FIXED_PHONE", length=200)
    public String getFixedPhone() {
        return this.fixedPhone;
    }
    
    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }
    
    @Column(name="MAJOR_DESC", length=200)
    public String getMajorDesc() {
        return this.majorDesc;
    }
    
    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc;
    }
    
    @Column(name="MOBILE_PHONE", length=200)
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    @Column(name="MOBILE_PHONE2", length=200)
    public String getMobilePhone2() {
        return this.mobilePhone2;
    }
    
    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ATTEND_WORK_DATE", length=7)
    public Date getAttendWorkDate() {
        return this.attendWorkDate;
    }
    
    public void setAttendWorkDate(Date attendWorkDate) {
        this.attendWorkDate = attendWorkDate;
    }
    
    @Column(name="ID_CARD_TYPE_CD", length=20)
    public String getIdCardTypeCd() {
        return this.idCardTypeCd;
    }
    
    public void setIdCardTypeCd(String idCardTypeCd) {
        this.idCardTypeCd = idCardTypeCd;
    }
    
    @Column(name="MEMBER_TYPE_CD", length=20)
    public String getMemberTypeCd() {
        return this.memberTypeCd;
    }
    
    public void setMemberTypeCd(String memberTypeCd) {
        this.memberTypeCd = memberTypeCd;
    }
    
    @Column(name="RESPONSIBILITY", length=200)
    public String getResponsibility() {
        return this.responsibility;
    }
    
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
    
    @Column(name="SPECIAL_USER_FLG", length=1)
    public String getSpecialUserFlg() {
        return this.specialUserFlg;
    }
    
    public void setSpecialUserFlg(String specialUserFlg) {
        this.specialUserFlg = specialUserFlg;
    }
    
    @Column(name="WORK_DUTY_DESC", length=200)
    public String getWorkDutyDesc() {
        return this.workDutyDesc;
    }
    
    public void setWorkDutyDesc(String workDutyDesc) {
        this.workDutyDesc = workDutyDesc;
    }
    
    @Column(name="USER_TYPE_CD", length=20)
    public String getUserTypeCd() {
        return this.userTypeCd;
    }
    
    public void setUserTypeCd(String userTypeCd) {
        this.userTypeCd = userTypeCd;
    }
    
    @Column(name="PROFESSION_TYPE_CD", length=20)
    public String getProfessionTypeCd() {
        return this.professionTypeCd;
    }
    
    public void setProfessionTypeCd(String professionTypeCd) {
        this.professionTypeCd = professionTypeCd;
    }
    
    @Column(name="POLITICS_CD", length=20)
    public String getPoliticsCd() {
        return this.politicsCd;
    }
    
    public void setPoliticsCd(String politicsCd) {
        this.politicsCd = politicsCd;
    }
    
    @Column(name="SOURCE_TYPE_CD", length=20)
    public String getSourceTypeCd() {
        return this.sourceTypeCd;
    }
    
    public void setSourceTypeCd(String sourceTypeCd) {
        this.sourceTypeCd = sourceTypeCd;
    }
    
    @Column(name="DEFAULT_CREDENC", length=100)
    public String getDefaultCredenc() {
        return this.defaultCredenc;
    }
    
    public void setDefaultCredenc(String defaultCredenc) {
        this.defaultCredenc = defaultCredenc;
    }
    
    @Column(name="OTHER_TYPE_CD", length=20)
    public String getOtherTypeCd() {
        return this.otherTypeCd;
    }
    
    public void setOtherTypeCd(String otherTypeCd) {
        this.otherTypeCd = otherTypeCd;
    }
    
    @Column(name="REMARK", length=4000)
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
    
    @Column(name="OLD_LEVEL_CD", length=20)
    public String getOldLevelCd() {
        return this.oldLevelCd;
    }
    
    public void setOldLevelCd(String oldLevelCd) {
        this.oldLevelCd = oldLevelCd;
    }
    
    @Column(name="ACCT_STATUS_CD", length=20)
    public String getAcctStatusCd() {
        return this.acctStatusCd;
    }
    
    public void setAcctStatusCd(String acctStatusCd) {
        this.acctStatusCd = acctStatusCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECT_DATE", length=7)
    public Date getEffectDate() {
        return this.effectDate;
    }
    
    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }
    
    @Column(name="FLOW_TYPE_CD", length=20)
    public String getFlowTypeCd() {
        return this.flowTypeCd;
    }
    
    public void setFlowTypeCd(String flowTypeCd) {
        this.flowTypeCd = flowTypeCd;
    }
    
    @Column(name="APPLY_PART_CD", length=20)
    public String getApplyPartCd() {
        return this.applyPartCd;
    }
    
    public void setApplyPartCd(String applyPartCd) {
        this.applyPartCd = applyPartCd;
    }
    
    @Column(name="AREA_TYPE_CD", length=20)
    public String getAreaTypeCd() {
        return this.areaTypeCd;
    }
    
    public void setAreaTypeCd(String areaTypeCd) {
        this.areaTypeCd = areaTypeCd;
    }
    
    @Column(name="APPLY_ROLE_CD", length=50)
    public String getApplyRoleCd() {
        return this.applyRoleCd;
    }
    
    public void setApplyRoleCd(String applyRoleCd) {
        this.applyRoleCd = applyRoleCd;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasApproveInfo")
    @BatchSize(size=10)
public List<PlasApproveNodeArch> getPlasApproveNodeArchs() {
        return this.plasApproveNodeArchs;
    }
    
    public void setPlasApproveNodeArchs(List<PlasApproveNodeArch> plasApproveNodeArchs) {
        this.plasApproveNodeArchs = plasApproveNodeArchs;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasApproveInfo")
    @BatchSize(size=10)
public List<PlasApproveNodeHis> getPlasApproveNodeHises() {
        return this.plasApproveNodeHises;
    }
    
    public void setPlasApproveNodeHises(List<PlasApproveNodeHis> plasApproveNodeHises) {
        this.plasApproveNodeHises = plasApproveNodeHises;
    }




}

