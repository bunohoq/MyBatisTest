select * from tabs;

create table tblAddress (
    seq number primary key,
    name varchar2(30) not null,
    age number(3) not null,
    address varchar2(300) not null,
    gender char(1) not null
);

create sequence seqAddress;

commit;

select * from tblAddress;

insert into tblAddress
    values (seqAddress.nextval, '홍길동', 20, '서울시 강남구 대치동', 'm');



