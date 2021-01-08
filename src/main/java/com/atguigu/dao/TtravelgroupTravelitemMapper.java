package com.atguigu.dao;

import com.atguigu.pojo.TtravelgroupTravelitemExample;
import com.atguigu.pojo.TtravelgroupTravelitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtravelgroupTravelitemMapper {
    long countByExample(TtravelgroupTravelitemExample example);

    int deleteByExample(TtravelgroupTravelitemExample example);

    int deleteByPrimaryKey(TtravelgroupTravelitemKey key);

    int insert(TtravelgroupTravelitemKey record);

    int insertSelective(TtravelgroupTravelitemKey record);

    List<TtravelgroupTravelitemKey> selectByExample(TtravelgroupTravelitemExample example);

    int updateByExampleSelective(@Param("record") TtravelgroupTravelitemKey record, @Param("example") TtravelgroupTravelitemExample example);

    int updateByExample(@Param("record") TtravelgroupTravelitemKey record, @Param("example") TtravelgroupTravelitemExample example);
}