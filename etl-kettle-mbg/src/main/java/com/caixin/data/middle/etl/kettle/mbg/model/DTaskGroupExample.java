package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DTaskGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DTaskGroupExample() {
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

        public Criteria andIdTaskGroupIsNull() {
            addCriterion("ID_TASK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupIsNotNull() {
            addCriterion("ID_TASK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP =", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupNotEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP <>", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupGreaterThan(Long value) {
            addCriterion("ID_TASK_GROUP >", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP >=", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupLessThan(Long value) {
            addCriterion("ID_TASK_GROUP <", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupLessThanOrEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP <=", value, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupIn(List<Long> values) {
            addCriterion("ID_TASK_GROUP in", values, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupNotIn(List<Long> values) {
            addCriterion("ID_TASK_GROUP not in", values, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupBetween(Long value1, Long value2) {
            addCriterion("ID_TASK_GROUP between", value1, value2, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupNotBetween(Long value1, Long value2) {
            addCriterion("ID_TASK_GROUP not between", value1, value2, "idTaskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameIsNull() {
            addCriterion("TASK_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameIsNotNull() {
            addCriterion("TASK_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameEqualTo(String value) {
            addCriterion("TASK_GROUP_NAME =", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotEqualTo(String value) {
            addCriterion("TASK_GROUP_NAME <>", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameGreaterThan(String value) {
            addCriterion("TASK_GROUP_NAME >", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_GROUP_NAME >=", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLessThan(String value) {
            addCriterion("TASK_GROUP_NAME <", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_GROUP_NAME <=", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLike(String value) {
            addCriterion("TASK_GROUP_NAME like", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotLike(String value) {
            addCriterion("TASK_GROUP_NAME not like", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameIn(List<String> values) {
            addCriterion("TASK_GROUP_NAME in", values, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotIn(List<String> values) {
            addCriterion("TASK_GROUP_NAME not in", values, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameBetween(String value1, String value2) {
            addCriterion("TASK_GROUP_NAME between", value1, value2, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotBetween(String value1, String value2) {
            addCriterion("TASK_GROUP_NAME not between", value1, value2, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNull() {
            addCriterion("TASK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNotNull() {
            addCriterion("TASK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescEqualTo(String value) {
            addCriterion("TASK_DESC =", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotEqualTo(String value) {
            addCriterion("TASK_DESC <>", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThan(String value) {
            addCriterion("TASK_DESC >", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DESC >=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThan(String value) {
            addCriterion("TASK_DESC <", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThanOrEqualTo(String value) {
            addCriterion("TASK_DESC <=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLike(String value) {
            addCriterion("TASK_DESC like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotLike(String value) {
            addCriterion("TASK_DESC not like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescIn(List<String> values) {
            addCriterion("TASK_DESC in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotIn(List<String> values) {
            addCriterion("TASK_DESC not in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescBetween(String value1, String value2) {
            addCriterion("TASK_DESC between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotBetween(String value1, String value2) {
            addCriterion("TASK_DESC not between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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