package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RTransHopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RTransHopExample() {
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

        public Criteria andIdTransHopIsNull() {
            addCriterion("ID_TRANS_HOP is null");
            return (Criteria) this;
        }

        public Criteria andIdTransHopIsNotNull() {
            addCriterion("ID_TRANS_HOP is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransHopEqualTo(Long value) {
            addCriterion("ID_TRANS_HOP =", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopNotEqualTo(Long value) {
            addCriterion("ID_TRANS_HOP <>", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopGreaterThan(Long value) {
            addCriterion("ID_TRANS_HOP >", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TRANS_HOP >=", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopLessThan(Long value) {
            addCriterion("ID_TRANS_HOP <", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopLessThanOrEqualTo(Long value) {
            addCriterion("ID_TRANS_HOP <=", value, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopIn(List<Long> values) {
            addCriterion("ID_TRANS_HOP in", values, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopNotIn(List<Long> values) {
            addCriterion("ID_TRANS_HOP not in", values, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopBetween(Long value1, Long value2) {
            addCriterion("ID_TRANS_HOP between", value1, value2, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransHopNotBetween(Long value1, Long value2) {
            addCriterion("ID_TRANS_HOP not between", value1, value2, "idTransHop");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIsNull() {
            addCriterion("ID_TRANSFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIsNotNull() {
            addCriterion("ID_TRANSFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION =", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION <>", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThan(Integer value) {
            addCriterion("ID_TRANSFORMATION >", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION >=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThan(Integer value) {
            addCriterion("ID_TRANSFORMATION <", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThanOrEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION <=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIn(List<Integer> values) {
            addCriterion("ID_TRANSFORMATION in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotIn(List<Integer> values) {
            addCriterion("ID_TRANSFORMATION not in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationBetween(Integer value1, Integer value2) {
            addCriterion("ID_TRANSFORMATION between", value1, value2, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_TRANSFORMATION not between", value1, value2, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdStepFromIsNull() {
            addCriterion("ID_STEP_FROM is null");
            return (Criteria) this;
        }

        public Criteria andIdStepFromIsNotNull() {
            addCriterion("ID_STEP_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepFromEqualTo(Integer value) {
            addCriterion("ID_STEP_FROM =", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromNotEqualTo(Integer value) {
            addCriterion("ID_STEP_FROM <>", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromGreaterThan(Integer value) {
            addCriterion("ID_STEP_FROM >", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_FROM >=", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromLessThan(Integer value) {
            addCriterion("ID_STEP_FROM <", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_FROM <=", value, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromIn(List<Integer> values) {
            addCriterion("ID_STEP_FROM in", values, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromNotIn(List<Integer> values) {
            addCriterion("ID_STEP_FROM not in", values, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_FROM between", value1, value2, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepFromNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_FROM not between", value1, value2, "idStepFrom");
            return (Criteria) this;
        }

        public Criteria andIdStepToIsNull() {
            addCriterion("ID_STEP_TO is null");
            return (Criteria) this;
        }

        public Criteria andIdStepToIsNotNull() {
            addCriterion("ID_STEP_TO is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepToEqualTo(Integer value) {
            addCriterion("ID_STEP_TO =", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToNotEqualTo(Integer value) {
            addCriterion("ID_STEP_TO <>", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToGreaterThan(Integer value) {
            addCriterion("ID_STEP_TO >", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_TO >=", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToLessThan(Integer value) {
            addCriterion("ID_STEP_TO <", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_TO <=", value, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToIn(List<Integer> values) {
            addCriterion("ID_STEP_TO in", values, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToNotIn(List<Integer> values) {
            addCriterion("ID_STEP_TO not in", values, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_TO between", value1, value2, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andIdStepToNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_TO not between", value1, value2, "idStepTo");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
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