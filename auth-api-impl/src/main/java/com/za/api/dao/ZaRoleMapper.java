package com.za.api.dao;

import com.za.pojo.ZaRole;
import com.za.pojo.ZaRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZaRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    long countByExample(ZaRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    int deleteByExample(ZaRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    int insert(ZaRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    int insertSelective(ZaRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    List<ZaRole> selectByExample(ZaRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") ZaRole record, @Param("example") ZaRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table za_role
     *
     * @mbg.generated Sun Jul 01 14:34:01 CST 2018
     */
    int updateByExample(@Param("record") ZaRole record, @Param("example") ZaRoleExample example);
}