package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RJobExample() {
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

        public Criteria andIdJobIsNull() {
            addCriterion("ID_JOB is null");
            return (Criteria) this;
        }

        public Criteria andIdJobIsNotNull() {
            addCriterion("ID_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobEqualTo(Long value) {
            addCriterion("ID_JOB =", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotEqualTo(Long value) {
            addCriterion("ID_JOB <>", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThan(Long value) {
            addCriterion("ID_JOB >", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOB >=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThan(Long value) {
            addCriterion("ID_JOB <", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOB <=", value, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobIn(List<Long> values) {
            addCriterion("ID_JOB in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotIn(List<Long> values) {
            addCriterion("ID_JOB not in", values, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobBetween(Long value1, Long value2) {
            addCriterion("ID_JOB between", value1, value2, "idJob");
            return (Criteria) this;
        }

        public Criteria andIdJobNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOB not between", value1, value2, "idJob");
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

        public Criteria andJobVersionIsNull() {
            addCriterion("JOB_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andJobVersionIsNotNull() {
            addCriterion("JOB_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andJobVersionEqualTo(String value) {
            addCriterion("JOB_VERSION =", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionNotEqualTo(String value) {
            addCriterion("JOB_VERSION <>", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionGreaterThan(String value) {
            addCriterion("JOB_VERSION >", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_VERSION >=", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionLessThan(String value) {
            addCriterion("JOB_VERSION <", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionLessThanOrEqualTo(String value) {
            addCriterion("JOB_VERSION <=", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionLike(String value) {
            addCriterion("JOB_VERSION like", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionNotLike(String value) {
            addCriterion("JOB_VERSION not like", value, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionIn(List<String> values) {
            addCriterion("JOB_VERSION in", values, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionNotIn(List<String> values) {
            addCriterion("JOB_VERSION not in", values, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionBetween(String value1, String value2) {
            addCriterion("JOB_VERSION between", value1, value2, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobVersionNotBetween(String value1, String value2) {
            addCriterion("JOB_VERSION not between", value1, value2, "jobVersion");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("JOB_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("JOB_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(Integer value) {
            addCriterion("JOB_STATUS =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(Integer value) {
            addCriterion("JOB_STATUS <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(Integer value) {
            addCriterion("JOB_STATUS >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOB_STATUS >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(Integer value) {
            addCriterion("JOB_STATUS <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(Integer value) {
            addCriterion("JOB_STATUS <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<Integer> values) {
            addCriterion("JOB_STATUS in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<Integer> values) {
            addCriterion("JOB_STATUS not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(Integer value1, Integer value2) {
            addCriterion("JOB_STATUS between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("JOB_STATUS not between", value1, value2, "jobStatus");
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

        public Criteria andUseBatchIdIsNull() {
            addCriterion("USE_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdIsNotNull() {
            addCriterion("USE_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdEqualTo(String value) {
            addCriterion("USE_BATCH_ID =", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdNotEqualTo(String value) {
            addCriterion("USE_BATCH_ID <>", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdGreaterThan(String value) {
            addCriterion("USE_BATCH_ID >", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_BATCH_ID >=", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdLessThan(String value) {
            addCriterion("USE_BATCH_ID <", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdLessThanOrEqualTo(String value) {
            addCriterion("USE_BATCH_ID <=", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdLike(String value) {
            addCriterion("USE_BATCH_ID like", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdNotLike(String value) {
            addCriterion("USE_BATCH_ID not like", value, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdIn(List<String> values) {
            addCriterion("USE_BATCH_ID in", values, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdNotIn(List<String> values) {
            addCriterion("USE_BATCH_ID not in", values, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdBetween(String value1, String value2) {
            addCriterion("USE_BATCH_ID between", value1, value2, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andUseBatchIdNotBetween(String value1, String value2) {
            addCriterion("USE_BATCH_ID not between", value1, value2, "useBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdIsNull() {
            addCriterion("PASS_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdIsNotNull() {
            addCriterion("PASS_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdEqualTo(String value) {
            addCriterion("PASS_BATCH_ID =", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdNotEqualTo(String value) {
            addCriterion("PASS_BATCH_ID <>", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdGreaterThan(String value) {
            addCriterion("PASS_BATCH_ID >", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_BATCH_ID >=", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdLessThan(String value) {
            addCriterion("PASS_BATCH_ID <", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdLessThanOrEqualTo(String value) {
            addCriterion("PASS_BATCH_ID <=", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdLike(String value) {
            addCriterion("PASS_BATCH_ID like", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdNotLike(String value) {
            addCriterion("PASS_BATCH_ID not like", value, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdIn(List<String> values) {
            addCriterion("PASS_BATCH_ID in", values, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdNotIn(List<String> values) {
            addCriterion("PASS_BATCH_ID not in", values, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdBetween(String value1, String value2) {
            addCriterion("PASS_BATCH_ID between", value1, value2, "passBatchId");
            return (Criteria) this;
        }

        public Criteria andPassBatchIdNotBetween(String value1, String value2) {
            addCriterion("PASS_BATCH_ID not between", value1, value2, "passBatchId");
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

        public Criteria andSharedFileIsNull() {
            addCriterion("SHARED_FILE is null");
            return (Criteria) this;
        }

        public Criteria andSharedFileIsNotNull() {
            addCriterion("SHARED_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andSharedFileEqualTo(String value) {
            addCriterion("SHARED_FILE =", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileNotEqualTo(String value) {
            addCriterion("SHARED_FILE <>", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileGreaterThan(String value) {
            addCriterion("SHARED_FILE >", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileGreaterThanOrEqualTo(String value) {
            addCriterion("SHARED_FILE >=", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileLessThan(String value) {
            addCriterion("SHARED_FILE <", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileLessThanOrEqualTo(String value) {
            addCriterion("SHARED_FILE <=", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileLike(String value) {
            addCriterion("SHARED_FILE like", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileNotLike(String value) {
            addCriterion("SHARED_FILE not like", value, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileIn(List<String> values) {
            addCriterion("SHARED_FILE in", values, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileNotIn(List<String> values) {
            addCriterion("SHARED_FILE not in", values, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileBetween(String value1, String value2) {
            addCriterion("SHARED_FILE between", value1, value2, "sharedFile");
            return (Criteria) this;
        }

        public Criteria andSharedFileNotBetween(String value1, String value2) {
            addCriterion("SHARED_FILE not between", value1, value2, "sharedFile");
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