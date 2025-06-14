-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: autosign
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `retirada`
--

DROP TABLE IF EXISTS `retirada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `retirada` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_professor` int NOT NULL,
  `id_sala` int NOT NULL,
  `id_material_ar` int NOT NULL,
  `id_material_datashow` int NOT NULL,
  `data_hora` datetime NOT NULL,
  `data_hora_devolucao` datetime DEFAULT NULL,
  `data_devolucao` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_professor` (`id_professor`),
  KEY `id_sala` (`id_sala`),
  KEY `id_material_ar` (`id_material_ar`),
  KEY `id_material_datashow` (`id_material_datashow`),
  CONSTRAINT `retirada_ibfk_1` FOREIGN KEY (`id_professor`) REFERENCES `professor` (`id`),
  CONSTRAINT `retirada_ibfk_2` FOREIGN KEY (`id_sala`) REFERENCES `sala` (`id`),
  CONSTRAINT `retirada_ibfk_3` FOREIGN KEY (`id_material_ar`) REFERENCES `material` (`id`),
  CONSTRAINT `retirada_ibfk_4` FOREIGN KEY (`id_material_datashow`) REFERENCES `material` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `retirada`
--

LOCK TABLES `retirada` WRITE;
/*!40000 ALTER TABLE `retirada` DISABLE KEYS */;
INSERT INTO `retirada` VALUES (6,1,1,4,1,'2025-06-14 00:19:49',NULL,'2025-06-14 10:32:19'),(7,1,2,5,2,'2025-06-14 00:57:20',NULL,'2025-06-14 10:32:13'),(8,1,3,6,3,'2025-06-14 02:09:10',NULL,'2025-06-14 10:32:09'),(9,1,1,4,1,'2025-06-14 10:33:28',NULL,'2025-06-14 10:44:08');
/*!40000 ALTER TABLE `retirada` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-14 10:48:53
