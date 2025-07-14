-- 스퀸스 객체 생성
create sequence seq_board;
-- 스퀸스 삭제 (차후에 활용)
drop sequence seq_board;
drop table test_board;

create table test_board(
	bno number(10,0),    				-- 게시물번호 (시퀀스)
	title varchar2(200) not null,		-- 제목
	content varchar2(2000) not null,	-- 내용
	writer varchar2(50) not null,		-- 작성자 (차후에 member와 연동)
	regdate date default sysdate,		-- 작성일 (자동으로 DB날짜가 입력)
	updatedate date default sysdate		-- 수정일 (자동으로 DB날짜가 입력)
); -- board 테이블 생성


alter table test_board add constraint pk_board primary key (bno);
-- tbl_board 구조변경(수정) 기본기를 bno로 지정함.


select * from test_board;