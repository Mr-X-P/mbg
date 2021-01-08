package com.atguigu.dao;

import com.atguigu.pojo.Ttravelitem;
import com.atguigu.pojo.TtravelitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtravelitemMapper {
    long countByExample(TtravelitemExample example);

    int deleteByExample(TtravelitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ttravelitem record);

    int insertSelective(Ttravelitem record);

    List<Ttravelitem> selectByExample(TtravelitemExample example);

    Ttravelitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ttravelitem record, @Param("example") TtravelitemExample example);

    int updateByExample(@Param("record") Ttravelitem record, @Param("example") TtravelitemExample example);

    int updateByPrimaryKeySelective(Ttravelitem record);

    int updateByPrimaryKey(Ttravelitem record);
}