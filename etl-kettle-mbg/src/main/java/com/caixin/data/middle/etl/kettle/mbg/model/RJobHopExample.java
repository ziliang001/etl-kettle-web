package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RJobHopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RJobHopExample() {
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

        public Criteria andIdJobHopIsNull() {
            addCriterion("ID_JOB_HOP is null");
            return (Criteria) this;
        }

        public Criteria andIdJobHopIsNotNull() {
            addCriterion("ID_JOB_HOP is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobHopEqualTo(Long value) {
            addCriterion("ID_JOB_HOP =", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopNotEqualTo(Long value) {
            addCriterion("ID_JOB_HOP <>", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopGreaterThan(Long value) {
            addCriterion("ID_JOB_HOP >", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOB_HOP >=", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopLessThan(Long value) {
            addCriterion("ID_JOB_HOP <", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOB_HOP <=", value, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopIn(List<Long> values) {
            addCriterion("ID_JOB_HOP in", values, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopNotIn(List<Long> values) {
            addCriterion("ID_JOB_HOP not in", values, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopBetween(Long value1, Long value2) {
            addCriterion("ID_JOB_HOP between", value1, value2, "idJobHop");
            return (Criteria) this;
        }

        public Criteria andIdJobHopNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOB_HOP not between", value1, value2, "idJobHop");
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

        public Criteria andIdJobentryCopyFromIsNull() {
            addCriterion("ID_JOBENTRY_COPY_FROM is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromIsNotNull() {
            addCriterion("ID_JOBENTRY_COPY_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM =", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromNotEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM <>", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromGreaterThan(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM >", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM >=", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromLessThan(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM <", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_FROM <=", value, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_COPY_FROM in", values, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromNotIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_COPY_FROM not in", values, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_COPY_FROM between", value1, value2, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyFromNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_COPY_FROM not between", value1, value2, "idJobentryCopyFrom");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToIsNull() {
            addCriterion("ID_JOBENTRY_COPY_TO is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToIsNotNull() {
            addCriterion("ID_JOBENTRY_COPY_TO is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO =", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToNotEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO <>", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToGreaterThan(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO >", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO >=", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToLessThan(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO <", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_COPY_TO <=", value, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_COPY_TO in", values, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToNotIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_COPY_TO not in", values, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_COPY_TO between", value1, value2, "idJobentryCopyTo");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyToNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_COPY_TO not between", value1, value2, "idJobentryCopyTo");
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

        public Criteria andEvaluationIsNull() {
            addCriterion("EVALUATION is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("EVALUATION is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("EVALUATION =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("EVALUATION <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("EVALUATION >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("EVALUATION <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("EVALUATION like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("EVALUATION not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("EVALUATION in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("EVALUATION not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("EVALUATION between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("EVALUATION not between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andUnconditionalIsNull() {
            addCriterion("UNCONDITIONAL is null");
            return (Criteria) this;
        }

        public Criteria andUnconditionalIsNotNull() {
            addCriterion("UNCONDITIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andUnconditionalEqualTo(String value) {
            addCriterion("UNCONDITIONAL =", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalNotEqualTo(String value) {
            addCriterion("UNCONDITIONAL <>", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalGreaterThan(String value) {
            addCriterion("UNCONDITIONAL >", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalGreaterThanOrEqualTo(String value) {
            addCriterion("UNCONDITIONAL >=", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalLessThan(String value) {
            addCriterion("UNCONDITIONAL <", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalLessThanOrEqualTo(String value) {
            addCriterion("UNCONDITIONAL <=", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalLike(String value) {
            addCriterion("UNCONDITIONAL like", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalNotLike(String value) {
            addCriterion("UNCONDITIONAL not like", value, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalIn(List<String> values) {
            addCriterion("UNCONDITIONAL in", values, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalNotIn(List<String> values) {
            addCriterion("UNCONDITIONAL not in", values, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalBetween(String value1, String value2) {
            addCriterion("UNCONDITIONAL between", value1, value2, "unconditional");
            return (Criteria) this;
        }

        public Criteria andUnconditionalNotBetween(String value1, String value2) {
            addCriterion("UNCONDITIONAL not between", value1, value2, "unconditional");
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