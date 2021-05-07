package com.company.teachingstudents.web.screens.universityteacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.UniversityTeacher;

@UiController("teachingstudents_UniversityTeacher.edit")
@UiDescriptor("university-teacher-edit.xml")
@EditedEntityContainer("universityTeacherDc")
@LoadDataBeforeShow
public class UniversityTeacherEdit extends StandardEditor<UniversityTeacher> {
}