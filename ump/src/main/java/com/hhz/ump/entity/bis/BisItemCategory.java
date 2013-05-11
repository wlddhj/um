// 
package com.hhz.ump.entity.bis;
// Generated 2012-6-20 13:55:13 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * BisItemCategory generated by hbm2java
 */
@Entity
@Table(name="BIS_ITEM_CATEGORY"
    
)
public class BisItemCategory  implements java.io.Serializable {


     private String itemCategoryId;
     private String categoryName;
     private String bisProjectId;
     private int orderNum;
     private int statusCd;
     private String remark;

    public BisItemCategory() {
    }

	
    public BisItemCategory(String itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }
    public BisItemCategory(String itemCategoryId, String categoryName, String bisProjectId, int orderNum, int statusCd, String remark) {
       this.itemCategoryId = itemCategoryId;
       this.categoryName = categoryName;
       this.bisProjectId = bisProjectId;
       this.orderNum = orderNum;
       this.statusCd = statusCd;
       this.remark = remark;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="ITEM_CATEGORY_ID", unique=true, nullable=false, length=50)
    public String getItemCategoryId() {
        return this.itemCategoryId;
    }
    
    public void setItemCategoryId(String itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }
    
    @Column(name="CATEGORY_NAME", length=50)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    @Column(name="BIS_PROJECT_ID", length=50)
    public String getBisProjectId() {
        return this.bisProjectId;
    }
    
    public void setBisProjectId(String bisProjectId) {
        this.bisProjectId = bisProjectId;
    }
    
    @Column(name="ORDER_NUM", precision=22, scale=0)
    public int getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    
    @Column(name="STATUS_CD", precision=22, scale=0)
    public int getStatusCd() {
        return this.statusCd;
    }
    
    public void setStatusCd(int statusCd) {
        this.statusCd = statusCd;
    }
    
    @Column(name="REMARK", length=100)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }




}

