package com.hansy.tyly.admin.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGoodsBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGoodsBaseInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsNoIsNull() {
            addCriterion("goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("goods_no like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("goods_no not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionIsNull() {
            addCriterion("goods_ascription is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionIsNotNull() {
            addCriterion("goods_ascription is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionEqualTo(String value) {
            addCriterion("goods_ascription =", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionNotEqualTo(String value) {
            addCriterion("goods_ascription <>", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionGreaterThan(String value) {
            addCriterion("goods_ascription >", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("goods_ascription >=", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionLessThan(String value) {
            addCriterion("goods_ascription <", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionLessThanOrEqualTo(String value) {
            addCriterion("goods_ascription <=", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionLike(String value) {
            addCriterion("goods_ascription like", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionNotLike(String value) {
            addCriterion("goods_ascription not like", value, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionIn(List<String> values) {
            addCriterion("goods_ascription in", values, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionNotIn(List<String> values) {
            addCriterion("goods_ascription not in", values, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionBetween(String value1, String value2) {
            addCriterion("goods_ascription between", value1, value2, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andGoodsAscriptionNotBetween(String value1, String value2) {
            addCriterion("goods_ascription not between", value1, value2, "goodsAscription");
            return (Criteria) this;
        }

        public Criteria andMarketAmtIsNull() {
            addCriterion("market_amt is null");
            return (Criteria) this;
        }

        public Criteria andMarketAmtIsNotNull() {
            addCriterion("market_amt is not null");
            return (Criteria) this;
        }

        public Criteria andMarketAmtEqualTo(BigDecimal value) {
            addCriterion("market_amt =", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtNotEqualTo(BigDecimal value) {
            addCriterion("market_amt <>", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtGreaterThan(BigDecimal value) {
            addCriterion("market_amt >", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_amt >=", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtLessThan(BigDecimal value) {
            addCriterion("market_amt <", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_amt <=", value, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtIn(List<BigDecimal> values) {
            addCriterion("market_amt in", values, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtNotIn(List<BigDecimal> values) {
            addCriterion("market_amt not in", values, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_amt between", value1, value2, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andMarketAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_amt not between", value1, value2, "marketAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtIsNull() {
            addCriterion("retail_amt is null");
            return (Criteria) this;
        }

        public Criteria andRetailAmtIsNotNull() {
            addCriterion("retail_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRetailAmtEqualTo(BigDecimal value) {
            addCriterion("retail_amt =", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtNotEqualTo(BigDecimal value) {
            addCriterion("retail_amt <>", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtGreaterThan(BigDecimal value) {
            addCriterion("retail_amt >", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_amt >=", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtLessThan(BigDecimal value) {
            addCriterion("retail_amt <", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_amt <=", value, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtIn(List<BigDecimal> values) {
            addCriterion("retail_amt in", values, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtNotIn(List<BigDecimal> values) {
            addCriterion("retail_amt not in", values, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_amt between", value1, value2, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andRetailAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_amt not between", value1, value2, "retailAmt");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNull() {
            addCriterion("goods_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIsNotNull() {
            addCriterion("goods_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumEqualTo(Integer value) {
            addCriterion("goods_sale_num =", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotEqualTo(Integer value) {
            addCriterion("goods_sale_num <>", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThan(Integer value) {
            addCriterion("goods_sale_num >", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num >=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThan(Integer value) {
            addCriterion("goods_sale_num <", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_num <=", value, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumIn(List<Integer> values) {
            addCriterion("goods_sale_num in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotIn(List<Integer> values) {
            addCriterion("goods_sale_num not in", values, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_num not between", value1, value2, "goodsSaleNum");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNull() {
            addCriterion("type_no is null");
            return (Criteria) this;
        }

        public Criteria andTypeNoIsNotNull() {
            addCriterion("type_no is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNoEqualTo(String value) {
            addCriterion("type_no =", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotEqualTo(String value) {
            addCriterion("type_no <>", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThan(String value) {
            addCriterion("type_no >", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("type_no >=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThan(String value) {
            addCriterion("type_no <", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLessThanOrEqualTo(String value) {
            addCriterion("type_no <=", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoLike(String value) {
            addCriterion("type_no like", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotLike(String value) {
            addCriterion("type_no not like", value, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoIn(List<String> values) {
            addCriterion("type_no in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotIn(List<String> values) {
            addCriterion("type_no not in", values, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoBetween(String value1, String value2) {
            addCriterion("type_no between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andTypeNoNotBetween(String value1, String value2) {
            addCriterion("type_no not between", value1, value2, "typeNo");
            return (Criteria) this;
        }

        public Criteria andProdInfoIsNull() {
            addCriterion("prod_info is null");
            return (Criteria) this;
        }

        public Criteria andProdInfoIsNotNull() {
            addCriterion("prod_info is not null");
            return (Criteria) this;
        }

        public Criteria andProdInfoEqualTo(String value) {
            addCriterion("prod_info =", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoNotEqualTo(String value) {
            addCriterion("prod_info <>", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoGreaterThan(String value) {
            addCriterion("prod_info >", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_info >=", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoLessThan(String value) {
            addCriterion("prod_info <", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoLessThanOrEqualTo(String value) {
            addCriterion("prod_info <=", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoLike(String value) {
            addCriterion("prod_info like", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoNotLike(String value) {
            addCriterion("prod_info not like", value, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoIn(List<String> values) {
            addCriterion("prod_info in", values, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoNotIn(List<String> values) {
            addCriterion("prod_info not in", values, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoBetween(String value1, String value2) {
            addCriterion("prod_info between", value1, value2, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andProdInfoNotBetween(String value1, String value2) {
            addCriterion("prod_info not between", value1, value2, "prodInfo");
            return (Criteria) this;
        }

        public Criteria andOnDateIsNull() {
            addCriterion("on_date is null");
            return (Criteria) this;
        }

        public Criteria andOnDateIsNotNull() {
            addCriterion("on_date is not null");
            return (Criteria) this;
        }

        public Criteria andOnDateEqualTo(Date value) {
            addCriterion("on_date =", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateNotEqualTo(Date value) {
            addCriterion("on_date <>", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateGreaterThan(Date value) {
            addCriterion("on_date >", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("on_date >=", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateLessThan(Date value) {
            addCriterion("on_date <", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateLessThanOrEqualTo(Date value) {
            addCriterion("on_date <=", value, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateIn(List<Date> values) {
            addCriterion("on_date in", values, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateNotIn(List<Date> values) {
            addCriterion("on_date not in", values, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateBetween(Date value1, Date value2) {
            addCriterion("on_date between", value1, value2, "onDate");
            return (Criteria) this;
        }

        public Criteria andOnDateNotBetween(Date value1, Date value2) {
            addCriterion("on_date not between", value1, value2, "onDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNull() {
            addCriterion("down_date is null");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNotNull() {
            addCriterion("down_date is not null");
            return (Criteria) this;
        }

        public Criteria andDownDateEqualTo(Date value) {
            addCriterion("down_date =", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotEqualTo(Date value) {
            addCriterion("down_date <>", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThan(Date value) {
            addCriterion("down_date >", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThanOrEqualTo(Date value) {
            addCriterion("down_date >=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThan(Date value) {
            addCriterion("down_date <", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThanOrEqualTo(Date value) {
            addCriterion("down_date <=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIn(List<Date> values) {
            addCriterion("down_date in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotIn(List<Date> values) {
            addCriterion("down_date not in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateBetween(Date value1, Date value2) {
            addCriterion("down_date between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotBetween(Date value1, Date value2) {
            addCriterion("down_date not between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andOnStatusIsNull() {
            addCriterion("on_status is null");
            return (Criteria) this;
        }

        public Criteria andOnStatusIsNotNull() {
            addCriterion("on_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnStatusEqualTo(String value) {
            addCriterion("on_status =", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusNotEqualTo(String value) {
            addCriterion("on_status <>", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusGreaterThan(String value) {
            addCriterion("on_status >", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("on_status >=", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusLessThan(String value) {
            addCriterion("on_status <", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusLessThanOrEqualTo(String value) {
            addCriterion("on_status <=", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusLike(String value) {
            addCriterion("on_status like", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusNotLike(String value) {
            addCriterion("on_status not like", value, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusIn(List<String> values) {
            addCriterion("on_status in", values, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusNotIn(List<String> values) {
            addCriterion("on_status not in", values, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusBetween(String value1, String value2) {
            addCriterion("on_status between", value1, value2, "onStatus");
            return (Criteria) this;
        }

        public Criteria andOnStatusNotBetween(String value1, String value2) {
            addCriterion("on_status not between", value1, value2, "onStatus");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoIsNull() {
            addCriterion("mian_pic_file_no is null");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoIsNotNull() {
            addCriterion("mian_pic_file_no is not null");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoEqualTo(Integer value) {
            addCriterion("mian_pic_file_no =", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoNotEqualTo(Integer value) {
            addCriterion("mian_pic_file_no <>", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoGreaterThan(Integer value) {
            addCriterion("mian_pic_file_no >", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mian_pic_file_no >=", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoLessThan(Integer value) {
            addCriterion("mian_pic_file_no <", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoLessThanOrEqualTo(Integer value) {
            addCriterion("mian_pic_file_no <=", value, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoIn(List<Integer> values) {
            addCriterion("mian_pic_file_no in", values, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoNotIn(List<Integer> values) {
            addCriterion("mian_pic_file_no not in", values, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoBetween(Integer value1, Integer value2) {
            addCriterion("mian_pic_file_no between", value1, value2, "mianPicFileNo");
            return (Criteria) this;
        }

        public Criteria andMianPicFileNoNotBetween(Integer value1, Integer value2) {
            addCriterion("mian_pic_file_no not between", value1, value2, "mianPicFileNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}