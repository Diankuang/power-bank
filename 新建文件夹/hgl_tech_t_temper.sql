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
-- Table structure for table `t_temper`
--

DROP TABLE IF EXISTS `t_temper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_temper` (
  `id` varchar(10) NOT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `adapter` varchar(45) DEFAULT NULL COMMENT '适用型号',
  `type` int(11) DEFAULT NULL COMMENT '手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others',
  `introductions` text COMMENT '产品介绍',
  `price` double DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手机膜产品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_temper`
--

LOCK TABLES `t_temper` WRITE;
/*!40000 ALTER TABLE `t_temper` DISABLE KEYS */;
INSERT INTO `t_temper` VALUES ('0549686736','iPhone X 4D丝印钢化玻璃膜','iPhone X',1,'4D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('1928963643','Oppo X 3D丝印钢化玻璃膜','Oppo X',4,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('2064130251','Vivo X 3D丝印钢化玻璃膜','Vivo X',5,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('3009181396','iPhone X 3D丝印钢化玻璃膜','iPhone X',1,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('4606903532','Huawei X 3D丝印钢化玻璃膜','Huawei X',2,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('4679244705','Samsung X 3D丝印钢化玻璃膜','Samsung X',3,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('8331638439','others X 3D丝印钢化玻璃膜','others X',6,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-27',NULL,NULL),('9552494256','others X 3D丝印钢化玻璃膜','others X',6,'3D丝印边框钢化玻璃膜较3D丝印边框钢化玻璃膜,弧度更圆润，弧面更窄，较3D膜看起来，更佳精致，引人注目。光滑的表面及出色的画质，完美的与液晶屏结合，易贴易取，不留残胶；采用丝印工艺，色彩炫丽，大大增加贴合产品的美感；经过强化处理，具有良好的机械性能和耐热抗震性能的玻璃；超强防刮耐磨，高灵敏度触摸及滑感，高清晰的画面透光度达95%，即使贴膜破裂也保持块状，不会散落，极大地降低了对人体的伤害。',0,'2018-10-28',NULL,NULL);
/*!40000 ALTER TABLE `t_temper` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28 23:27:36
