package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RElementTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RElementTypeExample() {
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

        public Criteria andIdElementTypeIsNull() {
            addCriterion("ID_ELEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeIsNotNull() {
            addCriterion("ID_ELEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeEqualTo(Long value) {
            addCriterion("ID_ELEMENT_TYPE =", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotEqualTo(Long value) {
            addCriterion("ID_ELEMENT_TYPE <>", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeGreaterThan(Long value) {
            addCriterion("ID_ELEMENT_TYPE >", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT_TYPE >=", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeLessThan(Long value) {
            addCriterion("ID_ELEMENT_TYPE <", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeLessThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT_TYPE <=", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeIn(List<Long> values) {
            addCriterion("ID_ELEMENT_TYPE in", values, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotIn(List<Long> values) {
            addCriterion("ID_ELEMENT_TYPE not in", values, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT_TYPE between", value1, value2, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT_TYPE not between", value1, value2, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceIsNull() {
            addCriterion("ID_NAMESPACE is null");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceIsNotNull() {
            addCriterion("ID_NAMESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceEqualTo(Integer value) {
            addCriterion("ID_NAMESPACE =", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceNotEqualTo(Integer value) {
            addCriterion("ID_NAMESPACE <>", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceGreaterThan(Integer value) {
            addCriterion("ID_NAMESPACE >", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_NAMESPACE >=", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceLessThan(Integer value) {
            addCriterion("ID_NAMESPACE <", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceLessThanOrEqualTo(Integer value) {
            addCriterion("ID_NAMESPACE <=", value, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceIn(List<Integer> values) {
            addCriterion("ID_NAMESPACE in", values, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceNotIn(List<Integer> values) {
            addCriterion("ID_NAMESPACE not in", values, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceBetween(Integer value1, Integer value2) {
            addCriterion("ID_NAMESPACE between", value1, value2, "idNamespace");
            return (Criteria) this;
        }

        public Criteria andIdNamespaceNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_NAMESPACE not between", value1, value2, "idNamespace");
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