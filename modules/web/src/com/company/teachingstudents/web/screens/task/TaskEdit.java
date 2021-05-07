package com.company.teachingstudents.web.screens.task;

import com.haulmont.cuba.gui.screen.*;
import com.company.teachingstudents.entity.Task;

@UiController("teachingstudents_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
@LoadDataBeforeShow
public class TaskEdit extends StandardEditor<Task> {
}