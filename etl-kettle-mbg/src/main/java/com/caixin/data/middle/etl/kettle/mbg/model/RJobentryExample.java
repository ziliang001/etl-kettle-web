package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RJobentryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RJobentryExample() {
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

        public Criteria andIdJobentryIsNull() {
            addCriterion("ID_JOBENTRY is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryIsNotNull() {
            addCriterion("ID_JOBENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryEqualTo(Long value) {
            addCriterion("ID_JOBENTRY =", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotEqualTo(Long value) {
            addCriterion("ID_JOBENTRY <>", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryGreaterThan(Long value) {
            addCriterion("ID_JOBENTRY >", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOBENTRY >=", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryLessThan(Long value) {
            addCriterion("ID_JOBENTRY <", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOBENTRY <=", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryIn(List<Long> values) {
            addCriterion("ID_JOBENTRY in", values, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotIn(List<Long> values) {
            addCriterion("ID_JOBENTRY not in", values, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryBetween(Long value1, Long value2) {
            addCriterion("ID_JOBENTRY between", value1, value2, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOBENTRY not between", value1, value2, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobIsNull() {
            addCriterion("ID_JOB is null");
            return (Criteria) this;
        }

        public Criteria andIdJobIsNotNull() {
            addCriterion("ID_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobEqualTo(Integer value) {
            addCriterion("ID_JOB =", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotEqualTo(Integer value) {
            addCriterion("ID_JOB <>", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThan(Integer value) {
            addCriterion("ID_JOB >", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOB >=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThan(Integer value) {
            addCriterion("ID_JOB <", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOB <=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobIn(List<Integer> values) {
            addCriterion("ID_JOB in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotIn(List<Integer> values) {
            addCriterion("ID_JOB not in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOB between", value1, value2, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOB not between", value1, value2, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIsNull() {
            addCriterion("ID_JOBENTRY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIsNotNull() {
            addCriterion("ID_JOBENTRY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE =", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <>", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeGreaterThan(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE >", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE >=", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeLessThan(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <=", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_TYPE in", values, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_TYPE not in", values, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_TYPE between", value1, value2, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_TYPE not between", value1, value2, "idJobentryType");
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