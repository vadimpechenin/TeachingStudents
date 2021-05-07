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
);