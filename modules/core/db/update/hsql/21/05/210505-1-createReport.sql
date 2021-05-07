create table TEACHINGSTUDENTS_REPORT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TASK_ID varchar(36),
    STUDENT_ID varchar(36),
    IDREPORT integer not null,
    --
    primary key (ID)
);