package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class DTaskGroupMemberAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DTaskGroupMemberAttributeExample() {
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

        public Criteria andIdTaskGroupMemberAttributeIsNull() {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeIsNotNull() {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE =", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeNotEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE <>", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeGreaterThan(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE >", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE >=", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeLessThan(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE <", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeLessThanOrEqualTo(Long value) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE <=", value, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeIn(List<Long> values) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE in", values, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeNotIn(List<Long> values) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE not in", values, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeBetween(Long value1, Long value2) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE between", value1, value2, "idTaskGroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdTaskGroupMemberAttributeNotBetween(Long value1, Long value2) {
            addCriterion("ID_TASK_GROUP_MEMBER_ATTRIBUTE not between", value1, value2, "idTaskGroupMemberAttribute");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIdTaskIsNull() {
            addCriterion("ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andIdTaskIsNotNull() {
            addCriterion("ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andIdTaskEqualTo(Long value) {
            addCriterion("ID_TASK =", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskNotEqualTo(Long value) {
            addCriterion("ID_TASK <>", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskGreaterThan(Long value) {
            addCriterion("ID_TASK >", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TASK >=", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskLessThan(Long value) {
            addCriterion("ID_TASK <", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskLessThanOrEqualTo(Long value) {
            addCriterion("ID_TASK <=", value, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskIn(List<Long> values) {
            addCriterion("ID_TASK in", values, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskNotIn(List<Long> values) {
            addCriterion("ID_TASK not in", values, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskBetween(Long value1, Long value2) {
            addCriterion("ID_TASK between", value1, value2, "idTask");
            return (Criteria) this;
        }

        public Criteria andIdTaskNotBetween(Long value1, Long value2) {
            addCriterion("ID_TASK not between", value1, value2, "idTask");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskPathIsNull() {
            addCriterion("TASK_PATH is null");
            return (Criteria) this;
        }

        public Criteria andTaskPathIsNotNull() {
            addCriterion("TASK_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPathEqualTo(String value) {
            addCriterion("TASK_PATH =", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathNotEqualTo(String value) {
            addCriterion("TASK_PATH <>", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathGreaterThan(String value) {
            addCriterion("TASK_PATH >", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PATH >=", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathLessThan(String value) {
            addCriterion("TASK_PATH <", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathLessThanOrEqualTo(String value) {
            addCriterion("TASK_PATH <=", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathLike(String value) {
            addCriterion("TASK_PATH like", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathNotLike(String value) {
            addCriterion("TASK_PATH not like", value, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathIn(List<String> values) {
            addCriterion("TASK_PATH in", values, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathNotIn(List<String> values) {
            addCriterion("TASK_PATH not in", values, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathBetween(String value1, String value2) {
            addCriterion("TASK_PATH between", value1, value2, "taskPath");
            return (Criteria) this;
        }

        public Criteria andTaskPathNotBetween(String value1, String value2) {
            addCriterion("TASK_PATH not between", value1, value2, "taskPath");
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