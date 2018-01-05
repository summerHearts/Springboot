package com.wangpu;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kenvin on 2018/1/5.
 */

@Entity
public class ComplaintInfo implements Serializable {

    @Id
    @GeneratedValue
    private  Integer  id;
    private  Integer  complaint_id;
    private  String   complaint_phone;
    private  String   customer_name;
    private  Integer  complaint_business;
    private  Integer  customer_id;
    private  Integer  complaint_channel;
    private  String   complaintchannel_info;
    private  Integer  protocol_id;
    private  String   complaint_theme;
    private  Integer  complaint_type;

    private String complaint_detail;
    private Integer emergency_degree;
    private Date complaint_date;
    private Date appoint_time;
    private Integer forwardprocessing_department;

    private String creater;
    private Date create_time;
    private String modifier;
    private Date modify_time;
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id;
    }

    public String getComplaint_phone() {
        return complaint_phone;
    }

    public void setComplaint_phone(String complaint_phone) {
        this.complaint_phone = complaint_phone;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getComplaint_business() {
        return complaint_business;
    }

    public void setComplaint_business(Integer complaint_business) {
        this.complaint_business = complaint_business;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getComplaint_channel() {
        return complaint_channel;
    }

    public void setComplaint_channel(Integer complaint_channel) {
        this.complaint_channel = complaint_channel;
    }

    public String getComplaintchannel_info() {
        return complaintchannel_info;
    }

    public void setComplaintchannel_info(String complaintchannel_info) {
        this.complaintchannel_info = complaintchannel_info;
    }

    public Integer getProtocol_id() {
        return protocol_id;
    }

    public void setProtocol_id(Integer protocol_id) {
        this.protocol_id = protocol_id;
    }

    public String getComplaint_theme() {
        return complaint_theme;
    }

    public void setComplaint_theme(String complaint_theme) {
        this.complaint_theme = complaint_theme;
    }

    public Integer getComplaint_type() {
        return complaint_type;
    }

    public void setComplaint_type(Integer complaint_type) {
        this.complaint_type = complaint_type;
    }

    public String getComplaint_detail() {
        return complaint_detail;
    }

    public void setComplaint_detail(String complaint_detail) {
        this.complaint_detail = complaint_detail;
    }

    public Integer getEmergency_degree() {
        return emergency_degree;
    }

    public void setEmergency_degree(Integer emergency_degree) {
        this.emergency_degree = emergency_degree;
    }

    public Date getComplaint_date() {
        return complaint_date;
    }

    public void setComplaint_date(Date complaint_date) {
        this.complaint_date = complaint_date;
    }

    public Date getAppoint_time() {
        return appoint_time;
    }

    public void setAppoint_time(Date appoint_time) {
        this.appoint_time = appoint_time;
    }

    public Integer getForwardprocessing_department() {
        return forwardprocessing_department;
    }

    public void setForwardprocessing_department(Integer forwardprocessing_department) {
        this.forwardprocessing_department = forwardprocessing_department;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
