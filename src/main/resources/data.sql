INSERT INTO `estilo` (idestilo, tipo, nombre, votos) VALUES (1, 1, 'Rock', 0);
INSERT INTO `estilo` (idestilo, tipo, nombre, votos) VALUES (2, 2, 'Pop', 0);
INSERT INTO `estilo` (idestilo, tipo, nombre, votos) VALUES (3, 3, 'Jazz', 0);

INSERT INTO `encuesta` (estilo, correo) VALUES (1, 'correo1@correo.com');
INSERT INTO `encuesta` (estilo, correo) VALUES (2, 'correo2@correo.com');
INSERT INTO `encuesta` (estilo, correo) VALUES (3, 'correo3@correo.com');

INSERT INTO `encuesta_estilo` (tipo, estilo) VALUES (1, 1);
INSERT INTO `encuesta_estilo` (tipo, estilo) VALUES (2, 2);
INSERT INTO `encuesta_estilo` (tipo, estilo) VALUES (3, 3);