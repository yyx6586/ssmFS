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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudent_accountIsNull() {
            addCriterion("student_account is null");
            return (Criteria) this;
        }

        public Criteria andStudent_accountIsNotNull() {
            addCriterion("student_account is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_accountEqualTo(String value) {
            addCriterion("student_account =", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountNotEqualTo(String value) {
            addCriterion("student_account <>", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountGreaterThan(String value) {
            addCriterion("student_account >", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountGreaterThanOrEqualTo(String value) {
            addCriterion("student_account >=", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountLessThan(String value) {
            addCriterion("student_account <", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountLessThanOrEqualTo(String value) {
            addCriterion("student_account <=", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountLike(String value) {
            addCriterion("student_account like", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountNotLike(String value) {
            addCriterion("student_account not like", value, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountIn(List<String> values) {
            addCriterion("student_account in", values, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountNotIn(List<String> values) {
            addCriterion("student_account not in", values, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountBetween(String value1, String value2) {
            addCriterion("student_account between", value1, value2, "student_account");
            return (Criteria) this;
        }

        public Criteria andStudent_accountNotBetween(String value1, String value2) {
            addCriterion("student_account not between", value1, value2, "student_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIsNull() {
            addCriterion("teacher_account is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIsNotNull() {
            addCriterion("teacher_account is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountEqualTo(String value) {
            addCriterion("teacher_account =", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotEqualTo(String value) {
            addCriterion("teacher_account <>", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountGreaterThan(String value) {
            addCriterion("teacher_account >", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_account >=", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLessThan(String value) {
            addCriterion("teacher_account <", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLessThanOrEqualTo(String value) {
            addCriterion("teacher_account <=", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLike(String value) {
            addCriterion("teacher_account like", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotLike(String value) {
            addCriterion("teacher_account not like", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIn(List<String> values) {
            addCriterion("teacher_account in", values, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotIn(List<String> values) {
            addCriterion("teacher_account not in", values, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountBetween(String value1, String value2) {
            addCriterion("teacher_account between", value1, value2, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotBetween(String value1, String value2) {
            addCriterion("teacher_account not between", value1, value2, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idIsNull() {
            addCriterion("gradeclass_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idIsNotNull() {
            addCriterion("gradeclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idEqualTo(String value) {
            addCriterion("gradeclass_id =", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idNotEqualTo(String value) {
            addCriterion("gradeclass_id <>", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idGreaterThan(String value) {
            addCriterion("gradeclass_id >", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idGreaterThanOrEqualTo(String value) {
            addCriterion("gradeclass_id >=", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idLessThan(String value) {
            addCriterion("gradeclass_id <", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idLessThanOrEqualTo(String value) {
            addCriterion("gradeclass_id <=", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idLike(String value) {
            addCriterion("gradeclass_id like", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idNotLike(String value) {
            addCriterion("gradeclass_id not like", value, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idIn(List<String> values) {
            addCriterion("gradeclass_id in", values, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idNotIn(List<String> values) {
            addCriterion("gradeclass_id not in", values, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idBetween(String value1, String value2) {
            addCriterion("gradeclass_id between", value1, value2, "gradeclass_id");
            return (Criteria) this;
        }

        public Criteria andGradeclass_idNotBetween(String value1, String value2) {
            addCriterion("gradeclass_id not between", value1, value2, "gradeclass_id");
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

        public Criteria andScore_subjectIsNull() {
            addCriterion("score_subject is null");
            return (Criteria) this;
        }

        public Criteria andScore_subjectIsNotNull() {
            addCriterion("score_subject is not null");
            return (Criteria) this;
        }

        public Criteria andScore_subjectEqualTo(String value) {
            addCriterion("score_subject =", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectNotEqualTo(String value) {
            addCriterion("score_subject <>", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectGreaterThan(String value) {
            addCriterion("score_subject >", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectGreaterThanOrEqualTo(String value) {
            addCriterion("score_subject >=", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectLessThan(String value) {
            addCriterion("score_subject <", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectLessThanOrEqualTo(String value) {
            addCriterion("score_subject <=", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectLike(String value) {
            addCriterion("score_subject like", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectNotLike(String value) {
            addCriterion("score_subject not like", value, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectIn(List<String> values) {
            addCriterion("score_subject in", values, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectNotIn(List<String> values) {
            addCriterion("score_subject not in", values, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectBetween(String value1, String value2) {
            addCriterion("score_subject between", value1, value2, "score_subject");
            return (Criteria) this;
        }

        public Criteria andScore_subjectNotBetween(String value1, String value2) {
            addCriterion("score_subject not between", value1, value2, "score_subject");
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