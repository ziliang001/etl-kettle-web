package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUserGroupMemberAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DUserGroupMemberAttributeExample() {
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

        public Criteria andIdUsergroupMemberAttributeIsNull() {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeIsNotNull() {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeEqualTo(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE =", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeNotEqualTo(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE <>", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeGreaterThan(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE >", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE >=", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeLessThan(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE <", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE <=", value, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeIn(List<Integer> values) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE in", values, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeNotIn(List<Integer> values) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE not in", values, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeBetween(Integer value1, Integer value2) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE between", value1, value2, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andIdUsergroupMemberAttributeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_USERGROUP_MEMBER_ATTRIBUTE not between", value1, value2, "idUsergroupMemberAttribute");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeIsNull() {
            addCriterion("SLAVE_PERMISSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeIsNotNull() {
            addCriterion("SLAVE_PERMISSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeEqualTo(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE =", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeNotEqualTo(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE <>", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeGreaterThan(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE >", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE >=", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeLessThan(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE <", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SLAVE_PERMISSION_TYPE <=", value, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeIn(List<Integer> values) {
            addCriterion("SLAVE_PERMISSION_TYPE in", values, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeNotIn(List<Integer> values) {
            addCriterion("SLAVE_PERMISSION_TYPE not in", values, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeBetween(Integer value1, Integer value2) {
            addCriterion("SLAVE_PERMISSION_TYPE between", value1, value2, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andSlavePermissionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SLAVE_PERMISSION_TYPE not between", value1, value2, "slavePermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeIsNull() {
            addCriterion("TASK_PERMISSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeIsNotNull() {
            addCriterion("TASK_PERMISSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeEqualTo(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE =", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeNotEqualTo(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE <>", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeGreaterThan(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE >", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE >=", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeLessThan(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE <", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_PERMISSION_TYPE <=", value, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeIn(List<Integer> values) {
            addCriterion("TASK_PERMISSION_TYPE in", values, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeNotIn(List<Integer> values) {
            addCriterion("TASK_PERMISSION_TYPE not in", values, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PERMISSION_TYPE between", value1, value2, "taskPermissionType");
            return (Criteria) this;
        }

        public Criteria andTaskPermissionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_PERMISSION_TYPE not between", value1, value2, "taskPermissionType");
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