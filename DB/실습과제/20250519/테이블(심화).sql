# 다음 컬럼을 가지는 userTBL과 buyTBL을 정의하세요.
    # 기존에 테이블이 존재하면 삭제함
USE tabledb;

DROP TABLE IF EXISTS usertbl, buytbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY ,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL
);

CREATE TABLE buytbl(
    num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    userID CHAR(8) NOT NULL,
    prodName CHAR(6) NOT NULL,
    FOREIGN KEY(userID) REFERENCES usertbl(userID)
);

# 다음 조건을 만족하는 usertbl 테이블을 정의하세요
    # 기존 buytbl과 usertbl을 삭제하세요.
USE tabledb;

DROP TABLE IF EXISTS usertbl, buytbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY ,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL,
    emaul CHAR(30) NULL UNIQUE
);

# 다음 조건을 만족하는 usertbl을 정의하세요.
    # 기존 usertbl을 삭제하세요.
USE tabledb;

DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NULL,
    birthYear INT NULL CHECK ( birthYear >= 1900 AND birthYear <= 2023 ),
    mobile CHAR(3) NOT NULL
);

# 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
    # 기존 usertbl을 삭제하세요.
    # 기본값 추가를 확인 할 수 있는 데이터를 추가하세요
USE tabledb;

DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL DEFAULT -1,
    addr CHAR(2) NOT NULL DEFAULT '서울',
    mobile1 CHAR(3) NULL,
    mobile2 CHAR(8) NULL,
    height SMALLINT NULL DEFAULT 170,
    mDAte DATE NULL
);

INSERT INTO usertbl VALUES ('LHL','이혜리',default,default,'011','1234567',default,'2023-12-12');
INSERT INTO usertbl(userID, name) VALUES ('KAY', '김아영');
INSERT INTO  usertbl VALUES ('WB', '원빈',1982,'대전','019','1111111',176,'2020-5-5');

SELECT * FROM usertbl;

# 앞에서 만든 usertbl에 대해서 다음 조건을 처리하도록 수정하세요.

# mobile1 컬럼을 삭제하세요.
ALTER TABLE usertbl DROP COLUMN mobile1;

# name 컬럼명을 uName으로 변경함
ALTER TABLE usertbl CHANGE COLUMN name uName VARCHAR(20) NULL;

# 기본키를 제거함
ALTER TABLE usertbl DROP PRIMARY KEY ;


# 모든 문제는 employees 데이터베이스에서 수행한다.
USE employees;

# 다음 정보를 가지는 직원 정보를 출력하는 EMPLOYEES_INFO 뷰를 작성하세요
CREATE VIEW EMPLOYEES_INFO
AS
SELECT e.emp_no, e.birth_date, e.first_name, e.last_name, e.gender, e.hire_date,
       t.title, t.from_date AS t_from, t.to_date AS t_to,
       s.salary, s.from_date AS s_from, s.to_date AS s_to
FROM employees AS e
    INNER JOIN titles AS t ON e.emp_no = t.emp_no
    INNER JOIN salaries AS s ON e.emp_no = s.emp_no;

# EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.
SELECT * FROM EMPLOYEES_INFO
WHERE s_to = '9999-01-01' AND t_to = '9999-01-01';
    # 이미지와 동일하게 하기 위해서는 아래와 같이 SELECT 하면 됨
    SELECT * FROM EMPLOYEES_INFO
    WHERE s_to = '9999-01-01';
    # 10004와 10007이 중복되어 나옴 t_to에 대한 조건이 없기 때문

# 다음 정보를 가지는 부서 정보를 출력하는 EMP_DEPT_INFO 뷰를 작성하세요
CREATE VIEW EMP_DEPT_INFO
AS
SELECT e.emp_no, de.dept_no, d.dept_name, de.from_date, de.to_date
FROM employees e
    INNER JOIN dept_emp AS de ON e.emp_no = de.emp_no
    INNER JOIN departments AS d ON de.dept_no = d.dept_no
ORDER BY e.emp_no ASC;

# EMP_DEPT_INFO로 현재 재직자의 부서 정보를 출력하세요.
SELECT * FROM EMP_DEPT_INFO
WHERE to_date = '9999-01-01';