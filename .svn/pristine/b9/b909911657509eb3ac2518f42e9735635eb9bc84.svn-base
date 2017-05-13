
    create table Academic_Records (
        acadrecId  serial not null,
        gpa varchar(255),
        gre varchar(255),
        toefl varchar(255),
        transcript varchar(255),
        primary key (acadrecId)
    );

    create table AdditionalReq (
        id  serial not null,
        add_info_name varchar(255),
        required boolean,
        type varchar(255),
        dept_dpmtId int4,
        primary key (id)
    );

    create table Application (
        appId  serial not null,
        submittedOn timestamp,
        term varchar(255),
        program_programId int4,
        status_appstatusId int4,
        primary key (appId)
    );

    create table Application_Status (
        appstatusId  serial not null,
        statusName varchar(255),
        primary key (appstatusId)
    );

    create table Department (
        dpmtId  serial not null,
        dpmtName varchar(255),
        primary key (dpmtId)
    );

    create table Educational_Background (
        edubackId  serial not null,
        EndDate timestamp,
        StartDate timestamp,
        college varchar(255),
        degreeRecieved varchar(255),
        major varchar(255),
        university varchar(255),
        primary key (edubackId)
    );

    create table Programs (
        programId  serial not null,
        programName varchar(255),
        requirement varchar(255),
        department_dpmtId int4,
        primary key (programId)
    );

    create table Student_Info (
        stuinfoId  serial not null,
        cin varchar(255),
        citizenship varchar(255),
        dob timestamp,
        fName varchar(255),
        gender varchar(255),
        lName varchar(255),
        phoneNo varchar(255),
        acadrecord_acadrecId int4,
        applications_appId int4,
        id_id int4,
        primary key (stuinfoId)
    );

    create table Student_Info_Educational_Background (
        Student_Info_stuinfoId int4 not null,
        edubckgrnd_edubackId int4 not null
    );

    create table additional_info (
        addinfoId  serial not null,
        value varchar(255),
        addreq_id int4,
        application_appId int4,
        primary key (addinfoId)
    );

    create table user_role (
        userroleID  serial not null,
        userroleName varchar(255),
        primary key (userroleID)
    );

    create table users (
        id  serial not null,
        emailID varchar(255),
        firstName varchar(255),
        lastName varchar(255),
        password varchar(255),
        role_userroleID int4,
        primary key (id)
    );

    alter table Student_Info_Educational_Background 
        add constraint UK_hesbkaipy4m675wwvjs59upb2 unique (edubckgrnd_edubackId);

    alter table AdditionalReq 
        add constraint FK_f0iv96r1gk0tekge63dstd2iq 
        foreign key (dept_dpmtId) 
        references Department;

    alter table Application 
        add constraint FK_wggq0jc2fqr0rgbosi5k22p1 
        foreign key (program_programId) 
        references Programs;

    alter table Application 
        add constraint FK_8qilx2wle7588vcxdvxyyqjky 
        foreign key (status_appstatusId) 
        references Application_Status;

    alter table Programs 
        add constraint FK_ea323msgmtbiggq2r3hulhm16 
        foreign key (department_dpmtId) 
        references Department;

    alter table Student_Info 
        add constraint FK_nlh85p78165to7mnif2r3vgkh 
        foreign key (acadrecord_acadrecId) 
        references Academic_Records;

    alter table Student_Info 
        add constraint FK_eocst89i45sa7thqjxv86r6yb 
        foreign key (applications_appId) 
        references Application;

    alter table Student_Info 
        add constraint FK_2hc9jrsgb7u2pxopv98sdem6p 
        foreign key (id_id) 
        references users;

    alter table Student_Info_Educational_Background 
        add constraint FK_hesbkaipy4m675wwvjs59upb2 
        foreign key (edubckgrnd_edubackId) 
        references Educational_Background;

    alter table Student_Info_Educational_Background 
        add constraint FK_2wkpltjtr3x3vfiy8evyuew3l 
        foreign key (Student_Info_stuinfoId) 
        references Student_Info;

    alter table additional_info 
        add constraint FK_h7nkcqfcft0ctv5t5gdejrvna 
        foreign key (addreq_id) 
        references AdditionalReq;

    alter table additional_info 
        add constraint FK_6impi0846gnsow8f9ga6ywlin 
        foreign key (application_appId) 
        references Application;

    alter table users 
        add constraint FK_2m2e98wj24ymn6gy3f5v5r23l 
        foreign key (role_userroleID) 
        references user_role;
