package com.wangpu.controller;

import com.wangpu.ComplaintInfo;
import com.wangpu.responsitory.ComplaintRepository;
import com.wangpu.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Kenvin on 2018/1/5.
 */
@RestController
public class ComplaintController {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Autowired
    private ComplaintService complaintService;


    /**
     * 查询所有的投诉信息列表
     * @return
     */
    @PostMapping(value = "/complaintInfoList")
    public List<ComplaintInfo> complaintInfoList(){
        return complaintRepository.findAll();
    }

    /**
     * 插入一条投诉信息
     * @param complaintInfo
     * @return
     */
    @PostMapping(value = "/complaintInfoAdd")
    public ComplaintInfo complaintInfoAdd(@RequestBody ComplaintInfo complaintInfo){
      return  complaintRepository.save(complaintInfo);
    }

    @PostMapping(value = "/query")
    public  ComplaintInfo queryComplaintInfo(@RequestParam("id") Integer id){
        return   complaintRepository.findOne(id);
    }

    /**
     * 根据投诉id 修改投诉内容相关信息
     * @param id
     * @param complaint_theme
     * @param complaint_detail
     * @return
     */
    @PostMapping(value = "/update")
    public  ComplaintInfo updateComplaintInfo(@RequestParam("id") Integer id,
                                              @RequestParam("complaint_theme") String complaint_theme,
                                              @RequestParam("complaint_detail") String complaint_detail){
         ComplaintInfo complaintInfo = new ComplaintInfo();
         complaintInfo  = complaintRepository.findOne(id);

         if (complaintInfo == null){
             return  null;
         }else {
             complaintInfo.setComplaint_theme(complaint_theme);
             complaintInfo.setComplaint_detail(complaint_detail);
             return complaintRepository.save(complaintInfo);
         }
    }

    /**
     * 删除某条投诉信息
     * @param id
     */
    @PostMapping(value = "/delete")
    public void deleteComplaintInfo(@RequestParam("id") Integer id) {
        complaintRepository.delete(id);
    }


    /**
     * 通过手机号查询数据
     * @param complaint_phone
     * @return
     */
    @PostMapping(value = "/queryByPhone")
    public List<ComplaintInfo> queryComplaintInfoByPhone(@RequestParam("complaint_phone") String complaint_phone){
        return complaintRepository.findByComplaint_phone(complaint_phone);
    }


    /**
     * 批量插入投诉数据
     * @param list
     */
    @PostMapping(value = "/insertComplaintInfoList")
    public void insertComplaintInfoList(@RequestBody List<ComplaintInfo> list){
        complaintService.insertComplaintList(list);
    }

}
