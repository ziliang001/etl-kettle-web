package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RLogExample() {
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

        public Criteria andIdLogIsNull() {
            addCriterion("ID_LOG is null");
            return (Criteria) this;
        }

        public Criteria andIdLogIsNotNull() {
            addCriterion("ID_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andIdLogEqualTo(Long value) {
            addCriterion("ID_LOG =", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogNotEqualTo(Long value) {
            addCriterion("ID_LOG <>", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogGreaterThan(Long value) {
            addCriterion("ID_LOG >", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_LOG >=", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogLessThan(Long value) {
            addCriterion("ID_LOG <", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogLessThanOrEqualTo(Long value) {
            addCriterion("ID_LOG <=", value, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogIn(List<Long> values) {
            addCriterion("ID_LOG in", values, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogNotIn(List<Long> values) {
            addCriterion("ID_LOG not in", values, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogBetween(Long value1, Long value2) {
            addCriterion("ID_LOG between", value1, value2, "idLog");
            return (Criteria) this;
        }

        public Criteria andIdLogNotBetween(Long value1, Long value2) {
            addCriterion("ID_LOG not between", value1, value2, "idLog");
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

        public Criteria andIdLoglevelIsNull() {
            addCriterion("ID_LOGLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelIsNotNull() {
            addCriterion("ID_LOGLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelEqualTo(Integer value) {
            addCriterion("ID_LOGLEVEL =", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelNotEqualTo(Integer value) {
            addCriterion("ID_LOGLEVEL <>", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelGreaterThan(Integer value) {
            addCriterion("ID_LOGLEVEL >", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_LOGLEVEL >=", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelLessThan(Integer value) {
            addCriterion("ID_LOGLEVEL <", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelLessThanOrEqualTo(Integer value) {
            addCriterion("ID_LOGLEVEL <=", value, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelIn(List<Integer> values) {
            addCriterion("ID_LOGLEVEL in", values, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelNotIn(List<Integer> values) {
            addCriterion("ID_LOGLEVEL not in", values, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelBetween(Integer value1, Integer value2) {
            addCriterion("ID_LOGLEVEL between", value1, value2, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andIdLoglevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_LOGLEVEL not between", value1, value2, "idLoglevel");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNull() {
            addCriterion("LOGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("LOGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(String value) {
            addCriterion("LOGTYPE =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(String value) {
            addCriterion("LOGTYPE <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(String value) {
            addCriterion("LOGTYPE >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGTYPE >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(String value) {
            addCriterion("LOGTYPE <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(String value) {
            addCriterion("LOGTYPE <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLike(String value) {
            addCriterion("LOGTYPE like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotLike(String value) {
            addCriterion("LOGTYPE not like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<String> values) {
            addCriterion("LOGTYPE in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<String> values) {
            addCriterion("LOGTYPE not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(String value1, String value2) {
            addCriterion("LOGTYPE between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(String value1, String value2) {
            addCriterion("LOGTYPE not between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFileextentionIsNull() {
            addCriterion("FILEEXTENTION is null");
            return (Criteria) this;
        }

        public Criteria andFileextentionIsNotNull() {
            addCriterion("FILEEXTENTION is not null");
            return (Criteria) this;
        }

        public Criteria andFileextentionEqualTo(String value) {
            addCriterion("FILEEXTENTION =", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionNotEqualTo(String value) {
            addCriterion("FILEEXTENTION <>", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionGreaterThan(String value) {
            addCriterion("FILEEXTENTION >", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionGreaterThanOrEqualTo(String value) {
            addCriterion("FILEEXTENTION >=", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionLessThan(String value) {
            addCriterion("FILEEXTENTION <", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionLessThanOrEqualTo(String value) {
            addCriterion("FILEEXTENTION <=", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionLike(String value) {
            addCriterion("FILEEXTENTION like", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionNotLike(String value) {
            addCriterion("FILEEXTENTION not like", value, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionIn(List<String> values) {
            addCriterion("FILEEXTENTION in", values, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionNotIn(List<String> values) {
            addCriterion("FILEEXTENTION not in", values, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionBetween(String value1, String value2) {
            addCriterion("FILEEXTENTION between", value1, value2, "fileextention");
            return (Criteria) this;
        }

        public Criteria andFileextentionNotBetween(String value1, String value2) {
            addCriterion("FILEEXTENTION not between", value1, value2, "fileextention");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("ADD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("ADD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(String value) {
            addCriterion("ADD_DATE =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(String value) {
            addCriterion("ADD_DATE <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(String value) {
            addCriterion("ADD_DATE >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_DATE >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(String value) {
            addCriterion("ADD_DATE <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(String value) {
            addCriterion("ADD_DATE <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLike(String value) {
            addCriterion("ADD_DATE like", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotLike(String value) {
            addCriterion("ADD_DATE not like", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<String> values) {
            addCriterion("ADD_DATE in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<String> values) {
            addCriterion("ADD_DATE not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(String value1, String value2) {
            addCriterion("ADD_DATE between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(String value1, String value2) {
            addCriterion("ADD_DATE not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("ADD_TIME like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("ADD_TIME not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogIsNull() {
            addCriterion("ID_DATABASE_LOG is null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogIsNotNull() {
            addCriterion("ID_DATABASE_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogEqualTo(Integer value) {
            addCriterion("ID_DATABASE_LOG =", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogNotEqualTo(Integer value) {
            addCriterion("ID_DATABASE_LOG <>", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogGreaterThan(Integer value) {
            addCriterion("ID_DATABASE_LOG >", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_LOG >=", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogLessThan(Integer value) {
            addCriterion("ID_DATABASE_LOG <", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogLessThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_LOG <=", value, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogIn(List<Integer> values) {
            addCriterion("ID_DATABASE_LOG in", values, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogNotIn(List<Integer> values) {
            addCriterion("ID_DATABASE_LOG not in", values, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_LOG between", value1, value2, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseLogNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_LOG not between", value1, value2, "idDatabaseLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogIsNull() {
            addCriterion("TABLE_NAME_LOG is null");
            return (Criteria) this;
        }

        public Criteria andTableNameLogIsNotNull() {
            addCriterion("TABLE_NAME_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameLogEqualTo(String value) {
            addCriterion("TABLE_NAME_LOG =", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogNotEqualTo(String value) {
            addCriterion("TABLE_NAME_LOG <>", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogGreaterThan(String value) {
            addCriterion("TABLE_NAME_LOG >", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME_LOG >=", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogLessThan(String value) {
            addCriterion("TABLE_NAME_LOG <", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME_LOG <=", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogLike(String value) {
            addCriterion("TABLE_NAME_LOG like", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogNotLike(String value) {
            addCriterion("TABLE_NAME_LOG not like", value, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogIn(List<String> values) {
            addCriterion("TABLE_NAME_LOG in", values, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogNotIn(List<String> values) {
            addCriterion("TABLE_NAME_LOG not in", values, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogBetween(String value1, String value2) {
            addCriterion("TABLE_NAME_LOG between", value1, value2, "tableNameLog");
            return (Criteria) this;
        }

        public Criteria andTableNameLogNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME_LOG not between", value1, value2, "tableNameLog");
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