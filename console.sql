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

select * from tblPoint;

commit;

select
			*
		from tblAddress a
			left outer join tblPoint p
				on a.seq = p.aseq;


--tblInsa <-> tblProject
create table tblProject (
    seq number primary key,
    name varchar2(100) not null,
    location varchar2(100) not null,
    num number not null references tblInsa(num)
);

insert into tblProject values (1, '해외 수출', '서울', 1001);
insert into tblProject values (2, 'TV 광고', '부산', 1002);
insert into tblProject values (3, '고객 홍보', '울산', 1001);
insert into tblProject values (4, '자재 매입', '광주', 1003);
insert into tblProject values (5, '재고 확보', '대전', 1001);

commit;

select
			*
		from tblInsa i
			left outer join tblProject p
				on i.num = p.num;