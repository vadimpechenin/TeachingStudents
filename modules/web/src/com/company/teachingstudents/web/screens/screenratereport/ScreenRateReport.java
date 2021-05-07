package com.company.teachingstudents.web.screens.screenratereport;


import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.company.teachingstudents.entity.GradeSheet;
import com.company.teachingstudents.web.screens.gradesheetcontroller.GradesheetcontrollerScreen;

import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("teachingstudents_ScreenRateReport")
@UiDescriptor("screen-rate-report.xml")
public class ScreenRateReport extends Screen {
    @Inject
    private InstanceContainer<GradeSheet> gradeSheetDc;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;
    @Inject
    private Metadata metadata;
    @Inject
    private Screens screens;

    @Subscribe
    private void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        GradeSheet gradeSheet = metadata.create(GradeSheet.class);
        gradeSheetDc.setItem(gradeSheet);
    }

    @Subscribe("showOrderBtn")
    private void onShowOrderBtnClick(Button.ClickEvent event) {
        GradeSheet gradeSheet = gradeSheetDc.getItem();
        String sb = "<strong>group:</strong> " + gradeSheet.getGroup() + "<br>" +
                "<strong>itemName:</strong> " + gradeSheet.getItemName()+ "<br>" +
                "<strong>customer:</strong> " + (gradeSheet.getUniversityTeacher() != null
                ? metadataTools.getInstanceName(gradeSheet.getUniversityTeacher())
                : null);

        notifications.create()
                .withCaption(sb)
                .withContentMode(ContentMode.HTML)
                .show();

        GradesheetcontrollerScreen screen = screens.create(GradesheetcontrollerScreen.class);
        screen.setGroup(gradeSheet.getGroup());
        screens.show(screen);

    }
}