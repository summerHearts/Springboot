package com.wangpu.service;

import com.wangpu.ComplaintInfo;
import com.wangpu.responsitory.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Kenvin on 2018/1/5.
 */

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Transactional
    public void  insertComplaintList(List<ComplaintInfo> list){
        for (int i = 0; i < list.size(); i++) {
            ComplaintInfo complaintInfo = list.get(i);
            complaintInfo  = complaintRepository.findOne(complaintInfo.getId());
            if (complaintInfo==null){
                complaintRepository.save(list.get(i));
            }else {
                return;
            }
        }
    }
}
