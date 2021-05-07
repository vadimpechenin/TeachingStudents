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
    PHONE_NUMBER varchar(255),
    EMAIL_ADDRESS varchar(255) not null,
    AVERAGE_MARK double precision,
    --
    primary key (ID)
);