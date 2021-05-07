package com.company.teachingstudents.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TEACHINGSTUDENTS_REPORT")
@Entity(name = "teachingstudents_Report")
@NamePattern("%s|name")
public class Report extends StandardEntity {
    private static final long serialVersionUID = -838198833031254547L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_ID")
    private Task task;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @Column(name = "IDREPORT", nullable = false, unique = true)
    @NotNull
    private Integer idreport;

    public void setIdreport(Integer idreport) {
        this.idreport = idreport;
    }

    public Integer getIdreport() {
        return idreport;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}