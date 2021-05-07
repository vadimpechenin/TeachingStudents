alter table TEACHINGSTUDENTS_STUDENT alter column GROUP_ rename to GROUP___U58834 ^
alter table TEACHINGSTUDENTS_STUDENT alter column GROUP___U58834 set null ;
alter table TEACHINGSTUDENTS_STUDENT add column GROUP_ varchar(255) ^
update TEACHINGSTUDENTS_STUDENT set GROUP_ = '' where GROUP_ is null ;
alter table TEACHINGSTUDENTS_STUDENT alter column GROUP_ set not null ;
