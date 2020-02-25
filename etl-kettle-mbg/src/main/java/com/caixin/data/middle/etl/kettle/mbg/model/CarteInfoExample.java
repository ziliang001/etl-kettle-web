package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarteInfoExample() {
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

        public Criteria andCarteRecordIdIsNull() {
            addCriterion("carte_record_id is null");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdIsNotNull() {
            addCriterion("carte_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdEqualTo(Long value) {
            addCriterion("carte_record_id =", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdNotEqualTo(Long value) {
            addCriterion("carte_record_id <>", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdGreaterThan(Long value) {
            addCriterion("carte_record_id >", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("carte_record_id >=", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdLessThan(Long value) {
            addCriterion("carte_record_id <", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("carte_record_id <=", value, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdIn(List<Long> values) {
            addCriterion("carte_record_id in", values, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdNotIn(List<Long> values) {
            addCriterion("carte_record_id not in", values, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdBetween(Long value1, Long value2) {
            addCriterion("carte_record_id between", value1, value2, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andCarteRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("carte_record_id not between", value1, value2, "carteRecordId");
            return (Criteria) this;
        }

        public Criteria andNDateIsNull() {
            addCriterion("n_date is null");
            return (Criteria) this;
        }

        public Criteria andNDateIsNotNull() {
            addCriterion("n_date is not null");
            return (Criteria) this;
        }

        public Criteria andNDateEqualTo(Date value) {
            addCriterion("n_date =", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateNotEqualTo(Date value) {
            addCriterion("n_date <>", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateGreaterThan(Date value) {
            addCriterion("n_date >", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateGreaterThanOrEqualTo(Date value) {
            addCriterion("n_date >=", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateLessThan(Date value) {
            addCriterion("n_date <", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateLessThanOrEqualTo(Date value) {
            addCriterion("n_date <=", value, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateIn(List<Date> values) {
            addCriterion("n_date in", values, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateNotIn(List<Date> values) {
            addCriterion("n_date not in", values, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateBetween(Date value1, Date value2) {
            addCriterion("n_date between", value1, value2, "nDate");
            return (Criteria) this;
        }

        public Criteria andNDateNotBetween(Date value1, Date value2) {
            addCriterion("n_date not between", value1, value2, "nDate");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIsNull() {
            addCriterion("slave_id is null");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIsNotNull() {
            addCriterion("slave_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlaveIdEqualTo(Integer value) {
            addCriterion("slave_id =", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotEqualTo(Integer value) {
            addCriterion("slave_id <>", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdGreaterThan(Integer value) {
            addCriterion("slave_id >", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("slave_id >=", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdLessThan(Integer value) {
            addCriterion("slave_id <", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("slave_id <=", value, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdIn(List<Integer> values) {
            addCriterion("slave_id in", values, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotIn(List<Integer> values) {
            addCriterion("slave_id not in", values, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdBetween(Integer value1, Integer value2) {
            addCriterion("slave_id between", value1, value2, "slaveId");
            return (Criteria) this;
        }

        public Criteria andSlaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("slave_id not between", value1, value2, "slaveId");
            return (Criteria) this;
        }

        public Criteria andThreadNumIsNull() {
            addCriterion("thread_num is null");
            return (Criteria) this;
        }

        public Criteria andThreadNumIsNotNull() {
            addCriterion("thread_num is not null");
            return (Criteria) this;
        }

        public Criteria andThreadNumEqualTo(Integer value) {
            addCriterion("thread_num =", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotEqualTo(Integer value) {
            addCriterion("thread_num <>", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumGreaterThan(Integer value) {
            addCriterion("thread_num >", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("thread_num >=", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumLessThan(Integer value) {
            addCriterion("thread_num <", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumLessThanOrEqualTo(Integer value) {
            addCriterion("thread_num <=", value, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumIn(List<Integer> values) {
            addCriterion("thread_num in", values, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotIn(List<Integer> values) {
            addCriterion("thread_num not in", values, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumBetween(Integer value1, Integer value2) {
            addCriterion("thread_num between", value1, value2, "threadNum");
            return (Criteria) this;
        }

        public Criteria andThreadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("thread_num not between", value1, value2, "threadNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNull() {
            addCriterion("job_num is null");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNotNull() {
            addCriterion("job_num is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumEqualTo(Integer value) {
            addCriterion("job_num =", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotEqualTo(Integer value) {
            addCriterion("job_num <>", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThan(Integer value) {
            addCriterion("job_num >", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_num >=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThan(Integer value) {
            addCriterion("job_num <", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThanOrEqualTo(Integer value) {
            addCriterion("job_num <=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIn(List<Integer> values) {
            addCriterion("job_num in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotIn(List<Integer> values) {
            addCriterion("job_num not in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumBetween(Integer value1, Integer value2) {
            addCriterion("job_num between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotBetween(Integer value1, Integer value2) {
            addCriterion("job_num not between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNull() {
            addCriterion("trans_num is null");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNotNull() {
            addCriterion("trans_num is not null");
            return (Criteria) this;
        }

        public Criteria andTransNumEqualTo(Integer value) {
            addCriterion("trans_num =", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotEqualTo(Integer value) {
            addCriterion("trans_num <>", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThan(Integer value) {
            addCriterion("trans_num >", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_num >=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThan(Integer value) {
            addCriterion("trans_num <", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThanOrEqualTo(Integer value) {
            addCriterion("trans_num <=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumIn(List<Integer> values) {
            addCriterion("trans_num in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotIn(List<Integer> values) {
            addCriterion("trans_num not in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumBetween(Integer value1, Integer value2) {
            addCriterion("trans_num between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_num not between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andFreeMemIsNull() {
            addCriterion("free_mem is null");
            return (Criteria) this;
        }

        public Criteria andFreeMemIsNotNull() {
            addCriterion("free_mem is not null");
            return (Criteria) this;
        }

        public Criteria andFreeMemEqualTo(Integer value) {
            addCriterion("free_mem =", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotEqualTo(Integer value) {
            addCriterion("free_mem <>", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemGreaterThan(Integer value) {
            addCriterion("free_mem >", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_mem >=", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemLessThan(Integer value) {
            addCriterion("free_mem <", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemLessThanOrEqualTo(Integer value) {
            addCriterion("free_mem <=", value, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemIn(List<Integer> values) {
            addCriterion("free_mem in", values, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotIn(List<Integer> values) {
            addCriterion("free_mem not in", values, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemBetween(Integer value1, Integer value2) {
            addCriterion("free_mem between", value1, value2, "freeMem");
            return (Criteria) this;
        }

        public Criteria andFreeMemNotBetween(Integer value1, Integer value2) {
            addCriterion("free_mem not between", value1, value2, "freeMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemIsNull() {
            addCriterion("total_mem is null");
            return (Criteria) this;
        }

        public Criteria andTotalMemIsNotNull() {
            addCriterion("total_mem is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMemEqualTo(Integer value) {
            addCriterion("total_mem =", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemNotEqualTo(Integer value) {
            addCriterion("total_mem <>", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemGreaterThan(Integer value) {
            addCriterion("total_mem >", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_mem >=", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemLessThan(Integer value) {
            addCriterion("total_mem <", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemLessThanOrEqualTo(Integer value) {
            addCriterion("total_mem <=", value, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemIn(List<Integer> values) {
            addCriterion("total_mem in", values, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemNotIn(List<Integer> values) {
            addCriterion("total_mem not in", values, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemBetween(Integer value1, Integer value2) {
            addCriterion("total_mem between", value1, value2, "totalMem");
            return (Criteria) this;
        }

        public Criteria andTotalMemNotBetween(Integer value1, Integer value2) {
            addCriterion("total_mem not between", value1, value2, "totalMem");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentIsNull() {
            addCriterion("used_mem_percent is null");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentIsNotNull() {
            addCriterion("used_mem_percent is not null");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentEqualTo(String value) {
            addCriterion("used_mem_percent =", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentNotEqualTo(String value) {
            addCriterion("used_mem_percent <>", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentGreaterThan(String value) {
            addCriterion("used_mem_percent >", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentGreaterThanOrEqualTo(String value) {
            addCriterion("used_mem_percent >=", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentLessThan(String value) {
            addCriterion("used_mem_percent <", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentLessThanOrEqualTo(String value) {
            addCriterion("used_mem_percent <=", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentLike(String value) {
            addCriterion("used_mem_percent like", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentNotLike(String value) {
            addCriterion("used_mem_percent not like", value, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentIn(List<String> values) {
            addCriterion("used_mem_percent in", values, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentNotIn(List<String> values) {
            addCriterion("used_mem_percent not in", values, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentBetween(String value1, String value2) {
            addCriterion("used_mem_percent between", value1, value2, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andUsedMemPercentNotBetween(String value1, String value2) {
            addCriterion("used_mem_percent not between", value1, value2, "usedMemPercent");
            return (Criteria) this;
        }

        public Criteria andLoadAvgIsNull() {
            addCriterion("load_avg is null");
            return (Criteria) this;
        }

        public Criteria andLoadAvgIsNotNull() {
            addCriterion("load_avg is not null");
            return (Criteria) this;
        }

        public Criteria andLoadAvgEqualTo(Float value) {
            addCriterion("load_avg =", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgNotEqualTo(Float value) {
            addCriterion("load_avg <>", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgGreaterThan(Float value) {
            addCriterion("load_avg >", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgGreaterThanOrEqualTo(Float value) {
            addCriterion("load_avg >=", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgLessThan(Float value) {
            addCriterion("load_avg <", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgLessThanOrEqualTo(Float value) {
            addCriterion("load_avg <=", value, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgIn(List<Float> values) {
            addCriterion("load_avg in", values, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgNotIn(List<Float> values) {
            addCriterion("load_avg not in", values, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgBetween(Float value1, Float value2) {
            addCriterion("load_avg between", value1, value2, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andLoadAvgNotBetween(Float value1, Float value2) {
            addCriterion("load_avg not between", value1, value2, "loadAvg");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumIsNull() {
            addCriterion("finished_job_num is null");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumIsNotNull() {
            addCriterion("finished_job_num is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumEqualTo(Integer value) {
            addCriterion("finished_job_num =", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumNotEqualTo(Integer value) {
            addCriterion("finished_job_num <>", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumGreaterThan(Integer value) {
            addCriterion("finished_job_num >", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_job_num >=", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumLessThan(Integer value) {
            addCriterion("finished_job_num <", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumLessThanOrEqualTo(Integer value) {
            addCriterion("finished_job_num <=", value, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumIn(List<Integer> values) {
            addCriterion("finished_job_num in", values, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumNotIn(List<Integer> values) {
            addCriterion("finished_job_num not in", values, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumBetween(Integer value1, Integer value2) {
            addCriterion("finished_job_num between", value1, value2, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedJobNumNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_job_num not between", value1, value2, "finishedJobNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumIsNull() {
            addCriterion("finished_trans_num is null");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumIsNotNull() {
            addCriterion("finished_trans_num is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumEqualTo(Integer value) {
            addCriterion("finished_trans_num =", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumNotEqualTo(Integer value) {
            addCriterion("finished_trans_num <>", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumGreaterThan(Integer value) {
            addCriterion("finished_trans_num >", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_trans_num >=", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumLessThan(Integer value) {
            addCriterion("finished_trans_num <", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumLessThanOrEqualTo(Integer value) {
            addCriterion("finished_trans_num <=", value, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumIn(List<Integer> values) {
            addCriterion("finished_trans_num in", values, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumNotIn(List<Integer> values) {
            addCriterion("finished_trans_num not in", values, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumBetween(Integer value1, Integer value2) {
            addCriterion("finished_trans_num between", value1, value2, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andFinishedTransNumNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_trans_num not between", value1, value2, "finishedTransNum");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemIsNull() {
            addCriterion("host_free_mem is null");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemIsNotNull() {
            addCriterion("host_free_mem is not null");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemEqualTo(String value) {
            addCriterion("host_free_mem =", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemNotEqualTo(String value) {
            addCriterion("host_free_mem <>", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemGreaterThan(String value) {
            addCriterion("host_free_mem >", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemGreaterThanOrEqualTo(String value) {
            addCriterion("host_free_mem >=", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemLessThan(String value) {
            addCriterion("host_free_mem <", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemLessThanOrEqualTo(String value) {
            addCriterion("host_free_mem <=", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemLike(String value) {
            addCriterion("host_free_mem like", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemNotLike(String value) {
            addCriterion("host_free_mem not like", value, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemIn(List<String> values) {
            addCriterion("host_free_mem in", values, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemNotIn(List<String> values) {
            addCriterion("host_free_mem not in", values, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemBetween(String value1, String value2) {
            addCriterion("host_free_mem between", value1, value2, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostFreeMemNotBetween(String value1, String value2) {
            addCriterion("host_free_mem not between", value1, value2, "hostFreeMem");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageIsNull() {
            addCriterion("host_cpu_usage is null");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageIsNotNull() {
            addCriterion("host_cpu_usage is not null");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageEqualTo(String value) {
            addCriterion("host_cpu_usage =", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageNotEqualTo(String value) {
            addCriterion("host_cpu_usage <>", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageGreaterThan(String value) {
            addCriterion("host_cpu_usage >", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageGreaterThanOrEqualTo(String value) {
            addCriterion("host_cpu_usage >=", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageLessThan(String value) {
            addCriterion("host_cpu_usage <", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageLessThanOrEqualTo(String value) {
            addCriterion("host_cpu_usage <=", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageLike(String value) {
            addCriterion("host_cpu_usage like", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageNotLike(String value) {
            addCriterion("host_cpu_usage not like", value, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageIn(List<String> values) {
            addCriterion("host_cpu_usage in", values, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageNotIn(List<String> values) {
            addCriterion("host_cpu_usage not in", values, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageBetween(String value1, String value2) {
            addCriterion("host_cpu_usage between", value1, value2, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostCpuUsageNotBetween(String value1, String value2) {
            addCriterion("host_cpu_usage not between", value1, value2, "hostCpuUsage");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskIsNull() {
            addCriterion("host_free_disk is null");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskIsNotNull() {
            addCriterion("host_free_disk is not null");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskEqualTo(String value) {
            addCriterion("host_free_disk =", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskNotEqualTo(String value) {
            addCriterion("host_free_disk <>", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskGreaterThan(String value) {
            addCriterion("host_free_disk >", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskGreaterThanOrEqualTo(String value) {
            addCriterion("host_free_disk >=", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskLessThan(String value) {
            addCriterion("host_free_disk <", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskLessThanOrEqualTo(String value) {
            addCriterion("host_free_disk <=", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskLike(String value) {
            addCriterion("host_free_disk like", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskNotLike(String value) {
            addCriterion("host_free_disk not like", value, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskIn(List<String> values) {
            addCriterion("host_free_disk in", values, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskNotIn(List<String> values) {
            addCriterion("host_free_disk not in", values, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskBetween(String value1, String value2) {
            addCriterion("host_free_disk between", value1, value2, "hostFreeDisk");
            return (Criteria) this;
        }

        public Criteria andHostFreeDiskNotBetween(String value1, String value2) {
            addCriterion("host_free_disk not between", value1, value2, "hostFreeDisk");
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