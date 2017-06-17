package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.RepaymentFinanceBatch;
import com.ut.scf.pojo.auto.RepaymentFinanceBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentFinanceBatchMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int countByExample(RepaymentFinanceBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int deleteByExample(RepaymentFinanceBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int deleteByPrimaryKey(String recUid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int insert(RepaymentFinanceBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int insertSelective(RepaymentFinanceBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	List<RepaymentFinanceBatch> selectByExample(
			RepaymentFinanceBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	RepaymentFinanceBatch selectByPrimaryKey(String recUid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RepaymentFinanceBatch record,
			@Param("example") RepaymentFinanceBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int updateByExample(@Param("record") RepaymentFinanceBatch record,
			@Param("example") RepaymentFinanceBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int updateByPrimaryKeySelective(RepaymentFinanceBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table repayment_finance_batch
	 * @mbggenerated  Sat Jun 10 10:51:56 CST 2017
	 */
	int updateByPrimaryKey(RepaymentFinanceBatch record);
}