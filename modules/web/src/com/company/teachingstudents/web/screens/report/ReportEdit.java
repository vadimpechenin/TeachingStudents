package com.company.teachingstudents.web.screens.report;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Report;

@UiController("teachingstudents_Report.edit")
@UiDescriptor("report-edit.xml")
@EditedEntityContainer("reportDc")
@LoadDataBeforeShow
public class ReportEdit extends StandardEditor<Report> {
}