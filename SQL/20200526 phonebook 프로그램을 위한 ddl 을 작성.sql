create table contact(
    
    pidx number(1) constraint contact_pidx_pk primary key,
    pbname varchar2(20) constraint contact_pbname_nn not null,
    pbphonenumber number(20) constraint contact_pbphonenumber_nn not null,
    pbaddr varchar2(20) default 'N',
    pbemail varchar2(20) default 'N',
    pbtype varchar2(20) constraint contact_pbtype_ck check (pbtype in('univ','com','cafe')),
    
    pbmajor varchar2(20),
    pbgrade number(10),
    pbcompany varchar2(20),
    pbdept varchar2(20),
    pbjob varchar2(20),
    pbcafe varchar2(20),
    pbnickname varchar2(20)
    );
