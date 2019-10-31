/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 50549
 Source Host           : localhost:3306
 Source Schema         : mydb01

 Target Server Type    : MySQL
 Target Server Version : 50549
 File Encoding         : 65001

 Date: 31/10/2019 09:41:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `sex` int(1) NULL DEFAULT NULL COMMENT '1-男；2-女',
  `birthday` datetime NULL DEFAULT NULL,
  `created` datetime NULL DEFAULT NULL,
  `updated` datetime NULL DEFAULT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (6, 'lilei', '123456', '李磊', 23, 1, '1993-08-07 08:24:49', '2014-09-20 08:26:06', '2014-09-20 08:26:06', '李磊同学在传智播客学习Java');
INSERT INTO `tb_user` VALUES (7, 'hanmeimei', '123456', '韩梅梅', 24, 2, '1992-08-07 08:24:49', '2014-09-20 08:26:06', '2014-09-20 08:26:06', '韩梅梅同学在传智播客学php');

SET FOREIGN_KEY_CHECKS = 1;
