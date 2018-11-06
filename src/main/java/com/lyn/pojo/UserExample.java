package com.lyn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andEncryptedPasswordIsNull() {
            addCriterion("encrypted_password is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordIsNotNull() {
            addCriterion("encrypted_password is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordEqualTo(String value) {
            addCriterion("encrypted_password =", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotEqualTo(String value) {
            addCriterion("encrypted_password <>", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordGreaterThan(String value) {
            addCriterion("encrypted_password >", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("encrypted_password >=", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLessThan(String value) {
            addCriterion("encrypted_password <", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLessThanOrEqualTo(String value) {
            addCriterion("encrypted_password <=", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordLike(String value) {
            addCriterion("encrypted_password like", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotLike(String value) {
            addCriterion("encrypted_password not like", value, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordIn(List<String> values) {
            addCriterion("encrypted_password in", values, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotIn(List<String> values) {
            addCriterion("encrypted_password not in", values, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordBetween(String value1, String value2) {
            addCriterion("encrypted_password between", value1, value2, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedPasswordNotBetween(String value1, String value2) {
            addCriterion("encrypted_password not between", value1, value2, "encryptedPassword");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeIsNull() {
            addCriterion("email_auth_code is null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeIsNotNull() {
            addCriterion("email_auth_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeEqualTo(String value) {
            addCriterion("email_auth_code =", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeNotEqualTo(String value) {
            addCriterion("email_auth_code <>", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeGreaterThan(String value) {
            addCriterion("email_auth_code >", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("email_auth_code >=", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeLessThan(String value) {
            addCriterion("email_auth_code <", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("email_auth_code <=", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeLike(String value) {
            addCriterion("email_auth_code like", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeNotLike(String value) {
            addCriterion("email_auth_code not like", value, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeIn(List<String> values) {
            addCriterion("email_auth_code in", values, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeNotIn(List<String> values) {
            addCriterion("email_auth_code not in", values, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeBetween(String value1, String value2) {
            addCriterion("email_auth_code between", value1, value2, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andEmailAuthCodeNotBetween(String value1, String value2) {
            addCriterion("email_auth_code not between", value1, value2, "emailAuthCode");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIsNull() {
            addCriterion("is_email_verified is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIsNotNull() {
            addCriterion("is_email_verified is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedEqualTo(Boolean value) {
            addCriterion("is_email_verified =", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotEqualTo(Boolean value) {
            addCriterion("is_email_verified <>", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedGreaterThan(Boolean value) {
            addCriterion("is_email_verified >", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_email_verified >=", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedLessThan(Boolean value) {
            addCriterion("is_email_verified <", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_email_verified <=", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIn(List<Boolean> values) {
            addCriterion("is_email_verified in", values, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotIn(List<Boolean> values) {
            addCriterion("is_email_verified not in", values, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_verified between", value1, value2, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_verified not between", value1, value2, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeIsNull() {
            addCriterion("mobile_auth_code is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeIsNotNull() {
            addCriterion("mobile_auth_code is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeEqualTo(String value) {
            addCriterion("mobile_auth_code =", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeNotEqualTo(String value) {
            addCriterion("mobile_auth_code <>", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeGreaterThan(String value) {
            addCriterion("mobile_auth_code >", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_auth_code >=", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeLessThan(String value) {
            addCriterion("mobile_auth_code <", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("mobile_auth_code <=", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeLike(String value) {
            addCriterion("mobile_auth_code like", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeNotLike(String value) {
            addCriterion("mobile_auth_code not like", value, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeIn(List<String> values) {
            addCriterion("mobile_auth_code in", values, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeNotIn(List<String> values) {
            addCriterion("mobile_auth_code not in", values, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeBetween(String value1, String value2) {
            addCriterion("mobile_auth_code between", value1, value2, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andMobileAuthCodeNotBetween(String value1, String value2) {
            addCriterion("mobile_auth_code not between", value1, value2, "mobileAuthCode");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedIsNull() {
            addCriterion("is_mobile_verified is null");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedIsNotNull() {
            addCriterion("is_mobile_verified is not null");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedEqualTo(Boolean value) {
            addCriterion("is_mobile_verified =", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedNotEqualTo(Boolean value) {
            addCriterion("is_mobile_verified <>", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedGreaterThan(Boolean value) {
            addCriterion("is_mobile_verified >", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_mobile_verified >=", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedLessThan(Boolean value) {
            addCriterion("is_mobile_verified <", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_mobile_verified <=", value, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedIn(List<Boolean> values) {
            addCriterion("is_mobile_verified in", values, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedNotIn(List<Boolean> values) {
            addCriterion("is_mobile_verified not in", values, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_mobile_verified between", value1, value2, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsMobileVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_mobile_verified not between", value1, value2, "isMobileVerified");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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