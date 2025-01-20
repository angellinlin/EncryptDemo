package com.zuiyu.encryptdemo.encry.bean;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author ChenZhiPing
 * @date 2020/12/10 10:43
 * @description:   mybatis generate  自动生成代码
*/
@Data
@Builder
public class InvCusComplaint {
    private Integer id;

    private String investorLoanIds;

    private String jdPin;

    private String complaintType;

    private String complaintFlag;

    private Date createdDate;

    private Date modifiedDate;

    private Integer yn;

    private String orgId;

    private String orgName;

    private String processId;

    private Date cusApplyDate;

    private String complaintContent;

    public InvCusComplaint(Integer id, String investorLoanIds, String jdPin, String complaintType, String complaintFlag, Date createdDate, Date modifiedDate, Integer yn, String orgId, String orgName, String processId, Date cusApplyDate) {
        this.id = id;
        this.investorLoanIds = investorLoanIds;
        this.jdPin = jdPin;
        this.complaintType = complaintType;
        this.complaintFlag = complaintFlag;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.yn = yn;
        this.orgId = orgId;
        this.orgName = orgName;
        this.processId = processId;
        this.cusApplyDate = cusApplyDate;
    }

    public InvCusComplaint(Integer id, String investorLoanIds, String jdPin, String complaintType, String complaintFlag, Date createdDate, Date modifiedDate, Integer yn, String orgId, String orgName, String processId, Date cusApplyDate, String complaintContent) {
        this.id = id;
        this.investorLoanIds = investorLoanIds;
        this.jdPin = jdPin;
        this.complaintType = complaintType;
        this.complaintFlag = complaintFlag;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.yn = yn;
        this.orgId = orgId;
        this.orgName = orgName;
        this.processId = processId;
        this.cusApplyDate = cusApplyDate;
        this.complaintContent = complaintContent;
    }

    public InvCusComplaint() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvestorLoanIds() {
        return investorLoanIds;
    }

    public void setInvestorLoanIds(String investorLoanIds) {
        this.investorLoanIds = investorLoanIds == null ? null : investorLoanIds.trim();
    }

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin == null ? null : jdPin.trim();
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType == null ? null : complaintType.trim();
    }

    public String getComplaintFlag() {
        return complaintFlag;
    }

    public void setComplaintFlag(String complaintFlag) {
        this.complaintFlag = complaintFlag == null ? null : complaintFlag.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public Date getCusApplyDate() {
        return cusApplyDate;
    }

    public void setCusApplyDate(Date cusApplyDate) {
        this.cusApplyDate = cusApplyDate;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent == null ? null : complaintContent.trim();
    }
}