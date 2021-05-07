package com.company.teachingstudents.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Task;

@UiController("teachingstudents_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
@LoadDataBeforeShow
public class TaskBrowse extends StandardLookup<Task> {
}