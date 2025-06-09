USE employees;

SELECT * FROM employees
ORDER BY birth_date DESC;

DROP DATABASE IF EXISTS scoula_db;

CREATE DATABASE scoula_db;

CREATE USER 'scoula'@'%' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON scoula_db.* TO 'scoula'@'%';
GRANT ALL PRIVILEGES ON sqldb.* TO 'scoula'@'%';

FLUSH PRIVILEGES;

SELECT @@autocommit;



SELECT @@autocommit;

set autocommit = false; -- auto commit : OFF

SELECT @@autocommit;

USE sqldb;

SELECT * FROM BUYTBL;

START TRANSACTION;

DELETE FROM buytbl WHERE num = 1;
DELETE FROM buytbl WHERE num = 2;

SELECT * FROM BUYTBL;

ROLLBACK;

SELECT * FROM BUYTBL;

set autocommit = true;
