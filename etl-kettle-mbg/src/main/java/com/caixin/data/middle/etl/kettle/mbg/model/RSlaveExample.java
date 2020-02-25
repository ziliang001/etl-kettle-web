package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RSlaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RSlaveExample() {
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

        public Criteria andIdSlaveIsNull() {
            addCriterion("ID_SLAVE is null");
            return (Criteria) this;
        }

        public Criteria andIdSlaveIsNotNull() {
            addCriterion("ID_SLAVE is not null");
            return (Criteria) this;
        }

        public Criteria andIdSlaveEqualTo(Long value) {
            addCriterion("ID_SLAVE =", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotEqualTo(Long value) {
            addCriterion("ID_SLAVE <>", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveGreaterThan(Long value) {
            addCriterion("ID_SLAVE >", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_SLAVE >=", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveLessThan(Long value) {
            addCriterion("ID_SLAVE <", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveLessThanOrEqualTo(Long value) {
            addCriterion("ID_SLAVE <=", value, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveIn(List<Long> values) {
            addCriterion("ID_SLAVE in", values, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotIn(List<Long> values) {
            addCriterion("ID_SLAVE not in", values, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveBetween(Long value1, Long value2) {
            addCriterion("ID_SLAVE between", value1, value2, "idSlave");
            return (Criteria) this;
        }

        public Criteria andIdSlaveNotBetween(Long value1, Long value2) {
            addCriterion("ID_SLAVE not between", value1, value2, "idSlave");
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

        public Criteria andPortEqualTo(String value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("PORT like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("PORT not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andWebAppNameIsNull() {
            addCriterion("WEB_APP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWebAppNameIsNotNull() {
            addCriterion("WEB_APP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWebAppNameEqualTo(String value) {
            addCriterion("WEB_APP_NAME =", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameNotEqualTo(String value) {
            addCriterion("WEB_APP_NAME <>", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameGreaterThan(String value) {
            addCriterion("WEB_APP_NAME >", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_APP_NAME >=", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameLessThan(String value) {
            addCriterion("WEB_APP_NAME <", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameLessThanOrEqualTo(String value) {
            addCriterion("WEB_APP_NAME <=", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameLike(String value) {
            addCriterion("WEB_APP_NAME like", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameNotLike(String value) {
            addCriterion("WEB_APP_NAME not like", value, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameIn(List<String> values) {
            addCriterion("WEB_APP_NAME in", values, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameNotIn(List<String> values) {
            addCriterion("WEB_APP_NAME not in", values, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameBetween(String value1, String value2) {
            addCriterion("WEB_APP_NAME between", value1, value2, "webAppName");
            return (Criteria) this;
        }

        public Criteria andWebAppNameNotBetween(String value1, String value2) {
            addCriterion("WEB_APP_NAME not between", value1, value2, "webAppName");
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

        public Criteria andProxyHostNameIsNull() {
            addCriterion("PROXY_HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameIsNotNull() {
            addCriterion("PROXY_HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameEqualTo(String value) {
            addCriterion("PROXY_HOST_NAME =", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameNotEqualTo(String value) {
            addCriterion("PROXY_HOST_NAME <>", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameGreaterThan(String value) {
            addCriterion("PROXY_HOST_NAME >", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY_HOST_NAME >=", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameLessThan(String value) {
            addCriterion("PROXY_HOST_NAME <", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameLessThanOrEqualTo(String value) {
            addCriterion("PROXY_HOST_NAME <=", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameLike(String value) {
            addCriterion("PROXY_HOST_NAME like", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameNotLike(String value) {
            addCriterion("PROXY_HOST_NAME not like", value, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameIn(List<String> values) {
            addCriterion("PROXY_HOST_NAME in", values, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameNotIn(List<String> values) {
            addCriterion("PROXY_HOST_NAME not in", values, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameBetween(String value1, String value2) {
            addCriterion("PROXY_HOST_NAME between", value1, value2, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyHostNameNotBetween(String value1, String value2) {
            addCriterion("PROXY_HOST_NAME not between", value1, value2, "proxyHostName");
            return (Criteria) this;
        }

        public Criteria andProxyPortIsNull() {
            addCriterion("PROXY_PORT is null");
            return (Criteria) this;
        }

        public Criteria andProxyPortIsNotNull() {
            addCriterion("PROXY_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andProxyPortEqualTo(String value) {
            addCriterion("PROXY_PORT =", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortNotEqualTo(String value) {
            addCriterion("PROXY_PORT <>", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortGreaterThan(String value) {
            addCriterion("PROXY_PORT >", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY_PORT >=", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortLessThan(String value) {
            addCriterion("PROXY_PORT <", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortLessThanOrEqualTo(String value) {
            addCriterion("PROXY_PORT <=", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortLike(String value) {
            addCriterion("PROXY_PORT like", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortNotLike(String value) {
            addCriterion("PROXY_PORT not like", value, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortIn(List<String> values) {
            addCriterion("PROXY_PORT in", values, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortNotIn(List<String> values) {
            addCriterion("PROXY_PORT not in", values, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortBetween(String value1, String value2) {
            addCriterion("PROXY_PORT between", value1, value2, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andProxyPortNotBetween(String value1, String value2) {
            addCriterion("PROXY_PORT not between", value1, value2, "proxyPort");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsIsNull() {
            addCriterion("NON_PROXY_HOSTS is null");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsIsNotNull() {
            addCriterion("NON_PROXY_HOSTS is not null");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsEqualTo(String value) {
            addCriterion("NON_PROXY_HOSTS =", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsNotEqualTo(String value) {
            addCriterion("NON_PROXY_HOSTS <>", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsGreaterThan(String value) {
            addCriterion("NON_PROXY_HOSTS >", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsGreaterThanOrEqualTo(String value) {
            addCriterion("NON_PROXY_HOSTS >=", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsLessThan(String value) {
            addCriterion("NON_PROXY_HOSTS <", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsLessThanOrEqualTo(String value) {
            addCriterion("NON_PROXY_HOSTS <=", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsLike(String value) {
            addCriterion("NON_PROXY_HOSTS like", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsNotLike(String value) {
            addCriterion("NON_PROXY_HOSTS not like", value, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsIn(List<String> values) {
            addCriterion("NON_PROXY_HOSTS in", values, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsNotIn(List<String> values) {
            addCriterion("NON_PROXY_HOSTS not in", values, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsBetween(String value1, String value2) {
            addCriterion("NON_PROXY_HOSTS between", value1, value2, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andNonProxyHostsNotBetween(String value1, String value2) {
            addCriterion("NON_PROXY_HOSTS not between", value1, value2, "nonProxyHosts");
            return (Criteria) this;
        }

        public Criteria andMasterIsNull() {
            addCriterion("MASTER is null");
            return (Criteria) this;
        }

        public Criteria andMasterIsNotNull() {
            addCriterion("MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andMasterEqualTo(String value) {
            addCriterion("MASTER =", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotEqualTo(String value) {
            addCriterion("MASTER <>", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThan(String value) {
            addCriterion("MASTER >", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThanOrEqualTo(String value) {
            addCriterion("MASTER >=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThan(String value) {
            addCriterion("MASTER <", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThanOrEqualTo(String value) {
            addCriterion("MASTER <=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLike(String value) {
            addCriterion("MASTER like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotLike(String value) {
            addCriterion("MASTER not like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterIn(List<String> values) {
            addCriterion("MASTER in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotIn(List<String> values) {
            addCriterion("MASTER not in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterBetween(String value1, String value2) {
            addCriterion("MASTER between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotBetween(String value1, String value2) {
            addCriterion("MASTER not between", value1, value2, "master");
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