-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: swift_datajava
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `hstry_deposit`
--

DROP TABLE IF EXISTS `hstry_deposit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_deposit` (
  `ID` varchar(45) NOT NULL,
  `acctname` varchar(45) NOT NULL,
  `dpstreference` varchar(45) DEFAULT NULL,
  `checknum` varchar(45) DEFAULT NULL,
  `amount` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_deposit`
--

LOCK TABLES `hstry_deposit` WRITE;
/*!40000 ALTER TABLE `hstry_deposit` DISABLE KEYS */;
INSERT INTO `hstry_deposit` VALUES ('DP-231114-0001','1234567890','N/A','N/A','PHP 213123','Done',NULL,NULL),('DP-231114-0002','09128390123','N/A','N/A','PHP 213203','Denied',NULL,NULL),('DP-231114-0004','67','N/A','12','PHP 50','Done',NULL,NULL),('DP-231114-0005','132123','N/A','N/A','PHP 23123','Denied',NULL,NULL),('DP-231114-0006','2123','132','N/A','PHP 29183','Denied',NULL,NULL),('DP-231115-0001','0128391201427474','1231231422','N/A','PHP 1241242','Denied',NULL,NULL),('DP-231115-0002','0123891389128319','9124819248','N/A','PHP 2141240','Pending',NULL,NULL),('DP-231115-0003','4872910000200030','4550000450','N/A','PHP 5000','Done',NULL,NULL),('DP-231117-0001','1230129033333333','N/A','N/A','PHP 3023','Done','DP','DP-0001'),('DP-231117-0002','12312222222223','2349280340','N/A','PHP 0983045','Denied','DP','DP-0002');
/*!40000 ALTER TABLE `hstry_deposit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hstry_encash`
--

DROP TABLE IF EXISTS `hstry_encash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_encash` (
  `ID` varchar(45) NOT NULL,
  `acctnum` varchar(45) NOT NULL,
  `checknum` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_encash`
--

LOCK TABLES `hstry_encash` WRITE;
/*!40000 ALTER TABLE `hstry_encash` DISABLE KEYS */;
INSERT INTO `hstry_encash` VALUES ('EC-231117-0001','9023409283820384','2049490340','PHP 40000','Done','EC','EC-0001'),('EC-231117-0002','3095930845930854','0903845903','PHP 32902','Done','EC','EC-0002'),('EC-231117-0003','203402340','02492934','PHP 3042903','Done','EC','EC-0003'),('EC-231117-0004','234234','2309492304','PHP 20384','Done','EC','EC-0004'),('EC-231117-0005','234234324','234','PHP 10','Denied','EC','EC-0005'),('EC-231117-0006','203923','79','PHP 10000','Denied','EC','EC-0006');
/*!40000 ALTER TABLE `hstry_encash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hstry_opening`
--

DROP TABLE IF EXISTS `hstry_opening`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_opening` (
  `ID` varchar(45) NOT NULL,
  `acctnum` varchar(45) DEFAULT NULL,
  `acctname` varchar(45) DEFAULT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_opening`
--

LOCK TABLES `hstry_opening` WRITE;
/*!40000 ALTER TABLE `hstry_opening` DISABLE KEYS */;
INSERT INTO `hstry_opening` VALUES ('AO-231117-0001','1219231823912389','Lady Christine','Done','AO','AO-0001'),('AO-231117-0002','2937498234982739','Gabriel Gonzalez','Done','AO','AO-0002');
/*!40000 ALTER TABLE `hstry_opening` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hstry_paybills`
--

DROP TABLE IF EXISTS `hstry_paybills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_paybills` (
  `ID` varchar(45) NOT NULL,
  `biller` varchar(45) NOT NULL,
  `subacctname` varchar(45) NOT NULL,
  `subacctnum` varchar(45) NOT NULL,
  `checknum` varchar(45) DEFAULT NULL,
  `amount` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_paybills`
--

LOCK TABLES `hstry_paybills` WRITE;
/*!40000 ALTER TABLE `hstry_paybills` DISABLE KEYS */;
INSERT INTO `hstry_paybills` VALUES ('PB-231113-0001','kjasdjklasd','asdasd','12345678990','N/A','PHP 123','Pending',NULL,NULL),('PB-231113-0002','Angeline','aMASD','123123','N/A','PHP 234234','Pending',NULL,NULL),('PB-231113-0003','qwe','qweqwe','213','N/A','PHP 77','Pending',NULL,NULL),('PB-231114-0001','DASD','ASD','2123','N/A','PHP 123','Pending',NULL,NULL),('PB-231114-0004','WAD','ASD','213123','N/A','PHP 213123','Pending',NULL,NULL),('PB-231114-0005','asldkalsd','aspdlaksd','2313','N/A','PHP 12301923','Pending',NULL,NULL),('PB-231117-0001','Lar','Bea','2193093012092130','N/A','PHP 800','Done','PB','PB-0001'),('PB-231117-0002','Yan','Sam','2348482834234234','N/A','PHP 30000','Done','PB','PB-0002');
/*!40000 ALTER TABLE `hstry_paybills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hstry_renew`
--

DROP TABLE IF EXISTS `hstry_renew`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_renew` (
  `ID` varchar(45) NOT NULL,
  `acctnum` varchar(45) NOT NULL,
  `acctname` varchar(45) NOT NULL,
  `expiration` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_renew`
--

LOCK TABLES `hstry_renew` WRITE;
/*!40000 ALTER TABLE `hstry_renew` DISABLE KEYS */;
INSERT INTO `hstry_renew` VALUES ('RM-231113-0001','123123','qwe','qwe','Pending',NULL,NULL),('RM-231114-0001','123','ASD','ASDASDASD','Denied',NULL,NULL),('RM-231114-0002','3213','ASD','1231ASDAD','Denied',NULL,NULL),('RM-231114-0003','21039213','asasd','sdfsdf','Denied',NULL,NULL),('RM-231114-0004','123123123','masdkasd','20310239','Pending',NULL,NULL),('RM-231117-0001','213123','KWERLWKERL','34234234','Denied','RM','RM-0001');
/*!40000 ALTER TABLE `hstry_renew` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hstry_withdraw`
--

DROP TABLE IF EXISTS `hstry_withdraw`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hstry_withdraw` (
  `ID` varchar(45) NOT NULL,
  `acctnum` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `transnum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hstry_withdraw`
--

LOCK TABLES `hstry_withdraw` WRITE;
/*!40000 ALTER TABLE `hstry_withdraw` DISABLE KEYS */;
INSERT INTO `hstry_withdraw` VALUES ('CW-231116-0001','123123','PHP 1221321','Denied','CW','CW-0001'),('CW-231117-0001','1','PHP 02','Denied','CW','CW-0001'),('CW-231117-0002','3213123','PHP 23123','Done','CW','CW-0002'),('CW-231117-0003','123','PHP 12312','Done','CW','CW-0003'),('CW-231117-0004','3405830959035839','PHP 2309023','Denied','CW','CW-0004'),('CW-231117-0005','9237892578927983','PHP 2384902','Done','CW','CW-0005'),('CW-231117-0006','2389409283409293','PHP 2342034','Denied','CW','CW-0006'),('CW-231117-0007','10','PHP 1293901','Denied','CW','CW-0007'),('CW-231117-0008','2','PHP 2304923','Done','CW','CW-0008'),('CW-231117-0009','8729348293479','PHP 3400','Denied','CW','CW-0009');
/*!40000 ALTER TABLE `hstry_withdraw` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `queueboard`
--

DROP TABLE IF EXISTS `queueboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `queueboard` (
  `id` int NOT NULL,
  `counter1` varchar(45) DEFAULT NULL,
  `counter2` varchar(45) DEFAULT NULL,
  `counter3` varchar(45) DEFAULT NULL,
  `counter4` varchar(45) DEFAULT NULL,
  `counter5` varchar(45) DEFAULT NULL,
  `counter6` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `queueboard`
--

LOCK TABLES `queueboard` WRITE;
/*!40000 ALTER TABLE `queueboard` DISABLE KEYS */;
INSERT INTO `queueboard` VALUES (0,'','','','','','');
/*!40000 ALTER TABLE `queueboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_accounts`
--

DROP TABLE IF EXISTS `swift_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_accounts` (
  `acctnum` bigint NOT NULL,
  `acctname` varchar(60) NOT NULL,
  `expiration` varchar(60) NOT NULL,
  PRIMARY KEY (`acctnum`),
  UNIQUE KEY `acctnum_UNIQUE` (`acctnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_accounts`
--

LOCK TABLES `swift_accounts` WRITE;
/*!40000 ALTER TABLE `swift_accounts` DISABLE KEYS */;
INSERT INTO `swift_accounts` VALUES (1219231823912389,'Lady Christine','09/20/2026'),(2937498234982739,'Gabriel Gonzalez','05/21/2027'),(4872910000200030,'Sara Smith','09/14/2027'),(4872910000200031,'Luke Johnson','03/10/2025'),(4872910000200032,'Ava Wilson','10/21/2026'),(4872910000200033,'Noah Lee','04/25/2023'),(4872910000200034,'Olivia Taylor','05/07/2023'),(4872910000200035,'Ethan White','05/11/2023'),(4872910000200036,'Sophia Turner','06/18/2024'),(4872910000200037,'Mason Clark','01/09/2025'),(4872910000200038,'Juan Dela Cruz','04/23/2025'),(4872910000200039,'Gerald Ramos','09/25/2026'),(4872910345678901,'Emma Brown','07/26/2024');
/*!40000 ALTER TABLE `swift_accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_admins`
--

DROP TABLE IF EXISTS `swift_admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_admins` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `totalqueue` int NOT NULL DEFAULT '0',
  `done` int NOT NULL DEFAULT '0',
  `denied` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_admins`
--

LOCK TABLES `swift_admins` WRITE;
/*!40000 ALTER TABLE `swift_admins` DISABLE KEYS */;
INSERT INTO `swift_admins` VALUES ('C1','C1',10,4,6),('C2','C2',4,2,2),('C3','C3',2,2,0),('C4','C4',2,1,1),('C5','C5',7,3,4),('C6','C6',5,2,3),('OVERALL','OVERALL',30,14,16);
/*!40000 ALTER TABLE `swift_admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_availability`
--

DROP TABLE IF EXISTS `swift_availability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_availability` (
  `counternum` varchar(60) NOT NULL,
  `id` varchar(60) DEFAULT NULL,
  `transnum` varchar(60) DEFAULT NULL,
  `time` varchar(60) DEFAULT NULL,
  `status` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`counternum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_availability`
--

LOCK TABLES `swift_availability` WRITE;
/*!40000 ALTER TABLE `swift_availability` DISABLE KEYS */;
INSERT INTO `swift_availability` VALUES ('Counter 1','','','',''),('Counter 2','','','',''),('Counter 3','','','',''),('Counter 4','','','',''),('Counter 5','','','',''),('Counter 6','','','','');
/*!40000 ALTER TABLE `swift_availability` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_date`
--

DROP TABLE IF EXISTS `swift_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_date` (
  `deposit` int NOT NULL DEFAULT '0',
  `withdrawal` int NOT NULL DEFAULT '0',
  `paybills` int NOT NULL DEFAULT '0',
  `encash` int NOT NULL DEFAULT '0',
  `renew` int NOT NULL DEFAULT '0',
  `opening` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`deposit`,`withdrawal`,`paybills`,`encash`,`renew`,`opening`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_date`
--

LOCK TABLES `swift_date` WRITE;
/*!40000 ALTER TABLE `swift_date` DISABLE KEYS */;
INSERT INTO `swift_date` VALUES (0,0,0,0,0,231113),(0,0,0,0,0,231114),(0,0,0,0,0,231117),(0,0,0,0,231113,0),(0,0,0,0,231114,0),(0,0,0,0,231117,0),(0,0,0,231113,0,0),(0,0,0,231114,0,0),(0,0,0,231117,0,0),(0,0,231113,0,0,0),(0,0,231117,0,0,0),(0,231113,0,0,0,0),(0,231114,0,0,0,0),(0,231115,0,0,0,0),(0,231116,0,0,0,0),(0,231117,0,0,0,0),(231113,0,0,0,0,0),(231114,0,0,0,0,0),(231115,0,0,0,0,0),(231117,0,0,0,0,0);
/*!40000 ALTER TABLE `swift_date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_mainqueue`
--

DROP TABLE IF EXISTS `swift_mainqueue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_mainqueue` (
  `type` varchar(45) NOT NULL,
  `ID` varchar(45) NOT NULL,
  `transnum` varchar(45) NOT NULL,
  `time` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_mainqueue`
--

LOCK TABLES `swift_mainqueue` WRITE;
/*!40000 ALTER TABLE `swift_mainqueue` DISABLE KEYS */;
/*!40000 ALTER TABLE `swift_mainqueue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swift_registered`
--

DROP TABLE IF EXISTS `swift_registered`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swift_registered` (
  `checknumbers` bigint NOT NULL,
  `depositref` bigint NOT NULL,
  PRIMARY KEY (`checknumbers`,`depositref`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swift_registered`
--

LOCK TABLES `swift_registered` WRITE;
/*!40000 ALTER TABLE `swift_registered` DISABLE KEYS */;
INSERT INTO `swift_registered` VALUES (2110004500,4550000450),(2110004501,4550000451),(2110004502,4550000452),(2110004503,4550000453),(2110004504,4550000454),(2110004505,4550000455),(2110004506,4550000456),(2110004507,4550000457),(2110004508,4550000458);
/*!40000 ALTER TABLE `swift_registered` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-17  5:08:29
