package com.company.teachingstudents.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TEACHINGSTUDENTS_GRADE_SHEET")
@Entity(name = "teachingstudents_GradeSheet")
public class GradeSheet extends StandardEntity {
    private static final long serialVersionUID = -1419734702815423385L;

    @Column(name = "ITEM_NAME", nullable = false)
    @NotNull
    private String itemName;

    @NotNull
    @Column(name = "GROUP_", nullable = false)
    private String group;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UNIVERSITY_TEACHER_ID")
    private UniversityTeacher universityTeacher;

    public UniversityTeacher getUniversityTeacher() {
        return universityTeacher;
    }

    public void setUniversityTeacher(UniversityTeacher universityTeacher) {
        this.universityTeacher = universityTeacher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}