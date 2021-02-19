-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.36-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para bdpsicologia
CREATE DATABASE IF NOT EXISTS `bdpsicologia` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bdpsicologia`;

-- Volcando estructura para tabla bdpsicologia.cita
CREATE TABLE IF NOT EXISTS `cita` (
  `ID_CITA` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `DNI` char(8) NOT NULL,
  `ID_ESPECIALISTA` char(8) NOT NULL,
  `ID_ESPECIALIDAD` int(6) NOT NULL,
  `FECHA` datetime NOT NULL,
  `ESTADO` int(11) NOT NULL,
  `DESCRIPCION` varchar(250) NOT NULL,
  `DIAGNOSTICO` varchar(250) NOT NULL,
  `TIPO_CITA` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_CITA`),
  KEY `DNI` (`DNI`),
  KEY `ID_ESPECIALISTA` (`ID_ESPECIALISTA`),
  KEY `ID_ESPECIALIDAD` (`ID_ESPECIALIDAD`),
  CONSTRAINT `FK_cita_especialidad` FOREIGN KEY (`ID_ESPECIALIDAD`) REFERENCES `especialidad` (`ID_ESPECIALIDAD`),
  CONSTRAINT `FK_cita_especialista` FOREIGN KEY (`ID_ESPECIALISTA`) REFERENCES `especialista` (`DNI`),
  CONSTRAINT `FK_cita_pacientes` FOREIGN KEY (`DNI`) REFERENCES `pacientes` (`DNI`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.cita: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` (`ID_CITA`, `DNI`, `ID_ESPECIALISTA`, `ID_ESPECIALIDAD`, `FECHA`, `ESTADO`, `DESCRIPCION`, `DIAGNOSTICO`, `TIPO_CITA`) VALUES
	(0000000001, '12345678', '12345678', 1, '2018-12-21 15:00:00', 0, 'Cansancio y Estres', 'Necesita descanso', 'consulta'),
	(0000000002, '89921221', 'admin', 2, '2018-12-21 13:00:00', 2, 'Problemas de comunicacion', 'Tratamiento Contra el estres\n', 'consulta'),
	(0000000003, '13819202', 'admin', 2, '2018-12-23 12:00:00', 0, 'Panico al exponer', '', 'consulta'),
	(0000000004, '28151844', '12404830', 4, '2018-12-23 10:30:00', 1, 'Desconfianza de pareja', '', 'consulta'),
	(0000000005, '58135832', '98765432', 3, '2018-12-29 12:00:00', 0, 'Tristesa por un fallecimiento familiar', '', 'consulta'),
	(0000000006, '13819202', '12345678', 1, '2019-01-01 16:00:00', 0, 'Estres', '', 'consulta'),
	(0000000007, '89921221', 'admin', 2, '2019-01-08 12:30:00', 0, 'Estres laboral', 'Necesita descanso', 'consulta'),
	(0000000008, '34950852', '12345678', 1, '2019-01-08 14:30:00', 0, 'Miedo a los perros', '', 'consulta'),
	(0000000009, '89921221', '12345678', 1, '2019-01-10 12:30:00', 2, 'Dolor de la Cabeza', 'Necesita descanso', 'consulta'),
	(0000000010, '12345678', 'admin', 1, '2019-12-20 09:00:00', 2, '', 'Se le atendera sin preambulos', 'consulta'),
	(0000000011, '13819202', 'admin', 1, '2019-12-21 21:00:00', 2, '', 'El paciente Miriana Castro sera atendida en el Consultorio 405.\nSe le cobrara 100 soles por el tratamiento.', 'consulta');
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.det_cita
CREATE TABLE IF NOT EXISTS `det_cita` (
  `id_det_cita` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `id_cita` int(10) unsigned zerofill NOT NULL,
  `fecha` datetime NOT NULL,
  `diagnostico` varchar(250) NOT NULL,
  `estado` char(1) NOT NULL,
  `pago` double NOT NULL,
  PRIMARY KEY (`id_det_cita`),
  KEY `FK_det_cita_cita` (`id_cita`),
  CONSTRAINT `FK_det_cita_cita` FOREIGN KEY (`id_cita`) REFERENCES `cita` (`ID_CITA`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.det_cita: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `det_cita` DISABLE KEYS */;
INSERT INTO `det_cita` (`id_det_cita`, `id_cita`, `fecha`, `diagnostico`, `estado`, `pago`) VALUES
	(0000000001, 0000000001, '2018-11-21 15:00:00', 'Necesita descanso', '1', 100),
	(0000000002, 0000000002, '2018-11-21 13:00:00', '', '0', 100),
	(0000000003, 0000000003, '2018-11-23 12:00:00', 'En tratamiento en el cosultorio N°405.', '2', 100),
	(0000000004, 0000000010, '2018-11-20 10:00:00', 'Pase al consultorio N°501', '2', 100),
	(0000000005, 0000000011, '2018-11-21 14:00:00', '', '0', 100),
	(0000000006, 0000000002, '2018-12-15 12:00:00', '', '0', 100);
/*!40000 ALTER TABLE `det_cita` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.especialidad
CREATE TABLE IF NOT EXISTS `especialidad` (
  `ID_ESPECIALIDAD` int(6) NOT NULL AUTO_INCREMENT,
  `ESPECIALIDAD` varchar(80) NOT NULL,
  `ID_SERVICIO` int(10) NOT NULL,
  PRIMARY KEY (`ID_ESPECIALIDAD`),
  KEY `FK_especialidad_servicio` (`ID_SERVICIO`),
  CONSTRAINT `FK_especialidad_servicio` FOREIGN KEY (`ID_SERVICIO`) REFERENCES `servicio` (`ID_SERVICIO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.especialidad: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` (`ID_ESPECIALIDAD`, `ESPECIALIDAD`, `ID_SERVICIO`) VALUES
	(1, 'Neuro Psicologia', 1),
	(2, 'Psicologia Social', 1),
	(3, 'Psicologia Familiar', 1),
	(4, 'Psicologia de Parejas', 1);
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.especialista
CREATE TABLE IF NOT EXISTS `especialista` (
  `DNI` char(8) NOT NULL,
  `NOMBRES` varchar(100) NOT NULL,
  `APE_PAT` varchar(50) NOT NULL,
  `APE_MAT` varchar(50) NOT NULL,
  `SEXO` char(1) NOT NULL,
  `F_NACIMIENTO` date NOT NULL,
  `CORREO` varchar(30) NOT NULL,
  `TELEFONO1` varchar(11) NOT NULL,
  `TELEFONO2` varchar(11) NOT NULL,
  `F_REGISTRO` datetime NOT NULL,
  `ESTADO` char(1) NOT NULL,
  `CONTRASENIA` varchar(15) NOT NULL,
  `ID_ESPECIALIDAD` int(10) NOT NULL,
  PRIMARY KEY (`DNI`),
  KEY `FK_especialista_especialidad` (`ID_ESPECIALIDAD`),
  CONSTRAINT `FK_especialista_especialidad` FOREIGN KEY (`ID_ESPECIALIDAD`) REFERENCES `especialidad` (`ID_ESPECIALIDAD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.especialista: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `especialista` DISABLE KEYS */;
INSERT INTO `especialista` (`DNI`, `NOMBRES`, `APE_PAT`, `APE_MAT`, `SEXO`, `F_NACIMIENTO`, `CORREO`, `TELEFONO1`, `TELEFONO2`, `F_REGISTRO`, `ESTADO`, `CONTRASENIA`, `ID_ESPECIALIDAD`) VALUES
	('12345678', 'Demetrio', 'Franco', 'Cupre', 'M', '1980-05-21', 'demetrio@gmail.com', '987654321', '011234567', '2018-11-19 00:00:00', '0', 'admin', 1),
	('12404830', 'Maxima', 'Chavez', 'Francine', 'F', '1980-10-26', 'maxima@gmail.com', '915725718', '', '2018-11-19 00:00:00', '0', 'admin', 4),
	('98765432', 'Lou', 'Valencia', 'Mendez', 'F', '1980-05-11', 'lou@gmail.com', '951188124', '', '2018-11-19 00:00:00', '0', 'admin', 3),
	('admin', 'Francisco', 'Valencia', 'Peña', 'M', '1980-05-12', 'francisco@gmail.com', '991421142', '', '2018-11-19 00:00:00', '0', 'admin', 2);
/*!40000 ALTER TABLE `especialista` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.hora
CREATE TABLE IF NOT EXISTS `hora` (
  `hora` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.hora: ~28 rows (aproximadamente)
/*!40000 ALTER TABLE `hora` DISABLE KEYS */;
INSERT INTO `hora` (`hora`) VALUES
	('08:00'),
	('08:30'),
	('09:00'),
	('09:30'),
	('10:00'),
	('10:30'),
	('11:00'),
	('11:30'),
	('12:00'),
	('12:30'),
	('14:00'),
	('14:30'),
	('15:00'),
	('15:30'),
	('16:00'),
	('16:30'),
	('17:00'),
	('17:30'),
	('18:00'),
	('18:30'),
	('19:00'),
	('19:30'),
	('20:00'),
	('20:30'),
	('21:00'),
	('21:30'),
	('22:00');
/*!40000 ALTER TABLE `hora` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.pacientes
CREATE TABLE IF NOT EXISTS `pacientes` (
  `DNI` char(8) NOT NULL,
  `NOMBRES` varchar(100) NOT NULL,
  `APE_PAT` varchar(50) NOT NULL,
  `APE_MAT` varchar(50) NOT NULL,
  `SEXO` char(1) NOT NULL,
  `F_NACIMIENTO` date NOT NULL,
  `CORREO` varchar(30) NOT NULL,
  `TELEFONO1` varchar(11) NOT NULL,
  `TELEFONO2` varchar(11) NOT NULL,
  `F_REGISTRO` datetime NOT NULL,
  `ESTADO` char(1) NOT NULL,
  `CONTRASENA` varchar(15) NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.pacientes: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` (`DNI`, `NOMBRES`, `APE_PAT`, `APE_MAT`, `SEXO`, `F_NACIMIENTO`, `CORREO`, `TELEFONO1`, `TELEFONO2`, `F_REGISTRO`, `ESTADO`, `CONTRASENA`) VALUES
	('12345678', 'Raul', 'Santiago', 'Lopez', 'M', '1990-12-22', 'raul@gmail.com', '999123456', '011234567', '2018-11-19 10:07:32', '1', '123'),
	('13819202', 'Miriana', 'Castro', 'Martines', 'F', '1990-08-16', 'miriana@gmail.com', '957351859', '', '2018-11-19 10:09:45', '0', '123'),
	('28151844', 'Partricia', 'Torres', 'Sanchez', 'F', '1989-06-18', 'partricia@gmail.com', '958179112', '', '2018-11-19 10:11:17', '0', '123'),
	('34950852', 'Beto', 'Nano', 'Morilla', 'M', '1990-10-20', 'beto@gmail.com', '912867512', '', '2018-11-19 10:12:48', '0', '123'),
	('58135832', 'Carlos', 'Galvez', 'Manrique', 'M', '1989-08-20', 'carlos@gmail.com', '912581924', '', '2018-11-19 10:13:59', '0', '123'),
	('89921221', 'Fabiana', 'De la Fuente', 'Lopez', 'F', '1990-10-12', 'fabiana@gmail.com', '987654321', '019847328', '2018-11-19 10:15:38', '0', '123');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.pago
CREATE TABLE IF NOT EXISTS `pago` (
  `id_pago` int(10) NOT NULL AUTO_INCREMENT,
  `ID_OPERACION` int(10) unsigned zerofill NOT NULL,
  `N_TARJETA` varchar(30) NOT NULL,
  `COD_SEG` varchar(30) NOT NULL,
  `MONTO` decimal(8,2) NOT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `FK_pago_cita` (`ID_OPERACION`),
  CONSTRAINT `FK_pago_cita` FOREIGN KEY (`ID_OPERACION`) REFERENCES `cita` (`ID_CITA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.pago: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` (`id_pago`, `ID_OPERACION`, `N_TARJETA`, `COD_SEG`, `MONTO`) VALUES
	(1, 0000000001, '123', '123', 100.00),
	(2, 0000000002, '124', '124', 100.00),
	(3, 0000000003, '125', '125', 100.00);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;

-- Volcando estructura para tabla bdpsicologia.servicio
CREATE TABLE IF NOT EXISTS `servicio` (
  `ID_SERVICIO` int(10) NOT NULL AUTO_INCREMENT,
  `SERVICIO` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_SERVICIO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla bdpsicologia.servicio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` (`ID_SERVICIO`, `SERVICIO`) VALUES
	(1, 'Psicologia');
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
