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

insert into tblAddress
    values (seqAddress.nextval, '아무개', 25, '서울시 강남구 대치동', 'm');

insert into tblAddress
    values (seqAddress.nextval, '강아지', 25, '서울시 강남구 대치동', 'm');

insert into tblAddress
    values (seqAddress.nextval, '고양이', 25, '서울시 강남구 대치동', 'm');

insert into tblAddress
    values (seqAddress.nextval, '병아리', 25, '서울시 강남구 대치동', 'm');

insert into tblAddress
    values (seqAddress.nextval, '호호호', 25, '서울시 강남구 대치동', 'm');



create table tblPoint (
    seq number primary key,
    point number default  100 not null,
    aseq number not null  references tblAddress(seq)
);

create sequence seqPoint;

select * from tblAddress;

commit;

