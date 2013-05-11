// 
package com.hhz.ump.entity.old;
// Generated 2010-8-11 13:39:29 by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NewsComment generated by hbm2java
 */
@Entity
@Table(name="NEWS_COMMENT"
    ,schema="POWERDESK"
)
public class NewsComment  implements java.io.Serializable {


     private String commentId;
     private BigDecimal parentId;
     private BigDecimal newsId;
     private String userId;
     private String nickName;
     private String content;
     private Date reTime;

    public NewsComment() {
    }

	
    public NewsComment(String commentId) {
        this.commentId = commentId;
    }
    public NewsComment(String commentId, BigDecimal parentId, BigDecimal newsId, String userId, String nickName, String content, Date reTime) {
       this.commentId = commentId;
       this.parentId = parentId;
       this.newsId = newsId;
       this.userId = userId;
       this.nickName = nickName;
       this.content = content;
       this.reTime = reTime;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="COMMENT_ID", unique=true, nullable=false, length=50)
    public String getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    
    @Column(name="PARENT_ID", precision=38, scale=0)
    public BigDecimal getParentId() {
        return this.parentId;
    }
    
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    
    @Column(name="NEWS_ID", precision=38, scale=0)
    public BigDecimal getNewsId() {
        return this.newsId;
    }
    
    public void setNewsId(BigDecimal newsId) {
        this.newsId = newsId;
    }

    
    @Column(name="USER_ID", length=50)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    @Column(name="NICK_NAME", length=100)
    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    
    @Column(name="CONTENT", length=4000)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RE_TIME", length=7)
    public Date getReTime() {
        return this.reTime;
    }
    
    public void setReTime(Date reTime) {
        this.reTime = reTime;
    }




}


