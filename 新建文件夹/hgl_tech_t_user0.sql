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
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `user_id` varchar(10) NOT NULL COMMENT '用户ID，主键',
  `first_name` varchar(45) NOT NULL COMMENT 'first name',
  `last_name` varchar(45) NOT NULL COMMENT 'last name',
  `email` varchar(45) NOT NULL COMMENT '邮箱',
  `password` varchar(45) NOT NULL COMMENT '账户密码',
  `company` varchar(45) DEFAULT NULL COMMENT '公司',
  `phone_number` varchar(45) DEFAULT NULL COMMENT 'phone number',
  `fax` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL COMMENT 'country',
  `postal_code` varchar(45) DEFAULT NULL COMMENT 'postal code',
  `city` varchar(45) DEFAULT NULL COMMENT 'city',
  `street_address` varchar(45) DEFAULT NULL COMMENT 'street address',
  `user_class` int(5) DEFAULT NULL COMMENT 'user class，用户类别，1为管理员，2为普通用户',
  `status` varchar(45) DEFAULT NULL COMMENT '状态，1有效，0无效',
  `gender` int(11) DEFAULT NULL,
  `height` double DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `updatet_time` date DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `subscribe` varchar(45) DEFAULT NULL COMMENT '订阅邮箱',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES ('0860241106','A','BC','ABC@qq.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,'2018-10-20',NULL,NULL,NULL,NULL),('2481123592','A','ABC','AAA@qq.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,'2018-10-20',NULL,NULL,NULL,NULL),('4563258971','xie','dishi','1832054053@qq.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('7462256283','Xie','DiShi','186@qq.com','123456',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,'2018-10-20',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-21 22:29:42
