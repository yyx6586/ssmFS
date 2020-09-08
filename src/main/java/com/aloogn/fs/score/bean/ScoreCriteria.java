package com.aloogn.fs.score.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreCriteria() {
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

        public Criteria andScore_nameIsNull() {
            addCriterion("score_name is null");
            return (Criteria) this;
        }

        public Criteria andScore_nameIsNotNull() {
            addCriterion("score_name is not null");
            return (Criteria) this;
        }

        public Criteria andScore_nameEqualTo(String value) {
            addCriterion("score_name =", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameNotEqualTo(String value) {
            addCriterion("score_name <>", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameGreaterThan(String value) {
            addCriterion("score_name >", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameGreaterThanOrEqualTo(String value) {
            addCriterion("score_name >=", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameLessThan(String value) {
            addCriterion("score_name <", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameLessThanOrEqualTo(String value) {
            addCriterion("score_name <=", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameLike(String value) {
            addCriterion("score_name like", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameNotLike(String value) {
            addCriterion("score_name not like", value, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameIn(List<String> values) {
            addCriterion("score_name in", values, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameNotIn(List<String> values) {
            addCriterion("score_name not in", values, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameBetween(String value1, String value2) {
            addCriterion("score_name between", value1, value2, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_nameNotBetween(String value1, String value2) {
            addCriterion("score_name not between", value1, value2, "score_name");
            return (Criteria) this;
        }

        public Criteria andScore_timeIsNull() {
            addCriterion("score_time is null");
            return (Criteria) this;
        }

        public Criteria andScore_timeIsNotNull() {
            addCriterion("score_time is not null");
            return (Criteria) this;
        }

        public Criteria andScore_timeEqualTo(String value) {
            addCriterion("score_time =", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeNotEqualTo(String value) {
            addCriterion("score_time <>", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeGreaterThan(String value) {
            addCriterion("score_time >", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeGreaterThanOrEqualTo(String value) {
            addCriterion("score_time >=", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeLessThan(String value) {
            addCriterion("score_time <", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeLessThanOrEqualTo(String value) {
            addCriterion("score_time <=", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeLike(String value) {
            addCriterion("score_time like", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeNotLike(String value) {
            addCriterion("score_time not like", value, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeIn(List<String> values) {
            addCriterion("score_time in", values, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeNotIn(List<String> values) {
            addCriterion("score_time not in", values, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeBetween(String value1, String value2) {
            addCriterion("score_time between", value1, value2, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_timeNotBetween(String value1, String value2) {
            addCriterion("score_time not between", value1, value2, "score_time");
            return (Criteria) this;
        }

        public Criteria andScore_addressIsNull() {
            addCriterion("score_address is null");
            return (Criteria) this;
        }

        public Criteria andScore_addressIsNotNull() {
            addCriterion("score_address is not null");
            return (Criteria) this;
        }

        public Criteria andScore_addressEqualTo(String value) {
            addCriterion("score_address =", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressNotEqualTo(String value) {
            addCriterion("score_address <>", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressGreaterThan(String value) {
            addCriterion("score_address >", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressGreaterThanOrEqualTo(String value) {
            addCriterion("score_address >=", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressLessThan(String value) {
            addCriterion("score_address <", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressLessThanOrEqualTo(String value) {
            addCriterion("score_address <=", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressLike(String value) {
            addCriterion("score_address like", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressNotLike(String value) {
            addCriterion("score_address not like", value, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressIn(List<String> values) {
            addCriterion("score_address in", values, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressNotIn(List<String> values) {
            addCriterion("score_address not in", values, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressBetween(String value1, String value2) {
            addCriterion("score_address between", value1, value2, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_addressNotBetween(String value1, String value2) {
            addCriterion("score_address not between", value1, value2, "score_address");
            return (Criteria) this;
        }

        public Criteria andScore_teacherIsNull() {
            addCriterion("score_teacher is null");
            return (Criteria) this;
        }

        public Criteria andScore_teacherIsNotNull() {
            addCriterion("score_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andScore_teacherEqualTo(String value) {
            addCriterion("score_teacher =", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherNotEqualTo(String value) {
            addCriterion("score_teacher <>", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherGreaterThan(String value) {
            addCriterion("score_teacher >", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherGreaterThanOrEqualTo(String value) {
            addCriterion("score_teacher >=", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherLessThan(String value) {
            addCriterion("score_teacher <", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherLessThanOrEqualTo(String value) {
            addCriterion("score_teacher <=", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherLike(String value) {
            addCriterion("score_teacher like", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherNotLike(String value) {
            addCriterion("score_teacher not like", value, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherIn(List<String> values) {
            addCriterion("score_teacher in", values, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherNotIn(List<String> values) {
            addCriterion("score_teacher not in", values, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherBetween(String value1, String value2) {
            addCriterion("score_teacher between", value1, value2, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScore_teacherNotBetween(String value1, String value2) {
            addCriterion("score_teacher not between", value1, value2, "score_teacher");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
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