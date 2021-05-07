alter table TEACHINGSTUDENTS_STUDENT add column GROUP_ integer ^
update TEACHINGSTUDENTS_STUDENT set GROUP_ = 0 where GROUP_ is null ;
alter table TEACHINGSTUDENTS_STUDENT alter column GROUP_ set not null ;
