package com.macfu.model.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_subject_comment")
public class CmsSubjectComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "member_nick_name")
    private String memberNickName;

    @Column(name = "member_icon")
    private String memberIcon;

    private String content;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return subject_id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * @return member_nick_name
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * @param memberNickName
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * @return member_icon
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * @param memberIcon
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
}