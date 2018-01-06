package com.wangpu.dao;

import com.wangpu.model.ComplaintInfo;

public interface ComplaintInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComplaintInfo record);

    int insertSelective(ComplaintInfo record);

    ComplaintInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComplaintInfo record);

    int updateByPrimaryKey(ComplaintInfo record);
}