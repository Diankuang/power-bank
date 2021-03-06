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
-- Table structure for table `t_temper_picture`
--

DROP TABLE IF EXISTS `t_temper_picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_temper_picture` (
  `id` varchar(10) NOT NULL,
  `temper_id` varchar(10) DEFAULT NULL COMMENT '手机膜编号',
  `picture` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL COMMENT '类型',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `order_no` int(11) DEFAULT NULL COMMENT '图片排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手机膜对应图片';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_temper_picture`
--

LOCK TABLES `t_temper_picture` WRITE;
/*!40000 ALTER TABLE `t_temper_picture` DISABLE KEYS */;
INSERT INTO `t_temper_picture` VALUES ('0530210983','9552494256','201804180940274027.jpg',NULL,'2018-10-28 15:02:32',NULL,NULL,3),('0943866071','9552494256','201804180938403840.jpg',NULL,'2018-10-28 15:02:32',NULL,NULL,2),('0943866072','8331638439','201804180938403840.jpg',NULL,'2018-10-28 15:02:32',NULL,NULL,2),('3757410844','9552494256','201804180938383838.jpg',NULL,'2018-10-28 15:02:32',NULL,NULL,1);
/*!40000 ALTER TABLE `t_temper_picture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28 23:27:43
