package com.aloogn.fs.grade.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeCriteria() {
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

        public Criteria andGrade_nameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGrade_nameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrade_nameEqualTo(String value) {
            addCriterion("grade_name =", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameGreaterThan(String value) {
            addCriterion("grade_name >", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameLessThan(String value) {
            addCriterion("grade_name <", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameLike(String value) {
            addCriterion("grade_name like", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameNotLike(String value) {
            addCriterion("grade_name not like", value, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameIn(List<String> values) {
            addCriterion("grade_name in", values, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_nameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "grade_name");
            return (Criteria) this;
        }

        public Criteria andGrade_numberIsNull() {
            addCriterion("grade_number is null");
            return (Criteria) this;
        }

        public Criteria andGrade_numberIsNotNull() {
            addCriterion("grade_number is not null");
            return (Criteria) this;
        }

        public Criteria andGrade_numberEqualTo(String value) {
            addCriterion("grade_number =", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberNotEqualTo(String value) {
            addCriterion("grade_number <>", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberGreaterThan(String value) {
            addCriterion("grade_number >", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberGreaterThanOrEqualTo(String value) {
            addCriterion("grade_number >=", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberLessThan(String value) {
            addCriterion("grade_number <", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberLessThanOrEqualTo(String value) {
            addCriterion("grade_number <=", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberLike(String value) {
            addCriterion("grade_number like", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberNotLike(String value) {
            addCriterion("grade_number not like", value, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberIn(List<String> values) {
            addCriterion("grade_number in", values, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberNotIn(List<String> values) {
            addCriterion("grade_number not in", values, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberBetween(String value1, String value2) {
            addCriterion("grade_number between", value1, value2, "grade_number");
            return (Criteria) this;
        }

        public Criteria andGrade_numberNotBetween(String value1, String value2) {
            addCriterion("grade_number not between", value1, value2, "grade_number");
            return (Criteria) this;
        }

        public Criteria andClass_nameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClass_nameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClass_nameEqualTo(String value) {
            addCriterion("class_name =", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameGreaterThan(String value) {
            addCriterion("class_name >", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLessThan(String value) {
            addCriterion("class_name <", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLike(String value) {
            addCriterion("class_name like", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotLike(String value) {
            addCriterion("class_name not like", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameIn(List<String> values) {
            addCriterion("class_name in", values, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_numberIsNull() {
            addCriterion("class_number is null");
            return (Criteria) this;
        }

        public Criteria andClass_numberIsNotNull() {
            addCriterion("class_number is not null");
            return (Criteria) this;
        }

        public Criteria andClass_numberEqualTo(String value) {
            addCriterion("class_number =", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberNotEqualTo(String value) {
            addCriterion("class_number <>", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberGreaterThan(String value) {
            addCriterion("class_number >", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberGreaterThanOrEqualTo(String value) {
            addCriterion("class_number >=", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberLessThan(String value) {
            addCriterion("class_number <", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberLessThanOrEqualTo(String value) {
            addCriterion("class_number <=", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberLike(String value) {
            addCriterion("class_number like", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberNotLike(String value) {
            addCriterion("class_number not like", value, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberIn(List<String> values) {
            addCriterion("class_number in", values, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberNotIn(List<String> values) {
            addCriterion("class_number not in", values, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberBetween(String value1, String value2) {
            addCriterion("class_number between", value1, value2, "class_number");
            return (Criteria) this;
        }

        public Criteria andClass_numberNotBetween(String value1, String value2) {
            addCriterion("class_number not between", value1, value2, "class_number");
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