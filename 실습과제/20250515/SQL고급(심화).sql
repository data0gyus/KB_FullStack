# 앞에서 정의한 3개의 테이블을 이용해서 다음을 처리하세요.
# ○ 학생 테이블, 동아리 테이블, 학생 동아리 테이블을 이용해서 학생을 기준으로 학생 이름/지역/가입한 동아리/동아리방을 출력하세요.
USE sqldb;

SELECT a.stdName, a.addr, b.clubName, b.roomNo  FROM stdtbl AS a
    INNER JOIN stdclubtbl AS SC
        ON a.stdName = SC.stdName
    INNER JOIN clubtbl AS b
        ON SC.clubName = b.clubName
ORDER BY a.stdName;

# 동아리를 기준으로 가입한 학생의 목록을 출력하세요.
#  출력정보: clubName, roomNo, stdName, addr

SELECT a.clubName, a.roomNo, b.stdName, b.addr FROM clubtbl AS a
    INNER JOIN stdclubtbl AS SC
        ON SC.clubName = a.clubName
    INNER JOIN stdtbl as b
        ON SC.stdName = b.stdName
ORDER BY a.clubName;

# 앞에서 추가한 테이블에서 '우대리'의 상관 연락처 정보를 확인하세요.
    # ○ 출력할 정보
    #  부하직원, 직속상관, 직속상관연락처
SELECT a.emp AS 부하직원, b.emp AS 직속상관, b.empTel AS 직속상관연락처
FROM emptbl AS a
    INNER JOIN emptbl AS b
        ON a.manager = b.emp
WHERE A.emp = '우대리';

# employees 데이터베이스에서 수행한다
USE employees;

# 현재 재직 중인 직원의 정보를 출력하세요
    # ○ 출력 항목: emp_no, first_name, last_name, title
SELECT a.emp_no, a.first_name, a.last_name, b.title FROM employees AS a
    INNER JOIN titles AS b
        ON a.emp_no = b.emp_no
WHERE b.to_date = '9999-01-01';

SELECT a.emp_no, a.first_name, a.last_name, b.title FROM employees AS a
    INNER JOIN titles AS b
        ON a.emp_no = b.emp_no
WHERE CURRENT_DATE BETWEEN from_date AND to_date;

# 현재 재직 중인 직원 정보를 출력하세요
    # ○ 출력항목: 직원의 기본 정보 모두, title, salary
SELECT a.*, b.title, c.salary  FROM employees AS a
    INNER JOIN titles AS b
        ON a.emp_no = b.emp_no
    INNER JOIN salaries AS c
        ON a.emp_no = c.emp_no
WHERE c.to_date = '9999-01-01' AND b.to_date = '9999-01-01';

SELECT a.*, b.title, c.salary FROM employees AS a
      INNER JOIN titles AS b
        ON a.emp_no = b.emp_no
      INNER JOIN salaries AS c
        ON a.emp_no = c.emp_no
WHERE CURRENT_DATE BETWEEN c.from_date AND c.to_date
    AND CURRENT_DATE BETWEEN b.from_date AND b.to_date;

# 현재 재직중인 직원의 정보를 출력하세요.
    # ○ 출력항목: emp_no, first_name, last_name, department
    # ○ 정렬: emp_no 오름 차순

SELECT b.emp_no, b.first_name, b.last_name, c.dept_name FROM dept_emp AS a
    INNER JOIN employees AS b
        ON a.emp_no = b.emp_no
    INNER JOIN departments AS c
        ON a.dept_no = c.dept_no
WHERE a.to_date = '9999-01-01'
ORDER BY b.emp_no ASC;

SELECT b.emp_no, b.first_name, b.last_name, c.dept_name FROM dept_emp AS a
    INNER JOIN employees AS b
        ON a.emp_no = b.emp_no
    INNER JOIN departments AS c
        ON a.dept_no = c.dept_no
WHERE CURRENT_DATE BETWEEN a.from_date AND a.to_date
ORDER BY b.emp_no ASC;

# 부서별 재직중인 직원의 수를 출력하세요.
# ○ 출력 항목: 부서 번호, 부서명, 인원수
# ○ 정렬: 부서 번호 오름차순

SELECT a.dept_no, b.dept_name, count(*) FROM dept_emp AS a
    INNER JOIN departments AS b
        ON a.dept_no = b.dept_no
    INNER JOIN employees AS c
        ON a.emp_no = c.emp_no
WHERE a.to_date = '9999-01-01'
GROUP BY a.dept_no
ORDER BY a.dept_no;

SELECT a.dept_no, b.dept_name, count(*) FROM dept_emp AS a
    INNER JOIN departments AS b
        ON a.dept_no = b.dept_no
    INNER JOIN employees AS c
        ON a.emp_no = c.emp_no
WHERE CURRENT_DATE BETWEEN a.from_date AND a.to_date
GROUP BY a.dept_no
ORDER BY a.dept_no;

# 직원 번호가 10209인 직원의 부서 이동 히스토리를 출력하세요.
    # ○ 출력항목: emp_no, first_name, last_name, dept_name, from_date, to_date
SELECT b.emp_no, b.first_name, b.last_name, c.dept_name, a.from_date, a.to_date FROM dept_emp as a
    INNER JOIN employees AS b
        ON a.emp_no = b.emp_no
    INNER JOIN departments AS c
        ON a.dept_no = c.dept_no
WHERE b.emp_no = 10209;

