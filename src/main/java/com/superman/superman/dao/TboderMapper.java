package com.superman.superman.dao;

import com.superman.superman.model.Tboder;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TboderMapper {


    int insert(Tboder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tboder
     *
     * @mbggenerated
     */
    Long selectPidInTb(List list);

    /**
     * 批量统计淘宝订单佣金（预估）
     * @param list
     * @return
     */
    Integer selectPidIn(List list);
    /**
     * 批量统计淘宝订单佣金（预估）
     * @param list
     * @return
     */
    Integer selectPidInFinish(List list);

    //统计淘宝订单佣金（预估）
    @Select("select  SUM(commission) from tboder where adzone_id=#{tbId} and tk_status =12")
    Long selectPid(Long  tbId);


    /**
     * 单个PID统计已结算订单收入
     * @return
     */
    @Select("select  SUM(commission) from tboder where adzone_id=#{pid} and tk_status =3")
    Long selectPidForFinish(Long  pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tboder
     *
     * @mbggenerated
     */
    Tboder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tboder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tboder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tboder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tboder record);
}