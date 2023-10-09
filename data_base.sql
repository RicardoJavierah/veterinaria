CREATE DATABASE BD_PeluqueriaCanina;
USE BD_PeluqueriaCanina;

CREATE TABLE tb_duenio(
id_duenio INT AUTO_INCREMENT PRIMARY KEY,
nombre_cliente VARCHAR(50),
telf_duenio CHAR(9)
);

CREATE TABLE tb_mascota(
id_mascota INT PRIMARY KEY,
nombre_Mascota VARCHAR(40) NOT NULL,
raza VARCHAR(20) NOT NULL,
color VARCHAR(20) NOT NULL,
alergia CHAR(2) NOT NULL,
atencion CHAR(2) NOT NULL,
observacion VARCHAR(255),
id_duenio INT,
FOREIGN KEY (id_duenio) REFERENCES tb_duenio(id_duenio)
ON DELETE CASCADE
);

#Inserciones Modelo
INSERT INTO tb_duenio VALUES (NULL,"joel","908767870"),(NULL,"jaime","908767870"), (NULL,"luis","908767870"), (NULL,"marco","908767870"), (NULL,"maria","908767870");
INSERT INTO tb_mascota VALUES (3, "boby","pequeña","rojo","si","no","ninguna",2),(4, "kelly","grande","crema","si","no","ninguna",3),(5, "rex","pastor","negro","si","no","ninguna",1);


