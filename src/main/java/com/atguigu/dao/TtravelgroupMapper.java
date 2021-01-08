package com.atguigu.dao;

import com.atguigu.pojo.Ttravelgroup;
import com.atguigu.pojo.TtravelgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtravelgroupMapper {
    long countByExample(TtravelgroupExample example);

    int deleteByExample(TtravelgroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ttravelgroup record);

    int insertSelective(Ttravelgroup record);

    List<Ttravelgroup> selectByExample(TtravelgroupExample example);

    Ttravelgroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ttravelgroup record, @Param("example") TtravelgroupExample example);

    int updateByExample(@Param("record") Ttravelgroup record, @Param("example") TtravelgroupExample example);

    int updateByPrimaryKeySelective(Ttravelgroup record);

    int updateByPrimaryKey(Ttravelgroup record);
}