package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.CorpInfo;
import com.ut.scf.pojo.auto.CorpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CorpInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int countByExample(CorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int deleteByExample(CorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int deleteByPrimaryKey(String corpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int insert(CorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int insertSelective(CorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    List<CorpInfo> selectByExample(CorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    CorpInfo selectByPrimaryKey(String corpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int updateByExampleSelective(@Param("record") CorpInfo record, @Param("example") CorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int updateByExample(@Param("record") CorpInfo record, @Param("example") CorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int updateByPrimaryKeySelective(CorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table corp_info
     *
     * @mbggenerated Sat May 27 15:05:46 CST 2017
     */
    int updateByPrimaryKey(CorpInfo record);
}