package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RPartitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RPartitionExample() {
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

        public Criteria andIdPartitionIsNull() {
            addCriterion("ID_PARTITION is null");
            return (Criteria) this;
        }

        public Criteria andIdPartitionIsNotNull() {
            addCriterion("ID_PARTITION is not null");
            return (Criteria) this;
        }

        public Criteria andIdPartitionEqualTo(Long value) {
            addCriterion("ID_PARTITION =", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionNotEqualTo(Long value) {
            addCriterion("ID_PARTITION <>", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionGreaterThan(Long value) {
            addCriterion("ID_PARTITION >", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_PARTITION >=", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionLessThan(Long value) {
            addCriterion("ID_PARTITION <", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionLessThanOrEqualTo(Long value) {
            addCriterion("ID_PARTITION <=", value, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionIn(List<Long> values) {
            addCriterion("ID_PARTITION in", values, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionNotIn(List<Long> values) {
            addCriterion("ID_PARTITION not in", values, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionBetween(Long value1, Long value2) {
            addCriterion("ID_PARTITION between", value1, value2, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionNotBetween(Long value1, Long value2) {
            addCriterion("ID_PARTITION not between", value1, value2, "idPartition");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaIsNull() {
            addCriterion("ID_PARTITION_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaIsNotNull() {
            addCriterion("ID_PARTITION_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaEqualTo(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA =", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaNotEqualTo(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA <>", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaGreaterThan(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA >", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA >=", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaLessThan(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA <", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaLessThanOrEqualTo(Integer value) {
            addCriterion("ID_PARTITION_SCHEMA <=", value, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaIn(List<Integer> values) {
            addCriterion("ID_PARTITION_SCHEMA in", values, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaNotIn(List<Integer> values) {
            addCriterion("ID_PARTITION_SCHEMA not in", values, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaBetween(Integer value1, Integer value2) {
            addCriterion("ID_PARTITION_SCHEMA between", value1, value2, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdPartitionSchemaNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_PARTITION_SCHEMA not between", value1, value2, "idPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNull() {
            addCriterion("PARTITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNotNull() {
            addCriterion("PARTITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdEqualTo(String value) {
            addCriterion("PARTITION_ID =", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotEqualTo(String value) {
            addCriterion("PARTITION_ID <>", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThan(String value) {
            addCriterion("PARTITION_ID >", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTITION_ID >=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThan(String value) {
            addCriterion("PARTITION_ID <", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThanOrEqualTo(String value) {
            addCriterion("PARTITION_ID <=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLike(String value) {
            addCriterion("PARTITION_ID like", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotLike(String value) {
            addCriterion("PARTITION_ID not like", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIn(List<String> values) {
            addCriterion("PARTITION_ID in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotIn(List<String> values) {
            addCriterion("PARTITION_ID not in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdBetween(String value1, String value2) {
            addCriterion("PARTITION_ID between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotBetween(String value1, String value2) {
            addCriterion("PARTITION_ID not between", value1, value2, "partitionId");
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