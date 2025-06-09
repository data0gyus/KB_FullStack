# tabledb 데이터베이스를 생성하세요.
# ○ 만일, 이미 존재한다면 삭제하세요.

DROP DATABASE tabledb;
CREATE DATABASE tabledb;
USE tabledb;

# 다음 컬럼을 가지는 usertbl 테이블을 만드세요
DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthyear INT NOT NULL,
    addr CHAR(2) NOT NULL,
    mobile1 CHAR(3) NULL,
    mobile2 CHAR(8) NULL,
    height SMALLINT NULL,
    mDate DATE NULL
);

# 다음 컬럼을 가지는 buytbl 테이블을 만드세요.
DROP TABLE IF EXISTS buytbl;

CREATE TABLE buytbl(
    num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    userID CHAR(8) NOT NULL,
    prodName CHAR(6) NOT NULL,
    groupName CHAR(4) NULL,
    price INT NOT NULL,
    amount SMALLINT NOT NULL,
    FOREIGN KEY(userID) REFERENCES usertbl(userID)
);

# 회원 테이블에 다음 데이터를 입력하세요.
INSERT INTO usertbl VALUES('LSG','이승기', 1987,'서울','011','1111111',182,'2009-8-8');
INSERT INTO usertbl VALUES('KBS','김번수', 1979,'경남','011','2222222',173,'2012-4-4');
INSERT INTO usertbl VALUES('KKH','김경호', 1971,'전남','019','3333333',177,'2007-7-7');


# 구매 테이블에 다음 데이터를 입력하세요
INSERT INTO buytbl VALUES(null,'KBS','운동화',null,30,2);
INSERT INTO buytbl VALUES(null,'KBS','노트북','전자',1000,1);
INSERT INTO buytbl VALUES(null,'JYP','모니터','전자',200,1);
-- 3번째 INSERT INTO는 에러 발생, userid 컬럼이 참조하는 usertbl테이블의 userID 컬럼에 'JYP'가 없음

# 다음 컬럼을 가지는 usertbl을 정의하세요.
    # ○ 기존 usertbl이 존재하는 경우 삭제함
    # ○ 기본키는 테이블 레벨에서 정의하고 제약조건명을 함께 지정함
DROP TABLE buytbl;
DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL,
    CONSTRAINT PRIMARY KEY PK_USER_ID(userID)
);

# 다음 컬럼을 가지는 prodTbl 을 정의하세요.
    # ○ 기존 prodTbl이 존재하는 경우 삭제함
DROP TABLE IF EXISTS prodtbl;

CREATE TABLE prodtbl(
    prodCode CHAR(3) NOT NULL,
    prodID CHAR(4) NOT NULL,
    prodDate DATETIME NOT NULL,
    proCur CHAR(10) NULL,
    CONSTRAINT PK_PROCODE_PRODID PRIMARY KEY (prodCode, prodID)
);

# sqldb 데이터 베이스를 이용해서
# usertbl과 buytbl을 바탕으로 다음 결과가 나오는 뷰를 정의하세요.
USE sqldb;

CREATE VIEW v_userbuytbl
AS
SELECT u.userid, u.name, b.prodName, u.addr, CONCAT(u.mobile1, u.mobile2)
FROM usertbl AS u
    INNER JOIN buytbl b
        ON u.userID = b.userID;

SELECT * FROM v_userbuytbl;

# 위에서 정의한 뷰에서 userid가 '김범수'인 데이터만 출력하세요.
SELECT *
FROM v_userbuytbl
WHERE name = '김범수';

