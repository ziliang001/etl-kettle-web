package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class QrtzTriggersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QrtzTriggersExample() {
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

        public Criteria andTriggerNameIsNull() {
            addCriterion("TRIGGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIsNotNull() {
            addCriterion("TRIGGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerNameEqualTo(String value) {
            addCriterion("TRIGGER_NAME =", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotEqualTo(String value) {
            addCriterion("TRIGGER_NAME <>", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThan(String value) {
            addCriterion("TRIGGER_NAME >", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME >=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThan(String value) {
            addCriterion("TRIGGER_NAME <", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_NAME <=", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameLike(String value) {
            addCriterion("TRIGGER_NAME like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotLike(String value) {
            addCriterion("TRIGGER_NAME not like", value, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameIn(List<String> values) {
            addCriterion("TRIGGER_NAME in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotIn(List<String> values) {
            addCriterion("TRIGGER_NAME not in", values, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME between", value1, value2, "triggerName");
            return (Criteria) this;
        }

        public Criteria andTriggerNameNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_NAME not between", value1, value2, "triggerName");
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

        public Criteria andNextFireTimeIsNull() {
            addCriterion("NEXT_FIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIsNotNull() {
            addCriterion("NEXT_FIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeEqualTo(Long value) {
            addCriterion("NEXT_FIRE_TIME =", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotEqualTo(Long value) {
            addCriterion("NEXT_FIRE_TIME <>", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThan(Long value) {
            addCriterion("NEXT_FIRE_TIME >", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("NEXT_FIRE_TIME >=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThan(Long value) {
            addCriterion("NEXT_FIRE_TIME <", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThanOrEqualTo(Long value) {
            addCriterion("NEXT_FIRE_TIME <=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIn(List<Long> values) {
            addCriterion("NEXT_FIRE_TIME in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotIn(List<Long> values) {
            addCriterion("NEXT_FIRE_TIME not in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeBetween(Long value1, Long value2) {
            addCriterion("NEXT_FIRE_TIME between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotBetween(Long value1, Long value2) {
            addCriterion("NEXT_FIRE_TIME not between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIsNull() {
            addCriterion("PREV_FIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIsNotNull() {
            addCriterion("PREV_FIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeEqualTo(Long value) {
            addCriterion("PREV_FIRE_TIME =", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotEqualTo(Long value) {
            addCriterion("PREV_FIRE_TIME <>", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeGreaterThan(Long value) {
            addCriterion("PREV_FIRE_TIME >", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("PREV_FIRE_TIME >=", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeLessThan(Long value) {
            addCriterion("PREV_FIRE_TIME <", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeLessThanOrEqualTo(Long value) {
            addCriterion("PREV_FIRE_TIME <=", value, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeIn(List<Long> values) {
            addCriterion("PREV_FIRE_TIME in", values, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotIn(List<Long> values) {
            addCriterion("PREV_FIRE_TIME not in", values, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeBetween(Long value1, Long value2) {
            addCriterion("PREV_FIRE_TIME between", value1, value2, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPrevFireTimeNotBetween(Long value1, Long value2) {
            addCriterion("PREV_FIRE_TIME not between", value1, value2, "prevFireTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIsNull() {
            addCriterion("TRIGGER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIsNotNull() {
            addCriterion("TRIGGER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerStateEqualTo(String value) {
            addCriterion("TRIGGER_STATE =", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotEqualTo(String value) {
            addCriterion("TRIGGER_STATE <>", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateGreaterThan(String value) {
            addCriterion("TRIGGER_STATE >", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_STATE >=", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLessThan(String value) {
            addCriterion("TRIGGER_STATE <", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_STATE <=", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateLike(String value) {
            addCriterion("TRIGGER_STATE like", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotLike(String value) {
            addCriterion("TRIGGER_STATE not like", value, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateIn(List<String> values) {
            addCriterion("TRIGGER_STATE in", values, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotIn(List<String> values) {
            addCriterion("TRIGGER_STATE not in", values, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateBetween(String value1, String value2) {
            addCriterion("TRIGGER_STATE between", value1, value2, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerStateNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_STATE not between", value1, value2, "triggerState");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNull() {
            addCriterion("TRIGGER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIsNotNull() {
            addCriterion("TRIGGER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeEqualTo(String value) {
            addCriterion("TRIGGER_TYPE =", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotEqualTo(String value) {
            addCriterion("TRIGGER_TYPE <>", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThan(String value) {
            addCriterion("TRIGGER_TYPE >", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_TYPE >=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThan(String value) {
            addCriterion("TRIGGER_TYPE <", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_TYPE <=", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeLike(String value) {
            addCriterion("TRIGGER_TYPE like", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotLike(String value) {
            addCriterion("TRIGGER_TYPE not like", value, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeIn(List<String> values) {
            addCriterion("TRIGGER_TYPE in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotIn(List<String> values) {
            addCriterion("TRIGGER_TYPE not in", values, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeBetween(String value1, String value2) {
            addCriterion("TRIGGER_TYPE between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andTriggerTypeNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_TYPE not between", value1, value2, "triggerType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Long value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Long value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Long value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Long value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Long> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Long> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Long value1, Long value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIsNull() {
            addCriterion("CALENDAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIsNotNull() {
            addCriterion("CALENDAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameEqualTo(String value) {
            addCriterion("CALENDAR_NAME =", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotEqualTo(String value) {
            addCriterion("CALENDAR_NAME <>", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThan(String value) {
            addCriterion("CALENDAR_NAME >", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NAME >=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThan(String value) {
            addCriterion("CALENDAR_NAME <", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NAME <=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLike(String value) {
            addCriterion("CALENDAR_NAME like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotLike(String value) {
            addCriterion("CALENDAR_NAME not like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIn(List<String> values) {
            addCriterion("CALENDAR_NAME in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotIn(List<String> values) {
            addCriterion("CALENDAR_NAME not in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameBetween(String value1, String value2) {
            addCriterion("CALENDAR_NAME between", value1, value2, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_NAME not between", value1, value2, "calendarName");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrIsNull() {
            addCriterion("MISFIRE_INSTR is null");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrIsNotNull() {
            addCriterion("MISFIRE_INSTR is not null");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrEqualTo(Short value) {
            addCriterion("MISFIRE_INSTR =", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotEqualTo(Short value) {
            addCriterion("MISFIRE_INSTR <>", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrGreaterThan(Short value) {
            addCriterion("MISFIRE_INSTR >", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrGreaterThanOrEqualTo(Short value) {
            addCriterion("MISFIRE_INSTR >=", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrLessThan(Short value) {
            addCriterion("MISFIRE_INSTR <", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrLessThanOrEqualTo(Short value) {
            addCriterion("MISFIRE_INSTR <=", value, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrIn(List<Short> values) {
            addCriterion("MISFIRE_INSTR in", values, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotIn(List<Short> values) {
            addCriterion("MISFIRE_INSTR not in", values, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrBetween(Short value1, Short value2) {
            addCriterion("MISFIRE_INSTR between", value1, value2, "misfireInstr");
            return (Criteria) this;
        }

        public Criteria andMisfireInstrNotBetween(Short value1, Short value2) {
            addCriterion("MISFIRE_INSTR not between", value1, value2, "misfireInstr");
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