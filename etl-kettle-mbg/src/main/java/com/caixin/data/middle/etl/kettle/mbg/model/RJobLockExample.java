package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RJobLockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RJobLockExample() {
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

        public Criteria andIdJobLockIsNull() {
            addCriterion("ID_JOB_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andIdJobLockIsNotNull() {
            addCriterion("ID_JOB_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobLockEqualTo(Long value) {
            addCriterion("ID_JOB_LOCK =", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockNotEqualTo(Long value) {
            addCriterion("ID_JOB_LOCK <>", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockGreaterThan(Long value) {
            addCriterion("ID_JOB_LOCK >", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOB_LOCK >=", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockLessThan(Long value) {
            addCriterion("ID_JOB_LOCK <", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOB_LOCK <=", value, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockIn(List<Long> values) {
            addCriterion("ID_JOB_LOCK in", values, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockNotIn(List<Long> values) {
            addCriterion("ID_JOB_LOCK not in", values, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockBetween(Long value1, Long value2) {
            addCriterion("ID_JOB_LOCK between", value1, value2, "idJobLock");
            return (Criteria) this;
        }

        public Criteria andIdJobLockNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOB_LOCK not between", value1, value2, "idJobLock");
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

        public Criteria andIdUserIsNull() {
            addCriterion("ID_USER is null");
            return (Criteria) this;
        }

        public Criteria andIdUserIsNotNull() {
            addCriterion("ID_USER is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserEqualTo(Integer value) {
            addCriterion("ID_USER =", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotEqualTo(Integer value) {
            addCriterion("ID_USER <>", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThan(Integer value) {
            addCriterion("ID_USER >", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_USER >=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThan(Integer value) {
            addCriterion("ID_USER <", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThanOrEqualTo(Integer value) {
            addCriterion("ID_USER <=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserIn(List<Integer> values) {
            addCriterion("ID_USER in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotIn(List<Integer> values) {
            addCriterion("ID_USER not in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER not between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
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