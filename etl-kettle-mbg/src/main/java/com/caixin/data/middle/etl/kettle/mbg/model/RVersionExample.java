package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RVersionExample() {
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

        public Criteria andIdVersionIsNull() {
            addCriterion("ID_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andIdVersionIsNotNull() {
            addCriterion("ID_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andIdVersionEqualTo(Long value) {
            addCriterion("ID_VERSION =", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionNotEqualTo(Long value) {
            addCriterion("ID_VERSION <>", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionGreaterThan(Long value) {
            addCriterion("ID_VERSION >", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_VERSION >=", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionLessThan(Long value) {
            addCriterion("ID_VERSION <", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionLessThanOrEqualTo(Long value) {
            addCriterion("ID_VERSION <=", value, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionIn(List<Long> values) {
            addCriterion("ID_VERSION in", values, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionNotIn(List<Long> values) {
            addCriterion("ID_VERSION not in", values, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionBetween(Long value1, Long value2) {
            addCriterion("ID_VERSION between", value1, value2, "idVersion");
            return (Criteria) this;
        }

        public Criteria andIdVersionNotBetween(Long value1, Long value2) {
            addCriterion("ID_VERSION not between", value1, value2, "idVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionIsNull() {
            addCriterion("MAJOR_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMajorVersionIsNotNull() {
            addCriterion("MAJOR_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMajorVersionEqualTo(Integer value) {
            addCriterion("MAJOR_VERSION =", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionNotEqualTo(Integer value) {
            addCriterion("MAJOR_VERSION <>", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionGreaterThan(Integer value) {
            addCriterion("MAJOR_VERSION >", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAJOR_VERSION >=", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionLessThan(Integer value) {
            addCriterion("MAJOR_VERSION <", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionLessThanOrEqualTo(Integer value) {
            addCriterion("MAJOR_VERSION <=", value, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionIn(List<Integer> values) {
            addCriterion("MAJOR_VERSION in", values, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionNotIn(List<Integer> values) {
            addCriterion("MAJOR_VERSION not in", values, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionBetween(Integer value1, Integer value2) {
            addCriterion("MAJOR_VERSION between", value1, value2, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMajorVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("MAJOR_VERSION not between", value1, value2, "majorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionIsNull() {
            addCriterion("MINOR_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMinorVersionIsNotNull() {
            addCriterion("MINOR_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMinorVersionEqualTo(Integer value) {
            addCriterion("MINOR_VERSION =", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionNotEqualTo(Integer value) {
            addCriterion("MINOR_VERSION <>", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionGreaterThan(Integer value) {
            addCriterion("MINOR_VERSION >", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("MINOR_VERSION >=", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionLessThan(Integer value) {
            addCriterion("MINOR_VERSION <", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionLessThanOrEqualTo(Integer value) {
            addCriterion("MINOR_VERSION <=", value, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionIn(List<Integer> values) {
            addCriterion("MINOR_VERSION in", values, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionNotIn(List<Integer> values) {
            addCriterion("MINOR_VERSION not in", values, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionBetween(Integer value1, Integer value2) {
            addCriterion("MINOR_VERSION between", value1, value2, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andMinorVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("MINOR_VERSION not between", value1, value2, "minorVersion");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateIsNull() {
            addCriterion("UPGRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateIsNotNull() {
            addCriterion("UPGRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateEqualTo(Date value) {
            addCriterion("UPGRADE_DATE =", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateNotEqualTo(Date value) {
            addCriterion("UPGRADE_DATE <>", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateGreaterThan(Date value) {
            addCriterion("UPGRADE_DATE >", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPGRADE_DATE >=", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateLessThan(Date value) {
            addCriterion("UPGRADE_DATE <", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateLessThanOrEqualTo(Date value) {
            addCriterion("UPGRADE_DATE <=", value, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateIn(List<Date> values) {
            addCriterion("UPGRADE_DATE in", values, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateNotIn(List<Date> values) {
            addCriterion("UPGRADE_DATE not in", values, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateBetween(Date value1, Date value2) {
            addCriterion("UPGRADE_DATE between", value1, value2, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andUpgradeDateNotBetween(Date value1, Date value2) {
            addCriterion("UPGRADE_DATE not between", value1, value2, "upgradeDate");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIsNull() {
            addCriterion("IS_UPGRADE is null");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIsNotNull() {
            addCriterion("IS_UPGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeEqualTo(String value) {
            addCriterion("IS_UPGRADE =", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotEqualTo(String value) {
            addCriterion("IS_UPGRADE <>", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeGreaterThan(String value) {
            addCriterion("IS_UPGRADE >", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UPGRADE >=", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLessThan(String value) {
            addCriterion("IS_UPGRADE <", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLessThanOrEqualTo(String value) {
            addCriterion("IS_UPGRADE <=", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLike(String value) {
            addCriterion("IS_UPGRADE like", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotLike(String value) {
            addCriterion("IS_UPGRADE not like", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIn(List<String> values) {
            addCriterion("IS_UPGRADE in", values, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotIn(List<String> values) {
            addCriterion("IS_UPGRADE not in", values, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeBetween(String value1, String value2) {
            addCriterion("IS_UPGRADE between", value1, value2, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotBetween(String value1, String value2) {
            addCriterion("IS_UPGRADE not between", value1, value2, "isUpgrade");
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