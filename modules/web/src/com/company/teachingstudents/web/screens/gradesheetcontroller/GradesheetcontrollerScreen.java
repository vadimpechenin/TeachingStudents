package com.company.teachingstudents.web.screens.gradesheetcontroller;

import ch.qos.logback.core.util.Loader;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.WindowParam;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Table;
import com.company.teachingstudents.entity.Student;

import com.haulmont.cuba.gui.Fragments;

import com.company.teachingstudents.web.screens.screenratereport.ScreenRateReport;
import javax.inject.Inject;

@UiController("teachingstudents_GradesheetcontrollerScreen")
@UiDescriptor("gradesheetcontroller-screen.xml")
@LoadDataBeforeShow
public class GradesheetcontrollerScreen extends Screen {



    @Inject
    private CollectionLoader<Student> studentsDl;

    //Передача параметра с первого экрана, взято из https://doc.cuba-platform.com/manual-latest-ru/gui_data_loaders.html
    /*@Subscribe("groupFilterField")
    private void onGroupFilterFieldValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue()) {
            studentsDl.setParameter("group", true);
        } else {
            studentsDl.removeParameter("group");
        }
        studentsDl.load();
    } */

    public void setGroup(String group) {
        studentsDl.setParameter("group", group);
    }

    @Inject
    private Notifications notifications;

    @Inject
    private Fragments fragments;

    @Inject
    private Screens screens;

    @Inject
    private CheckBox multiselect;
    @Inject
    private CheckBox columnControlVisible;
    @Inject
    private CheckBox sortable;
    @Inject
    private CheckBox reorderingAllowed;
    @Inject
    private CheckBox showSelection;

    @Inject
    private Table<Student> studentsTable;

    @Subscribe
    protected void onInit(InitEvent event) {
        multiselect.setValue(studentsTable.isMultiSelect());
        sortable.setValue(studentsTable.isSortable());
        columnControlVisible.setValue(studentsTable.getColumnControlVisible());
        reorderingAllowed.setValue(studentsTable.getColumnReorderingAllowed());
        showSelection.setValue(studentsTable.isShowSelection());
        /*studentsDl.setQuery(
                "select e from sample$Product e left join e.customer c " +
                        "where c.id = :param$customer or c is null"); */
    }

    @Subscribe("multiselect")
    protected void onMultiselectValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        studentsTable.setMultiSelect(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("sortable")
    protected void onSortableValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        studentsTable.setSortable(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("columnControlVisible")
    protected void onColumnControlVisibleValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        studentsTable.setColumnControlVisible(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("reorderingAllowed")
    protected void onReorderingAllowedValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        studentsTable.setColumnReorderingAllowed(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("showSelection")
    protected void onShowSelectionValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        studentsTable.setShowSelection(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("rateStudents")
    protected void onSomeActionActionPerformed(Action.ActionPerformedEvent event) {
        notifications.create()
                .withCaption("Action performed")
                .show();

        ScreenRateReport screen = screens.create(ScreenRateReport.class);
        screens.show(screen);
    }

}