package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RClusterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RClusterExample() {
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

        public Criteria andIdClusterIsNull() {
            addCriterion("ID_CLUSTER is null");
            return (Criteria) this;
        }

        public Criteria andIdClusterIsNotNull() {
            addCriterion("ID_CLUSTER is not null");
            return (Criteria) this;
        }

        public Criteria andIdClusterEqualTo(Long value) {
            addCriterion("ID_CLUSTER =", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotEqualTo(Long value) {
            addCriterion("ID_CLUSTER <>", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterGreaterThan(Long value) {
            addCriterion("ID_CLUSTER >", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_CLUSTER >=", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterLessThan(Long value) {
            addCriterion("ID_CLUSTER <", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterLessThanOrEqualTo(Long value) {
            addCriterion("ID_CLUSTER <=", value, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterIn(List<Long> values) {
            addCriterion("ID_CLUSTER in", values, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotIn(List<Long> values) {
            addCriterion("ID_CLUSTER not in", values, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterBetween(Long value1, Long value2) {
            addCriterion("ID_CLUSTER between", value1, value2, "idCluster");
            return (Criteria) this;
        }

        public Criteria andIdClusterNotBetween(Long value1, Long value2) {
            addCriterion("ID_CLUSTER not between", value1, value2, "idCluster");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBasePortIsNull() {
            addCriterion("BASE_PORT is null");
            return (Criteria) this;
        }

        public Criteria andBasePortIsNotNull() {
            addCriterion("BASE_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andBasePortEqualTo(String value) {
            addCriterion("BASE_PORT =", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortNotEqualTo(String value) {
            addCriterion("BASE_PORT <>", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortGreaterThan(String value) {
            addCriterion("BASE_PORT >", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_PORT >=", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortLessThan(String value) {
            addCriterion("BASE_PORT <", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortLessThanOrEqualTo(String value) {
            addCriterion("BASE_PORT <=", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortLike(String value) {
            addCriterion("BASE_PORT like", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortNotLike(String value) {
            addCriterion("BASE_PORT not like", value, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortIn(List<String> values) {
            addCriterion("BASE_PORT in", values, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortNotIn(List<String> values) {
            addCriterion("BASE_PORT not in", values, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortBetween(String value1, String value2) {
            addCriterion("BASE_PORT between", value1, value2, "basePort");
            return (Criteria) this;
        }

        public Criteria andBasePortNotBetween(String value1, String value2) {
            addCriterion("BASE_PORT not between", value1, value2, "basePort");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeIsNull() {
            addCriterion("SOCKETS_BUFFER_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeIsNotNull() {
            addCriterion("SOCKETS_BUFFER_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeEqualTo(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE =", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeNotEqualTo(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE <>", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeGreaterThan(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE >", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeGreaterThanOrEqualTo(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE >=", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeLessThan(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE <", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeLessThanOrEqualTo(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE <=", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeLike(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE like", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeNotLike(String value) {
            addCriterion("SOCKETS_BUFFER_SIZE not like", value, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeIn(List<String> values) {
            addCriterion("SOCKETS_BUFFER_SIZE in", values, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeNotIn(List<String> values) {
            addCriterion("SOCKETS_BUFFER_SIZE not in", values, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeBetween(String value1, String value2) {
            addCriterion("SOCKETS_BUFFER_SIZE between", value1, value2, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsBufferSizeNotBetween(String value1, String value2) {
            addCriterion("SOCKETS_BUFFER_SIZE not between", value1, value2, "socketsBufferSize");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalIsNull() {
            addCriterion("SOCKETS_FLUSH_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalIsNotNull() {
            addCriterion("SOCKETS_FLUSH_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalEqualTo(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL =", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalNotEqualTo(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL <>", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalGreaterThan(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL >", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL >=", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalLessThan(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL <", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalLessThanOrEqualTo(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL <=", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalLike(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL like", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalNotLike(String value) {
            addCriterion("SOCKETS_FLUSH_INTERVAL not like", value, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalIn(List<String> values) {
            addCriterion("SOCKETS_FLUSH_INTERVAL in", values, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalNotIn(List<String> values) {
            addCriterion("SOCKETS_FLUSH_INTERVAL not in", values, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalBetween(String value1, String value2) {
            addCriterion("SOCKETS_FLUSH_INTERVAL between", value1, value2, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsFlushIntervalNotBetween(String value1, String value2) {
            addCriterion("SOCKETS_FLUSH_INTERVAL not between", value1, value2, "socketsFlushInterval");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedIsNull() {
            addCriterion("SOCKETS_COMPRESSED is null");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedIsNotNull() {
            addCriterion("SOCKETS_COMPRESSED is not null");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedEqualTo(String value) {
            addCriterion("SOCKETS_COMPRESSED =", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedNotEqualTo(String value) {
            addCriterion("SOCKETS_COMPRESSED <>", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedGreaterThan(String value) {
            addCriterion("SOCKETS_COMPRESSED >", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedGreaterThanOrEqualTo(String value) {
            addCriterion("SOCKETS_COMPRESSED >=", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedLessThan(String value) {
            addCriterion("SOCKETS_COMPRESSED <", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedLessThanOrEqualTo(String value) {
            addCriterion("SOCKETS_COMPRESSED <=", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedLike(String value) {
            addCriterion("SOCKETS_COMPRESSED like", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedNotLike(String value) {
            addCriterion("SOCKETS_COMPRESSED not like", value, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedIn(List<String> values) {
            addCriterion("SOCKETS_COMPRESSED in", values, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedNotIn(List<String> values) {
            addCriterion("SOCKETS_COMPRESSED not in", values, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedBetween(String value1, String value2) {
            addCriterion("SOCKETS_COMPRESSED between", value1, value2, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andSocketsCompressedNotBetween(String value1, String value2) {
            addCriterion("SOCKETS_COMPRESSED not between", value1, value2, "socketsCompressed");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterIsNull() {
            addCriterion("DYNAMIC_CLUSTER is null");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterIsNotNull() {
            addCriterion("DYNAMIC_CLUSTER is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterEqualTo(String value) {
            addCriterion("DYNAMIC_CLUSTER =", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterNotEqualTo(String value) {
            addCriterion("DYNAMIC_CLUSTER <>", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterGreaterThan(String value) {
            addCriterion("DYNAMIC_CLUSTER >", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_CLUSTER >=", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterLessThan(String value) {
            addCriterion("DYNAMIC_CLUSTER <", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_CLUSTER <=", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterLike(String value) {
            addCriterion("DYNAMIC_CLUSTER like", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterNotLike(String value) {
            addCriterion("DYNAMIC_CLUSTER not like", value, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterIn(List<String> values) {
            addCriterion("DYNAMIC_CLUSTER in", values, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterNotIn(List<String> values) {
            addCriterion("DYNAMIC_CLUSTER not in", values, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterBetween(String value1, String value2) {
            addCriterion("DYNAMIC_CLUSTER between", value1, value2, "dynamicCluster");
            return (Criteria) this;
        }

        public Criteria andDynamicClusterNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_CLUSTER not between", value1, value2, "dynamicCluster");
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