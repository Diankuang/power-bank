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
-- Table structure for table `t_faq`
--

DROP TABLE IF EXISTS `t_faq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_faq` (
  `id` varchar(10) NOT NULL,
  `title` varchar(300) DEFAULT NULL,
  `content1` text,
  `content2` text,
  `content3` text,
  `content4` text,
  `status` varchar(45) DEFAULT NULL COMMENT '状态，0有效，1失效',
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='FAQ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_faq`
--

LOCK TABLES `t_faq` WRITE;
/*!40000 ALTER TABLE `t_faq` DISABLE KEYS */;
INSERT INTO `t_faq` VALUES ('0474413491','Can the charger ports work at the same time when I do a wireless charging?','The charger ports can work at the same time with the wireless charging.',NULL,NULL,NULL,'0','2018-10-27',NULL),('1703349420','My device charges at 1 Amp, will this charger’s output harm it?','No, the charger will only supply the maximum charge current allowed by your device up to 2.4 Amps from each port. That is to say, if you use a 2.4A charger with a device drawing 1A, it will only draw 1A.',NULL,NULL,NULL,'0','2018-10-27',NULL),('2945809152','What if the BJD Desktop Charger is not charging my device(s)?','A. Check to ensure that your device is USB-powered with a power input of 5V and between 0 and 2.4A.','B. Check to ensure that the power cord isn’t broken, is connected to an active wall outlet and also firmly connected to the BJD Desktop Charger .','C. Use a different usb cable to double check. If the issue is our wall charger, please feel free to email us.',NULL,'0','2018-10-27',NULL),('3936067291','How do I check my device’s input current and voltage?','Please refer to your device’s user manual, original OEM charging adapter, or contact the manufacturer to determine this information',NULL,NULL,NULL,'0','2018-10-27',NULL),('4120144717','How can I find the same power cord if I lost the original one that came with the 25w charger?','It is a standard 2-prong power cord, they\'re easily available online. If you can\'t find it online please contact our customer care team.',NULL,NULL,NULL,'0','2018-10-27',NULL),('4497226469','When the charger is plugged into an outlet but has no devices plugged in, will it consume power? What is the standby power consumption?','The charger will consume almost no power in this state. Its standby power consumption is rated at <0.5W.',NULL,NULL,NULL,'0','2018-10-27',NULL),('5342334943','What is the difference between super charging port and standard port?','Super charger Ports: Can charge any device at speeds of up to 2.4 amps, will automatically determine your device\'s optimum input and provide it accordingly.','Standard Ports: Capable of charging most Android phones and iPhones with iOS 5 or later at full speed as well as many other devices.',NULL,NULL,'0','2018-10-27',NULL),('5343067013','What kind of USB charging cables should I use with this charger?','To ensure complete safety and best performance, we strongly recommend using your device\'s original cable or a third-party certified cables.',NULL,NULL,NULL,'0','2018-10-27',NULL);
/*!40000 ALTER TABLE `t_faq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28 23:27:40
