package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RValueExample() {
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

        public Criteria andIdValueIsNull() {
            addCriterion("ID_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andIdValueIsNotNull() {
            addCriterion("ID_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andIdValueEqualTo(Long value) {
            addCriterion("ID_VALUE =", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotEqualTo(Long value) {
            addCriterion("ID_VALUE <>", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThan(Long value) {
            addCriterion("ID_VALUE >", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_VALUE >=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThan(Long value) {
            addCriterion("ID_VALUE <", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueLessThanOrEqualTo(Long value) {
            addCriterion("ID_VALUE <=", value, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueIn(List<Long> values) {
            addCriterion("ID_VALUE in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotIn(List<Long> values) {
            addCriterion("ID_VALUE not in", values, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueBetween(Long value1, Long value2) {
            addCriterion("ID_VALUE between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andIdValueNotBetween(Long value1, Long value2) {
            addCriterion("ID_VALUE not between", value1, value2, "idValue");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNull() {
            addCriterion("VALUE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNotNull() {
            addCriterion("VALUE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andValueTypeEqualTo(String value) {
            addCriterion("VALUE_TYPE =", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotEqualTo(String value) {
            addCriterion("VALUE_TYPE <>", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThan(String value) {
            addCriterion("VALUE_TYPE >", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_TYPE >=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThan(String value) {
            addCriterion("VALUE_TYPE <", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThanOrEqualTo(String value) {
            addCriterion("VALUE_TYPE <=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLike(String value) {
            addCriterion("VALUE_TYPE like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotLike(String value) {
            addCriterion("VALUE_TYPE not like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeIn(List<String> values) {
            addCriterion("VALUE_TYPE in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotIn(List<String> values) {
            addCriterion("VALUE_TYPE not in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeBetween(String value1, String value2) {
            addCriterion("VALUE_TYPE between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotBetween(String value1, String value2) {
            addCriterion("VALUE_TYPE not between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueStrIsNull() {
            addCriterion("VALUE_STR is null");
            return (Criteria) this;
        }

        public Criteria andValueStrIsNotNull() {
            addCriterion("VALUE_STR is not null");
            return (Criteria) this;
        }

        public Criteria andValueStrEqualTo(String value) {
            addCriterion("VALUE_STR =", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrNotEqualTo(String value) {
            addCriterion("VALUE_STR <>", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrGreaterThan(String value) {
            addCriterion("VALUE_STR >", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_STR >=", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrLessThan(String value) {
            addCriterion("VALUE_STR <", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrLessThanOrEqualTo(String value) {
            addCriterion("VALUE_STR <=", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrLike(String value) {
            addCriterion("VALUE_STR like", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrNotLike(String value) {
            addCriterion("VALUE_STR not like", value, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrIn(List<String> values) {
            addCriterion("VALUE_STR in", values, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrNotIn(List<String> values) {
            addCriterion("VALUE_STR not in", values, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrBetween(String value1, String value2) {
            addCriterion("VALUE_STR between", value1, value2, "valueStr");
            return (Criteria) this;
        }

        public Criteria andValueStrNotBetween(String value1, String value2) {
            addCriterion("VALUE_STR not between", value1, value2, "valueStr");
            return (Criteria) this;
        }

        public Criteria andIsNullIsNull() {
            addCriterion("IS_NULL is null");
            return (Criteria) this;
        }

        public Criteria andIsNullIsNotNull() {
            addCriterion("IS_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andIsNullEqualTo(String value) {
            addCriterion("IS_NULL =", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotEqualTo(String value) {
            addCriterion("IS_NULL <>", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullGreaterThan(String value) {
            addCriterion("IS_NULL >", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NULL >=", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLessThan(String value) {
            addCriterion("IS_NULL <", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLessThanOrEqualTo(String value) {
            addCriterion("IS_NULL <=", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLike(String value) {
            addCriterion("IS_NULL like", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotLike(String value) {
            addCriterion("IS_NULL not like", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullIn(List<String> values) {
            addCriterion("IS_NULL in", values, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotIn(List<String> values) {
            addCriterion("IS_NULL not in", values, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullBetween(String value1, String value2) {
            addCriterion("IS_NULL between", value1, value2, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotBetween(String value1, String value2) {
            addCriterion("IS_NULL not between", value1, value2, "isNull");
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