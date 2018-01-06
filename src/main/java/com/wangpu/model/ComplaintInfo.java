package com.wangpu.model;

import java.util.Date;

public class ComplaintInfo {
    private Integer id;

    private Date appointTime;

    private Integer complaintBusiness;

    private Integer complaintChannel;

    private Date complaintDate;

    private String complaintDetail;

    private Integer complaintId;

    private String complaintPhone;

    private String complaintTheme;

    private Integer complaintType;

    private String complaintchannelInfo;

    private Date createTime;

    private String creater;

    private Integer customerId;

    private String customerName;

    private Integer emergencyDegree;

    private Integer forwardprocessingDepartment;

    private String modifier;

    private Date modifyTime;

    private Integer protocolId;

    private Integer version;

    public ComplaintInfo(Integer id, Date appointTime, Integer complaintBusiness, Integer complaintChannel, Date complaintDate, String complaintDetail, Integer complaintId, String complaintPhone, String complaintTheme, Integer complaintType, String complaintchannelInfo, Date createTime, String creater, Integer customerId, String customerName, Integer emergencyDegree, Integer forwardprocessingDepartment, String modifier, Date modifyTime, Integer protocolId, Integer version) {
        this.id = id;
        this.appointTime = appointTime;
        this.complaintBusiness = complaintBusiness;
        this.complaintChannel = complaintChannel;
        this.complaintDate = complaintDate;
        this.complaintDetail = complaintDetail;
        this.complaintId = complaintId;
        this.complaintPhone = complaintPhone;
        this.complaintTheme = complaintTheme;
        this.complaintType = complaintType;
        this.complaintchannelInfo = complaintchannelInfo;
        this.createTime = createTime;
        this.creater = creater;
        this.customerId = customerId;
        this.customerName = customerName;
        this.emergencyDegree = emergencyDegree;
        this.forwardprocessingDepartment = forwardprocessingDepartment;
        this.modifier = modifier;
        this.modifyTime = modifyTime;
        this.protocolId = protocolId;
        this.version = version;
    }

    public ComplaintInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Integer getComplaintBusiness() {
        return complaintBusiness;
    }

    public void setComplaintBusiness(Integer complaintBusiness) {
        this.complaintBusiness = complaintBusiness;
    }

    public Integer getComplaintChannel() {
        return complaintChannel;
    }

    public void setComplaintChannel(Integer complaintChannel) {
        this.complaintChannel = complaintChannel;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getComplaintDetail() {
        return complaintDetail;
    }

    public void setComplaintDetail(String complaintDetail) {
        this.complaintDetail = complaintDetail == null ? null : complaintDetail.trim();
    }

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintPhone() {
        return complaintPhone;
    }

    public void setComplaintPhone(String complaintPhone) {
        this.complaintPhone = complaintPhone == null ? null : complaintPhone.trim();
    }

    public String getComplaintTheme() {
        return complaintTheme;
    }

    public void setComplaintTheme(String complaintTheme) {
        this.complaintTheme = complaintTheme == null ? null : complaintTheme.trim();
    }

    public Integer getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(Integer complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintchannelInfo() {
        return complaintchannelInfo;
    }

    public void setComplaintchannelInfo(String complaintchannelInfo) {
        this.complaintchannelInfo = complaintchannelInfo == null ? null : complaintchannelInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getEmergencyDegree() {
        return emergencyDegree;
    }

    public void setEmergencyDegree(Integer emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
    }

    public Integer getForwardprocessingDepartment() {
        return forwardprocessingDepartment;
    }

    public void setForwardprocessingDepartment(Integer forwardprocessingDepartment) {
        this.forwardprocessingDepartment = forwardprocessingDepartment;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}