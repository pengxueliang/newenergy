/*
Navicat MySQL Data Transfer

Source Server         : ke
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : newenergy

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2019-03-29 12:09:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `newenergy_admin`
-- ----------------------------
DROP TABLE IF EXISTS `newenergy_admin`;
CREATE TABLE `newenergy_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `last_login_ip` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_ids` tinyblob,
  `update_time` datetime DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of newenergy_admin
-- ----------------------------
INSERT INTO `newenergy_admin` VALUES ('1', '2019-03-17 11:56:25', '', null, '2019-03-17 11:56:17', '$2a$10$.rEfyBb/GURD9P2p0fRg/OAJGloGNDkJS4lY0cQHeqDgsbdTylBpu', null, '2019-03-17 11:55:59', 'admin123');

-- ----------------------------
-- Table structure for `newenergy_permission`
-- ----------------------------
DROP TABLE IF EXISTS `newenergy_permission`;
CREATE TABLE `newenergy_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of newenergy_permission
-- ----------------------------
INSERT INTO `newenergy_permission` VALUES ('1', '*', '2019-03-17 12:03:06', '', '1', '2019-03-17 12:03:53');

-- ----------------------------
-- Table structure for `newenergy_role`
-- ----------------------------
DROP TABLE IF EXISTS `newenergy_role`;
CREATE TABLE `newenergy_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `enable` bit(1) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of newenergy_role
-- ----------------------------
INSERT INTO `newenergy_role` VALUES ('1', '2019-03-17 12:04:33', '', '所有模块的权限', '', '超级管理员', '2019-03-17 12:05:07');
