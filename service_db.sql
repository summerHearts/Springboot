/*
 Navicat MySQL Data Transfer

 Source Server         : localhost 2
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : service_db

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 01/06/2018 17:30:07 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `complaint_info`
-- ----------------------------
DROP TABLE IF EXISTS `complaint_info`;
CREATE TABLE `complaint_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appoint_time` datetime DEFAULT NULL,
  `complaint_business` int(11) DEFAULT NULL,
  `complaint_channel` int(11) DEFAULT NULL,
  `complaint_date` datetime DEFAULT NULL,
  `complaint_detail` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `complaint_id` int(11) DEFAULT NULL,
  `complaint_phone` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `complaint_theme` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `complaint_type` int(11) DEFAULT NULL,
  `complaintchannel_info` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `creater` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `customer_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `emergency_degree` int(11) DEFAULT NULL,
  `forwardprocessing_department` int(11) DEFAULT NULL,
  `modifier` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `protocol_id` int(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Records of `complaint_info`
-- ----------------------------
BEGIN;
INSERT INTO `complaint_info` VALUES ('1', '2018-01-23 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管进度太慢', '1', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '姚亚杰', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1'), ('2', '2018-01-26 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管协商会议', '2', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '李志郎', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1'), ('3', '2018-01-23 16:29:16', '2', '3', '2018-01-19 16:29:43', '????????????', '4', '132343539583', '???????????', '1', '4', '2018-01-05 16:30:34', 'alliyun', '22', '???', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '2'), ('5', '2018-01-23 16:29:16', '2', '3', '2018-01-19 16:29:43', 'Java 开发可以一个人从中间件一直写到前端网页。那个项目的首页写着，你不需要 npm、babel、webpack', '4', '132343539583', '资金监管文档', '1', '4', '2018-01-05 16:30:34', 'alliyun', '22', '王重阳', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '2'), ('6', '2018-01-23 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管进度太慢', '1', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '姚亚杰', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1'), ('7', '2018-01-26 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管协商会议', '2', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '李志郎', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1'), ('8', '2018-01-23 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管进度太慢', '1', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '姚亚杰', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1'), ('9', '2018-01-26 16:29:16', '1', '2', '2018-01-19 16:29:43', '资金监管协商会议', '2', '13651981343', '进度太慢', '1', '2', '2018-01-05 16:30:34', 'kenvin', '21', '李志郎', '2', '3', 'catefile', '2018-01-10 16:31:16', '2', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
