package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class QrtzPausedTriggerGrpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QrtzPausedTriggerGrpsExample() {
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

        public Criteria andSchedNameIsNull() {
            addCriterion("SCHED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchedNameIsNotNull() {
            addCriterion("SCHED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchedNameEqualTo(String value) {
            addCriterion("SCHED_NAME =", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotEqualTo(String value) {
            addCriterion("SCHED_NAME <>", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameGreaterThan(String value) {
            addCriterion("SCHED_NAME >", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHED_NAME >=", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLessThan(String value) {
            addCriterion("SCHED_NAME <", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLessThanOrEqualTo(String value) {
            addCriterion("SCHED_NAME <=", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameLike(String value) {
            addCriterion("SCHED_NAME like", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotLike(String value) {
            addCriterion("SCHED_NAME not like", value, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameIn(List<String> values) {
            addCriterion("SCHED_NAME in", values, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotIn(List<String> values) {
            addCriterion("SCHED_NAME not in", values, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameBetween(String value1, String value2) {
            addCriterion("SCHED_NAME between", value1, value2, "schedName");
            return (Criteria) this;
        }

        public Criteria andSchedNameNotBetween(String value1, String value2) {
            addCriterion("SCHED_NAME not between", value1, value2, "schedName");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIsNull() {
            addCriterion("TRIGGER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIsNotNull() {
            addCriterion("TRIGGER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupEqualTo(String value) {
            addCriterion("TRIGGER_GROUP =", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotEqualTo(String value) {
            addCriterion("TRIGGER_GROUP <>", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupGreaterThan(String value) {
            addCriterion("TRIGGER_GROUP >", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_GROUP >=", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLessThan(String value) {
            addCriterion("TRIGGER_GROUP <", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_GROUP <=", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupLike(String value) {
            addCriterion("TRIGGER_GROUP like", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotLike(String value) {
            addCriterion("TRIGGER_GROUP not like", value, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupIn(List<String> values) {
            addCriterion("TRIGGER_GROUP in", values, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotIn(List<String> values) {
            addCriterion("TRIGGER_GROUP not in", values, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupBetween(String value1, String value2) {
            addCriterion("TRIGGER_GROUP between", value1, value2, "triggerGroup");
            return (Criteria) this;
        }

        public Criteria andTriggerGroupNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_GROUP not between", value1, value2, "triggerGroup");
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