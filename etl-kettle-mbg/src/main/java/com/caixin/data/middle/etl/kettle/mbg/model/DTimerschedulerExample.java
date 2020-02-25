package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class DTimerschedulerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DTimerschedulerExample() {
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

        public Criteria andIdJobtaskIsNull() {
            addCriterion("ID_JOBTASK is null");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskIsNotNull() {
            addCriterion("ID_JOBTASK is not null");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskEqualTo(Long value) {
            addCriterion("ID_JOBTASK =", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskNotEqualTo(Long value) {
            addCriterion("ID_JOBTASK <>", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskGreaterThan(Long value) {
            addCriterion("ID_JOBTASK >", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_JOBTASK >=", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskLessThan(Long value) {
            addCriterion("ID_JOBTASK <", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskLessThanOrEqualTo(Long value) {
            addCriterion("ID_JOBTASK <=", value, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskIn(List<Long> values) {
            addCriterion("ID_JOBTASK in", values, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskNotIn(List<Long> values) {
            addCriterion("ID_JOBTASK not in", values, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskBetween(Long value1, Long value2) {
            addCriterion("ID_JOBTASK between", value1, value2, "idJobtask");
            return (Criteria) this;
        }

        public Criteria andIdJobtaskNotBetween(Long value1, Long value2) {
            addCriterion("ID_JOBTASK not between", value1, value2, "idJobtask");
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

        public Criteria andSlavesIsNull() {
            addCriterion("SLAVES is null");
            return (Criteria) this;
        }

        public Criteria andSlavesIsNotNull() {
            addCriterion("SLAVES is not null");
            return (Criteria) this;
        }

        public Criteria andSlavesEqualTo(String value) {
            addCriterion("SLAVES =", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesNotEqualTo(String value) {
            addCriterion("SLAVES <>", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesGreaterThan(String value) {
            addCriterion("SLAVES >", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesGreaterThanOrEqualTo(String value) {
            addCriterion("SLAVES >=", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesLessThan(String value) {
            addCriterion("SLAVES <", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesLessThanOrEqualTo(String value) {
            addCriterion("SLAVES <=", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesLike(String value) {
            addCriterion("SLAVES like", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesNotLike(String value) {
            addCriterion("SLAVES not like", value, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesIn(List<String> values) {
            addCriterion("SLAVES in", values, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesNotIn(List<String> values) {
            addCriterion("SLAVES not in", values, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesBetween(String value1, String value2) {
            addCriterion("SLAVES between", value1, value2, "slaves");
            return (Criteria) this;
        }

        public Criteria andSlavesNotBetween(String value1, String value2) {
            addCriterion("SLAVES not between", value1, value2, "slaves");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIsNull() {
            addCriterion("ISREPEAT is null");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIsNotNull() {
            addCriterion("ISREPEAT is not null");
            return (Criteria) this;
        }

        public Criteria andIsrepeatEqualTo(String value) {
            addCriterion("ISREPEAT =", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotEqualTo(String value) {
            addCriterion("ISREPEAT <>", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatGreaterThan(String value) {
            addCriterion("ISREPEAT >", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatGreaterThanOrEqualTo(String value) {
            addCriterion("ISREPEAT >=", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatLessThan(String value) {
            addCriterion("ISREPEAT <", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatLessThanOrEqualTo(String value) {
            addCriterion("ISREPEAT <=", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatLike(String value) {
            addCriterion("ISREPEAT like", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotLike(String value) {
            addCriterion("ISREPEAT not like", value, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatIn(List<String> values) {
            addCriterion("ISREPEAT in", values, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotIn(List<String> values) {
            addCriterion("ISREPEAT not in", values, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatBetween(String value1, String value2) {
            addCriterion("ISREPEAT between", value1, value2, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andIsrepeatNotBetween(String value1, String value2) {
            addCriterion("ISREPEAT not between", value1, value2, "isrepeat");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeIsNull() {
            addCriterion("SCHEDULERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeIsNotNull() {
            addCriterion("SCHEDULERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeEqualTo(Integer value) {
            addCriterion("SCHEDULERTYPE =", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeNotEqualTo(Integer value) {
            addCriterion("SCHEDULERTYPE <>", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeGreaterThan(Integer value) {
            addCriterion("SCHEDULERTYPE >", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHEDULERTYPE >=", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeLessThan(Integer value) {
            addCriterion("SCHEDULERTYPE <", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeLessThanOrEqualTo(Integer value) {
            addCriterion("SCHEDULERTYPE <=", value, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeIn(List<Integer> values) {
            addCriterion("SCHEDULERTYPE in", values, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeNotIn(List<Integer> values) {
            addCriterion("SCHEDULERTYPE not in", values, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeBetween(Integer value1, Integer value2) {
            addCriterion("SCHEDULERTYPE between", value1, value2, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andSchedulertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHEDULERTYPE not between", value1, value2, "schedulertype");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesIsNull() {
            addCriterion("INTERVALMINUTES is null");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesIsNotNull() {
            addCriterion("INTERVALMINUTES is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesEqualTo(Integer value) {
            addCriterion("INTERVALMINUTES =", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesNotEqualTo(Integer value) {
            addCriterion("INTERVALMINUTES <>", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesGreaterThan(Integer value) {
            addCriterion("INTERVALMINUTES >", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTERVALMINUTES >=", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesLessThan(Integer value) {
            addCriterion("INTERVALMINUTES <", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesLessThanOrEqualTo(Integer value) {
            addCriterion("INTERVALMINUTES <=", value, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesIn(List<Integer> values) {
            addCriterion("INTERVALMINUTES in", values, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesNotIn(List<Integer> values) {
            addCriterion("INTERVALMINUTES not in", values, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesBetween(Integer value1, Integer value2) {
            addCriterion("INTERVALMINUTES between", value1, value2, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andIntervalminutesNotBetween(Integer value1, Integer value2) {
            addCriterion("INTERVALMINUTES not between", value1, value2, "intervalminutes");
            return (Criteria) this;
        }

        public Criteria andHourIsNull() {
            addCriterion("HOUR is null");
            return (Criteria) this;
        }

        public Criteria andHourIsNotNull() {
            addCriterion("HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andHourEqualTo(Integer value) {
            addCriterion("HOUR =", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotEqualTo(Integer value) {
            addCriterion("HOUR <>", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThan(Integer value) {
            addCriterion("HOUR >", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOUR >=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThan(Integer value) {
            addCriterion("HOUR <", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThanOrEqualTo(Integer value) {
            addCriterion("HOUR <=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourIn(List<Integer> values) {
            addCriterion("HOUR in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotIn(List<Integer> values) {
            addCriterion("HOUR not in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourBetween(Integer value1, Integer value2) {
            addCriterion("HOUR between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotBetween(Integer value1, Integer value2) {
            addCriterion("HOUR not between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andMinutesIsNull() {
            addCriterion("MINUTES is null");
            return (Criteria) this;
        }

        public Criteria andMinutesIsNotNull() {
            addCriterion("MINUTES is not null");
            return (Criteria) this;
        }

        public Criteria andMinutesEqualTo(Integer value) {
            addCriterion("MINUTES =", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesNotEqualTo(Integer value) {
            addCriterion("MINUTES <>", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesGreaterThan(Integer value) {
            addCriterion("MINUTES >", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MINUTES >=", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesLessThan(Integer value) {
            addCriterion("MINUTES <", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("MINUTES <=", value, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesIn(List<Integer> values) {
            addCriterion("MINUTES in", values, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesNotIn(List<Integer> values) {
            addCriterion("MINUTES not in", values, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesBetween(Integer value1, Integer value2) {
            addCriterion("MINUTES between", value1, value2, "minutes");
            return (Criteria) this;
        }

        public Criteria andMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("MINUTES not between", value1, value2, "minutes");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNull() {
            addCriterion("WEEKDAY is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("WEEKDAY is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(Integer value) {
            addCriterion("WEEKDAY =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(Integer value) {
            addCriterion("WEEKDAY <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(Integer value) {
            addCriterion("WEEKDAY >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("WEEKDAY >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(Integer value) {
            addCriterion("WEEKDAY <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("WEEKDAY <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<Integer> values) {
            addCriterion("WEEKDAY in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<Integer> values) {
            addCriterion("WEEKDAY not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("WEEKDAY between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("WEEKDAY not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andDayofmonthIsNull() {
            addCriterion("DAYOFMONTH is null");
            return (Criteria) this;
        }

        public Criteria andDayofmonthIsNotNull() {
            addCriterion("DAYOFMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andDayofmonthEqualTo(Integer value) {
            addCriterion("DAYOFMONTH =", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthNotEqualTo(Integer value) {
            addCriterion("DAYOFMONTH <>", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthGreaterThan(Integer value) {
            addCriterion("DAYOFMONTH >", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAYOFMONTH >=", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthLessThan(Integer value) {
            addCriterion("DAYOFMONTH <", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthLessThanOrEqualTo(Integer value) {
            addCriterion("DAYOFMONTH <=", value, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthIn(List<Integer> values) {
            addCriterion("DAYOFMONTH in", values, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthNotIn(List<Integer> values) {
            addCriterion("DAYOFMONTH not in", values, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthBetween(Integer value1, Integer value2) {
            addCriterion("DAYOFMONTH between", value1, value2, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andDayofmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("DAYOFMONTH not between", value1, value2, "dayofmonth");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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