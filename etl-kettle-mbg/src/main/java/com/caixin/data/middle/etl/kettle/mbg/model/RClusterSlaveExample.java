package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RClusterSlaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RClusterSlaveExample() {
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

        public Criteria andIdClusterSlaveIsNull() {
            addCriterion("ID_CLUSTER_SLAVE is null");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveIsNotNull() {
            addCriterion("ID_CLUSTER_SLAVE is not null");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveEqualTo(Long value) {
            addCriterion("ID_CLUSTER_SLAVE =", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveNotEqualTo(Long value) {
            addCriterion("ID_CLUSTER_SLAVE <>", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveGreaterThan(Long value) {
            addCriterion("ID_CLUSTER_SLAVE >", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_CLUSTER_SLAVE >=", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveLessThan(Long value) {
            addCriterion("ID_CLUSTER_SLAVE <", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveLessThanOrEqualTo(Long value) {
            addCriterion("ID_CLUSTER_SLAVE <=", value, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveIn(List<Long> values) {
            addCriterion("ID_CLUSTER_SLAVE in", values, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveNotIn(List<Long> values) {
            addCriterion("ID_CLUSTER_SLAVE not in", values, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveBetween(Long value1, Long value2) {
            addCriterion("ID_CLUSTER_SLAVE between", value1, value2, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterSlaveNotBetween(Long value1, Long value2) {
            addCriterion("ID_CLUSTER_SLAVE not between", value1, value2, "idClusterSlave");
            return (Criteria) this;
        }

        public Criteria andIdClusterIsNull() {
            addCriterion("ID_CLUSTER is null");
            return (Criteria) this;
        }

        public Criteria andIdClusterIsNotNull() {
            addCriterion("ID_CLUSTER is not null");
            return (Criteria) this;
        }

        public Criteria andIdClusterEqualTo(Integer value) {
            addCriterion("ID_CLUSTER =", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotEqualTo(Integer value) {
            addCriterion("ID_CLUSTER <>", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterGreaterThan(Integer value) {
            addCriterion("ID_CLUSTER >", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_CLUSTER >=", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterLessThan(Integer value) {
            addCriterion("ID_CLUSTER <", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterLessThanOrEqualTo(Integer value) {
            addCriterion("ID_CLUSTER <=", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterIn(List<Integer> values) {
            addCriterion("ID_CLUSTER in", values, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotIn(List<Integer> values) {
            addCriterion("ID_CLUSTER not in", values, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterBetween(Integer value1, Integer value2) {
            addCriterion("ID_CLUSTER between", value1, value2, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_CLUSTER not between", value1, value2, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdSlaveIsNull() {
            addCriterion("ID_SLAVE is null");
            return (Criteria) this;
        }

        public Criteria andIdSlaveIsNotNull() {
            addCriterion("ID_SLAVE is not null");
            return (Criteria) this;
        }

        public Criteria andIdSlaveEqualTo(Integer value) {
            addCriterion("ID_SLAVE =", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotEqualTo(Integer value) {
            addCriterion("ID_SLAVE <>", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveGreaterThan(Integer value) {
            addCriterion("ID_SLAVE >", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_SLAVE >=", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveLessThan(Integer value) {
            addCriterion("ID_SLAVE <", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveLessThanOrEqualTo(Integer value) {
            addCriterion("ID_SLAVE <=", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveIn(List<Integer> values) {
            addCriterion("ID_SLAVE in", values, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotIn(List<Integer> values) {
            addCriterion("ID_SLAVE not in", values, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveBetween(Integer value1, Integer value2) {
            addCriterion("ID_SLAVE between", value1, value2, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_SLAVE not between", value1, value2, "idSlave");
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