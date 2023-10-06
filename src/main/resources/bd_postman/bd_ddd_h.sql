-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         PostgreSQL 16.0, compiled by Visual C++ build 1935, 64-bit
-- SO del servidor:              
-- HeidiSQL Versión:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES  */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando estructura para tabla public.cuenta
CREATE TABLE IF NOT EXISTS "cuenta" (
	"numero_cuenta" INTEGER NULL DEFAULT NULL,
	"tipo" VARCHAR NULL DEFAULT NULL,
	"saldo_inicial" DOUBLE PRECISION NULL DEFAULT NULL,
	"estado" BOOLEAN NULL DEFAULT NULL,
	"idusuario" INTEGER NULL DEFAULT NULL,
	"idcuenta" INTEGER NOT NULL DEFAULT 'nextval(''cuenta_idcuenta_seq''::regclass)',
	PRIMARY KEY ("idcuenta")
);

-- Volcando datos para la tabla public.cuenta: 1 rows
DELETE FROM "cuenta";
/*!40000 ALTER TABLE "cuenta" DISABLE KEYS */;
INSERT INTO "cuenta" ("numero_cuenta", "tipo", "saldo_inicial", "estado", "idusuario", "idcuenta") VALUES
	(424234, 'Cuenta Corriente', 2000, 'true', 3, 1);
/*!40000 ALTER TABLE "cuenta" ENABLE KEYS */;

-- Volcando estructura para tabla public.movimiento
CREATE TABLE IF NOT EXISTS "movimiento" (
	"fecha" VARCHAR NULL DEFAULT NULL,
	"idcuenta" INTEGER NULL DEFAULT NULL,
	"movimiento" DOUBLE PRECISION NULL DEFAULT NULL,
	"saldo" DOUBLE PRECISION NULL DEFAULT NULL,
	"idmovimiento" INTEGER NOT NULL DEFAULT 'nextval(''movimiento_idmovimiento_seq''::regclass)',
	"estado" BOOLEAN NULL DEFAULT NULL,
	PRIMARY KEY ("idmovimiento")
);

-- Volcando datos para la tabla public.movimiento: 1 rows
DELETE FROM "movimiento";
/*!40000 ALTER TABLE "movimiento" DISABLE KEYS */;
INSERT INTO "movimiento" ("fecha", "idcuenta", "movimiento", "saldo", "idmovimiento", "estado") VALUES
	('06-10-2023', 3, 600, 2600, 1, 'true');
/*!40000 ALTER TABLE "movimiento" ENABLE KEYS */;

-- Volcando estructura para tabla public.usuario
CREATE TABLE IF NOT EXISTS "usuario" (
	"correo" VARCHAR NULL DEFAULT NULL,
	"telefono" VARCHAR NULL DEFAULT NULL,
	"empresa" VARCHAR NULL DEFAULT NULL,
	"ruc" INTEGER NULL DEFAULT NULL,
	"tipo" INTEGER NULL DEFAULT NULL,
	"contrasenia" VARCHAR NULL DEFAULT NULL,
	"direccion" VARCHAR NULL DEFAULT NULL,
	"nombre" VARCHAR NULL DEFAULT NULL,
	"idusuario" INTEGER NOT NULL DEFAULT 'nextval(''user_idusuario_seq''::regclass)',
	PRIMARY KEY ("idusuario")
);

-- Volcando datos para la tabla public.usuario: 1 rows
DELETE FROM "usuario";
/*!40000 ALTER TABLE "usuario" DISABLE KEYS */;
INSERT INTO "usuario" ("correo", "telefono", "empresa", "ruc", "tipo", "contrasenia", "direccion", "nombre", "idusuario") VALUES
	('dany@hhas.com', '364453', 'j&r', 2050453035, 1, 'sdasdsadf', 'calle 2f', 'Danny', 3);
/*!40000 ALTER TABLE "usuario" ENABLE KEYS */;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
