package com.company.teachingstudents.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TEACHINGSTUDENTS_TASK")
@Entity(name = "teachingstudents_Task")
@NamePattern("%s|name")
public class Task extends StandardEntity {
    private static final long serialVersionUID = 8376793460312150669L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROFESSOR_ID")
    private UniversityTeacher universityTeacher;

    @NotNull
    @Column(name = "GROUP_", nullable = false)
    private String group;

    @NotNull
    @Column(name = "IDTASK", nullable = false, unique = true)
    private String idtask;

    public String getIdtask() {
        return idtask;
    }

    public void setIdtask(String idtask) {
        this.idtask = idtask;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public UniversityTeacher getUniversityTeacher() {
        return universityTeacher;
    }

    public void setUniversityTeacher(UniversityTeacher universityTeacher) {
        this.universityTeacher = universityTeacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}