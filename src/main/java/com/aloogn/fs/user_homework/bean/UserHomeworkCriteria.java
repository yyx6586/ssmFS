package com.aloogn.fs.user_homework.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserHomeworkCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHomeworkCriteria() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andShow_teacherIsNull() {
            addCriterion("show_teacher is null");
            return (Criteria) this;
        }

        public Criteria andShow_teacherIsNotNull() {
            addCriterion("show_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andShow_teacherEqualTo(String value) {
            addCriterion("show_teacher =", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherNotEqualTo(String value) {
            addCriterion("show_teacher <>", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherGreaterThan(String value) {
            addCriterion("show_teacher >", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherGreaterThanOrEqualTo(String value) {
            addCriterion("show_teacher >=", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherLessThan(String value) {
            addCriterion("show_teacher <", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherLessThanOrEqualTo(String value) {
            addCriterion("show_teacher <=", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherLike(String value) {
            addCriterion("show_teacher like", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherNotLike(String value) {
            addCriterion("show_teacher not like", value, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherIn(List<String> values) {
            addCriterion("show_teacher in", values, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherNotIn(List<String> values) {
            addCriterion("show_teacher not in", values, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherBetween(String value1, String value2) {
            addCriterion("show_teacher between", value1, value2, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_teacherNotBetween(String value1, String value2) {
            addCriterion("show_teacher not between", value1, value2, "show_teacher");
            return (Criteria) this;
        }

        public Criteria andShow_studentIsNull() {
            addCriterion("show_student is null");
            return (Criteria) this;
        }

        public Criteria andShow_studentIsNotNull() {
            addCriterion("show_student is not null");
            return (Criteria) this;
        }

        public Criteria andShow_studentEqualTo(String value) {
            addCriterion("show_student =", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentNotEqualTo(String value) {
            addCriterion("show_student <>", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentGreaterThan(String value) {
            addCriterion("show_student >", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentGreaterThanOrEqualTo(String value) {
            addCriterion("show_student >=", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentLessThan(String value) {
            addCriterion("show_student <", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentLessThanOrEqualTo(String value) {
            addCriterion("show_student <=", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentLike(String value) {
            addCriterion("show_student like", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentNotLike(String value) {
            addCriterion("show_student not like", value, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentIn(List<String> values) {
            addCriterion("show_student in", values, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentNotIn(List<String> values) {
            addCriterion("show_student not in", values, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentBetween(String value1, String value2) {
            addCriterion("show_student between", value1, value2, "show_student");
            return (Criteria) this;
        }

        public Criteria andShow_studentNotBetween(String value1, String value2) {
            addCriterion("show_student not between", value1, value2, "show_student");
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