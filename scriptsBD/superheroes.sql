DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
  
INSERT INTO creador VALUES(1,'Marvel');
INSERT INTO creador VALUES(2,'DC Comics');
INSERT INTO creador VALUES(3,'DC Comics');

INSERT INTO personajes VALUES(1,'bruce','hulk',4,9,'8',11,5,'ser muy fuerte',1);
INSERT INTO personajes VALUES(2,'alguno loco','loco',9,7,'9',4,7,'nada',2);

UPDATE personajes
	SET aparicion = 20
WHERE id_personaje = 1;

DELETE
	FROM personajes
WHERE id_personaje =2;

SELECT *
	FROM personajes;
