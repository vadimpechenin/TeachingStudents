package com.company.teachingstudents.web.screens.gradesheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.GradeSheet;

@UiController("teachingstudents_GradeSheet.edit")
@UiDescriptor("grade-sheet-edit.xml")
@EditedEntityContainer("gradeSheetDc")
@LoadDataBeforeShow
public class GradeSheetEdit extends StandardEditor<GradeSheet> {
}