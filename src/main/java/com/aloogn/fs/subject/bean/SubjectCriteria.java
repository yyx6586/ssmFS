package com.aloogn.fs.subject.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjectCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubject_nameEqualTo(String value) {
            addCriterion("subject_name =", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLessThan(String value) {
            addCriterion("subject_name <", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLike(String value) {
            addCriterion("subject_name like", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotLike(String value) {
            addCriterion("subject_name not like", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIn(List<String> values) {
            addCriterion("subject_name in", values, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subject_name");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThan(Date value) {
            addCriterion("creat_time <", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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