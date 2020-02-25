package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RRepositoryLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RRepositoryLogExample() {
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

        public Criteria andIdRepositoryLogIsNull() {
            addCriterion("ID_REPOSITORY_LOG is null");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogIsNotNull() {
            addCriterion("ID_REPOSITORY_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogEqualTo(Long value) {
            addCriterion("ID_REPOSITORY_LOG =", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogNotEqualTo(Long value) {
            addCriterion("ID_REPOSITORY_LOG <>", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogGreaterThan(Long value) {
            addCriterion("ID_REPOSITORY_LOG >", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_REPOSITORY_LOG >=", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogLessThan(Long value) {
            addCriterion("ID_REPOSITORY_LOG <", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogLessThanOrEqualTo(Long value) {
            addCriterion("ID_REPOSITORY_LOG <=", value, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogIn(List<Long> values) {
            addCriterion("ID_REPOSITORY_LOG in", values, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogNotIn(List<Long> values) {
            addCriterion("ID_REPOSITORY_LOG not in", values, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogBetween(Long value1, Long value2) {
            addCriterion("ID_REPOSITORY_LOG between", value1, value2, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andIdRepositoryLogNotBetween(Long value1, Long value2) {
            addCriterion("ID_REPOSITORY_LOG not between", value1, value2, "idRepositoryLog");
            return (Criteria) this;
        }

        public Criteria andRepVersionIsNull() {
            addCriterion("REP_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRepVersionIsNotNull() {
            addCriterion("REP_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRepVersionEqualTo(String value) {
            addCriterion("REP_VERSION =", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionNotEqualTo(String value) {
            addCriterion("REP_VERSION <>", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionGreaterThan(String value) {
            addCriterion("REP_VERSION >", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionGreaterThanOrEqualTo(String value) {
            addCriterion("REP_VERSION >=", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionLessThan(String value) {
            addCriterion("REP_VERSION <", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionLessThanOrEqualTo(String value) {
            addCriterion("REP_VERSION <=", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionLike(String value) {
            addCriterion("REP_VERSION like", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionNotLike(String value) {
            addCriterion("REP_VERSION not like", value, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionIn(List<String> values) {
            addCriterion("REP_VERSION in", values, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionNotIn(List<String> values) {
            addCriterion("REP_VERSION not in", values, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionBetween(String value1, String value2) {
            addCriterion("REP_VERSION between", value1, value2, "repVersion");
            return (Criteria) this;
        }

        public Criteria andRepVersionNotBetween(String value1, String value2) {
            addCriterion("REP_VERSION not between", value1, value2, "repVersion");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("LOG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("LOG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("LOG_DATE =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("LOG_DATE <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("LOG_DATE >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_DATE >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("LOG_DATE <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("LOG_DATE <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("LOG_DATE in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("LOG_DATE not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("LOG_DATE between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("LOG_DATE not between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNull() {
            addCriterion("LOG_USER is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNotNull() {
            addCriterion("LOG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserEqualTo(String value) {
            addCriterion("LOG_USER =", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotEqualTo(String value) {
            addCriterion("LOG_USER <>", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThan(String value) {
            addCriterion("LOG_USER >", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_USER >=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThan(String value) {
            addCriterion("LOG_USER <", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThanOrEqualTo(String value) {
            addCriterion("LOG_USER <=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLike(String value) {
            addCriterion("LOG_USER like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotLike(String value) {
            addCriterion("LOG_USER not like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserIn(List<String> values) {
            addCriterion("LOG_USER in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotIn(List<String> values) {
            addCriterion("LOG_USER not in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserBetween(String value1, String value2) {
            addCriterion("LOG_USER between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotBetween(String value1, String value2) {
            addCriterion("LOG_USER not between", value1, value2, "logUser");
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