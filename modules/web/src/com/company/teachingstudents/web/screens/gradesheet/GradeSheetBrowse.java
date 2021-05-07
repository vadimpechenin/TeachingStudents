package com.company.teachingstudents.web.screens.gradesheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.GradeSheet;

@UiController("teachingstudents_GradeSheet.browse")
@UiDescriptor("grade-sheet-browse.xml")
@LookupComponent("gradeSheetsTable")
@LoadDataBeforeShow
public class GradeSheetBrowse extends StandardLookup<GradeSheet> {
}