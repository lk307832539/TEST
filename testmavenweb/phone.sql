/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50705
Source Host           : localhost:3306
Source Database       : phone

Target Server Type    : MYSQL
Target Server Version : 50705
File Encoding         : 65001

Date: 2016-08-14 18:58:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `phoneId` varchar(50) NOT NULL,
  `phoneName` varchar(100) DEFAULT NULL,
  `price` double(5,0) DEFAULT NULL,
  `num` int(5) DEFAULT NULL,
  PRIMARY KEY (`phoneId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventory
-- ----------------------------
INSERT INTO `inventory` VALUES ('1', '2', '1', '-6');
INSERT INTO `inventory` VALUES ('2', '2', '223', '117');
INSERT INTO `inventory` VALUES ('3', '333', '433', '331');

-- ----------------------------
-- Table structure for purchaserecord
-- ----------------------------
DROP TABLE IF EXISTS `purchaserecord`;
CREATE TABLE `purchaserecord` (
  `recordId` varchar(50) NOT NULL,
  `phoneId` varchar(50) DEFAULT NULL,
  `phoneName` varchar(100) DEFAULT NULL,
  `buyPrice` double(5,0) DEFAULT NULL,
  `num` int(5) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`recordId`),
  KEY `fk1` (`phoneId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchaserecord
-- ----------------------------
INSERT INTO `purchaserecord` VALUES ('1', '1', '1', '1', '1', '2016-05-04 18:04:25');
INSERT INTO `purchaserecord` VALUES ('20165101658553', '3', '333', '333', '333', '2016-05-10 16:58:56');
INSERT INTO `purchaserecord` VALUES ('2016510176264', '4', '123', '123', '123', '2016-05-10 17:06:27');
INSERT INTO `purchaserecord` VALUES ('2016510178325', '5', '123', '123', '123', '2016-05-10 17:08:33');
INSERT INTO `purchaserecord` VALUES ('2016541640241', '1', '1', '123', '123', '2016-05-04 16:40:25');
INSERT INTO `purchaserecord` VALUES ('2016541640302', '2', '2', '123', '123', '2016-05-04 16:40:30');

-- ----------------------------
-- Table structure for returnrecord
-- ----------------------------
DROP TABLE IF EXISTS `returnrecord`;
CREATE TABLE `returnrecord` (
  `recordId` varchar(50) NOT NULL,
  `phoneId` varchar(50) DEFAULT NULL,
  `num` int(5) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`recordId`),
  KEY `fk4` (`phoneId`),
  CONSTRAINT `FKt4d28gyvbg2ex8er36vsosdxe` FOREIGN KEY (`phoneId`) REFERENCES `inventory` (`phoneId`),
  CONSTRAINT `fk4` FOREIGN KEY (`phoneId`) REFERENCES `inventory` (`phoneId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of returnrecord
-- ----------------------------

-- ----------------------------
-- Table structure for salerecord
-- ----------------------------
DROP TABLE IF EXISTS `salerecord`;
CREATE TABLE `salerecord` (
  `recordId` varchar(50) NOT NULL,
  `num` int(5) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `total` double(10,0) DEFAULT NULL,
  `saleperson` varchar(50) DEFAULT NULL,
  `phoneId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`recordId`),
  KEY `fk5` (`phoneId`),
  KEY `fk3` (`saleperson`),
  CONSTRAINT `FKn4sfqc2qmrr9lg0m7d2g03evw` FOREIGN KEY (`phoneId`) REFERENCES `inventory` (`phoneId`),
  CONSTRAINT `FKta3tqp1aeg5wtfvwbcjof6l5p` FOREIGN KEY (`saleperson`) REFERENCES `user` (`id`),
  CONSTRAINT `fk3` FOREIGN KEY (`saleperson`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk5` FOREIGN KEY (`phoneId`) REFERENCES `inventory` (`phoneId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salerecord
-- ----------------------------
INSERT INTO `salerecord` VALUES ('2016512211801', '2', '2016-05-12 21:18:00', '2', '111', '1');
INSERT INTO `salerecord` VALUES ('2016512211803', '1', '2016-05-12 21:18:00', '433', '111', '3');
INSERT INTO `salerecord` VALUES ('20165122118421', '2', '2016-05-12 21:18:42', '2', '111', '1');
INSERT INTO `salerecord` VALUES ('20165122118422', '3', '2016-05-12 21:18:42', '669', '111', '2');
INSERT INTO `salerecord` VALUES ('20165122118423', '1', '2016-05-12 21:18:42', '433', '111', '3');
INSERT INTO `salerecord` VALUES ('20166102314141', '1', '2016-06-10 23:14:15', '1', '111', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(50) NOT NULL,
  `userName` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `role` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '111111', '0');
INSERT INTO `user` VALUES ('111', '111', '111111', '0');
INSERT INTO `user` VALUES ('yh001', 'root', '123456', '1');
INSERT INTO `user` VALUES ('yh002', 'qqq', '123456', '0');
