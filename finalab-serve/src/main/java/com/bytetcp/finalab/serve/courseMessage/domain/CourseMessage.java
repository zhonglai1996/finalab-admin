package com.bytetcp.finalab.serve.courseMessage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 学生参与课件表 course_message
 *
 * @author finalab
 * @date 2020-05-28
 */
public class CourseMessage {
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 课程id
     */
    private String instanceId;
    /**
     * 实例id
     */
    private Long studentId;
    /**
     * 消息
     */
    private String information;
    /**
     * 消息状态  0未读  1已读
     */
    private Long status;
    /**
     * 时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public String toString() {
        return "CourseMessage{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", instanceId='" + instanceId + '\'' +
                ", studentId=" + studentId +
                ", information='" + information + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
