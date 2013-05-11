// 
package com.hhz.ump.entity.oa;
// Generated 2010-8-11 13:25:01 by Hibernate Tools 3.2.4.GA


import java.sql.Clob;
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
 * OaMeeting generated by hbm2java
 */
@Entity
@Table(name="OA_MEETING"
    ,schema="POWERDESK"
)
public class OaMeeting  implements java.io.Serializable {


     private String oaMeetingId;
     private String strModule;
     private String isDeleted;
     private String attentionFlg;
     private String hiddenFlg;
     private String waterNumber;
     private Clob business;
     private String responsiblePerson;
     private String coordinatePerson;
     private String visibleToUsers;
     private Date targetDate;
     private String status;
     private String priority;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private String fileFlg;
     private Date updatedDate;
     private long recordVersion;
     private List<OaMeetingAttendee> oaMeetingAttendees = new ArrayList<OaMeetingAttendee>();
     private List<OaMeetingComment> oaMeetingComments = new ArrayList<OaMeetingComment>();

    public OaMeeting() {
    }

	
    public OaMeeting(String oaMeetingId, long recordVersion) {
        this.oaMeetingId = oaMeetingId;
        this.recordVersion = recordVersion;
    }
    public OaMeeting(String oaMeetingId, String strModule, String isDeleted, String attentionFlg, String hiddenFlg, String waterNumber, Clob business, String responsiblePerson, String coordinatePerson, String visibleToUsers, Date targetDate, String status, String priority, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, List<OaMeetingAttendee> oaMeetingAttendees, List<OaMeetingComment> oaMeetingComments) {
       this.oaMeetingId = oaMeetingId;
       this.strModule = strModule;
       this.isDeleted = isDeleted;
       this.attentionFlg = attentionFlg;
       this.hiddenFlg = hiddenFlg;
       this.waterNumber = waterNumber;
       this.business = business;
       this.responsiblePerson = responsiblePerson;
       this.coordinatePerson = coordinatePerson;
       this.visibleToUsers = visibleToUsers;
       this.targetDate = targetDate;
       this.status = status;
       this.priority = priority;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.oaMeetingAttendees = oaMeetingAttendees;
       this.oaMeetingComments = oaMeetingComments;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="OA_MEETING_ID", unique=true, nullable=false, length=50)
    public String getOaMeetingId() {
        return this.oaMeetingId;
    }
    
    public void setOaMeetingId(String oaMeetingId) {
        this.oaMeetingId = oaMeetingId;
    }

    @Column(name="STR_MODULE", length=20)
    public String getStrModule() {
        return this.strModule;
    }
    
    public void setStrModule(String strModule) {
        this.strModule = strModule;
    }
    
    @Column(name="IS_DELETED", length=1)
    public String getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    
    @Column(name="ATTENTION_FLG", length=1)
    public String getAttentionFlg() {
        return this.attentionFlg;
    }
    
    public void setAttentionFlg(String attentionFlg) {
        this.attentionFlg = attentionFlg;
    }

    
    @Column(name="HIDDEN_FLG", length=1)
    public String getHiddenFlg() {
        return this.hiddenFlg;
    }
    
    public void setHiddenFlg(String hiddenFlg) {
        this.hiddenFlg = hiddenFlg;
    }

    
    @Column(name="WATER_NUMBER", length=20)
    public String getWaterNumber() {
        return this.waterNumber;
    }
    
    public void setWaterNumber(String waterNumber) {
        this.waterNumber = waterNumber;
    }

    
    @Column(name="BUSINESS")
    public Clob getBusiness() {
        return this.business;
    }
    
    public void setBusiness(Clob business) {
        this.business = business;
    }

    
    @Column(name="RESPONSIBLE_PERSON", length=500)
    public String getResponsiblePerson() {
        return this.responsiblePerson;
    }
    
    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    
    @Column(name="COORDINATE_PERSON", length=500)
    public String getCoordinatePerson() {
        return this.coordinatePerson;
    }
    
    public void setCoordinatePerson(String coordinatePerson) {
        this.coordinatePerson = coordinatePerson;
    }

    
    @Column(name="VISIBLE_TO_USERS", length=1000)
    public String getVisibleToUsers() {
        return this.visibleToUsers;
    }
    
    public void setVisibleToUsers(String visibleToUsers) {
        this.visibleToUsers = visibleToUsers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TARGET_DATE", length=7)
    public Date getTargetDate() {
        return this.targetDate;
    }
    
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    
    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="PRIORITY", length=1)
    public String getPriority() {
        return this.priority;
    }
    
    public void setPriority(String priority) {
        this.priority = priority;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="oaMeeting")
    @BatchSize(size=10)
public List<OaMeetingAttendee> getOaMeetingAttendees() {
        return this.oaMeetingAttendees;
    }
    
    public void setOaMeetingAttendees(List<OaMeetingAttendee> oaMeetingAttendees) {
        this.oaMeetingAttendees = oaMeetingAttendees;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="oaMeeting")
    @BatchSize(size=10)
    @OrderBy(clause="CREATED_DATE DESC")
public List<OaMeetingComment> getOaMeetingComments() {
        return this.oaMeetingComments;
    }
    
    public void setOaMeetingComments(List<OaMeetingComment> oaMeetingComments) {
        this.oaMeetingComments = oaMeetingComments;
    }


	public String getFileFlg() {
		return fileFlg;
	}

    @Column(name="FILE_FLG", length=1)
	public void setFileFlg(String fileFlg) {
		this.fileFlg = fileFlg;
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



}


