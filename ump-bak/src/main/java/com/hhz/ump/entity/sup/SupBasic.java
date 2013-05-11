// 
package com.hhz.ump.entity.sup;
// Generated 2011-6-1 14:45:48 by Hibernate Tools 3.2.2.GA


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
import org.hibernate.annotations.OrderBy;

/**
 * SupBasic generated by hbm2java
 */
@Entity
@Table(name="SUP_BASIC"
    ,schema="POWERDESK"
)
public class SupBasic  implements java.io.Serializable {


     private String supBasicId;
     private String tableType;
     private String supName;
     private String supTypeSn;
     private String comRegMoney;
     private String comZzGrade;
     private String supContractor;
     private String supTel;
     private String supTypeName;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String supAudit;
     private String supManaEval;
     private String supExamResu;
     private String supInfoId;
     private String companyWebSite;
     private String operateRange;
     private String companyArea;
     private String operateRangeSn;
     private String deleteFlg;
     private String examResuPerson;
     private String examResuContent;
     private String tag0;//其他
     private String tag1;//地区
     private String tag2;//品牌
     private List<SupApproveRes> supApproveReses = new ArrayList<SupApproveRes>();
     private List<SupContactor> supContactors = new ArrayList<SupContactor>();
     private List<SupDetail> supDetails = new ArrayList<SupDetail>();

    public SupBasic() {
    }

	
    public SupBasic(String supBasicId, long recordVersion) {
        this.supBasicId = supBasicId;
        this.recordVersion = recordVersion;
    }
    public SupBasic(String supBasicId, String tableType, String supName, String supTypeSn, String comRegMoney, String comZzGrade, String supContractor, String supTel, String supTypeName, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String supAudit, String supManaEval, String supExamResu, String supInfoId, String companyWebSite, String operateRange, String companyArea,String tag0,String tag1, String tag2, List<SupApproveRes> supApproveReses, List<SupContactor> supContactors, List<SupDetail> supDetails,String operateRangeSn,String deleteFlg,String examResuPerson,String examResuContent) {
       this.supBasicId = supBasicId;
       this.tableType = tableType;
       this.supName = supName;
       this.supTypeSn = supTypeSn;
       this.comRegMoney = comRegMoney;
       this.comZzGrade = comZzGrade;
       this.supContractor = supContractor;
       this.supTel = supTel;
       this.supTypeName = supTypeName;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.supAudit = supAudit;
       this.supManaEval = supManaEval;
       this.supExamResu = supExamResu;
       this.supInfoId = supInfoId;
       this.companyWebSite = companyWebSite;
       this.operateRange = operateRange;
       this.companyArea = companyArea;
       this.tag0 = tag0;
       this.tag1 = tag1;
       this.tag2 = tag2;
       this.supApproveReses = supApproveReses;
       this.supContactors = supContactors;
       this.supDetails = supDetails;
       this.operateRangeSn = operateRangeSn;
       this.deleteFlg = deleteFlg;
       this.examResuPerson = examResuPerson;
       this.examResuContent = examResuContent;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="SUP_BASIC_ID", unique=true, nullable=false, length=50)
    public String getSupBasicId() {
        return this.supBasicId;
    }
    
    public void setSupBasicId(String supBasicId) {
        this.supBasicId = supBasicId;
    }
    
    @Column(name="TABLE_TYPE", length=50)
    public String getTableType() {
        return this.tableType;
    }
    
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
    
    @Column(name="SUP_NAME", length=80)
    public String getSupName() {
        return this.supName;
    }
    
    public void setSupName(String supName) {
        this.supName = supName;
    }
    
    @Column(name="SUP_TYPE_SN", length=2000)
    public String getSupTypeSn() {
        return this.supTypeSn;
    }
    
    public void setSupTypeSn(String supTypeSn) {
        this.supTypeSn = supTypeSn;
    }
    
    @Column(name="COM_REG_MONEY", length=50)
    public String getComRegMoney() {
        return this.comRegMoney;
    }
    
    public void setComRegMoney(String comRegMoney) {
        this.comRegMoney = comRegMoney;
    }
    
    @Column(name="COM_ZZ_GRADE", length=400)
    public String getComZzGrade() {
        return this.comZzGrade;
    }
    
    public void setComZzGrade(String comZzGrade) {
        this.comZzGrade = comZzGrade;
    }
    
    @Column(name="SUP_CONTRACTOR", length=200)
    public String getSupContractor() {
        return this.supContractor;
    }
    
    public void setSupContractor(String supContractor) {
        this.supContractor = supContractor;
    }
    
    @Column(name="SUP_TEL", length=50)
    public String getSupTel() {
        return this.supTel;
    }
    
    public void setSupTel(String supTel) {
        this.supTel = supTel;
    }
    
    @Column(name="SUP_TYPE_NAME", length=700)
    public String getSupTypeName() {
        return this.supTypeName;
    }
    
    public void setSupTypeName(String supTypeName) {
        this.supTypeName = supTypeName;
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
    
    @Column(name="SUP_AUDIT", length=2)
    public String getSupAudit() {
        return this.supAudit;
    }
    
    public void setSupAudit(String supAudit) {
        this.supAudit = supAudit;
    }
    
    @Column(name="SUP_MANA_EVAL", length=20)
    public String getSupManaEval() {
        return this.supManaEval;
    }
    
    public void setSupManaEval(String supManaEval) {
        this.supManaEval = supManaEval;
    }
    
    @Column(name="SUP_EXAM_RESU", length=20)
    public String getSupExamResu() {
        return this.supExamResu;
    }
    
    public void setSupExamResu(String supExamResu) {
        this.supExamResu = supExamResu;
    }
    
    @Column(name="SUP_INFO_ID", length=50)
    public String getSupInfoId() {
        return this.supInfoId;
    }
    
    public void setSupInfoId(String supInfoId) {
        this.supInfoId = supInfoId;
    }
    
    @Column(name="COMPANY_WEB_SITE", length=200)
    public String getCompanyWebSite() {
        return this.companyWebSite;
    }
    
    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }
    
    @Column(name="OPERATE_RANGE", length=200)
    public String getOperateRange() {
        return this.operateRange;
    }
    
    public void setOperateRange(String operateRange) {
        this.operateRange = operateRange;
    }
    
    @Column(name="COMPANY_AREA", length=100)
    public String getCompanyArea() {
        return this.companyArea;
    }
    
    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }
    

    @Column(name="TAG0", length=200)
    public String getTag0() {
        return this.tag0;
    }
    
    public void setTag0(String tag0) {
        this.tag0 = tag0;
    }
    @Column(name="TAG1", length=200)
    public String getTag1() {
        return this.tag1;
    }
    
    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }
    @Column(name="TAG2", length=200)
    public String getTag2() {
        return this.tag2;
    }
    
    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }
	@OneToMany(fetch=FetchType.LAZY, mappedBy="supBasic")
	    @BatchSize(size=10)
	    @OrderBy(clause="SUP_APP_TYPE asc")
	public List<SupApproveRes> getSupApproveReses() {
	        return this.supApproveReses;
	    }
	    
	    public void setSupApproveReses(List<SupApproveRes> supApproveReses) {
	        this.supApproveReses = supApproveReses;
	    }
	@OneToMany(fetch=FetchType.LAZY, mappedBy="supBasic")
	    @BatchSize(size=10)
	public List<SupContactor> getSupContactors() {
	        return this.supContactors;
	    }
	    
	    public void setSupContactors(List<SupContactor> supContactors) {
	        this.supContactors = supContactors;
	    }
	@OneToMany(fetch=FetchType.LAZY, mappedBy="supBasic")
	    @BatchSize(size=10)
	public List<SupDetail> getSupDetails() {
	        return this.supDetails;
	    }
    
    public void setSupDetails(List<SupDetail> supDetails) {
        this.supDetails = supDetails;
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
    @Column(name="OPERATE_RANGE_SN", length=100)
	public String getOperateRangeSn() {
		return operateRangeSn;
	}


	public void setOperateRangeSn(String operateRangeSn) {
		this.operateRangeSn = operateRangeSn;
	}

	@Column(name="DELETE_FLG", length=2)
	public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Column(name="EXAM_RESU_PERSON", length=100)
	public String getExamResuPerson() {
		return examResuPerson;
	}


	public void setExamResuPerson(String examResuPerson) {
		this.examResuPerson = examResuPerson;
	}

	@Column(name="EXAM_RESU_CONTENT", length=400)
	public String getExamResuContent() {
		return examResuContent;
	}


	public void setExamResuContent(String examResuContent) {
		this.examResuContent = examResuContent;
	}




}

