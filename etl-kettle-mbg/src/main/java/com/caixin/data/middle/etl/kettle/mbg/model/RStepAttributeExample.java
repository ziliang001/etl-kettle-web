package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RStepAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RStepAttributeExample() {
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

        public Criteria andIdStepAttributeIsNull() {
            addCriterion("ID_STEP_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeIsNotNull() {
            addCriterion("ID_STEP_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeEqualTo(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE =", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeNotEqualTo(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE <>", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeGreaterThan(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE >", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE >=", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeLessThan(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE <", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeLessThanOrEqualTo(Long value) {
            addCriterion("ID_STEP_ATTRIBUTE <=", value, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeIn(List<Long> values) {
            addCriterion("ID_STEP_ATTRIBUTE in", values, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeNotIn(List<Long> values) {
            addCriterion("ID_STEP_ATTRIBUTE not in", values, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeBetween(Long value1, Long value2) {
            addCriterion("ID_STEP_ATTRIBUTE between", value1, value2, "idStepAttribute");
            return (Criteria) this;
        }

        public Criteria andIdStepAttributeNotBetween(Long value1, Long value2) {
            addCriterion("ID_STEP_ATTRIBUTE not between", value1, value2, "idStepAttribute");
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

        public Criteria andIdStepIsNull() {
            addCriterion("ID_STEP is null");
            return (Criteria) this;
        }

        public Criteria andIdStepIsNotNull() {
            addCriterion("ID_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepEqualTo(Integer value) {
            addCriterion("ID_STEP =", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotEqualTo(Integer value) {
            addCriterion("ID_STEP <>", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepGreaterThan(Integer value) {
            addCriterion("ID_STEP >", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP >=", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepLessThan(Integer value) {
            addCriterion("ID_STEP <", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP <=", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepIn(List<Integer> values) {
            addCriterion("ID_STEP in", values, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotIn(List<Integer> values) {
            addCriterion("ID_STEP not in", values, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP between", value1, value2, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP not between", value1, value2, "idStep");
            return (Criteria) this;
        }

        public Criteria andNrIsNull() {
            addCriterion("NR is null");
            return (Criteria) this;
        }

        public Criteria andNrIsNotNull() {
            addCriterion("NR is not null");
            return (Criteria) this;
        }

        public Criteria andNrEqualTo(Integer value) {
            addCriterion("NR =", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotEqualTo(Integer value) {
            addCriterion("NR <>", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThan(Integer value) {
            addCriterion("NR >", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThanOrEqualTo(Integer value) {
            addCriterion("NR >=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThan(Integer value) {
            addCriterion("NR <", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThanOrEqualTo(Integer value) {
            addCriterion("NR <=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrIn(List<Integer> values) {
            addCriterion("NR in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotIn(List<Integer> values) {
            addCriterion("NR not in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrBetween(Integer value1, Integer value2) {
            addCriterion("NR between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotBetween(Integer value1, Integer value2) {
            addCriterion("NR not between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andValueNumIsNull() {
            addCriterion("VALUE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andValueNumIsNotNull() {
            addCriterion("VALUE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andValueNumEqualTo(Long value) {
            addCriterion("VALUE_NUM =", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumNotEqualTo(Long value) {
            addCriterion("VALUE_NUM <>", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumGreaterThan(Long value) {
            addCriterion("VALUE_NUM >", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumGreaterThanOrEqualTo(Long value) {
            addCriterion("VALUE_NUM >=", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumLessThan(Long value) {
            addCriterion("VALUE_NUM <", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumLessThanOrEqualTo(Long value) {
            addCriterion("VALUE_NUM <=", value, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumIn(List<Long> values) {
            addCriterion("VALUE_NUM in", values, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumNotIn(List<Long> values) {
            addCriterion("VALUE_NUM not in", values, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumBetween(Long value1, Long value2) {
            addCriterion("VALUE_NUM between", value1, value2, "valueNum");
            return (Criteria) this;
        }

        public Criteria andValueNumNotBetween(Long value1, Long value2) {
            addCriterion("VALUE_NUM not between", value1, value2, "valueNum");
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