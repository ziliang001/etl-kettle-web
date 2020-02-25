package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RStepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RStepExample() {
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

        public Criteria andIdStepIsNull() {
            addCriterion("ID_STEP is null");
            return (Criteria) this;
        }

        public Criteria andIdStepIsNotNull() {
            addCriterion("ID_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepEqualTo(Long value) {
            addCriterion("ID_STEP =", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotEqualTo(Long value) {
            addCriterion("ID_STEP <>", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepGreaterThan(Long value) {
            addCriterion("ID_STEP >", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_STEP >=", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepLessThan(Long value) {
            addCriterion("ID_STEP <", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepLessThanOrEqualTo(Long value) {
            addCriterion("ID_STEP <=", value, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepIn(List<Long> values) {
            addCriterion("ID_STEP in", values, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotIn(List<Long> values) {
            addCriterion("ID_STEP not in", values, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepBetween(Long value1, Long value2) {
            addCriterion("ID_STEP between", value1, value2, "idStep");
            return (Criteria) this;
        }

        public Criteria andIdStepNotBetween(Long value1, Long value2) {
            addCriterion("ID_STEP not between", value1, value2, "idStep");
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

        public Criteria andIdStepTypeIsNull() {
            addCriterion("ID_STEP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeIsNotNull() {
            addCriterion("ID_STEP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeEqualTo(Integer value) {
            addCriterion("ID_STEP_TYPE =", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotEqualTo(Integer value) {
            addCriterion("ID_STEP_TYPE <>", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeGreaterThan(Integer value) {
            addCriterion("ID_STEP_TYPE >", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_TYPE >=", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeLessThan(Integer value) {
            addCriterion("ID_STEP_TYPE <", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_TYPE <=", value, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeIn(List<Integer> values) {
            addCriterion("ID_STEP_TYPE in", values, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotIn(List<Integer> values) {
            addCriterion("ID_STEP_TYPE not in", values, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_TYPE between", value1, value2, "idStepType");
            return (Criteria) this;
        }

        public Criteria andIdStepTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_TYPE not between", value1, value2, "idStepType");
            return (Criteria) this;
        }

        public Criteria andDistributeIsNull() {
            addCriterion("DISTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andDistributeIsNotNull() {
            addCriterion("DISTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeEqualTo(String value) {
            addCriterion("DISTRIBUTE =", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeNotEqualTo(String value) {
            addCriterion("DISTRIBUTE <>", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeGreaterThan(String value) {
            addCriterion("DISTRIBUTE >", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTE >=", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeLessThan(String value) {
            addCriterion("DISTRIBUTE <", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeLessThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTE <=", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeLike(String value) {
            addCriterion("DISTRIBUTE like", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeNotLike(String value) {
            addCriterion("DISTRIBUTE not like", value, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeIn(List<String> values) {
            addCriterion("DISTRIBUTE in", values, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeNotIn(List<String> values) {
            addCriterion("DISTRIBUTE not in", values, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeBetween(String value1, String value2) {
            addCriterion("DISTRIBUTE between", value1, value2, "distribute");
            return (Criteria) this;
        }

        public Criteria andDistributeNotBetween(String value1, String value2) {
            addCriterion("DISTRIBUTE not between", value1, value2, "distribute");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNull() {
            addCriterion("COPIES is null");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNotNull() {
            addCriterion("COPIES is not null");
            return (Criteria) this;
        }

        public Criteria andCopiesEqualTo(Integer value) {
            addCriterion("COPIES =", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotEqualTo(Integer value) {
            addCriterion("COPIES <>", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThan(Integer value) {
            addCriterion("COPIES >", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("COPIES >=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThan(Integer value) {
            addCriterion("COPIES <", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThanOrEqualTo(Integer value) {
            addCriterion("COPIES <=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesIn(List<Integer> values) {
            addCriterion("COPIES in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotIn(List<Integer> values) {
            addCriterion("COPIES not in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesBetween(Integer value1, Integer value2) {
            addCriterion("COPIES between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotBetween(Integer value1, Integer value2) {
            addCriterion("COPIES not between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIsNull() {
            addCriterion("GUI_LOCATION_X is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIsNotNull() {
            addCriterion("GUI_LOCATION_X is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X =", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X <>", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_X >", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X >=", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXLessThan(Integer value) {
            addCriterion("GUI_LOCATION_X <", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X <=", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_X in", values, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_X not in", values, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_X between", value1, value2, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_X not between", value1, value2, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIsNull() {
            addCriterion("GUI_LOCATION_Y is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIsNotNull() {
            addCriterion("GUI_LOCATION_Y is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y =", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y <>", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_Y >", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y >=", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYLessThan(Integer value) {
            addCriterion("GUI_LOCATION_Y <", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y <=", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_Y in", values, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_Y not in", values, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_Y between", value1, value2, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_Y not between", value1, value2, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiDrawIsNull() {
            addCriterion("GUI_DRAW is null");
            return (Criteria) this;
        }

        public Criteria andGuiDrawIsNotNull() {
            addCriterion("GUI_DRAW is not null");
            return (Criteria) this;
        }

        public Criteria andGuiDrawEqualTo(String value) {
            addCriterion("GUI_DRAW =", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawNotEqualTo(String value) {
            addCriterion("GUI_DRAW <>", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawGreaterThan(String value) {
            addCriterion("GUI_DRAW >", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawGreaterThanOrEqualTo(String value) {
            addCriterion("GUI_DRAW >=", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawLessThan(String value) {
            addCriterion("GUI_DRAW <", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawLessThanOrEqualTo(String value) {
            addCriterion("GUI_DRAW <=", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawLike(String value) {
            addCriterion("GUI_DRAW like", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawNotLike(String value) {
            addCriterion("GUI_DRAW not like", value, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawIn(List<String> values) {
            addCriterion("GUI_DRAW in", values, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawNotIn(List<String> values) {
            addCriterion("GUI_DRAW not in", values, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawBetween(String value1, String value2) {
            addCriterion("GUI_DRAW between", value1, value2, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andGuiDrawNotBetween(String value1, String value2) {
            addCriterion("GUI_DRAW not between", value1, value2, "guiDraw");
            return (Criteria) this;
        }

        public Criteria andCopiesStringIsNull() {
            addCriterion("COPIES_STRING is null");
            return (Criteria) this;
        }

        public Criteria andCopiesStringIsNotNull() {
            addCriterion("COPIES_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andCopiesStringEqualTo(String value) {
            addCriterion("COPIES_STRING =", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringNotEqualTo(String value) {
            addCriterion("COPIES_STRING <>", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringGreaterThan(String value) {
            addCriterion("COPIES_STRING >", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringGreaterThanOrEqualTo(String value) {
            addCriterion("COPIES_STRING >=", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringLessThan(String value) {
            addCriterion("COPIES_STRING <", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringLessThanOrEqualTo(String value) {
            addCriterion("COPIES_STRING <=", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringLike(String value) {
            addCriterion("COPIES_STRING like", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringNotLike(String value) {
            addCriterion("COPIES_STRING not like", value, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringIn(List<String> values) {
            addCriterion("COPIES_STRING in", values, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringNotIn(List<String> values) {
            addCriterion("COPIES_STRING not in", values, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringBetween(String value1, String value2) {
            addCriterion("COPIES_STRING between", value1, value2, "copiesString");
            return (Criteria) this;
        }

        public Criteria andCopiesStringNotBetween(String value1, String value2) {
            addCriterion("COPIES_STRING not between", value1, value2, "copiesString");
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