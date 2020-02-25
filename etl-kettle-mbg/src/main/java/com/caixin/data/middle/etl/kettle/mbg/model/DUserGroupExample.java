package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class DUserGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DUserGroupExample() {
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

        public Criteria andIdUserGroupIsNull() {
            addCriterion("ID_USER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupIsNotNull() {
            addCriterion("ID_USER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupEqualTo(Integer value) {
            addCriterion("ID_USER_GROUP =", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupNotEqualTo(Integer value) {
            addCriterion("ID_USER_GROUP <>", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupGreaterThan(Integer value) {
            addCriterion("ID_USER_GROUP >", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_USER_GROUP >=", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupLessThan(Integer value) {
            addCriterion("ID_USER_GROUP <", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupLessThanOrEqualTo(Integer value) {
            addCriterion("ID_USER_GROUP <=", value, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupIn(List<Integer> values) {
            addCriterion("ID_USER_GROUP in", values, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupNotIn(List<Integer> values) {
            addCriterion("ID_USER_GROUP not in", values, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER_GROUP between", value1, value2, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andIdUserGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER_GROUP not between", value1, value2, "idUserGroup");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNull() {
            addCriterion("USER_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNotNull() {
            addCriterion("USER_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameEqualTo(String value) {
            addCriterion("USER_GROUP_NAME =", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotEqualTo(String value) {
            addCriterion("USER_GROUP_NAME <>", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThan(String value) {
            addCriterion("USER_GROUP_NAME >", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GROUP_NAME >=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThan(String value) {
            addCriterion("USER_GROUP_NAME <", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThanOrEqualTo(String value) {
            addCriterion("USER_GROUP_NAME <=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLike(String value) {
            addCriterion("USER_GROUP_NAME like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotLike(String value) {
            addCriterion("USER_GROUP_NAME not like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIn(List<String> values) {
            addCriterion("USER_GROUP_NAME in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotIn(List<String> values) {
            addCriterion("USER_GROUP_NAME not in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameBetween(String value1, String value2) {
            addCriterion("USER_GROUP_NAME between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotBetween(String value1, String value2) {
            addCriterion("USER_GROUP_NAME not between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescIsNull() {
            addCriterion("USER_GROUP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescIsNotNull() {
            addCriterion("USER_GROUP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescEqualTo(String value) {
            addCriterion("USER_GROUP_DESC =", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescNotEqualTo(String value) {
            addCriterion("USER_GROUP_DESC <>", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescGreaterThan(String value) {
            addCriterion("USER_GROUP_DESC >", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GROUP_DESC >=", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescLessThan(String value) {
            addCriterion("USER_GROUP_DESC <", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescLessThanOrEqualTo(String value) {
            addCriterion("USER_GROUP_DESC <=", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescLike(String value) {
            addCriterion("USER_GROUP_DESC like", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescNotLike(String value) {
            addCriterion("USER_GROUP_DESC not like", value, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescIn(List<String> values) {
            addCriterion("USER_GROUP_DESC in", values, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescNotIn(List<String> values) {
            addCriterion("USER_GROUP_DESC not in", values, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescBetween(String value1, String value2) {
            addCriterion("USER_GROUP_DESC between", value1, value2, "userGroupDesc");
            return (Criteria) this;
        }

        public Criteria andUserGroupDescNotBetween(String value1, String value2) {
            addCriterion("USER_GROUP_DESC not between", value1, value2, "userGroupDesc");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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