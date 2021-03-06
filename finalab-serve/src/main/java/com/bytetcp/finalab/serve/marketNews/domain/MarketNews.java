package com.bytetcp.finalab.serve.marketNews.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 案例市场新闻表 market_news
 *
 * @author finalab
 * @date 2019-05-25
 */
public class MarketNews {
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;
    /**  */
    private Long caseId;
    /**  */
    private Integer phaseNum;
    /**  */
    private Integer timeNum;
    /**  */
    private Integer sendAim;
    //是否强制
    private Integer isCompel;
    /** 1:买入 2：卖出*/
    private String action;
    //强制标的
    private String compelStockId;
    /**  */
    private String newsTitle;
    /**  */
    private String content;
    /**
     * 要替换content的某些数字
     */
    private String targetString;
    /**分组信息*/
    private Integer groupNum;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setPhaseNum(Integer phaseNum) {
        this.phaseNum = phaseNum;
    }

    public Integer getPhaseNum() {
        return phaseNum;
    }

    public void setTimeNum(Integer timeNum) {
        this.timeNum = timeNum;
    }

    public Integer getTimeNum() {
        return timeNum;
    }

    public void setSendAim(Integer sendAim) {
        this.sendAim = sendAim;
    }

    public Integer getSendAim() {
        return sendAim;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Integer getIsCompel() {
        return isCompel;
    }

    public void setIsCompel(Integer isCompel) {
        this.isCompel = isCompel;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCompelStockId() {
        return compelStockId;
    }

    public void setCompelStockId(String compelStockId) {
        this.compelStockId = compelStockId;
    }

    public String getTargetString() {
        return targetString;
    }

    public void setTargetString(String targetString) {
        this.targetString = targetString;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("caseId", getCaseId())
                .append("phaseNum", getPhaseNum())
                .append("timeNum", getTimeNum())
                .append("sendAim", getSendAim())
                .append("action", getAction())
                .append("isCompel", getIsCompel())
                .append("compelStockId", getCompelStockId())
                .append("groupNum", getGroupNum())
                .toString();
    }
}
