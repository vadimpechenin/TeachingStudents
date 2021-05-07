package com.company.teachingstudents.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Student;

@UiController("teachingstudents_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}