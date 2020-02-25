package com.caixin.data.middle.etl.kettle.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QrtzSimpropTriggersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QrtzSimpropTriggersExample() {
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

        public Criteria andStrProp1IsNull() {
            addCriterion("STR_PROP_1 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp1IsNotNull() {
            addCriterion("STR_PROP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp1EqualTo(String value) {
            addCriterion("STR_PROP_1 =", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotEqualTo(String value) {
            addCriterion("STR_PROP_1 <>", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1GreaterThan(String value) {
            addCriterion("STR_PROP_1 >", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1GreaterThanOrEqualTo(String value) {
            addCriterion("STR_PROP_1 >=", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1LessThan(String value) {
            addCriterion("STR_PROP_1 <", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1LessThanOrEqualTo(String value) {
            addCriterion("STR_PROP_1 <=", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1Like(String value) {
            addCriterion("STR_PROP_1 like", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotLike(String value) {
            addCriterion("STR_PROP_1 not like", value, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1In(List<String> values) {
            addCriterion("STR_PROP_1 in", values, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotIn(List<String> values) {
            addCriterion("STR_PROP_1 not in", values, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1Between(String value1, String value2) {
            addCriterion("STR_PROP_1 between", value1, value2, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp1NotBetween(String value1, String value2) {
            addCriterion("STR_PROP_1 not between", value1, value2, "strProp1");
            return (Criteria) this;
        }

        public Criteria andStrProp2IsNull() {
            addCriterion("STR_PROP_2 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp2IsNotNull() {
            addCriterion("STR_PROP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp2EqualTo(String value) {
            addCriterion("STR_PROP_2 =", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotEqualTo(String value) {
            addCriterion("STR_PROP_2 <>", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2GreaterThan(String value) {
            addCriterion("STR_PROP_2 >", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2GreaterThanOrEqualTo(String value) {
            addCriterion("STR_PROP_2 >=", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2LessThan(String value) {
            addCriterion("STR_PROP_2 <", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2LessThanOrEqualTo(String value) {
            addCriterion("STR_PROP_2 <=", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2Like(String value) {
            addCriterion("STR_PROP_2 like", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotLike(String value) {
            addCriterion("STR_PROP_2 not like", value, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2In(List<String> values) {
            addCriterion("STR_PROP_2 in", values, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotIn(List<String> values) {
            addCriterion("STR_PROP_2 not in", values, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2Between(String value1, String value2) {
            addCriterion("STR_PROP_2 between", value1, value2, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp2NotBetween(String value1, String value2) {
            addCriterion("STR_PROP_2 not between", value1, value2, "strProp2");
            return (Criteria) this;
        }

        public Criteria andStrProp3IsNull() {
            addCriterion("STR_PROP_3 is null");
            return (Criteria) this;
        }

        public Criteria andStrProp3IsNotNull() {
            addCriterion("STR_PROP_3 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProp3EqualTo(String value) {
            addCriterion("STR_PROP_3 =", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotEqualTo(String value) {
            addCriterion("STR_PROP_3 <>", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3GreaterThan(String value) {
            addCriterion("STR_PROP_3 >", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3GreaterThanOrEqualTo(String value) {
            addCriterion("STR_PROP_3 >=", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3LessThan(String value) {
            addCriterion("STR_PROP_3 <", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3LessThanOrEqualTo(String value) {
            addCriterion("STR_PROP_3 <=", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3Like(String value) {
            addCriterion("STR_PROP_3 like", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotLike(String value) {
            addCriterion("STR_PROP_3 not like", value, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3In(List<String> values) {
            addCriterion("STR_PROP_3 in", values, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotIn(List<String> values) {
            addCriterion("STR_PROP_3 not in", values, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3Between(String value1, String value2) {
            addCriterion("STR_PROP_3 between", value1, value2, "strProp3");
            return (Criteria) this;
        }

        public Criteria andStrProp3NotBetween(String value1, String value2) {
            addCriterion("STR_PROP_3 not between", value1, value2, "strProp3");
            return (Criteria) this;
        }

        public Criteria andIntProp1IsNull() {
            addCriterion("INT_PROP_1 is null");
            return (Criteria) this;
        }

        public Criteria andIntProp1IsNotNull() {
            addCriterion("INT_PROP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andIntProp1EqualTo(Integer value) {
            addCriterion("INT_PROP_1 =", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotEqualTo(Integer value) {
            addCriterion("INT_PROP_1 <>", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1GreaterThan(Integer value) {
            addCriterion("INT_PROP_1 >", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1GreaterThanOrEqualTo(Integer value) {
            addCriterion("INT_PROP_1 >=", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1LessThan(Integer value) {
            addCriterion("INT_PROP_1 <", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1LessThanOrEqualTo(Integer value) {
            addCriterion("INT_PROP_1 <=", value, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1In(List<Integer> values) {
            addCriterion("INT_PROP_1 in", values, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotIn(List<Integer> values) {
            addCriterion("INT_PROP_1 not in", values, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1Between(Integer value1, Integer value2) {
            addCriterion("INT_PROP_1 between", value1, value2, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp1NotBetween(Integer value1, Integer value2) {
            addCriterion("INT_PROP_1 not between", value1, value2, "intProp1");
            return (Criteria) this;
        }

        public Criteria andIntProp2IsNull() {
            addCriterion("INT_PROP_2 is null");
            return (Criteria) this;
        }

        public Criteria andIntProp2IsNotNull() {
            addCriterion("INT_PROP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andIntProp2EqualTo(Integer value) {
            addCriterion("INT_PROP_2 =", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotEqualTo(Integer value) {
            addCriterion("INT_PROP_2 <>", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2GreaterThan(Integer value) {
            addCriterion("INT_PROP_2 >", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2GreaterThanOrEqualTo(Integer value) {
            addCriterion("INT_PROP_2 >=", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2LessThan(Integer value) {
            addCriterion("INT_PROP_2 <", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2LessThanOrEqualTo(Integer value) {
            addCriterion("INT_PROP_2 <=", value, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2In(List<Integer> values) {
            addCriterion("INT_PROP_2 in", values, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotIn(List<Integer> values) {
            addCriterion("INT_PROP_2 not in", values, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2Between(Integer value1, Integer value2) {
            addCriterion("INT_PROP_2 between", value1, value2, "intProp2");
            return (Criteria) this;
        }

        public Criteria andIntProp2NotBetween(Integer value1, Integer value2) {
            addCriterion("INT_PROP_2 not between", value1, value2, "intProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp1IsNull() {
            addCriterion("LONG_PROP_1 is null");
            return (Criteria) this;
        }

        public Criteria andLongProp1IsNotNull() {
            addCriterion("LONG_PROP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLongProp1EqualTo(Long value) {
            addCriterion("LONG_PROP_1 =", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotEqualTo(Long value) {
            addCriterion("LONG_PROP_1 <>", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1GreaterThan(Long value) {
            addCriterion("LONG_PROP_1 >", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1GreaterThanOrEqualTo(Long value) {
            addCriterion("LONG_PROP_1 >=", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1LessThan(Long value) {
            addCriterion("LONG_PROP_1 <", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1LessThanOrEqualTo(Long value) {
            addCriterion("LONG_PROP_1 <=", value, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1In(List<Long> values) {
            addCriterion("LONG_PROP_1 in", values, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotIn(List<Long> values) {
            addCriterion("LONG_PROP_1 not in", values, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1Between(Long value1, Long value2) {
            addCriterion("LONG_PROP_1 between", value1, value2, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp1NotBetween(Long value1, Long value2) {
            addCriterion("LONG_PROP_1 not between", value1, value2, "longProp1");
            return (Criteria) this;
        }

        public Criteria andLongProp2IsNull() {
            addCriterion("LONG_PROP_2 is null");
            return (Criteria) this;
        }

        public Criteria andLongProp2IsNotNull() {
            addCriterion("LONG_PROP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLongProp2EqualTo(Long value) {
            addCriterion("LONG_PROP_2 =", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotEqualTo(Long value) {
            addCriterion("LONG_PROP_2 <>", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2GreaterThan(Long value) {
            addCriterion("LONG_PROP_2 >", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2GreaterThanOrEqualTo(Long value) {
            addCriterion("LONG_PROP_2 >=", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2LessThan(Long value) {
            addCriterion("LONG_PROP_2 <", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2LessThanOrEqualTo(Long value) {
            addCriterion("LONG_PROP_2 <=", value, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2In(List<Long> values) {
            addCriterion("LONG_PROP_2 in", values, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotIn(List<Long> values) {
            addCriterion("LONG_PROP_2 not in", values, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2Between(Long value1, Long value2) {
            addCriterion("LONG_PROP_2 between", value1, value2, "longProp2");
            return (Criteria) this;
        }

        public Criteria andLongProp2NotBetween(Long value1, Long value2) {
            addCriterion("LONG_PROP_2 not between", value1, value2, "longProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp1IsNull() {
            addCriterion("DEC_PROP_1 is null");
            return (Criteria) this;
        }

        public Criteria andDecProp1IsNotNull() {
            addCriterion("DEC_PROP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDecProp1EqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_1 =", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_1 <>", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1GreaterThan(BigDecimal value) {
            addCriterion("DEC_PROP_1 >", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_1 >=", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1LessThan(BigDecimal value) {
            addCriterion("DEC_PROP_1 <", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_1 <=", value, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1In(List<BigDecimal> values) {
            addCriterion("DEC_PROP_1 in", values, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotIn(List<BigDecimal> values) {
            addCriterion("DEC_PROP_1 not in", values, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_PROP_1 between", value1, value2, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_PROP_1 not between", value1, value2, "decProp1");
            return (Criteria) this;
        }

        public Criteria andDecProp2IsNull() {
            addCriterion("DEC_PROP_2 is null");
            return (Criteria) this;
        }

        public Criteria andDecProp2IsNotNull() {
            addCriterion("DEC_PROP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDecProp2EqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_2 =", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_2 <>", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2GreaterThan(BigDecimal value) {
            addCriterion("DEC_PROP_2 >", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_2 >=", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2LessThan(BigDecimal value) {
            addCriterion("DEC_PROP_2 <", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_PROP_2 <=", value, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2In(List<BigDecimal> values) {
            addCriterion("DEC_PROP_2 in", values, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotIn(List<BigDecimal> values) {
            addCriterion("DEC_PROP_2 not in", values, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_PROP_2 between", value1, value2, "decProp2");
            return (Criteria) this;
        }

        public Criteria andDecProp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_PROP_2 not between", value1, value2, "decProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp1IsNull() {
            addCriterion("BOOL_PROP_1 is null");
            return (Criteria) this;
        }

        public Criteria andBoolProp1IsNotNull() {
            addCriterion("BOOL_PROP_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBoolProp1EqualTo(String value) {
            addCriterion("BOOL_PROP_1 =", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotEqualTo(String value) {
            addCriterion("BOOL_PROP_1 <>", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1GreaterThan(String value) {
            addCriterion("BOOL_PROP_1 >", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1GreaterThanOrEqualTo(String value) {
            addCriterion("BOOL_PROP_1 >=", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1LessThan(String value) {
            addCriterion("BOOL_PROP_1 <", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1LessThanOrEqualTo(String value) {
            addCriterion("BOOL_PROP_1 <=", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1Like(String value) {
            addCriterion("BOOL_PROP_1 like", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotLike(String value) {
            addCriterion("BOOL_PROP_1 not like", value, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1In(List<String> values) {
            addCriterion("BOOL_PROP_1 in", values, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotIn(List<String> values) {
            addCriterion("BOOL_PROP_1 not in", values, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1Between(String value1, String value2) {
            addCriterion("BOOL_PROP_1 between", value1, value2, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp1NotBetween(String value1, String value2) {
            addCriterion("BOOL_PROP_1 not between", value1, value2, "boolProp1");
            return (Criteria) this;
        }

        public Criteria andBoolProp2IsNull() {
            addCriterion("BOOL_PROP_2 is null");
            return (Criteria) this;
        }

        public Criteria andBoolProp2IsNotNull() {
            addCriterion("BOOL_PROP_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBoolProp2EqualTo(String value) {
            addCriterion("BOOL_PROP_2 =", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotEqualTo(String value) {
            addCriterion("BOOL_PROP_2 <>", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2GreaterThan(String value) {
            addCriterion("BOOL_PROP_2 >", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2GreaterThanOrEqualTo(String value) {
            addCriterion("BOOL_PROP_2 >=", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2LessThan(String value) {
            addCriterion("BOOL_PROP_2 <", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2LessThanOrEqualTo(String value) {
            addCriterion("BOOL_PROP_2 <=", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2Like(String value) {
            addCriterion("BOOL_PROP_2 like", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotLike(String value) {
            addCriterion("BOOL_PROP_2 not like", value, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2In(List<String> values) {
            addCriterion("BOOL_PROP_2 in", values, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotIn(List<String> values) {
            addCriterion("BOOL_PROP_2 not in", values, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2Between(String value1, String value2) {
            addCriterion("BOOL_PROP_2 between", value1, value2, "boolProp2");
            return (Criteria) this;
        }

        public Criteria andBoolProp2NotBetween(String value1, String value2) {
            addCriterion("BOOL_PROP_2 not between", value1, value2, "boolProp2");
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