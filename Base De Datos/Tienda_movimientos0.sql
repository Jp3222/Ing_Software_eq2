-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: Tienda
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dia` int NOT NULL,
  `mes` int NOT NULL,
  `año` int NOT NULL,
  `hora` int NOT NULL,
  `min` int NOT NULL,
  `seg` int NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=302 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
INSERT INTO `movimientos` VALUES (1,10,10,2021,20,51,16,'inicio_de_sesion','root'),(2,11,10,2021,15,47,9,'inicio_de_sesion','root'),(3,11,10,2021,15,49,12,'inicio_de_sesion','root'),(4,11,10,2021,15,50,53,'inicio_de_sesion','root'),(5,11,10,2021,15,55,12,'inicio_de_sesion','root'),(6,11,10,2021,15,58,55,'inicio_de_sesion','root'),(7,11,10,2021,15,59,35,'inicio_de_sesion','jc2001'),(8,11,10,2021,16,20,16,'inicio_de_sesion','root'),(9,11,10,2021,16,22,56,'inicio_de_sesion','root'),(10,11,10,2021,16,25,25,'inicio_de_sesion','root'),(11,11,10,2021,16,30,21,'inicio_de_sesion','root'),(12,11,10,2021,16,31,13,'inicio_de_sesion','jc2001'),(13,11,10,2021,16,35,0,'inicio_de_sesion','jc2001'),(14,11,10,2021,17,15,38,'inicio_de_sesion','root'),(15,11,10,2021,17,48,38,'inicio_de_sesion','jc2001'),(16,11,10,2021,23,35,39,'inicio_de_sesion','root'),(17,12,10,2021,23,11,19,'inicio_de_sesion','root'),(18,12,10,2021,23,11,43,'inicio_de_sesion','jc2001'),(19,12,10,2021,23,11,51,'inicio_de_sesion','root'),(20,13,10,2021,0,15,50,'inicio_de_sesion','jc2001'),(21,13,10,2021,2,11,48,'inicio_de_sesion','root'),(22,13,10,2021,2,33,58,'inicio_de_sesion','root'),(23,13,10,2021,3,37,33,'inicio_de_sesion','root'),(24,13,10,2021,3,39,2,'inicio_de_sesion','root'),(25,13,10,2021,3,39,13,'inicio_de_sesion','jc2001'),(26,13,10,2021,3,39,20,'inicio_de_sesion','root'),(27,13,10,2021,16,34,4,'inicio_de_sesion','root'),(28,13,10,2021,16,43,1,'inicio_de_sesion','root'),(29,13,10,2021,16,44,53,'inicio_de_sesion','root'),(30,13,10,2021,16,45,10,'inicio_de_sesion','root'),(31,13,10,2021,23,9,37,'inicio_de_sesion','root'),(32,14,10,2021,3,1,9,'inicio_de_sesion','root'),(33,14,10,2021,3,37,31,'inicio_de_sesion','root'),(34,14,10,2021,3,40,30,'inicio_de_sesion','root'),(35,14,10,2021,3,41,27,'inicio_de_sesion','jc2001'),(36,14,10,2021,3,46,20,'inicio_de_sesion','jc2001'),(37,14,10,2021,3,48,17,'inicio_de_sesion','jc2001'),(38,14,10,2021,3,49,18,'inicio_de_sesion','jc2001'),(39,14,10,2021,3,49,25,'inicio_de_sesion','root'),(40,14,10,2021,3,49,38,'inicio_de_sesion','jc2001'),(41,14,10,2021,3,50,41,'inicio_de_sesion','jc2001'),(42,14,10,2021,3,50,46,'inicio_de_sesion','root'),(43,14,10,2021,3,50,54,'inicio_de_sesion','jc2001'),(44,14,10,2021,9,7,9,'inicio_de_sesion','root'),(45,14,10,2021,9,7,26,'inicio_de_sesion','root'),(46,14,10,2021,9,8,26,'inicio_de_sesion','root'),(47,14,10,2021,9,8,32,'inicio_de_sesion','root'),(48,14,10,2021,9,9,6,'inicio_de_sesion','root'),(49,14,10,2021,9,9,16,'inicio_de_sesion','root'),(50,14,10,2021,22,14,5,'inicio_de_sesion','jc2001'),(51,14,10,2021,22,14,12,'inicio_de_sesion','root'),(52,14,10,2021,22,37,1,'inicio_de_sesion','jc2001'),(53,14,10,2021,22,37,7,'inicio_de_sesion','root'),(54,14,10,2021,23,11,22,'inicio_de_sesion','root'),(55,14,10,2021,23,23,15,'inicio_de_sesion','root'),(56,14,10,2021,23,27,26,'inicio_de_sesion','root'),(57,14,10,2021,23,28,33,'inicio_de_sesion','root'),(58,14,10,2021,23,30,30,'inicio_de_sesion','root'),(59,14,10,2021,23,34,54,'inicio_de_sesion','root'),(60,14,10,2021,23,35,59,'inicio_de_sesion','root'),(61,14,10,2021,23,36,33,'inicio_de_sesion','root'),(62,14,10,2021,23,37,20,'inicio_de_sesion','root'),(63,14,10,2021,23,39,0,'inicio_de_sesion','root'),(64,14,10,2021,23,41,41,'inicio_de_sesion','root'),(65,14,10,2021,23,42,26,'inicio_de_sesion','root'),(66,14,10,2021,23,54,39,'inicio_de_sesion','root'),(67,14,10,2021,23,56,35,'inicio_de_sesion','root'),(68,14,10,2021,23,57,18,'inicio_de_sesion','root'),(69,14,10,2021,23,59,13,'inicio_de_sesion','root'),(70,15,10,2021,0,15,37,'inicio_de_sesion','root'),(71,15,10,2021,0,26,14,'inicio_de_sesion','root'),(72,15,10,2021,0,32,47,'inicio_de_sesion','root'),(73,15,10,2021,0,34,49,'inicio_de_sesion','root'),(74,15,10,2021,0,36,39,'inicio_de_sesion','root'),(75,15,10,2021,0,41,31,'inicio_de_sesion','root'),(76,15,10,2021,0,42,44,'inicio_de_sesion','root'),(77,15,10,2021,0,46,34,'inicio_de_sesion','root'),(78,15,10,2021,0,47,14,'inicio_de_sesion','root'),(79,15,10,2021,0,48,59,'inicio_de_sesion','root'),(80,15,10,2021,11,54,45,'inicio_de_sesion','root'),(81,15,10,2021,11,56,7,'inicio_de_sesion','root'),(82,15,10,2021,11,58,21,'inicio_de_sesion','root'),(83,15,10,2021,12,5,14,'inicio_de_sesion','root'),(84,15,10,2021,12,20,45,'inicio_de_sesion','root'),(85,15,10,2021,12,27,18,'inicio_de_sesion','root'),(86,15,10,2021,12,29,20,'inicio_de_sesion','root'),(87,15,10,2021,12,30,52,'inicio_de_sesion','root'),(88,15,10,2021,12,37,7,'inicio_de_sesion','root'),(89,15,10,2021,12,38,9,'inicio_de_sesion','root'),(90,15,10,2021,12,39,46,'inicio_de_sesion','root'),(91,15,10,2021,12,40,42,'inicio_de_sesion','root'),(92,15,10,2021,12,45,48,'inicio_de_sesion','root'),(93,15,10,2021,12,46,38,'inicio_de_sesion','root'),(94,15,10,2021,12,47,49,'inicio_de_sesion','root'),(95,15,10,2021,12,50,47,'inicio_de_sesion','root'),(96,15,10,2021,12,53,27,'inicio_de_sesion','root'),(97,15,10,2021,12,54,25,'inicio_de_sesion','root'),(98,15,10,2021,12,55,59,'inicio_de_sesion','root'),(99,15,10,2021,12,57,38,'inicio_de_sesion','root'),(100,15,10,2021,12,58,17,'inicio_de_sesion','root'),(101,15,10,2021,12,59,32,'inicio_de_sesion','root'),(102,15,10,2021,13,0,37,'inicio_de_sesion','root'),(103,15,10,2021,13,1,23,'inicio_de_sesion','root'),(104,15,10,2021,13,4,16,'inicio_de_sesion','root'),(105,15,10,2021,13,5,33,'inicio_de_sesion','root'),(106,15,10,2021,13,6,49,'inicio_de_sesion','root'),(107,15,10,2021,13,8,0,'inicio_de_sesion','root'),(108,15,10,2021,13,37,10,'inicio_de_sesion','root'),(109,15,10,2021,13,44,16,'inicio_de_sesion','root'),(110,15,10,2021,13,47,34,'inicio_de_sesion','root'),(111,15,10,2021,14,0,0,'inicio_de_sesion','root'),(112,15,10,2021,14,0,52,'inicio_de_sesion','root'),(113,15,10,2021,14,2,20,'inicio_de_sesion','root'),(114,15,10,2021,14,17,11,'inicio_de_sesion','root'),(115,15,10,2021,20,23,40,'inicio_de_sesion','root'),(116,16,10,2021,1,14,32,'inicio_de_sesion','root'),(117,16,10,2021,1,16,47,'inicio_de_sesion','root'),(118,16,10,2021,14,10,9,'inicio_de_sesion','root'),(119,16,10,2021,22,31,56,'inicio_de_sesion','root'),(120,16,10,2021,22,32,39,'inicio_de_sesion','root'),(121,16,10,2021,22,35,25,'inicio_de_sesion','root'),(122,16,10,2021,22,35,53,'inicio_de_sesion','root'),(123,16,10,2021,22,39,30,'inicio_de_sesion','root'),(124,16,10,2021,22,46,31,'inicio_de_sesion','root'),(125,16,10,2021,22,55,29,'inicio_de_sesion','root'),(126,16,10,2021,22,57,45,'inicio_de_sesion','root'),(127,16,10,2021,23,6,57,'inicio_de_sesion','root'),(128,16,10,2021,23,8,7,'inicio_de_sesion','root'),(129,16,10,2021,23,10,29,'inicio_de_sesion','root'),(130,16,10,2021,23,48,29,'inicio_de_sesion','root'),(131,16,10,2021,23,56,21,'inicio_de_sesion','root'),(132,17,10,2021,0,7,28,'inicio_de_sesion','root'),(133,17,10,2021,1,0,23,'inicio_de_sesion','root'),(134,17,10,2021,13,23,55,'inicio_de_sesion','root'),(135,17,10,2021,13,25,57,'inicio_de_sesion','root'),(136,17,10,2021,13,34,56,'inicio_de_sesion','root'),(137,17,10,2021,13,35,55,'inicio_de_sesion','root'),(138,17,10,2021,13,36,57,'inicio_de_sesion','root'),(139,17,10,2021,13,37,51,'inicio_de_sesion','root'),(140,17,10,2021,13,40,13,'inicio_de_sesion','root'),(141,17,10,2021,13,40,40,'inicio_de_sesion','root'),(142,17,10,2021,13,43,0,'inicio_de_sesion','root'),(143,17,10,2021,14,11,57,'inicio_de_sesion','root'),(144,17,10,2021,14,16,54,'inicio_de_sesion','root'),(145,17,10,2021,14,17,37,'inicio_de_sesion','root'),(146,17,10,2021,14,25,15,'inicio_de_sesion','root'),(147,17,10,2021,14,26,52,'inicio_de_sesion','root'),(148,17,10,2021,14,29,25,'inicio_de_sesion','root'),(149,17,10,2021,14,34,30,'inicio_de_sesion','root'),(150,17,10,2021,14,36,51,'inicio_de_sesion','root'),(151,17,10,2021,14,39,45,'inicio_de_sesion','root'),(152,17,10,2021,14,40,7,'inicio_de_sesion','root'),(153,17,10,2021,14,40,42,'inicio_de_sesion','root'),(154,17,10,2021,14,44,25,'inicio_de_sesion','root'),(155,17,10,2021,14,45,51,'inicio_de_sesion','root'),(156,17,10,2021,14,47,13,'inicio_de_sesion','root'),(157,17,10,2021,14,47,55,'inicio_de_sesion','root'),(158,17,10,2021,14,48,0,'inicio_de_sesion','root'),(159,17,10,2021,14,52,36,'inicio_de_sesion','root'),(160,17,10,2021,14,53,22,'inicio_de_sesion','root'),(161,17,10,2021,14,54,33,'inicio_de_sesion','root'),(162,17,10,2021,15,2,45,'inicio_de_sesion','root'),(163,17,10,2021,15,4,2,'inicio_de_sesion','root'),(164,17,10,2021,15,17,32,'inicio_de_sesion','root'),(165,17,10,2021,17,49,8,'inicio_de_sesion','root'),(166,17,10,2021,17,51,34,'inicio_de_sesion','root'),(167,17,10,2021,17,55,11,'inicio_de_sesion','root'),(168,17,10,2021,17,57,53,'inicio_de_sesion','root'),(169,17,10,2021,17,59,45,'inicio_de_sesion','root'),(170,17,10,2021,20,3,21,'inicio_de_sesion','root'),(171,17,10,2021,20,7,20,'inicio_de_sesion','root'),(172,18,10,2021,1,22,18,'inicio_de_sesion','root'),(173,18,10,2021,1,22,56,'inicio_de_sesion','root'),(174,18,10,2021,1,25,20,'inicio_de_sesion','root'),(175,18,10,2021,1,30,10,'inicio_de_sesion','root'),(176,18,10,2021,1,37,33,'inicio_de_sesion','root'),(177,18,10,2021,1,39,23,'inicio_de_sesion','root'),(178,18,10,2021,1,42,27,'inicio_de_sesion','root'),(179,18,10,2021,1,49,14,'inicio_de_sesion','root'),(180,18,10,2021,1,58,32,'inicio_de_sesion','root'),(181,18,10,2021,2,11,45,'inicio_de_sesion','root'),(182,18,10,2021,2,15,18,'inicio_de_sesion','root'),(183,18,10,2021,2,22,24,'inicio_de_sesion','root'),(184,18,10,2021,2,22,29,'inicio_de_sesion','root'),(185,18,10,2021,2,25,20,'inicio_de_sesion','root'),(186,18,10,2021,2,25,34,'cierre_de_sesion','root'),(187,18,10,2021,2,38,30,'inicio_de_sesion','root'),(188,18,10,2021,2,40,36,'inicio_de_sesion','root'),(189,18,10,2021,2,40,43,'cierre_del_sistema','root'),(190,18,10,2021,2,49,14,'inicio_de_sesion','root'),(191,18,10,2021,2,50,7,'cierre_del_sistema','root'),(192,18,10,2021,2,54,29,'inicio_de_sesion','root'),(193,18,10,2021,2,55,52,'cierre_del_sistema','root'),(194,18,10,2021,2,56,57,'inicio_de_sesion','root'),(195,18,10,2021,2,58,1,'cierre_del_sistema','root'),(196,18,10,2021,3,2,30,'inicio_de_sesion','root'),(197,18,10,2021,3,2,37,'cierre_de_sesion','root'),(198,18,10,2021,3,2,38,'cierre_del_sistema','root'),(199,18,10,2021,3,3,14,'inicio_de_sesion','root'),(200,18,10,2021,3,3,17,'cierre_del_sistema','root'),(201,18,10,2021,3,6,21,'inicio_de_sesion','root'),(202,18,10,2021,3,6,23,'cierre_del_sistema','root'),(203,18,10,2021,3,7,27,'inicio_de_sesion','root'),(204,18,10,2021,3,7,29,'cierre_del_sistema','root'),(205,18,10,2021,3,9,4,'inicio_de_sesion','root'),(206,18,10,2021,3,9,9,'cierre_del_sistema','root'),(207,18,10,2021,14,11,24,'inicio_de_sesion','root'),(208,18,10,2021,14,14,59,'cierre_del_sistema','root'),(209,18,10,2021,14,22,26,'inicio_de_sesion','root'),(210,18,10,2021,14,24,42,'cierre_de_sesion','root'),(211,18,10,2021,14,25,8,'inicio_de_sesion','root'),(212,18,10,2021,14,26,41,'cierre_del_sistema','root'),(213,19,10,2021,4,39,8,'inicio_de_sesion','jc2001'),(214,19,10,2021,4,39,15,'cierre_del_sistema','jc2001'),(215,19,10,2021,4,47,13,'inicio_de_sesion','jc2001'),(216,19,10,2021,4,48,15,'cierre_del_sistema','jc2001'),(217,19,10,2021,4,50,36,'inicio_de_sesion','root'),(218,19,10,2021,6,28,43,'inicio_de_sesion','root'),(219,19,10,2021,6,29,8,'cierre_del_sistema','root'),(220,19,10,2021,6,29,39,'inicio_de_sesion','root'),(221,19,10,2021,6,29,58,'cierre_del_sistema','root'),(222,19,10,2021,6,30,33,'inicio_de_sesion','root'),(223,19,10,2021,6,30,42,'cierre_del_sistema','root'),(224,19,10,2021,6,35,12,'inicio_de_sesion','root'),(225,19,10,2021,6,35,52,'cierre_del_sistema','root'),(226,19,10,2021,6,57,11,'inicio_de_sesion','root'),(227,19,10,2021,6,58,15,'cierre_del_sistema','root'),(228,19,10,2021,6,59,3,'inicio_de_sesion','root'),(229,19,10,2021,6,59,19,'cierre_del_sistema','root'),(230,19,10,2021,6,59,35,'inicio_de_sesion','root'),(231,19,10,2021,7,0,13,'cierre_del_sistema','root'),(232,20,10,2021,2,26,30,'inicio_de_sesion','jc2001'),(233,20,10,2021,2,30,26,'cierre_del_sistema','jc2001'),(234,21,10,2021,1,8,20,'inicio_de_sesion','root'),(235,21,10,2021,1,9,21,'cierre_del_sistema','root'),(236,21,10,2021,1,19,28,'inicio_de_sesion','root'),(237,21,10,2021,1,19,40,'cierre_del_sistema','root'),(238,21,10,2021,1,20,40,'inicio_de_sesion','root'),(239,21,10,2021,1,21,16,'cierre_del_sistema','root'),(240,21,10,2021,1,22,46,'inicio_de_sesion','jc2001'),(241,21,10,2021,1,23,26,'cierre_del_sistema','jc2001'),(242,21,10,2021,1,23,59,'inicio_de_sesion','jc2001'),(243,21,10,2021,1,24,39,'cierre_del_sistema','jc2001'),(244,21,10,2021,1,25,1,'inicio_de_sesion','root'),(245,21,10,2021,1,25,27,'cierre_del_sistema','root'),(246,21,10,2021,1,35,57,'inicio_de_sesion','root'),(247,21,10,2021,1,37,12,'cierre_del_sistema','root'),(248,21,10,2021,1,38,1,'inicio_de_sesion','root'),(249,21,10,2021,1,38,50,'inicio_de_sesion','root'),(250,21,10,2021,1,39,35,'cierre_del_sistema','root'),(251,21,10,2021,1,40,15,'inicio_de_sesion','root'),(252,21,10,2021,1,40,51,'cierre_del_sistema','root'),(253,21,10,2021,1,41,22,'inicio_de_sesion','root'),(254,21,10,2021,1,42,34,'cierre_del_sistema','root'),(255,21,10,2021,1,44,51,'inicio_de_sesion','root'),(256,21,10,2021,1,45,5,'cierre_del_sistema','root'),(257,21,10,2021,7,6,5,'inicio_de_sesion','root'),(258,21,10,2021,7,6,58,'cierre_del_sistema','root'),(259,21,10,2021,7,7,40,'inicio_de_sesion','root'),(260,21,10,2021,7,7,59,'cierre_del_sistema','root'),(261,21,10,2021,7,10,8,'inicio_de_sesion','root'),(262,21,10,2021,7,10,27,'cierre_del_sistema','root'),(263,21,10,2021,7,12,8,'inicio_de_sesion','root'),(264,21,10,2021,7,12,33,'cierre_del_sistema','root'),(265,21,10,2021,7,12,58,'inicio_de_sesion','root'),(266,21,10,2021,7,13,17,'cierre_del_sistema','root'),(267,21,10,2021,7,14,8,'inicio_de_sesion','root'),(268,21,10,2021,7,14,52,'cierre_del_sistema','root'),(269,21,10,2021,7,16,9,'inicio_de_sesion','root'),(270,21,10,2021,7,16,12,'cierre_del_sistema','root'),(271,21,10,2021,7,16,54,'inicio_de_sesion','root'),(272,21,10,2021,7,17,6,'cierre_del_sistema','root'),(273,21,10,2021,7,18,13,'inicio_de_sesion','root'),(274,21,10,2021,7,18,30,'cierre_del_sistema','root'),(275,21,10,2021,7,22,26,'inicio_de_sesion','root'),(276,21,10,2021,7,22,34,'cierre_del_sistema','root'),(277,21,10,2021,7,22,53,'inicio_de_sesion','root'),(278,21,10,2021,7,22,58,'cierre_del_sistema','root'),(279,21,10,2021,7,23,46,'inicio_de_sesion','root'),(280,21,10,2021,7,24,5,'cierre_del_sistema','root'),(281,21,10,2021,7,24,30,'inicio_de_sesion','root'),(282,21,10,2021,7,25,7,'cierre_del_sistema','root'),(283,21,10,2021,7,25,23,'inicio_de_sesion','root'),(284,21,10,2021,7,25,50,'cierre_del_sistema','root'),(285,21,10,2021,7,26,6,'inicio_de_sesion','root'),(286,21,10,2021,7,26,10,'cierre_del_sistema','root'),(287,21,10,2021,7,41,56,'inicio_de_sesion','root'),(288,21,10,2021,7,42,48,'cierre_del_sistema','root'),(289,21,10,2021,7,45,5,'inicio_de_sesion','root'),(290,21,10,2021,7,45,42,'cierre_del_sistema','root'),(291,21,10,2021,7,47,8,'inicio_de_sesion','root'),(292,21,10,2021,7,47,39,'cierre_de_sesion','root'),(293,21,10,2021,7,47,44,'cierre_del_sistema','root'),(294,21,10,2021,7,54,22,'inicio_de_sesion','root'),(295,21,10,2021,7,54,24,'cierre_de_sesion','root'),(296,21,10,2021,7,54,29,'inicio_de_sesion','root'),(297,21,10,2021,7,54,40,'cierre_del_sistema','root'),(298,22,10,2021,20,6,25,'inicio_de_sesion','jc2001'),(299,22,10,2021,20,6,28,'cierre_de_sesion','jc2001'),(300,22,10,2021,20,6,40,'inicio_de_sesion','root'),(301,22,10,2021,20,8,16,'cierre_del_sistema','root');
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-22 20:23:09
