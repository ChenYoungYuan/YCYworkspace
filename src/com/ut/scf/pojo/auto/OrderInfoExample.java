package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public OrderInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andOrderIdIsNull() {
			addCriterion("order_id is null");
			return (Criteria) this;
		}

		public Criteria andOrderIdIsNotNull() {
			addCriterion("order_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrderIdEqualTo(String value) {
			addCriterion("order_id =", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotEqualTo(String value) {
			addCriterion("order_id <>", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThan(String value) {
			addCriterion("order_id >", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
			addCriterion("order_id >=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThan(String value) {
			addCriterion("order_id <", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThanOrEqualTo(String value) {
			addCriterion("order_id <=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLike(String value) {
			addCriterion("order_id like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotLike(String value) {
			addCriterion("order_id not like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdIn(List<String> values) {
			addCriterion("order_id in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotIn(List<String> values) {
			addCriterion("order_id not in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdBetween(String value1, String value2) {
			addCriterion("order_id between", value1, value2, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotBetween(String value1, String value2) {
			addCriterion("order_id not between", value1, value2, "orderId");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(String value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(String value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(String value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(String value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(String value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(String value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLike(String value) {
			addCriterion("product_id like", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotLike(String value) {
			addCriterion("product_id not like", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<String> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<String> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(String value1, String value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(String value1, String value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2,
					"productName");
			return (Criteria) this;
		}

		public Criteria andProductAmtIsNull() {
			addCriterion("product_amt is null");
			return (Criteria) this;
		}

		public Criteria andProductAmtIsNotNull() {
			addCriterion("product_amt is not null");
			return (Criteria) this;
		}

		public Criteria andProductAmtEqualTo(BigDecimal value) {
			addCriterion("product_amt =", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtNotEqualTo(BigDecimal value) {
			addCriterion("product_amt <>", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtGreaterThan(BigDecimal value) {
			addCriterion("product_amt >", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("product_amt >=", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtLessThan(BigDecimal value) {
			addCriterion("product_amt <", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtLessThanOrEqualTo(BigDecimal value) {
			addCriterion("product_amt <=", value, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtIn(List<BigDecimal> values) {
			addCriterion("product_amt in", values, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtNotIn(List<BigDecimal> values) {
			addCriterion("product_amt not in", values, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("product_amt between", value1, value2, "productAmt");
			return (Criteria) this;
		}

		public Criteria andProductAmtNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("product_amt not between", value1, value2,
					"productAmt");
			return (Criteria) this;
		}

		public Criteria andPeriodIsNull() {
			addCriterion("period is null");
			return (Criteria) this;
		}

		public Criteria andPeriodIsNotNull() {
			addCriterion("period is not null");
			return (Criteria) this;
		}

		public Criteria andPeriodEqualTo(Byte value) {
			addCriterion("period =", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotEqualTo(Byte value) {
			addCriterion("period <>", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodGreaterThan(Byte value) {
			addCriterion("period >", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodGreaterThanOrEqualTo(Byte value) {
			addCriterion("period >=", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodLessThan(Byte value) {
			addCriterion("period <", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodLessThanOrEqualTo(Byte value) {
			addCriterion("period <=", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodIn(List<Byte> values) {
			addCriterion("period in", values, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotIn(List<Byte> values) {
			addCriterion("period not in", values, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodBetween(Byte value1, Byte value2) {
			addCriterion("period between", value1, value2, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotBetween(Byte value1, Byte value2) {
			addCriterion("period not between", value1, value2, "period");
			return (Criteria) this;
		}

		public Criteria andLoanIsNull() {
			addCriterion("loan is null");
			return (Criteria) this;
		}

		public Criteria andLoanIsNotNull() {
			addCriterion("loan is not null");
			return (Criteria) this;
		}

		public Criteria andLoanEqualTo(BigDecimal value) {
			addCriterion("loan =", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanNotEqualTo(BigDecimal value) {
			addCriterion("loan <>", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanGreaterThan(BigDecimal value) {
			addCriterion("loan >", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("loan >=", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanLessThan(BigDecimal value) {
			addCriterion("loan <", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanLessThanOrEqualTo(BigDecimal value) {
			addCriterion("loan <=", value, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanIn(List<BigDecimal> values) {
			addCriterion("loan in", values, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanNotIn(List<BigDecimal> values) {
			addCriterion("loan not in", values, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("loan between", value1, value2, "loan");
			return (Criteria) this;
		}

		public Criteria andLoanNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("loan not between", value1, value2, "loan");
			return (Criteria) this;
		}

		public Criteria andSellerIdIsNull() {
			addCriterion("seller_id is null");
			return (Criteria) this;
		}

		public Criteria andSellerIdIsNotNull() {
			addCriterion("seller_id is not null");
			return (Criteria) this;
		}

		public Criteria andSellerIdEqualTo(String value) {
			addCriterion("seller_id =", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdNotEqualTo(String value) {
			addCriterion("seller_id <>", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdGreaterThan(String value) {
			addCriterion("seller_id >", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
			addCriterion("seller_id >=", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdLessThan(String value) {
			addCriterion("seller_id <", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdLessThanOrEqualTo(String value) {
			addCriterion("seller_id <=", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdLike(String value) {
			addCriterion("seller_id like", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdNotLike(String value) {
			addCriterion("seller_id not like", value, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdIn(List<String> values) {
			addCriterion("seller_id in", values, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdNotIn(List<String> values) {
			addCriterion("seller_id not in", values, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdBetween(String value1, String value2) {
			addCriterion("seller_id between", value1, value2, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerIdNotBetween(String value1, String value2) {
			addCriterion("seller_id not between", value1, value2, "sellerId");
			return (Criteria) this;
		}

		public Criteria andSellerNameIsNull() {
			addCriterion("seller_name is null");
			return (Criteria) this;
		}

		public Criteria andSellerNameIsNotNull() {
			addCriterion("seller_name is not null");
			return (Criteria) this;
		}

		public Criteria andSellerNameEqualTo(String value) {
			addCriterion("seller_name =", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameNotEqualTo(String value) {
			addCriterion("seller_name <>", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameGreaterThan(String value) {
			addCriterion("seller_name >", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
			addCriterion("seller_name >=", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameLessThan(String value) {
			addCriterion("seller_name <", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameLessThanOrEqualTo(String value) {
			addCriterion("seller_name <=", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameLike(String value) {
			addCriterion("seller_name like", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameNotLike(String value) {
			addCriterion("seller_name not like", value, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameIn(List<String> values) {
			addCriterion("seller_name in", values, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameNotIn(List<String> values) {
			addCriterion("seller_name not in", values, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameBetween(String value1, String value2) {
			addCriterion("seller_name between", value1, value2, "sellerName");
			return (Criteria) this;
		}

		public Criteria andSellerNameNotBetween(String value1, String value2) {
			addCriterion("seller_name not between", value1, value2,
					"sellerName");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtIsNull() {
			addCriterion("cr_req_amt is null");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtIsNotNull() {
			addCriterion("cr_req_amt is not null");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtEqualTo(BigDecimal value) {
			addCriterion("cr_req_amt =", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtNotEqualTo(BigDecimal value) {
			addCriterion("cr_req_amt <>", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtGreaterThan(BigDecimal value) {
			addCriterion("cr_req_amt >", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("cr_req_amt >=", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtLessThan(BigDecimal value) {
			addCriterion("cr_req_amt <", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtLessThanOrEqualTo(BigDecimal value) {
			addCriterion("cr_req_amt <=", value, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtIn(List<BigDecimal> values) {
			addCriterion("cr_req_amt in", values, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtNotIn(List<BigDecimal> values) {
			addCriterion("cr_req_amt not in", values, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("cr_req_amt between", value1, value2, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andCrReqAmtNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("cr_req_amt not between", value1, value2, "crReqAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtIsNull() {
			addCriterion("start_pay_amt is null");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtIsNotNull() {
			addCriterion("start_pay_amt is not null");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtEqualTo(BigDecimal value) {
			addCriterion("start_pay_amt =", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtNotEqualTo(BigDecimal value) {
			addCriterion("start_pay_amt <>", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtGreaterThan(BigDecimal value) {
			addCriterion("start_pay_amt >", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("start_pay_amt >=", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtLessThan(BigDecimal value) {
			addCriterion("start_pay_amt <", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtLessThanOrEqualTo(BigDecimal value) {
			addCriterion("start_pay_amt <=", value, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtIn(List<BigDecimal> values) {
			addCriterion("start_pay_amt in", values, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtNotIn(List<BigDecimal> values) {
			addCriterion("start_pay_amt not in", values, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("start_pay_amt between", value1, value2, "startPayAmt");
			return (Criteria) this;
		}

		public Criteria andStartPayAmtNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("start_pay_amt not between", value1, value2,
					"startPayAmt");
			return (Criteria) this;
		}

		public Criteria andPayMIsNull() {
			addCriterion("pay_m is null");
			return (Criteria) this;
		}

		public Criteria andPayMIsNotNull() {
			addCriterion("pay_m is not null");
			return (Criteria) this;
		}

		public Criteria andPayMEqualTo(BigDecimal value) {
			addCriterion("pay_m =", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMNotEqualTo(BigDecimal value) {
			addCriterion("pay_m <>", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMGreaterThan(BigDecimal value) {
			addCriterion("pay_m >", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("pay_m >=", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMLessThan(BigDecimal value) {
			addCriterion("pay_m <", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMLessThanOrEqualTo(BigDecimal value) {
			addCriterion("pay_m <=", value, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMIn(List<BigDecimal> values) {
			addCriterion("pay_m in", values, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMNotIn(List<BigDecimal> values) {
			addCriterion("pay_m not in", values, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pay_m between", value1, value2, "payM");
			return (Criteria) this;
		}

		public Criteria andPayMNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pay_m not between", value1, value2, "payM");
			return (Criteria) this;
		}

		public Criteria andStartPayDayIsNull() {
			addCriterion("start_pay_day is null");
			return (Criteria) this;
		}

		public Criteria andStartPayDayIsNotNull() {
			addCriterion("start_pay_day is not null");
			return (Criteria) this;
		}

		public Criteria andStartPayDayEqualTo(Date value) {
			addCriterionForJDBCDate("start_pay_day =", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("start_pay_day <>", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayGreaterThan(Date value) {
			addCriterionForJDBCDate("start_pay_day >", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_pay_day >=", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayLessThan(Date value) {
			addCriterionForJDBCDate("start_pay_day <", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_pay_day <=", value, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayIn(List<Date> values) {
			addCriterionForJDBCDate("start_pay_day in", values, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("start_pay_day not in", values,
					"startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_pay_day between", value1, value2,
					"startPayDay");
			return (Criteria) this;
		}

		public Criteria andStartPayDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_pay_day not between", value1,
					value2, "startPayDay");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIsNull() {
			addCriterion("order_status is null");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIsNotNull() {
			addCriterion("order_status is not null");
			return (Criteria) this;
		}

		public Criteria andOrderStatusEqualTo(Byte value) {
			addCriterion("order_status =", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotEqualTo(Byte value) {
			addCriterion("order_status <>", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusGreaterThan(Byte value) {
			addCriterion("order_status >", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("order_status >=", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusLessThan(Byte value) {
			addCriterion("order_status <", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
			addCriterion("order_status <=", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIn(List<Byte> values) {
			addCriterion("order_status in", values, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotIn(List<Byte> values) {
			addCriterion("order_status not in", values, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
			addCriterion("order_status between", value1, value2, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("order_status not between", value1, value2,
					"orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdIsNull() {
			addCriterion("order_batch_id is null");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdIsNotNull() {
			addCriterion("order_batch_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdEqualTo(String value) {
			addCriterion("order_batch_id =", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdNotEqualTo(String value) {
			addCriterion("order_batch_id <>", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdGreaterThan(String value) {
			addCriterion("order_batch_id >", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdGreaterThanOrEqualTo(String value) {
			addCriterion("order_batch_id >=", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdLessThan(String value) {
			addCriterion("order_batch_id <", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdLessThanOrEqualTo(String value) {
			addCriterion("order_batch_id <=", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdLike(String value) {
			addCriterion("order_batch_id like", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdNotLike(String value) {
			addCriterion("order_batch_id not like", value, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdIn(List<String> values) {
			addCriterion("order_batch_id in", values, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdNotIn(List<String> values) {
			addCriterion("order_batch_id not in", values, "orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdBetween(String value1, String value2) {
			addCriterion("order_batch_id between", value1, value2,
					"orderBatchId");
			return (Criteria) this;
		}

		public Criteria andOrderBatchIdNotBetween(String value1, String value2) {
			addCriterion("order_batch_id not between", value1, value2,
					"orderBatchId");
			return (Criteria) this;
		}

		public Criteria andStuIdIsNull() {
			addCriterion("stu_id is null");
			return (Criteria) this;
		}

		public Criteria andStuIdIsNotNull() {
			addCriterion("stu_id is not null");
			return (Criteria) this;
		}

		public Criteria andStuIdEqualTo(String value) {
			addCriterion("stu_id =", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotEqualTo(String value) {
			addCriterion("stu_id <>", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdGreaterThan(String value) {
			addCriterion("stu_id >", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdGreaterThanOrEqualTo(String value) {
			addCriterion("stu_id >=", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdLessThan(String value) {
			addCriterion("stu_id <", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdLessThanOrEqualTo(String value) {
			addCriterion("stu_id <=", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdLike(String value) {
			addCriterion("stu_id like", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotLike(String value) {
			addCriterion("stu_id not like", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdIn(List<String> values) {
			addCriterion("stu_id in", values, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotIn(List<String> values) {
			addCriterion("stu_id not in", values, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdBetween(String value1, String value2) {
			addCriterion("stu_id between", value1, value2, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotBetween(String value1, String value2) {
			addCriterion("stu_id not between", value1, value2, "stuId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table order_info
	 * @mbggenerated  Mon Jun 12 17:31:18 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbggenerated do_not_delete_during_merge Tue May 23 19:56:24 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}