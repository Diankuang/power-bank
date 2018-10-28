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
-- Table structure for table `t_product_picture`
--

DROP TABLE IF EXISTS `t_product_picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_product_picture` (
  `id` varchar(10) NOT NULL,
  `product_id` varchar(10) DEFAULT NULL COMMENT '产品编号',
  `picture` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL COMMENT '产品类型',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `order_no` int(11) DEFAULT NULL COMMENT '图片排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品对应图片';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_product_picture`
--

LOCK TABLES `t_product_picture` WRITE;
/*!40000 ALTER TABLE `t_product_picture` DISABLE KEYS */;
INSERT INTO `t_product_picture` VALUES ('0234591590','1323764257','5b2b38d8cb68e.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,3),('2955488660','1323764257','5b2b38d1023ed.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,1),('4693523705','1323764257','5b2b38d4a440d.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,2),('5877140288','1323764257','5b2b38d651d8a.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,6),('6658122441','1323764257','5b2b38db5a4c9.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,8),('7651046237','1323764257','5b2b38d32c5e1.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,4),('8307404996','1323764257','5b2b38dd219f4.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,9),('8602508890','1323764257','5b2b38d240a8d.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,5),('8723211137','1323764257','5b2b38da09c52.jpg','Wireless Charger','2018-10-28 13:53:58',NULL,NULL,7);
/*!40000 ALTER TABLE `t_product_picture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28 23:27:41
