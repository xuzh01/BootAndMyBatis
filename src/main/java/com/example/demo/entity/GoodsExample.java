package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverIsNull() {
            addCriterion("goods_cover is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverIsNotNull() {
            addCriterion("goods_cover is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverEqualTo(String value) {
            addCriterion("goods_cover =", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverNotEqualTo(String value) {
            addCriterion("goods_cover <>", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverGreaterThan(String value) {
            addCriterion("goods_cover >", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cover >=", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverLessThan(String value) {
            addCriterion("goods_cover <", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverLessThanOrEqualTo(String value) {
            addCriterion("goods_cover <=", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverLike(String value) {
            addCriterion("goods_cover like", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverNotLike(String value) {
            addCriterion("goods_cover not like", value, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverIn(List<String> values) {
            addCriterion("goods_cover in", values, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverNotIn(List<String> values) {
            addCriterion("goods_cover not in", values, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverBetween(String value1, String value2) {
            addCriterion("goods_cover between", value1, value2, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsCoverNotBetween(String value1, String value2) {
            addCriterion("goods_cover not between", value1, value2, "goodsCover");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Float value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Float value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Float value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Float value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Float value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Float> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Float> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Float value1, Float value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Float value1, Float value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIsNull() {
            addCriterion("goods_market_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIsNotNull() {
            addCriterion("goods_market_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceEqualTo(Float value) {
            addCriterion("goods_market_price =", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotEqualTo(Float value) {
            addCriterion("goods_market_price <>", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceGreaterThan(Float value) {
            addCriterion("goods_market_price >", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_market_price >=", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceLessThan(Float value) {
            addCriterion("goods_market_price <", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceLessThanOrEqualTo(Float value) {
            addCriterion("goods_market_price <=", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIn(List<Float> values) {
            addCriterion("goods_market_price in", values, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotIn(List<Float> values) {
            addCriterion("goods_market_price not in", values, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceBetween(Float value1, Float value2) {
            addCriterion("goods_market_price between", value1, value2, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotBetween(Float value1, Float value2) {
            addCriterion("goods_market_price not between", value1, value2, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIsNull() {
            addCriterion("goods_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIsNotNull() {
            addCriterion("goods_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeEqualTo(Date value) {
            addCriterion("goods_create_time =", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotEqualTo(Date value) {
            addCriterion("goods_create_time <>", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeGreaterThan(Date value) {
            addCriterion("goods_create_time >", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_create_time >=", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeLessThan(Date value) {
            addCriterion("goods_create_time <", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_create_time <=", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIn(List<Date> values) {
            addCriterion("goods_create_time in", values, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotIn(List<Date> values) {
            addCriterion("goods_create_time not in", values, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("goods_create_time between", value1, value2, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_create_time not between", value1, value2, "goodsCreateTime");
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

        public Criteria andGoodsStatusEqualTo(Integer value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Integer value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Integer value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Integer value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Integer> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Integer> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Integer value1, Integer value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
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