/*CREATE DATABASE/SCHEMA IF NOT EXIST*/
CREATE SCHEMA IF NOT EXISTS `jdbc`;

/*CREATE DATABASE/SCHEMA*/
CREATE SCHEMA `jdbc` ;

/*CREATE TABLE*/
CREATE TABLE `jdbc`.`students` (
  `id_student` INT NOT NULL,
  `name` VARCHAR(255) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id_student`));
  
CREATE TABLE `jdbc`.`students2` (
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