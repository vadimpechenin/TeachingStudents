package com.company.teachingstudents.web.screens.universityteacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.UniversityTeacher;

@UiController("teachingstudents_UniversityTeacher.browse")
@UiDescriptor("university-teacher-browse.xml")
@LookupComponent("universityTeachersTable")
@LoadDataBeforeShow
public class UniversityTeacherBrowse extends StandardLookup<UniversityTeacher> {
}