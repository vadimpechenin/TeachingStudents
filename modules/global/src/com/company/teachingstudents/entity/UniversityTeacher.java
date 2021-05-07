package com.company.teachingstudents.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TEACHINGSTUDENTS_UNIVERSITY_TEACHER")
@Entity(name = "teachingstudents_UniversityTeacher")
@NamePattern("%s|name")
public class UniversityTeacher extends StandardEntity {
    private static final long serialVersionUID = -4794908583285806959L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}