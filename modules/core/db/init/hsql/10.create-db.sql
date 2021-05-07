-- begin TEACHINGSTUDENTS_GRADE_SHEET
create table TEACHINGSTUDENTS_GRADE_SHEET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ITEM_NAME varchar(255) not null,
    GROUP_ varchar(255) not null,
    UNIVERSITY_TEACHER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TEACHINGSTUDENTS_GRADE_SHEET
-- begin TEACHINGSTUDENTS_UNIVERSITY_TEACHER
create table TEACHINGSTUDENTS_UNIVERSITY_TEACHER (
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
    PHONE_NUMBER varchar(255),
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEACHINGSTUDENTS_UNIVERSITY_TEACHER
-- begin TEACHINGSTUDENTS_STUDENT
create table TEACHINGSTUDENTS_STUDENT (
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
    GROUP_ varchar(255) not null,
    PHONE_NUMBER varchar(255),
    EMAIL_ADDRESS varchar(255) not null,
    AVERAGE_MARK double precision,
    --
    primary key (ID)
)^
-- end TEACHINGSTUDENTS_STUDENT
-- begin TEACHINGSTUDENTS_REPORT
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
)^
-- end TEACHINGSTUDENTS_REPORT
-- begin TEACHINGSTUDENTS_TASK
create table TEACHINGSTUDENTS_TASK (
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
    DESCRIPTION varchar(255),
    PROFESSOR_ID varchar(36),
    GROUP_ varchar(255) not null,
    IDTASK varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEACHINGSTUDENTS_TASK
