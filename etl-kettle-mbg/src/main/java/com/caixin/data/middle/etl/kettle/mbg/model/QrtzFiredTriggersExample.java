package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class QrtzFiredTriggersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QrtzFiredTriggersExample() {
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

        public Criteria andEntryIdIsNull() {
            addCriterion("ENTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNotNull() {
            addCriterion("ENTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntryIdEqualTo(String value) {
            addCriterion("ENTRY_ID =", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotEqualTo(String value) {
            addCriterion("ENTRY_ID <>", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThan(String value) {
            addCriterion("ENTRY_ID >", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_ID >=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThan(String value) {
            addCriterion("ENTRY_ID <", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_ID <=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLike(String value) {
            addCriterion("ENTRY_ID like", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotLike(String value) {
            addCriterion("ENTRY_ID not like", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdIn(List<String> values) {
            addCriterion("ENTRY_ID in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotIn(List<String> values) {
            addCriterion("ENTRY_ID not in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdBetween(String value1, String value2) {
            addCriterion("ENTRY_ID between", value1, value2, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotBetween(String value1, String value2) {
            addCriterion("ENTRY_ID not between", value1, value2, "entryId");
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

        public Criteria andInstanceNameIsNull() {
            addCriterion("INSTANCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIsNotNull() {
            addCriterion("INSTANCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceNameEqualTo(String value) {
            addCriterion("INSTANCE_NAME =", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotEqualTo(String value) {
            addCriterion("INSTANCE_NAME <>", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThan(String value) {
            addCriterion("INSTANCE_NAME >", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NAME >=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThan(String value) {
            addCriterion("INSTANCE_NAME <", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NAME <=", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameLike(String value) {
            addCriterion("INSTANCE_NAME like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotLike(String value) {
            addCriterion("INSTANCE_NAME not like", value, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameIn(List<String> values) {
            addCriterion("INSTANCE_NAME in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotIn(List<String> values) {
            addCriterion("INSTANCE_NAME not in", values, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameBetween(String value1, String value2) {
            addCriterion("INSTANCE_NAME between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andInstanceNameNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_NAME not between", value1, value2, "instanceName");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIsNull() {
            addCriterion("FIRED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIsNotNull() {
            addCriterion("FIRED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFiredTimeEqualTo(Long value) {
            addCriterion("FIRED_TIME =", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotEqualTo(Long value) {
            addCriterion("FIRED_TIME <>", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeGreaterThan(Long value) {
            addCriterion("FIRED_TIME >", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("FIRED_TIME >=", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeLessThan(Long value) {
            addCriterion("FIRED_TIME <", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeLessThanOrEqualTo(Long value) {
            addCriterion("FIRED_TIME <=", value, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeIn(List<Long> values) {
            addCriterion("FIRED_TIME in", values, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotIn(List<Long> values) {
            addCriterion("FIRED_TIME not in", values, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeBetween(Long value1, Long value2) {
            addCriterion("FIRED_TIME between", value1, value2, "firedTime");
            return (Criteria) this;
        }

        public Criteria andFiredTimeNotBetween(Long value1, Long value2) {
            addCriterion("FIRED_TIME not between", value1, value2, "firedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIsNull() {
            addCriterion("SCHED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIsNotNull() {
            addCriterion("SCHED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSchedTimeEqualTo(Long value) {
            addCriterion("SCHED_TIME =", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotEqualTo(Long value) {
            addCriterion("SCHED_TIME <>", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeGreaterThan(Long value) {
            addCriterion("SCHED_TIME >", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SCHED_TIME >=", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeLessThan(Long value) {
            addCriterion("SCHED_TIME <", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeLessThanOrEqualTo(Long value) {
            addCriterion("SCHED_TIME <=", value, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeIn(List<Long> values) {
            addCriterion("SCHED_TIME in", values, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotIn(List<Long> values) {
            addCriterion("SCHED_TIME not in", values, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeBetween(Long value1, Long value2) {
            addCriterion("SCHED_TIME between", value1, value2, "schedTime");
            return (Criteria) this;
        }

        public Criteria andSchedTimeNotBetween(Long value1, Long value2) {
            addCriterion("SCHED_TIME not between", value1, value2, "schedTime");
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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