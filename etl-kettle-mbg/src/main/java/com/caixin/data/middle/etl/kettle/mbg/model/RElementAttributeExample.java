package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RElementAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RElementAttributeExample() {
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

        public Criteria andIdElementAttributeIsNull() {
            addCriterion("ID_ELEMENT_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeIsNotNull() {
            addCriterion("ID_ELEMENT_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeEqualTo(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE =", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeNotEqualTo(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE <>", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeGreaterThan(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE >", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE >=", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeLessThan(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE <", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeLessThanOrEqualTo(Long value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE <=", value, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeIn(List<Long> values) {
            addCriterion("ID_ELEMENT_ATTRIBUTE in", values, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeNotIn(List<Long> values) {
            addCriterion("ID_ELEMENT_ATTRIBUTE not in", values, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT_ATTRIBUTE between", value1, value2, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeNotBetween(Long value1, Long value2) {
            addCriterion("ID_ELEMENT_ATTRIBUTE not between", value1, value2, "idElementAttribute");
            return (Criteria) this;
        }

        public Criteria andIdElementIsNull() {
            addCriterion("ID_ELEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIdElementIsNotNull() {
            addCriterion("ID_ELEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementEqualTo(Integer value) {
            addCriterion("ID_ELEMENT =", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotEqualTo(Integer value) {
            addCriterion("ID_ELEMENT <>", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementGreaterThan(Integer value) {
            addCriterion("ID_ELEMENT >", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT >=", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementLessThan(Integer value) {
            addCriterion("ID_ELEMENT <", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT <=", value, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementIn(List<Integer> values) {
            addCriterion("ID_ELEMENT in", values, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotIn(List<Integer> values) {
            addCriterion("ID_ELEMENT not in", values, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT between", value1, value2, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT not between", value1, value2, "idElement");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentIsNull() {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentIsNotNull() {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT =", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentNotEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT <>", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentGreaterThan(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT >", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT >=", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentLessThan(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT <", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentLessThanOrEqualTo(Integer value) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT <=", value, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentIn(List<Integer> values) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT in", values, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentNotIn(List<Integer> values) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT not in", values, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT between", value1, value2, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andIdElementAttributeParentNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_ELEMENT_ATTRIBUTE_PARENT not between", value1, value2, "idElementAttributeParent");
            return (Criteria) this;
        }

        public Criteria andAttrKeyIsNull() {
            addCriterion("ATTR_KEY is null");
            return (Criteria) this;
        }

        public Criteria andAttrKeyIsNotNull() {
            addCriterion("ATTR_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andAttrKeyEqualTo(String value) {
            addCriterion("ATTR_KEY =", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyNotEqualTo(String value) {
            addCriterion("ATTR_KEY <>", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyGreaterThan(String value) {
            addCriterion("ATTR_KEY >", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_KEY >=", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyLessThan(String value) {
            addCriterion("ATTR_KEY <", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyLessThanOrEqualTo(String value) {
            addCriterion("ATTR_KEY <=", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyLike(String value) {
            addCriterion("ATTR_KEY like", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyNotLike(String value) {
            addCriterion("ATTR_KEY not like", value, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyIn(List<String> values) {
            addCriterion("ATTR_KEY in", values, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyNotIn(List<String> values) {
            addCriterion("ATTR_KEY not in", values, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyBetween(String value1, String value2) {
            addCriterion("ATTR_KEY between", value1, value2, "attrKey");
            return (Criteria) this;
        }

        public Criteria andAttrKeyNotBetween(String value1, String value2) {
            addCriterion("ATTR_KEY not between", value1, value2, "attrKey");
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