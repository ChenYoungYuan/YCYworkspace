package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.BatchHndlInfo;
import com.ut.scf.pojo.auto.BatchHndlInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchHndlInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int countByExample(BatchHndlInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int deleteByExample(BatchHndlInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int deleteByPrimaryKey(String batchId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int insert(BatchHndlInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int insertSelective(BatchHndlInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	List<BatchHndlInfo> selectByExample(BatchHndlInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	BatchHndlInfo selectByPrimaryKey(String batchId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int updateByExampleSelective(@Param("record") BatchHndlInfo record,
			@Param("example") BatchHndlInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int updateByExample(@Param("record") BatchHndlInfo record,
			@Param("example") BatchHndlInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int updateByPrimaryKeySelective(BatchHndlInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table batch_hndl_info
	 * @mbggenerated  Thu May 25 10:03:10 CST 2017
	 */
	int updateByPrimaryKey(BatchHndlInfo record);
}