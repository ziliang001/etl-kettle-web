package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RJobentryCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RJobentryCopyExample() {
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

        public Criteria andIdJobentryCopyIsNull() {
            addCriterion("ID_JOBENTRY_COPY is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyIsNotNull() {
            addCriterion("ID_JOBENTRY_COPY is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyEqualTo(Long value) {
            addCriterion("ID_JOBENTRY_COPY =", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyNotEqualTo(Long value) {
            addCriterion("ID_JOBENTRY_COPY <>", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyGreaterThan(Long value) {
            addCriterion("ID_JOBENTRY_COPY >", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOBENTRY_COPY >=", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyLessThan(Long value) {
            addCriterion("ID_JOBENTRY_COPY <", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOBENTRY_COPY <=", value, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyIn(List<Long> values) {
            addCriterion("ID_JOBENTRY_COPY in", values, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyNotIn(List<Long> values) {
            addCriterion("ID_JOBENTRY_COPY not in", values, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyBetween(Long value1, Long value2) {
            addCriterion("ID_JOBENTRY_COPY between", value1, value2, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryCopyNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOBENTRY_COPY not between", value1, value2, "idJobentryCopy");
            return (Criteria) this;
        }

        public Criteria andIdJobentryIsNull() {
            addCriterion("ID_JOBENTRY is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryIsNotNull() {
            addCriterion("ID_JOBENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY =", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY <>", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryGreaterThan(Integer value) {
            addCriterion("ID_JOBENTRY >", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY >=", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryLessThan(Integer value) {
            addCriterion("ID_JOBENTRY <", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY <=", value, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY in", values, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY not in", values, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY between", value1, value2, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobentryNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY not between", value1, value2, "idJobentry");
            return (Criteria) this;
        }

        public Criteria andIdJobIsNull() {
            addCriterion("ID_JOB is null");
            return (Criteria) this;
        }

        public Criteria andIdJobIsNotNull() {
            addCriterion("ID_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobEqualTo(Integer value) {
            addCriterion("ID_JOB =", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotEqualTo(Integer value) {
            addCriterion("ID_JOB <>", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThan(Integer value) {
            addCriterion("ID_JOB >", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOB >=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThan(Integer value) {
            addCriterion("ID_JOB <", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOB <=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobIn(List<Integer> values) {
            addCriterion("ID_JOB in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotIn(List<Integer> values) {
            addCriterion("ID_JOB not in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOB between", value1, value2, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOB not between", value1, value2, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIsNull() {
            addCriterion("ID_JOBENTRY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIsNotNull() {
            addCriterion("ID_JOBENTRY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE =", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <>", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeGreaterThan(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE >", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE >=", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeLessThan(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_JOBENTRY_TYPE <=", value, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_TYPE in", values, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotIn(List<Integer> values) {
            addCriterion("ID_JOBENTRY_TYPE not in", values, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_TYPE between", value1, value2, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andIdJobentryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_JOBENTRY_TYPE not between", value1, value2, "idJobentryType");
            return (Criteria) this;
        }

        public Criteria andNrIsNull() {
            addCriterion("NR is null");
            return (Criteria) this;
        }

        public Criteria andNrIsNotNull() {
            addCriterion("NR is not null");
            return (Criteria) this;
        }

        public Criteria andNrEqualTo(Integer value) {
            addCriterion("NR =", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotEqualTo(Integer value) {
            addCriterion("NR <>", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThan(Integer value) {
            addCriterion("NR >", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThanOrEqualTo(Integer value) {
            addCriterion("NR >=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThan(Integer value) {
            addCriterion("NR <", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThanOrEqualTo(Integer value) {
            addCriterion("NR <=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrIn(List<Integer> values) {
            addCriterion("NR in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotIn(List<Integer> values) {
            addCriterion("NR not in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrBetween(Integer value1, Integer value2) {
            addCriterion("NR between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotBetween(Integer value1, Integer value2) {
            addCriterion("NR not between", value1, value2, "nr");
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

        public Criteria andParallelIsNull() {
            addCriterion("PARALLEL is null");
            return (Criteria) this;
        }

        public Criteria andParallelIsNotNull() {
            addCriterion("PARALLEL is not null");
            return (Criteria) this;
        }

        public Criteria andParallelEqualTo(String value) {
            addCriterion("PARALLEL =", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelNotEqualTo(String value) {
            addCriterion("PARALLEL <>", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelGreaterThan(String value) {
            addCriterion("PARALLEL >", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelGreaterThanOrEqualTo(String value) {
            addCriterion("PARALLEL >=", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelLessThan(String value) {
            addCriterion("PARALLEL <", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelLessThanOrEqualTo(String value) {
            addCriterion("PARALLEL <=", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelLike(String value) {
            addCriterion("PARALLEL like", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelNotLike(String value) {
            addCriterion("PARALLEL not like", value, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelIn(List<String> values) {
            addCriterion("PARALLEL in", values, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelNotIn(List<String> values) {
            addCriterion("PARALLEL not in", values, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelBetween(String value1, String value2) {
            addCriterion("PARALLEL between", value1, value2, "parallel");
            return (Criteria) this;
        }

        public Criteria andParallelNotBetween(String value1, String value2) {
            addCriterion("PARALLEL not between", value1, value2, "parallel");
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