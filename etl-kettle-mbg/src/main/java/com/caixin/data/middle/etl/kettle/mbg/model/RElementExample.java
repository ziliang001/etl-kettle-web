package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RElementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RElementExample() {
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

        public Criteria andIdElementIsNull() {
            addCriterion("ID_ELEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIdElementIsNotNull() {
            addCriterion("ID_ELEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementEqualTo(Long value) {
            addCriterion("ID_ELEMENT =", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotEqualTo(Long value) {
            addCriterion("ID_ELEMENT <>", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementGreaterThan(Long value) {
            addCriterion("ID_ELEMENT >", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT >=", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementLessThan(Long value) {
            addCriterion("ID_ELEMENT <", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementLessThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT <=", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementIn(List<Long> values) {
            addCriterion("ID_ELEMENT in", values, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotIn(List<Long> values) {
            addCriterion("ID_ELEMENT not in", values, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT between", value1, value2, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT not between", value1, value2, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeIsNull() {
            addCriterion("ID_ELEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeIsNotNull() {
            addCriterion("ID_ELEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_TYPE =", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_TYPE <>", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeGreaterThan(Integer value) {
            addCriterion("ID_ELEMENT_TYPE >", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_TYPE >=", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeLessThan(Integer value) {
            addCriterion("ID_ELEMENT_TYPE <", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_TYPE <=", value, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeIn(List<Integer> values) {
            addCriterion("ID_ELEMENT_TYPE in", values, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotIn(List<Integer> values) {
            addCriterion("ID_ELEMENT_TYPE not in", values, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT_TYPE between", value1, value2, "idElementType");
            return (Criteria) this;
        }

        public Criteria andIdElementTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT_TYPE not between", value1, value2, "idElementType");
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