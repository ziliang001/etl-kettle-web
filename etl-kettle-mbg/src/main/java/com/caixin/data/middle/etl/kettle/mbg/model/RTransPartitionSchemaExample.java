package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RTransPartitionSchemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RTransPartitionSchemaExample() {
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

        public Criteria andIdTransPartitionSchemaIsNull() {
            addCriterion("ID_TRANS_PARTITION_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaIsNotNull() {
            addCriterion("ID_TRANS_PARTITION_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaEqualTo(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA =", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaNotEqualTo(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA <>", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaGreaterThan(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA >", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA >=", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaLessThan(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA <", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaLessThanOrEqualTo(Long value) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA <=", value, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaIn(List<Long> values) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA in", values, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaNotIn(List<Long> values) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA not in", values, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaBetween(Long value1, Long value2) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA between", value1, value2, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransPartitionSchemaNotBetween(Long value1, Long value2) {
            addCriterion("ID_TRANS_PARTITION_SCHEMA not between", value1, value2, "idTransPartitionSchema");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIsNull() {
            addCriterion("ID_TRANSFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIsNotNull() {
            addCriterion("ID_TRANSFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION =", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION <>", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThan(Integer value) {
            addCriterion("ID_TRANSFORMATION >", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION >=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThan(Integer value) {
            addCriterion("ID_TRANSFORMATION <", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThanOrEqualTo(Integer value) {
            addCriterion("ID_TRANSFORMATION <=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIn(List<Integer> values) {
            addCriterion("ID_TRANSFORMATION in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotIn(List<Integer> values) {
            addCriterion("ID_TRANSFORMATION not in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationBetween(Integer value1, Integer value2) {
            addCriterion("ID_TRANSFORMATION between", value1, value2, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_TRANSFORMATION not between", value1, value2, "idTransformation");
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