package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RDatabaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RDatabaseExample() {
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

        public Criteria andIdDatabaseIsNull() {
            addCriterion("ID_DATABASE is null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseIsNotNull() {
            addCriterion("ID_DATABASE is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseEqualTo(Long value) {
            addCriterion("ID_DATABASE =", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseNotEqualTo(Long value) {
            addCriterion("ID_DATABASE <>", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseGreaterThan(Long value) {
            addCriterion("ID_DATABASE >", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_DATABASE >=", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLessThan(Long value) {
            addCriterion("ID_DATABASE <", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLessThanOrEqualTo(Long value) {
            addCriterion("ID_DATABASE <=", value, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseIn(List<Long> values) {
            addCriterion("ID_DATABASE in", values, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseNotIn(List<Long> values) {
            addCriterion("ID_DATABASE not in", values, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseBetween(Long value1, Long value2) {
            addCriterion("ID_DATABASE between", value1, value2, "idDatabase");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseNotBetween(Long value1, Long value2) {
            addCriterion("ID_DATABASE not between", value1, value2, "idDatabase");
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

        public Criteria andIdDatabaseTypeIsNull() {
            addCriterion("ID_DATABASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeIsNotNull() {
            addCriterion("ID_DATABASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeEqualTo(Integer value) {
            addCriterion("ID_DATABASE_TYPE =", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeNotEqualTo(Integer value) {
            addCriterion("ID_DATABASE_TYPE <>", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeGreaterThan(Integer value) {
            addCriterion("ID_DATABASE_TYPE >", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_TYPE >=", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeLessThan(Integer value) {
            addCriterion("ID_DATABASE_TYPE <", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_TYPE <=", value, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeIn(List<Integer> values) {
            addCriterion("ID_DATABASE_TYPE in", values, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeNotIn(List<Integer> values) {
            addCriterion("ID_DATABASE_TYPE not in", values, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_TYPE between", value1, value2, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_TYPE not between", value1, value2, "idDatabaseType");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeIsNull() {
            addCriterion("ID_DATABASE_CONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeIsNotNull() {
            addCriterion("ID_DATABASE_CONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeEqualTo(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE =", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeNotEqualTo(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE <>", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeGreaterThan(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE >", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE >=", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeLessThan(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE <", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_CONTYPE <=", value, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeIn(List<Integer> values) {
            addCriterion("ID_DATABASE_CONTYPE in", values, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeNotIn(List<Integer> values) {
            addCriterion("ID_DATABASE_CONTYPE not in", values, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_CONTYPE between", value1, value2, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseContypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_CONTYPE not between", value1, value2, "idDatabaseContype");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andServernameIsNull() {
            addCriterion("SERVERNAME is null");
            return (Criteria) this;
        }

        public Criteria andServernameIsNotNull() {
            addCriterion("SERVERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andServernameEqualTo(String value) {
            addCriterion("SERVERNAME =", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotEqualTo(String value) {
            addCriterion("SERVERNAME <>", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameGreaterThan(String value) {
            addCriterion("SERVERNAME >", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVERNAME >=", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLessThan(String value) {
            addCriterion("SERVERNAME <", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLessThanOrEqualTo(String value) {
            addCriterion("SERVERNAME <=", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLike(String value) {
            addCriterion("SERVERNAME like", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotLike(String value) {
            addCriterion("SERVERNAME not like", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameIn(List<String> values) {
            addCriterion("SERVERNAME in", values, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotIn(List<String> values) {
            addCriterion("SERVERNAME not in", values, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameBetween(String value1, String value2) {
            addCriterion("SERVERNAME between", value1, value2, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotBetween(String value1, String value2) {
            addCriterion("SERVERNAME not between", value1, value2, "servername");
            return (Criteria) this;
        }

        public Criteria andDataTbsIsNull() {
            addCriterion("DATA_TBS is null");
            return (Criteria) this;
        }

        public Criteria andDataTbsIsNotNull() {
            addCriterion("DATA_TBS is not null");
            return (Criteria) this;
        }

        public Criteria andDataTbsEqualTo(String value) {
            addCriterion("DATA_TBS =", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsNotEqualTo(String value) {
            addCriterion("DATA_TBS <>", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsGreaterThan(String value) {
            addCriterion("DATA_TBS >", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TBS >=", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsLessThan(String value) {
            addCriterion("DATA_TBS <", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsLessThanOrEqualTo(String value) {
            addCriterion("DATA_TBS <=", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsLike(String value) {
            addCriterion("DATA_TBS like", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsNotLike(String value) {
            addCriterion("DATA_TBS not like", value, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsIn(List<String> values) {
            addCriterion("DATA_TBS in", values, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsNotIn(List<String> values) {
            addCriterion("DATA_TBS not in", values, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsBetween(String value1, String value2) {
            addCriterion("DATA_TBS between", value1, value2, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andDataTbsNotBetween(String value1, String value2) {
            addCriterion("DATA_TBS not between", value1, value2, "dataTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsIsNull() {
            addCriterion("INDEX_TBS is null");
            return (Criteria) this;
        }

        public Criteria andIndexTbsIsNotNull() {
            addCriterion("INDEX_TBS is not null");
            return (Criteria) this;
        }

        public Criteria andIndexTbsEqualTo(String value) {
            addCriterion("INDEX_TBS =", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsNotEqualTo(String value) {
            addCriterion("INDEX_TBS <>", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsGreaterThan(String value) {
            addCriterion("INDEX_TBS >", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_TBS >=", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsLessThan(String value) {
            addCriterion("INDEX_TBS <", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsLessThanOrEqualTo(String value) {
            addCriterion("INDEX_TBS <=", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsLike(String value) {
            addCriterion("INDEX_TBS like", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsNotLike(String value) {
            addCriterion("INDEX_TBS not like", value, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsIn(List<String> values) {
            addCriterion("INDEX_TBS in", values, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsNotIn(List<String> values) {
            addCriterion("INDEX_TBS not in", values, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsBetween(String value1, String value2) {
            addCriterion("INDEX_TBS between", value1, value2, "indexTbs");
            return (Criteria) this;
        }

        public Criteria andIndexTbsNotBetween(String value1, String value2) {
            addCriterion("INDEX_TBS not between", value1, value2, "indexTbs");
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