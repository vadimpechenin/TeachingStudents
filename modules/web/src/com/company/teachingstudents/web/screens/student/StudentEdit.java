package com.company.teachingstudents.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Student;

@UiController("teachingstudents_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}