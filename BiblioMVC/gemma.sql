UNLOCK TABLES;
drop database if exists libros;
create database libros;
use libros;

--
-- Table structure for table `alumnos`
--
DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;



CREATE TABLE `alumnos` (

  `dni` varchar(14) NOT NULL,
  `nombre` varchar(26) NOT NULL,
  `apellido1` varchar(21) NOT NULL,
  `apellido2` varchar(21) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=6587 DEFAULT CHARSET=latin1;






INSERT INTO `alumnos` VALUES ('38a','ZENEIDA','ACOSTA','MARTIN'),
('54133956Y','JOS','ACOSTA','MONTESDEOCA'),('61a','WALID ADIB','AYACHE',''),
('52123956Y','JUAN MIGUEL','AFONSO','ALONSO'),('73a','SERGIO','AFONSO','MARRERO'),
('53133956Y','MAR...','AFONSO','MEDINA'),('79a','HERIBERTO','AFONSO','PEREZ'),
('51133956Y','DESIREE RAIZA','AFONSO','RAMIREZ'),('85a','JUANA ISABEL','AFONSO','REYES'),
('50133956Y','CARMEN G.','AFONSO','SANTANA'),('96a','JOSE ANGEL','AGUIAR','MARTIN'),
('55133956Y,'CARMEN ROSA','AGUIAR','MENDOZA'),('99a','OLIVERIO CARMELO','AGUIAR','PONCE'),
('51133956Y','ISRAEL SERGIO','AGUIAR','RODR'),('121a','IRENE DE LA LUZ','ALAMO','CACERES'),
('54133956Y','ADELAIDA','ALAMO','GONZALEZ'),('132a','NEREIDA MARIA','ALAMO','MORENO'),
('34133956Y','FRANCISCO ECHEDEY','ALAMO','PEREZ'),
('148a','INES MARIA','ALBA','RODRIGUEZ');




/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;




select * from alumnos;

