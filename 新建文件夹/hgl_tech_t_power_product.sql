-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hgl_tech
-- ------------------------------------------------------
-- Server version	5.5.57

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_power_product`
--

DROP TABLE IF EXISTS `t_power_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_power_product` (
  `id` varchar(10) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `material` varchar(100) DEFAULT NULL,
  `size` varchar(100) DEFAULT NULL,
  `input` varchar(100) DEFAULT NULL,
  `output` varchar(100) DEFAULT NULL,
  `color` varchar(100) DEFAULT NULL,
  `power` varchar(100) DEFAULT NULL,
  `dimension` varchar(100) DEFAULT NULL,
  `circuit_protections` varchar(100) DEFAULT NULL,
  `service` varchar(100) DEFAULT NULL,
  `port` varchar(100) DEFAULT NULL,
  `pin` varchar(100) DEFAULT NULL,
  `plug` varchar(100) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `price` double DEFAULT NULL,
  `introductions` text,
  `model_no` varchar(100) DEFAULT NULL,
  `certificate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品详情表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_power_product`
--

LOCK TABLES `t_power_product` WRITE;
/*!40000 ALTER TABLE `t_power_product` DISABLE KEYS */;
INSERT INTO `t_power_product` VALUES ('0150195536','Power Socket','6','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('0461362102','Multi-function','5','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('0867840051','','','','','','','','','','','','','','','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('1141779553','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('1323764257','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,150,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('1886636506','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('2108873177','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('2606999553','Car Chargers','2','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('3428204508','Wall Chargers','4','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('3801623927','My Single Web','3','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,NULL,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('5543562079','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('6047396325','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('6582116488','Wireless chargers','Wireless charger','fdsfa','2323','1V 2V','2V 4V','black','32','fdsfaf','ffdsafdfdsf','fdsfasfds','fdsfa','fdsfas','fsfsa','2018-10-25',NULL,119.05,'DDR4 is the latest generation of RAM for newer desktop computers and notebooks. It offers increased speed and efficiency over DDR3 memory. Along with its increased speed, DDR4 is also more efficient, using a maximum of 1.2 Volts compared to DDR3’s maximum 1.65 Volts.',NULL,NULL),('9208671537','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE'),('9431131742','WD-213-5100QI','Wireless Charger','PC(Fireproof)','108*108*7 mm','DC 5V 2A; 9V 1.67A','','Metal pad / Heat dissipation fast /Varied colors / Customized pattern','','','high temperature, over-current, and short circuit;','','','','','2018-10-28',NULL,NULL,'','WD-213-5100QI',' QI, FCC, RoHS, CE');
/*!40000 ALTER TABLE `t_power_product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28 23:27:34
