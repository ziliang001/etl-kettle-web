package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RStepTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RStepTypeExample() {
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

        public Criteria andIdStepTypeIsNull() {
            addCriterion("ID_STEP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeIsNotNull() {
            addCriterion("ID_STEP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeEqualTo(Long value) {
            addCriterion("ID_STEP_TYPE =", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotEqualTo(Long value) {
            addCriterion("ID_STEP_TYPE <>", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeGreaterThan(Long value) {
            addCriterion("ID_STEP_TYPE >", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_STEP_TYPE >=", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeLessThan(Long value) {
            addCriterion("ID_STEP_TYPE <", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeLessThanOrEqualTo(Long value) {
            addCriterion("ID_STEP_TYPE <=", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeIn(List<Long> values) {
            addCriterion("ID_STEP_TYPE in", values, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotIn(List<Long> values) {
            addCriterion("ID_STEP_TYPE not in", values, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeBetween(Long value1, Long value2) {
            addCriterion("ID_STEP_TYPE between", value1, value2, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotBetween(Long value1, Long value2) {
            addCriterion("ID_STEP_TYPE not between", value1, value2, "idStepType");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andHelptextIsNull() {
            addCriterion("HELPTEXT is null");
            return (Criteria) this;
        }

        public Criteria andHelptextIsNotNull() {
            addCriterion("HELPTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andHelptextEqualTo(String value) {
            addCriterion("HELPTEXT =", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextNotEqualTo(String value) {
            addCriterion("HELPTEXT <>", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextGreaterThan(String value) {
            addCriterion("HELPTEXT >", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextGreaterThanOrEqualTo(String value) {
            addCriterion("HELPTEXT >=", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextLessThan(String value) {
            addCriterion("HELPTEXT <", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextLessThanOrEqualTo(String value) {
            addCriterion("HELPTEXT <=", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextLike(String value) {
            addCriterion("HELPTEXT like", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextNotLike(String value) {
            addCriterion("HELPTEXT not like", value, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextIn(List<String> values) {
            addCriterion("HELPTEXT in", values, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextNotIn(List<String> values) {
            addCriterion("HELPTEXT not in", values, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextBetween(String value1, String value2) {
            addCriterion("HELPTEXT between", value1, value2, "helptext");
            return (Criteria) this;
        }

        public Criteria andHelptextNotBetween(String value1, String value2) {
            addCriterion("HELPTEXT not between", value1, value2, "helptext");
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