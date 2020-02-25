package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RTransformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RTransformationExample() {
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

        public Criteria andIdTransformationIsNull() {
            addCriterion("ID_TRANSFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIsNotNull() {
            addCriterion("ID_TRANSFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransformationEqualTo(Long value) {
            addCriterion("ID_TRANSFORMATION =", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotEqualTo(Long value) {
            addCriterion("ID_TRANSFORMATION <>", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThan(Long value) {
            addCriterion("ID_TRANSFORMATION >", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_TRANSFORMATION >=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThan(Long value) {
            addCriterion("ID_TRANSFORMATION <", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationLessThanOrEqualTo(Long value) {
            addCriterion("ID_TRANSFORMATION <=", value, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationIn(List<Long> values) {
            addCriterion("ID_TRANSFORMATION in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotIn(List<Long> values) {
            addCriterion("ID_TRANSFORMATION not in", values, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationBetween(Long value1, Long value2) {
            addCriterion("ID_TRANSFORMATION between", value1, value2, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdTransformationNotBetween(Long value1, Long value2) {
            addCriterion("ID_TRANSFORMATION not between", value1, value2, "idTransformation");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryIsNull() {
            addCriterion("ID_DIRECTORY is null");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryIsNotNull() {
            addCriterion("ID_DIRECTORY is not null");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryEqualTo(Integer value) {
            addCriterion("ID_DIRECTORY =", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryNotEqualTo(Integer value) {
            addCriterion("ID_DIRECTORY <>", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryGreaterThan(Integer value) {
            addCriterion("ID_DIRECTORY >", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_DIRECTORY >=", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryLessThan(Integer value) {
            addCriterion("ID_DIRECTORY <", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryLessThanOrEqualTo(Integer value) {
            addCriterion("ID_DIRECTORY <=", value, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryIn(List<Integer> values) {
            addCriterion("ID_DIRECTORY in", values, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryNotIn(List<Integer> values) {
            addCriterion("ID_DIRECTORY not in", values, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryBetween(Integer value1, Integer value2) {
            addCriterion("ID_DIRECTORY between", value1, value2, "idDirectory");
            return (Criteria) this;
        }

        public Criteria andIdDirectoryNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_DIRECTORY not between", value1, value2, "idDirectory");
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

        public Criteria andTransVersionIsNull() {
            addCriterion("TRANS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andTransVersionIsNotNull() {
            addCriterion("TRANS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andTransVersionEqualTo(String value) {
            addCriterion("TRANS_VERSION =", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotEqualTo(String value) {
            addCriterion("TRANS_VERSION <>", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionGreaterThan(String value) {
            addCriterion("TRANS_VERSION >", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_VERSION >=", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLessThan(String value) {
            addCriterion("TRANS_VERSION <", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLessThanOrEqualTo(String value) {
            addCriterion("TRANS_VERSION <=", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLike(String value) {
            addCriterion("TRANS_VERSION like", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotLike(String value) {
            addCriterion("TRANS_VERSION not like", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionIn(List<String> values) {
            addCriterion("TRANS_VERSION in", values, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotIn(List<String> values) {
            addCriterion("TRANS_VERSION not in", values, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionBetween(String value1, String value2) {
            addCriterion("TRANS_VERSION between", value1, value2, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotBetween(String value1, String value2) {
            addCriterion("TRANS_VERSION not between", value1, value2, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNull() {
            addCriterion("TRANS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNotNull() {
            addCriterion("TRANS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransStatusEqualTo(Integer value) {
            addCriterion("TRANS_STATUS =", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotEqualTo(Integer value) {
            addCriterion("TRANS_STATUS <>", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThan(Integer value) {
            addCriterion("TRANS_STATUS >", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_STATUS >=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThan(Integer value) {
            addCriterion("TRANS_STATUS <", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_STATUS <=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusIn(List<Integer> values) {
            addCriterion("TRANS_STATUS in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotIn(List<Integer> values) {
            addCriterion("TRANS_STATUS not in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_STATUS between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_STATUS not between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andIdStepReadIsNull() {
            addCriterion("ID_STEP_READ is null");
            return (Criteria) this;
        }

        public Criteria andIdStepReadIsNotNull() {
            addCriterion("ID_STEP_READ is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepReadEqualTo(Integer value) {
            addCriterion("ID_STEP_READ =", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadNotEqualTo(Integer value) {
            addCriterion("ID_STEP_READ <>", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadGreaterThan(Integer value) {
            addCriterion("ID_STEP_READ >", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_READ >=", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadLessThan(Integer value) {
            addCriterion("ID_STEP_READ <", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_READ <=", value, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadIn(List<Integer> values) {
            addCriterion("ID_STEP_READ in", values, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadNotIn(List<Integer> values) {
            addCriterion("ID_STEP_READ not in", values, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_READ between", value1, value2, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepReadNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_READ not between", value1, value2, "idStepRead");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteIsNull() {
            addCriterion("ID_STEP_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteIsNotNull() {
            addCriterion("ID_STEP_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteEqualTo(Integer value) {
            addCriterion("ID_STEP_WRITE =", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteNotEqualTo(Integer value) {
            addCriterion("ID_STEP_WRITE <>", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteGreaterThan(Integer value) {
            addCriterion("ID_STEP_WRITE >", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_WRITE >=", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteLessThan(Integer value) {
            addCriterion("ID_STEP_WRITE <", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_WRITE <=", value, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteIn(List<Integer> values) {
            addCriterion("ID_STEP_WRITE in", values, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteNotIn(List<Integer> values) {
            addCriterion("ID_STEP_WRITE not in", values, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_WRITE between", value1, value2, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepWriteNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_WRITE not between", value1, value2, "idStepWrite");
            return (Criteria) this;
        }

        public Criteria andIdStepInputIsNull() {
            addCriterion("ID_STEP_INPUT is null");
            return (Criteria) this;
        }

        public Criteria andIdStepInputIsNotNull() {
            addCriterion("ID_STEP_INPUT is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepInputEqualTo(Integer value) {
            addCriterion("ID_STEP_INPUT =", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputNotEqualTo(Integer value) {
            addCriterion("ID_STEP_INPUT <>", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputGreaterThan(Integer value) {
            addCriterion("ID_STEP_INPUT >", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_INPUT >=", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputLessThan(Integer value) {
            addCriterion("ID_STEP_INPUT <", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_INPUT <=", value, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputIn(List<Integer> values) {
            addCriterion("ID_STEP_INPUT in", values, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputNotIn(List<Integer> values) {
            addCriterion("ID_STEP_INPUT not in", values, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_INPUT between", value1, value2, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepInputNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_INPUT not between", value1, value2, "idStepInput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputIsNull() {
            addCriterion("ID_STEP_OUTPUT is null");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputIsNotNull() {
            addCriterion("ID_STEP_OUTPUT is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputEqualTo(Integer value) {
            addCriterion("ID_STEP_OUTPUT =", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputNotEqualTo(Integer value) {
            addCriterion("ID_STEP_OUTPUT <>", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputGreaterThan(Integer value) {
            addCriterion("ID_STEP_OUTPUT >", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_OUTPUT >=", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputLessThan(Integer value) {
            addCriterion("ID_STEP_OUTPUT <", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_OUTPUT <=", value, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputIn(List<Integer> values) {
            addCriterion("ID_STEP_OUTPUT in", values, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputNotIn(List<Integer> values) {
            addCriterion("ID_STEP_OUTPUT not in", values, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_OUTPUT between", value1, value2, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepOutputNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_OUTPUT not between", value1, value2, "idStepOutput");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateIsNull() {
            addCriterion("ID_STEP_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateIsNotNull() {
            addCriterion("ID_STEP_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateEqualTo(Integer value) {
            addCriterion("ID_STEP_UPDATE =", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateNotEqualTo(Integer value) {
            addCriterion("ID_STEP_UPDATE <>", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateGreaterThan(Integer value) {
            addCriterion("ID_STEP_UPDATE >", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_UPDATE >=", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateLessThan(Integer value) {
            addCriterion("ID_STEP_UPDATE <", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("ID_STEP_UPDATE <=", value, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateIn(List<Integer> values) {
            addCriterion("ID_STEP_UPDATE in", values, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateNotIn(List<Integer> values) {
            addCriterion("ID_STEP_UPDATE not in", values, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_UPDATE between", value1, value2, "idStepUpdate");
            return (Criteria) this;
        }

        public Criteria andIdStepUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_STEP_UPDATE not between", value1, value2, "idStepUpdate");
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

        public Criteria andUseBatchidIsNull() {
            addCriterion("USE_BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andUseBatchidIsNotNull() {
            addCriterion("USE_BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andUseBatchidEqualTo(String value) {
            addCriterion("USE_BATCHID =", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidNotEqualTo(String value) {
            addCriterion("USE_BATCHID <>", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidGreaterThan(String value) {
            addCriterion("USE_BATCHID >", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("USE_BATCHID >=", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidLessThan(String value) {
            addCriterion("USE_BATCHID <", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidLessThanOrEqualTo(String value) {
            addCriterion("USE_BATCHID <=", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidLike(String value) {
            addCriterion("USE_BATCHID like", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidNotLike(String value) {
            addCriterion("USE_BATCHID not like", value, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidIn(List<String> values) {
            addCriterion("USE_BATCHID in", values, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidNotIn(List<String> values) {
            addCriterion("USE_BATCHID not in", values, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidBetween(String value1, String value2) {
            addCriterion("USE_BATCHID between", value1, value2, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseBatchidNotBetween(String value1, String value2) {
            addCriterion("USE_BATCHID not between", value1, value2, "useBatchid");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldIsNull() {
            addCriterion("USE_LOGFIELD is null");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldIsNotNull() {
            addCriterion("USE_LOGFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldEqualTo(String value) {
            addCriterion("USE_LOGFIELD =", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldNotEqualTo(String value) {
            addCriterion("USE_LOGFIELD <>", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldGreaterThan(String value) {
            addCriterion("USE_LOGFIELD >", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldGreaterThanOrEqualTo(String value) {
            addCriterion("USE_LOGFIELD >=", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldLessThan(String value) {
            addCriterion("USE_LOGFIELD <", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldLessThanOrEqualTo(String value) {
            addCriterion("USE_LOGFIELD <=", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldLike(String value) {
            addCriterion("USE_LOGFIELD like", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldNotLike(String value) {
            addCriterion("USE_LOGFIELD not like", value, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldIn(List<String> values) {
            addCriterion("USE_LOGFIELD in", values, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldNotIn(List<String> values) {
            addCriterion("USE_LOGFIELD not in", values, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldBetween(String value1, String value2) {
            addCriterion("USE_LOGFIELD between", value1, value2, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andUseLogfieldNotBetween(String value1, String value2) {
            addCriterion("USE_LOGFIELD not between", value1, value2, "useLogfield");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateIsNull() {
            addCriterion("ID_DATABASE_MAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateIsNotNull() {
            addCriterion("ID_DATABASE_MAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateEqualTo(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE =", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateNotEqualTo(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE <>", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateGreaterThan(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE >", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE >=", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateLessThan(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE <", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateLessThanOrEqualTo(Integer value) {
            addCriterion("ID_DATABASE_MAXDATE <=", value, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateIn(List<Integer> values) {
            addCriterion("ID_DATABASE_MAXDATE in", values, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateNotIn(List<Integer> values) {
            addCriterion("ID_DATABASE_MAXDATE not in", values, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_MAXDATE between", value1, value2, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andIdDatabaseMaxdateNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_DATABASE_MAXDATE not between", value1, value2, "idDatabaseMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateIsNull() {
            addCriterion("TABLE_NAME_MAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateIsNotNull() {
            addCriterion("TABLE_NAME_MAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateEqualTo(String value) {
            addCriterion("TABLE_NAME_MAXDATE =", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateNotEqualTo(String value) {
            addCriterion("TABLE_NAME_MAXDATE <>", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateGreaterThan(String value) {
            addCriterion("TABLE_NAME_MAXDATE >", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME_MAXDATE >=", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateLessThan(String value) {
            addCriterion("TABLE_NAME_MAXDATE <", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME_MAXDATE <=", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateLike(String value) {
            addCriterion("TABLE_NAME_MAXDATE like", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateNotLike(String value) {
            addCriterion("TABLE_NAME_MAXDATE not like", value, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateIn(List<String> values) {
            addCriterion("TABLE_NAME_MAXDATE in", values, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateNotIn(List<String> values) {
            addCriterion("TABLE_NAME_MAXDATE not in", values, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateBetween(String value1, String value2) {
            addCriterion("TABLE_NAME_MAXDATE between", value1, value2, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andTableNameMaxdateNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME_MAXDATE not between", value1, value2, "tableNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateIsNull() {
            addCriterion("FIELD_NAME_MAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateIsNotNull() {
            addCriterion("FIELD_NAME_MAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateEqualTo(String value) {
            addCriterion("FIELD_NAME_MAXDATE =", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateNotEqualTo(String value) {
            addCriterion("FIELD_NAME_MAXDATE <>", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateGreaterThan(String value) {
            addCriterion("FIELD_NAME_MAXDATE >", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME_MAXDATE >=", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateLessThan(String value) {
            addCriterion("FIELD_NAME_MAXDATE <", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME_MAXDATE <=", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateLike(String value) {
            addCriterion("FIELD_NAME_MAXDATE like", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateNotLike(String value) {
            addCriterion("FIELD_NAME_MAXDATE not like", value, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateIn(List<String> values) {
            addCriterion("FIELD_NAME_MAXDATE in", values, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateNotIn(List<String> values) {
            addCriterion("FIELD_NAME_MAXDATE not in", values, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateBetween(String value1, String value2) {
            addCriterion("FIELD_NAME_MAXDATE between", value1, value2, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andFieldNameMaxdateNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME_MAXDATE not between", value1, value2, "fieldNameMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateIsNull() {
            addCriterion("OFFSET_MAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateIsNotNull() {
            addCriterion("OFFSET_MAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateEqualTo(Double value) {
            addCriterion("OFFSET_MAXDATE =", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateNotEqualTo(Double value) {
            addCriterion("OFFSET_MAXDATE <>", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateGreaterThan(Double value) {
            addCriterion("OFFSET_MAXDATE >", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateGreaterThanOrEqualTo(Double value) {
            addCriterion("OFFSET_MAXDATE >=", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateLessThan(Double value) {
            addCriterion("OFFSET_MAXDATE <", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateLessThanOrEqualTo(Double value) {
            addCriterion("OFFSET_MAXDATE <=", value, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateIn(List<Double> values) {
            addCriterion("OFFSET_MAXDATE in", values, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateNotIn(List<Double> values) {
            addCriterion("OFFSET_MAXDATE not in", values, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateBetween(Double value1, Double value2) {
            addCriterion("OFFSET_MAXDATE between", value1, value2, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andOffsetMaxdateNotBetween(Double value1, Double value2) {
            addCriterion("OFFSET_MAXDATE not between", value1, value2, "offsetMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateIsNull() {
            addCriterion("DIFF_MAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateIsNotNull() {
            addCriterion("DIFF_MAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateEqualTo(Double value) {
            addCriterion("DIFF_MAXDATE =", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateNotEqualTo(Double value) {
            addCriterion("DIFF_MAXDATE <>", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateGreaterThan(Double value) {
            addCriterion("DIFF_MAXDATE >", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateGreaterThanOrEqualTo(Double value) {
            addCriterion("DIFF_MAXDATE >=", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateLessThan(Double value) {
            addCriterion("DIFF_MAXDATE <", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateLessThanOrEqualTo(Double value) {
            addCriterion("DIFF_MAXDATE <=", value, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateIn(List<Double> values) {
            addCriterion("DIFF_MAXDATE in", values, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateNotIn(List<Double> values) {
            addCriterion("DIFF_MAXDATE not in", values, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateBetween(Double value1, Double value2) {
            addCriterion("DIFF_MAXDATE between", value1, value2, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andDiffMaxdateNotBetween(Double value1, Double value2) {
            addCriterion("DIFF_MAXDATE not between", value1, value2, "diffMaxdate");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("CREATED_USER like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNull() {
            addCriterion("MODIFIED_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNotNull() {
            addCriterion("MODIFIED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserEqualTo(String value) {
            addCriterion("MODIFIED_USER =", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotEqualTo(String value) {
            addCriterion("MODIFIED_USER <>", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThan(String value) {
            addCriterion("MODIFIED_USER >", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER >=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThan(String value) {
            addCriterion("MODIFIED_USER <", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER <=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLike(String value) {
            addCriterion("MODIFIED_USER like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotLike(String value) {
            addCriterion("MODIFIED_USER not like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIn(List<String> values) {
            addCriterion("MODIFIED_USER in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotIn(List<String> values) {
            addCriterion("MODIFIED_USER not in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER not between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("MODIFIED_DATE =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("MODIFIED_DATE >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("MODIFIED_DATE <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("MODIFIED_DATE in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("MODIFIED_DATE not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetIsNull() {
            addCriterion("SIZE_ROWSET is null");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetIsNotNull() {
            addCriterion("SIZE_ROWSET is not null");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetEqualTo(Integer value) {
            addCriterion("SIZE_ROWSET =", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetNotEqualTo(Integer value) {
            addCriterion("SIZE_ROWSET <>", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetGreaterThan(Integer value) {
            addCriterion("SIZE_ROWSET >", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE_ROWSET >=", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetLessThan(Integer value) {
            addCriterion("SIZE_ROWSET <", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE_ROWSET <=", value, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetIn(List<Integer> values) {
            addCriterion("SIZE_ROWSET in", values, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetNotIn(List<Integer> values) {
            addCriterion("SIZE_ROWSET not in", values, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_ROWSET between", value1, value2, "sizeRowset");
            return (Criteria) this;
        }

        public Criteria andSizeRowsetNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_ROWSET not between", value1, value2, "sizeRowset");
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