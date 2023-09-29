/*CREATE DATABASE/SCHEMA IF NOT EXIST*/
CREATE SCHEMA IF NOT EXISTS `fist_data_base`;

/*CREATE DATABASE/SCHEMA*/
CREATE SCHEMA `first_data_base` ;

/*CREATE TABLE*/
CREATE TABLE `first_data_base`.`students` (
  `id_student` INT NOT NULL,
  `name` VARCHAR(255) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id_student`));
  
CREATE TABLE `first_data_base`.`students2` (
  `id_student` INT NOT NULL,
  `name` VARCHAR(255) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id_student`));
/*INSERT DATA IN THE TABLE*/

INSERT INTO students VALUES(1,'felipe',30);
INSERT INTO students VALUES(2,'maria',20);
INSERT INTO students VALUES(3,'andres',50);

INSERT INTO students2 VALUES(1,'felipe',30);
INSERT INTO students2 VALUES(2,'oscar',20);
INSERT INTO students2 VALUES(3,'andres',56);

/*SELECT EVERYTHING OF THE TABLE*/
SELECT *
	FROM students;
    
/*UPDATE*/
UPDATE students
	SET name = 'ricardo'
WHERE id_student = 1;

/*DELETE*/
DELETE 
	FROM students
WHERE id_student = 3;

/*DELETE OR DROP TABLE/SCHEMA ETC*/
DROP TABLE students;
DROP SCHEMA first_data_base;    

/*SELECT IF CONDITION*/
SELECT NAME FROM STUDENTS;
SELECT NAME FROM STUDENTS WHERE NAME LIKE 'F%';

/*ORDER BY */
SELECT NAME FROM STUDENTS ORDER BY NAME ASC;

/*AGGREGATION FUNCTION*/
SELECT MAX AGE FROM STUDENTS;
SELECT MIN ID_STUDENT FROM STUDENTS;
SELECT AVG AGE FROM STUDENTS;
SELECT COUNT(ID_STUDENT) FROM STUDENTS;

/*GROUP BY */
SELECT NAME, SUM(AGE) FROM STUDENTS;
SELECT COUNT(ID_STUDENT), NAME FROM STUDENTS;

/*HAVING*/
/*agruparia cuantas personas hay por pais y que solo las muestre si ese pais tiene mas de una persona*/
SELECT COUNT(ID), pais FROM Personas GROUP BY pais HAVING COUNT(ID) > 1;

/*AS*/
/*PUT A NICK NAME TO A COLOMUN THAT WE SAID*/
SELECT NAME AS NAMESTUDENT FROM STUDENTS;


/*ROUND*/
SELECT ROUND(AVG(AGE)) FROM STUDENTS;

/*LIMIT*/
SELECT NAME FROM STUDENTS LIMIT 1;


/*JOIN*/

/*INNER JOIN*/
SELECT * FROM  students INNER JOIN students2 ON students.id_student = students2.id_student;

/*LEFT JOIN*/
SELECT * FROM  students LEFT JOIN students2 ON students.id_student = students2.id_student;

/*RIGHT JOIN*/
SELECT * FROM  students RIGHT JOIN students2 ON students.id_student = students2.id_student;

/*SUB QUERY*/
/*IT IS FOR USE A QUERY INSIDE OF AND OTHER QUERY*/
SELECT nombre, salario FROM Empleados WHERE salario > (SELECT AVG(salario) FROM Empleados);