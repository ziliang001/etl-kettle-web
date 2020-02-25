package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RConditionExample() {
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

        public Criteria andIdConditionIsNull() {
            addCriterion("ID_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andIdConditionIsNotNull() {
            addCriterion("ID_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andIdConditionEqualTo(Long value) {
            addCriterion("ID_CONDITION =", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionNotEqualTo(Long value) {
            addCriterion("ID_CONDITION <>", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionGreaterThan(Long value) {
            addCriterion("ID_CONDITION >", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_CONDITION >=", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionLessThan(Long value) {
            addCriterion("ID_CONDITION <", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionLessThanOrEqualTo(Long value) {
            addCriterion("ID_CONDITION <=", value, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionIn(List<Long> values) {
            addCriterion("ID_CONDITION in", values, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionNotIn(List<Long> values) {
            addCriterion("ID_CONDITION not in", values, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionBetween(Long value1, Long value2) {
            addCriterion("ID_CONDITION between", value1, value2, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionNotBetween(Long value1, Long value2) {
            addCriterion("ID_CONDITION not between", value1, value2, "idCondition");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentIsNull() {
            addCriterion("ID_CONDITION_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentIsNotNull() {
            addCriterion("ID_CONDITION_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentEqualTo(Integer value) {
            addCriterion("ID_CONDITION_PARENT =", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentNotEqualTo(Integer value) {
            addCriterion("ID_CONDITION_PARENT <>", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentGreaterThan(Integer value) {
            addCriterion("ID_CONDITION_PARENT >", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_CONDITION_PARENT >=", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentLessThan(Integer value) {
            addCriterion("ID_CONDITION_PARENT <", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentLessThanOrEqualTo(Integer value) {
            addCriterion("ID_CONDITION_PARENT <=", value, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentIn(List<Integer> values) {
            addCriterion("ID_CONDITION_PARENT in", values, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentNotIn(List<Integer> values) {
            addCriterion("ID_CONDITION_PARENT not in", values, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentBetween(Integer value1, Integer value2) {
            addCriterion("ID_CONDITION_PARENT between", value1, value2, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andIdConditionParentNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_CONDITION_PARENT not between", value1, value2, "idConditionParent");
            return (Criteria) this;
        }

        public Criteria andNegatedIsNull() {
            addCriterion("NEGATED is null");
            return (Criteria) this;
        }

        public Criteria andNegatedIsNotNull() {
            addCriterion("NEGATED is not null");
            return (Criteria) this;
        }

        public Criteria andNegatedEqualTo(String value) {
            addCriterion("NEGATED =", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedNotEqualTo(String value) {
            addCriterion("NEGATED <>", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedGreaterThan(String value) {
            addCriterion("NEGATED >", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedGreaterThanOrEqualTo(String value) {
            addCriterion("NEGATED >=", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedLessThan(String value) {
            addCriterion("NEGATED <", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedLessThanOrEqualTo(String value) {
            addCriterion("NEGATED <=", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedLike(String value) {
            addCriterion("NEGATED like", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedNotLike(String value) {
            addCriterion("NEGATED not like", value, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedIn(List<String> values) {
            addCriterion("NEGATED in", values, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedNotIn(List<String> values) {
            addCriterion("NEGATED not in", values, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedBetween(String value1, String value2) {
            addCriterion("NEGATED between", value1, value2, "negated");
            return (Criteria) this;
        }

        public Criteria andNegatedNotBetween(String value1, String value2) {
            addCriterion("NEGATED not between", value1, value2, "negated");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andLeftNameIsNull() {
            addCriterion("LEFT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLeftNameIsNotNull() {
            addCriterion("LEFT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLeftNameEqualTo(String value) {
            addCriterion("LEFT_NAME =", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameNotEqualTo(String value) {
            addCriterion("LEFT_NAME <>", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameGreaterThan(String value) {
            addCriterion("LEFT_NAME >", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEFT_NAME >=", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameLessThan(String value) {
            addCriterion("LEFT_NAME <", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameLessThanOrEqualTo(String value) {
            addCriterion("LEFT_NAME <=", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameLike(String value) {
            addCriterion("LEFT_NAME like", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameNotLike(String value) {
            addCriterion("LEFT_NAME not like", value, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameIn(List<String> values) {
            addCriterion("LEFT_NAME in", values, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameNotIn(List<String> values) {
            addCriterion("LEFT_NAME not in", values, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameBetween(String value1, String value2) {
            addCriterion("LEFT_NAME between", value1, value2, "leftName");
            return (Criteria) this;
        }

        public Criteria andLeftNameNotBetween(String value1, String value2) {
            addCriterion("LEFT_NAME not between", value1, value2, "leftName");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionIsNull() {
            addCriterion("CONDITION_FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionIsNotNull() {
            addCriterion("CONDITION_FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionEqualTo(String value) {
            addCriterion("CONDITION_FUNCTION =", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionNotEqualTo(String value) {
            addCriterion("CONDITION_FUNCTION <>", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionGreaterThan(String value) {
            addCriterion("CONDITION_FUNCTION >", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITION_FUNCTION >=", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionLessThan(String value) {
            addCriterion("CONDITION_FUNCTION <", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionLessThanOrEqualTo(String value) {
            addCriterion("CONDITION_FUNCTION <=", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionLike(String value) {
            addCriterion("CONDITION_FUNCTION like", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionNotLike(String value) {
            addCriterion("CONDITION_FUNCTION not like", value, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionIn(List<String> values) {
            addCriterion("CONDITION_FUNCTION in", values, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionNotIn(List<String> values) {
            addCriterion("CONDITION_FUNCTION not in", values, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionBetween(String value1, String value2) {
            addCriterion("CONDITION_FUNCTION between", value1, value2, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andConditionFunctionNotBetween(String value1, String value2) {
            addCriterion("CONDITION_FUNCTION not between", value1, value2, "conditionFunction");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNull() {
            addCriterion("RIGHT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNotNull() {
            addCriterion("RIGHT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRightNameEqualTo(String value) {
            addCriterion("RIGHT_NAME =", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotEqualTo(String value) {
            addCriterion("RIGHT_NAME <>", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThan(String value) {
            addCriterion("RIGHT_NAME >", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHT_NAME >=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThan(String value) {
            addCriterion("RIGHT_NAME <", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThanOrEqualTo(String value) {
            addCriterion("RIGHT_NAME <=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLike(String value) {
            addCriterion("RIGHT_NAME like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotLike(String value) {
            addCriterion("RIGHT_NAME not like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameIn(List<String> values) {
            addCriterion("RIGHT_NAME in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotIn(List<String> values) {
            addCriterion("RIGHT_NAME not in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameBetween(String value1, String value2) {
            addCriterion("RIGHT_NAME between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotBetween(String value1, String value2) {
            addCriterion("RIGHT_NAME not between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andIdValueRightIsNull() {
            addCriterion("ID_VALUE_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andIdValueRightIsNotNull() {
            addCriterion("ID_VALUE_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andIdValueRightEqualTo(Integer value) {
            addCriterion("ID_VALUE_RIGHT =", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightNotEqualTo(Integer value) {
            addCriterion("ID_VALUE_RIGHT <>", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightGreaterThan(Integer value) {
            addCriterion("ID_VALUE_RIGHT >", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_VALUE_RIGHT >=", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightLessThan(Integer value) {
            addCriterion("ID_VALUE_RIGHT <", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightLessThanOrEqualTo(Integer value) {
            addCriterion("ID_VALUE_RIGHT <=", value, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightIn(List<Integer> values) {
            addCriterion("ID_VALUE_RIGHT in", values, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightNotIn(List<Integer> values) {
            addCriterion("ID_VALUE_RIGHT not in", values, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightBetween(Integer value1, Integer value2) {
            addCriterion("ID_VALUE_RIGHT between", value1, value2, "idValueRight");
            return (Criteria) this;
        }

        public Criteria andIdValueRightNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_VALUE_RIGHT not between", value1, value2, "idValueRight");
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