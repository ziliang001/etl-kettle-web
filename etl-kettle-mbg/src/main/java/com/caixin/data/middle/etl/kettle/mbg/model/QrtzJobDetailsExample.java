package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class QrtzJobDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QrtzJobDetailsExample() {
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

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("JOB_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("JOB_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("JOB_GROUP =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("JOB_GROUP <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("JOB_GROUP >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("JOB_GROUP <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("JOB_GROUP like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("JOB_GROUP not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("JOB_GROUP in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("JOB_GROUP not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("JOB_GROUP between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("JOB_GROUP not between", value1, value2, "jobGroup");
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

        public Criteria andJobClassNameIsNull() {
            addCriterion("JOB_CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobClassNameIsNotNull() {
            addCriterion("JOB_CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassNameEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME =", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <>", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameGreaterThan(String value) {
            addCriterion("JOB_CLASS_NAME >", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME >=", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLessThan(String value) {
            addCriterion("JOB_CLASS_NAME <", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <=", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLike(String value) {
            addCriterion("JOB_CLASS_NAME like", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotLike(String value) {
            addCriterion("JOB_CLASS_NAME not like", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME in", values, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME not in", values, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME between", value1, value2, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME not between", value1, value2, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andIsDurableIsNull() {
            addCriterion("IS_DURABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsDurableIsNotNull() {
            addCriterion("IS_DURABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDurableEqualTo(String value) {
            addCriterion("IS_DURABLE =", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableNotEqualTo(String value) {
            addCriterion("IS_DURABLE <>", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableGreaterThan(String value) {
            addCriterion("IS_DURABLE >", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DURABLE >=", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableLessThan(String value) {
            addCriterion("IS_DURABLE <", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableLessThanOrEqualTo(String value) {
            addCriterion("IS_DURABLE <=", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableLike(String value) {
            addCriterion("IS_DURABLE like", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableNotLike(String value) {
            addCriterion("IS_DURABLE not like", value, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableIn(List<String> values) {
            addCriterion("IS_DURABLE in", values, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableNotIn(List<String> values) {
            addCriterion("IS_DURABLE not in", values, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableBetween(String value1, String value2) {
            addCriterion("IS_DURABLE between", value1, value2, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsDurableNotBetween(String value1, String value2) {
            addCriterion("IS_DURABLE not between", value1, value2, "isDurable");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentIsNull() {
            addCriterion("IS_NONCONCURRENT is null");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentIsNotNull() {
            addCriterion("IS_NONCONCURRENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentEqualTo(String value) {
            addCriterion("IS_NONCONCURRENT =", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentNotEqualTo(String value) {
            addCriterion("IS_NONCONCURRENT <>", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentGreaterThan(String value) {
            addCriterion("IS_NONCONCURRENT >", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NONCONCURRENT >=", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentLessThan(String value) {
            addCriterion("IS_NONCONCURRENT <", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentLessThanOrEqualTo(String value) {
            addCriterion("IS_NONCONCURRENT <=", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentLike(String value) {
            addCriterion("IS_NONCONCURRENT like", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentNotLike(String value) {
            addCriterion("IS_NONCONCURRENT not like", value, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentIn(List<String> values) {
            addCriterion("IS_NONCONCURRENT in", values, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentNotIn(List<String> values) {
            addCriterion("IS_NONCONCURRENT not in", values, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentBetween(String value1, String value2) {
            addCriterion("IS_NONCONCURRENT between", value1, value2, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsNonconcurrentNotBetween(String value1, String value2) {
            addCriterion("IS_NONCONCURRENT not between", value1, value2, "isNonconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataIsNull() {
            addCriterion("IS_UPDATE_DATA is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataIsNotNull() {
            addCriterion("IS_UPDATE_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataEqualTo(String value) {
            addCriterion("IS_UPDATE_DATA =", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataNotEqualTo(String value) {
            addCriterion("IS_UPDATE_DATA <>", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataGreaterThan(String value) {
            addCriterion("IS_UPDATE_DATA >", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UPDATE_DATA >=", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataLessThan(String value) {
            addCriterion("IS_UPDATE_DATA <", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataLessThanOrEqualTo(String value) {
            addCriterion("IS_UPDATE_DATA <=", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataLike(String value) {
            addCriterion("IS_UPDATE_DATA like", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataNotLike(String value) {
            addCriterion("IS_UPDATE_DATA not like", value, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataIn(List<String> values) {
            addCriterion("IS_UPDATE_DATA in", values, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataNotIn(List<String> values) {
            addCriterion("IS_UPDATE_DATA not in", values, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataBetween(String value1, String value2) {
            addCriterion("IS_UPDATE_DATA between", value1, value2, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andIsUpdateDataNotBetween(String value1, String value2) {
            addCriterion("IS_UPDATE_DATA not between", value1, value2, "isUpdateData");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryIsNull() {
            addCriterion("REQUESTS_RECOVERY is null");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryIsNotNull() {
            addCriterion("REQUESTS_RECOVERY is not null");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY =", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryNotEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY <>", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryGreaterThan(String value) {
            addCriterion("REQUESTS_RECOVERY >", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY >=", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryLessThan(String value) {
            addCriterion("REQUESTS_RECOVERY <", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryLessThanOrEqualTo(String value) {
            addCriterion("REQUESTS_RECOVERY <=", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryLike(String value) {
            addCriterion("REQUESTS_RECOVERY like", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryNotLike(String value) {
            addCriterion("REQUESTS_RECOVERY not like", value, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryIn(List<String> values) {
            addCriterion("REQUESTS_RECOVERY in", values, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryNotIn(List<String> values) {
            addCriterion("REQUESTS_RECOVERY not in", values, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryBetween(String value1, String value2) {
            addCriterion("REQUESTS_RECOVERY between", value1, value2, "requestsRecovery");
            return (Criteria) this;
        }

        public Criteria andRequestsRecoveryNotBetween(String value1, String value2) {
            addCriterion("REQUESTS_RECOVERY not between", value1, value2, "requestsRecovery");
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