package com.wangpu.responsitory;

import com.wangpu.ComplaintInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Kenvin on 2018/1/5.
 */

public interface ComplaintRepository extends JpaRepository <ComplaintInfo,Integer>{


     @Query("select t from ComplaintInfo t where t.complaint_phone = ?1")
     List<ComplaintInfo> findByComplaint_phone(String complaint_phone);
}
