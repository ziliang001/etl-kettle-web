package com.caixin.data.middle.etl.kettle.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class RNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RNoteExample() {
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

        public Criteria andIdNoteIsNull() {
            addCriterion("ID_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andIdNoteIsNotNull() {
            addCriterion("ID_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoteEqualTo(Long value) {
            addCriterion("ID_NOTE =", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteNotEqualTo(Long value) {
            addCriterion("ID_NOTE <>", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteGreaterThan(Long value) {
            addCriterion("ID_NOTE >", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_NOTE >=", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteLessThan(Long value) {
            addCriterion("ID_NOTE <", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteLessThanOrEqualTo(Long value) {
            addCriterion("ID_NOTE <=", value, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteIn(List<Long> values) {
            addCriterion("ID_NOTE in", values, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteNotIn(List<Long> values) {
            addCriterion("ID_NOTE not in", values, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteBetween(Long value1, Long value2) {
            addCriterion("ID_NOTE between", value1, value2, "idNote");
            return (Criteria) this;
        }

        public Criteria andIdNoteNotBetween(Long value1, Long value2) {
            addCriterion("ID_NOTE not between", value1, value2, "idNote");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIsNull() {
            addCriterion("GUI_LOCATION_X is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIsNotNull() {
            addCriterion("GUI_LOCATION_X is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X =", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X <>", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_X >", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X >=", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXLessThan(Integer value) {
            addCriterion("GUI_LOCATION_X <", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_X <=", value, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_X in", values, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_X not in", values, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_X between", value1, value2, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationXNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_X not between", value1, value2, "guiLocationX");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIsNull() {
            addCriterion("GUI_LOCATION_Y is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIsNotNull() {
            addCriterion("GUI_LOCATION_Y is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y =", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y <>", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_Y >", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y >=", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYLessThan(Integer value) {
            addCriterion("GUI_LOCATION_Y <", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_Y <=", value, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_Y in", values, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_Y not in", values, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_Y between", value1, value2, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationYNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_Y not between", value1, value2, "guiLocationY");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthIsNull() {
            addCriterion("GUI_LOCATION_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthIsNotNull() {
            addCriterion("GUI_LOCATION_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH =", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH <>", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH >", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH >=", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthLessThan(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH <", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_WIDTH <=", value, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_WIDTH in", values, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_WIDTH not in", values, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_WIDTH between", value1, value2, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_WIDTH not between", value1, value2, "guiLocationWidth");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightIsNull() {
            addCriterion("GUI_LOCATION_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightIsNotNull() {
            addCriterion("GUI_LOCATION_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT =", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightNotEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT <>", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightGreaterThan(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT >", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT >=", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightLessThan(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT <", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightLessThanOrEqualTo(Integer value) {
            addCriterion("GUI_LOCATION_HEIGHT <=", value, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_HEIGHT in", values, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightNotIn(List<Integer> values) {
            addCriterion("GUI_LOCATION_HEIGHT not in", values, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_HEIGHT between", value1, value2, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andGuiLocationHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("GUI_LOCATION_HEIGHT not between", value1, value2, "guiLocationHeight");
            return (Criteria) this;
        }

        public Criteria andFontSizeIsNull() {
            addCriterion("FONT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFontSizeIsNotNull() {
            addCriterion("FONT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFontSizeEqualTo(Integer value) {
            addCriterion("FONT_SIZE =", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotEqualTo(Integer value) {
            addCriterion("FONT_SIZE <>", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeGreaterThan(Integer value) {
            addCriterion("FONT_SIZE >", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_SIZE >=", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeLessThan(Integer value) {
            addCriterion("FONT_SIZE <", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_SIZE <=", value, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeIn(List<Integer> values) {
            addCriterion("FONT_SIZE in", values, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotIn(List<Integer> values) {
            addCriterion("FONT_SIZE not in", values, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeBetween(Integer value1, Integer value2) {
            addCriterion("FONT_SIZE between", value1, value2, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_SIZE not between", value1, value2, "fontSize");
            return (Criteria) this;
        }

        public Criteria andFontBoldIsNull() {
            addCriterion("FONT_BOLD is null");
            return (Criteria) this;
        }

        public Criteria andFontBoldIsNotNull() {
            addCriterion("FONT_BOLD is not null");
            return (Criteria) this;
        }

        public Criteria andFontBoldEqualTo(String value) {
            addCriterion("FONT_BOLD =", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldNotEqualTo(String value) {
            addCriterion("FONT_BOLD <>", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldGreaterThan(String value) {
            addCriterion("FONT_BOLD >", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_BOLD >=", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldLessThan(String value) {
            addCriterion("FONT_BOLD <", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldLessThanOrEqualTo(String value) {
            addCriterion("FONT_BOLD <=", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldLike(String value) {
            addCriterion("FONT_BOLD like", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldNotLike(String value) {
            addCriterion("FONT_BOLD not like", value, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldIn(List<String> values) {
            addCriterion("FONT_BOLD in", values, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldNotIn(List<String> values) {
            addCriterion("FONT_BOLD not in", values, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldBetween(String value1, String value2) {
            addCriterion("FONT_BOLD between", value1, value2, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontBoldNotBetween(String value1, String value2) {
            addCriterion("FONT_BOLD not between", value1, value2, "fontBold");
            return (Criteria) this;
        }

        public Criteria andFontItalicIsNull() {
            addCriterion("FONT_ITALIC is null");
            return (Criteria) this;
        }

        public Criteria andFontItalicIsNotNull() {
            addCriterion("FONT_ITALIC is not null");
            return (Criteria) this;
        }

        public Criteria andFontItalicEqualTo(String value) {
            addCriterion("FONT_ITALIC =", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicNotEqualTo(String value) {
            addCriterion("FONT_ITALIC <>", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicGreaterThan(String value) {
            addCriterion("FONT_ITALIC >", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_ITALIC >=", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicLessThan(String value) {
            addCriterion("FONT_ITALIC <", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicLessThanOrEqualTo(String value) {
            addCriterion("FONT_ITALIC <=", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicLike(String value) {
            addCriterion("FONT_ITALIC like", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicNotLike(String value) {
            addCriterion("FONT_ITALIC not like", value, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicIn(List<String> values) {
            addCriterion("FONT_ITALIC in", values, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicNotIn(List<String> values) {
            addCriterion("FONT_ITALIC not in", values, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicBetween(String value1, String value2) {
            addCriterion("FONT_ITALIC between", value1, value2, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontItalicNotBetween(String value1, String value2) {
            addCriterion("FONT_ITALIC not between", value1, value2, "fontItalic");
            return (Criteria) this;
        }

        public Criteria andFontColorRedIsNull() {
            addCriterion("FONT_COLOR_RED is null");
            return (Criteria) this;
        }

        public Criteria andFontColorRedIsNotNull() {
            addCriterion("FONT_COLOR_RED is not null");
            return (Criteria) this;
        }

        public Criteria andFontColorRedEqualTo(Integer value) {
            addCriterion("FONT_COLOR_RED =", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedNotEqualTo(Integer value) {
            addCriterion("FONT_COLOR_RED <>", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedGreaterThan(Integer value) {
            addCriterion("FONT_COLOR_RED >", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_RED >=", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedLessThan(Integer value) {
            addCriterion("FONT_COLOR_RED <", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_RED <=", value, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedIn(List<Integer> values) {
            addCriterion("FONT_COLOR_RED in", values, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedNotIn(List<Integer> values) {
            addCriterion("FONT_COLOR_RED not in", values, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_RED between", value1, value2, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorRedNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_RED not between", value1, value2, "fontColorRed");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenIsNull() {
            addCriterion("FONT_COLOR_GREEN is null");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenIsNotNull() {
            addCriterion("FONT_COLOR_GREEN is not null");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenEqualTo(Integer value) {
            addCriterion("FONT_COLOR_GREEN =", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenNotEqualTo(Integer value) {
            addCriterion("FONT_COLOR_GREEN <>", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenGreaterThan(Integer value) {
            addCriterion("FONT_COLOR_GREEN >", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_GREEN >=", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenLessThan(Integer value) {
            addCriterion("FONT_COLOR_GREEN <", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_GREEN <=", value, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenIn(List<Integer> values) {
            addCriterion("FONT_COLOR_GREEN in", values, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenNotIn(List<Integer> values) {
            addCriterion("FONT_COLOR_GREEN not in", values, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_GREEN between", value1, value2, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorGreenNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_GREEN not between", value1, value2, "fontColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueIsNull() {
            addCriterion("FONT_COLOR_BLUE is null");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueIsNotNull() {
            addCriterion("FONT_COLOR_BLUE is not null");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueEqualTo(Integer value) {
            addCriterion("FONT_COLOR_BLUE =", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueNotEqualTo(Integer value) {
            addCriterion("FONT_COLOR_BLUE <>", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueGreaterThan(Integer value) {
            addCriterion("FONT_COLOR_BLUE >", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_BLUE >=", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueLessThan(Integer value) {
            addCriterion("FONT_COLOR_BLUE <", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_COLOR_BLUE <=", value, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueIn(List<Integer> values) {
            addCriterion("FONT_COLOR_BLUE in", values, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueNotIn(List<Integer> values) {
            addCriterion("FONT_COLOR_BLUE not in", values, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_BLUE between", value1, value2, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontColorBlueNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_COLOR_BLUE not between", value1, value2, "fontColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedIsNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_RED is null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedIsNotNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_RED is not null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED =", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedNotEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED <>", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedGreaterThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED >", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED >=", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedLessThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED <", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED <=", value, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED in", values, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedNotIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED not in", values, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED between", value1, value2, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorRedNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_RED not between", value1, value2, "fontBackGroundColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenIsNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN is null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenIsNotNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN is not null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN =", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenNotEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN <>", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenGreaterThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN >", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN >=", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenLessThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN <", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN <=", value, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN in", values, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenNotIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN not in", values, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN between", value1, value2, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorGreenNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_GREEN not between", value1, value2, "fontBackGroundColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueIsNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE is null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueIsNotNull() {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE is not null");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE =", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueNotEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE <>", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueGreaterThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE >", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE >=", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueLessThan(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE <", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE <=", value, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE in", values, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueNotIn(List<Integer> values) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE not in", values, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE between", value1, value2, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBackGroundColorBlueNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BACK_GROUND_COLOR_BLUE not between", value1, value2, "fontBackGroundColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedIsNull() {
            addCriterion("FONT_BORDER_COLOR_RED is null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedIsNotNull() {
            addCriterion("FONT_BORDER_COLOR_RED is not null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED =", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedNotEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED <>", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedGreaterThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED >", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED >=", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedLessThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED <", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_RED <=", value, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_RED in", values, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedNotIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_RED not in", values, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_RED between", value1, value2, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorRedNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_RED not between", value1, value2, "fontBorderColorRed");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenIsNull() {
            addCriterion("FONT_BORDER_COLOR_GREEN is null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenIsNotNull() {
            addCriterion("FONT_BORDER_COLOR_GREEN is not null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN =", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenNotEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN <>", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenGreaterThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN >", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN >=", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenLessThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN <", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_GREEN <=", value, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_GREEN in", values, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenNotIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_GREEN not in", values, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_GREEN between", value1, value2, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorGreenNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_GREEN not between", value1, value2, "fontBorderColorGreen");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueIsNull() {
            addCriterion("FONT_BORDER_COLOR_BLUE is null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueIsNotNull() {
            addCriterion("FONT_BORDER_COLOR_BLUE is not null");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE =", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueNotEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE <>", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueGreaterThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE >", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE >=", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueLessThan(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE <", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_BORDER_COLOR_BLUE <=", value, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_BLUE in", values, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueNotIn(List<Integer> values) {
            addCriterion("FONT_BORDER_COLOR_BLUE not in", values, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_BLUE between", value1, value2, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andFontBorderColorBlueNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_BORDER_COLOR_BLUE not between", value1, value2, "fontBorderColorBlue");
            return (Criteria) this;
        }

        public Criteria andDrawShadowIsNull() {
            addCriterion("DRAW_SHADOW is null");
            return (Criteria) this;
        }

        public Criteria andDrawShadowIsNotNull() {
            addCriterion("DRAW_SHADOW is not null");
            return (Criteria) this;
        }

        public Criteria andDrawShadowEqualTo(String value) {
            addCriterion("DRAW_SHADOW =", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowNotEqualTo(String value) {
            addCriterion("DRAW_SHADOW <>", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowGreaterThan(String value) {
            addCriterion("DRAW_SHADOW >", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowGreaterThanOrEqualTo(String value) {
            addCriterion("DRAW_SHADOW >=", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowLessThan(String value) {
            addCriterion("DRAW_SHADOW <", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowLessThanOrEqualTo(String value) {
            addCriterion("DRAW_SHADOW <=", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowLike(String value) {
            addCriterion("DRAW_SHADOW like", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowNotLike(String value) {
            addCriterion("DRAW_SHADOW not like", value, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowIn(List<String> values) {
            addCriterion("DRAW_SHADOW in", values, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowNotIn(List<String> values) {
            addCriterion("DRAW_SHADOW not in", values, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowBetween(String value1, String value2) {
            addCriterion("DRAW_SHADOW between", value1, value2, "drawShadow");
            return (Criteria) this;
        }

        public Criteria andDrawShadowNotBetween(String value1, String value2) {
            addCriterion("DRAW_SHADOW not between", value1, value2, "drawShadow");
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