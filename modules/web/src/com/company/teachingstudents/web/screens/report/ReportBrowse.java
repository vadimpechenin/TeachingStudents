package com.company.teachingstudents.web.screens.report;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Report;

@UiController("teachingstudents_Report.browse")
@UiDescriptor("report-browse.xml")
@LookupComponent("reportsTable")
@LoadDataBeforeShow
public class ReportBrowse extends StandardLookup<Report> {
}