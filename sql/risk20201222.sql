/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云MySQL
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : totrip.xin:3306
 Source Schema         : risk

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 22/12/2020 10:03:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for csi_nts_code_detail
-- ----------------------------
DROP TABLE IF EXISTS `csi_nts_code_detail`;
CREATE TABLE `csi_nts_code_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_type` int(11) NOT NULL COMMENT '代码类型',
  `code_detail` int(11) NOT NULL COMMENT '代码',
  `code_content1` varchar(30) DEFAULT NULL COMMENT '大机构',
  `code_content2` varchar(30) DEFAULT NULL COMMENT '子机构',
  `code_content3` varchar(30) DEFAULT NULL COMMENT '有效值',
  `code_content4` varchar(30) DEFAULT NULL COMMENT '机构缩写',
  `code_content5` varchar(30) DEFAULT NULL,
  `orderby` int(10) DEFAULT NULL COMMENT '排序',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `code_content6` varchar(30) DEFAULT NULL COMMENT '用户名',
  `code_content7` varchar(30) DEFAULT NULL COMMENT '密码',
  `code_content8` varchar(30) DEFAULT NULL,
  `code_content9` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`code_type`,`code_detail`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of csi_nts_code_detail
-- ----------------------------
BEGIN;
INSERT INTO `csi_nts_code_detail` VALUES (7, 1, 123, 'ww', 'bbb', '1', NULL, NULL, NULL, NULL, '111', '111', NULL, NULL);
INSERT INTO `csi_nts_code_detail` VALUES (8, 1, 1231, 'xm', 'bb1', '1', NULL, '123', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `csi_nts_code_detail` VALUES (9, 1, 1323, 'xm1', 'bb2', '1', NULL, '123', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `csi_nts_code_detail` VALUES (10, 1, 1232, 'xm2', '221', '1', NULL, '123', NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for csi_nts_stock
-- ----------------------------
DROP TABLE IF EXISTS `csi_nts_stock`;
CREATE TABLE `csi_nts_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `stock_code` varchar(15) NOT NULL COMMENT '股票代码',
  `stock_name` varchar(100) NOT NULL COMMENT '股票简称',
  `industry` varchar(3000) NOT NULL COMMENT '所属行业大类',
  `amac_index_code` varchar(15) NOT NULL COMMENT '对应amac指数代码',
  `list_date` varchar(8) NOT NULL COMMENT '上市日',
  `delist_date` varchar(8) DEFAULT NULL COMMENT '摘牌日',
  `market` varchar(4) DEFAULT NULL,
  `nee_trade_type` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of csi_nts_stock
-- ----------------------------
BEGIN;
INSERT INTO `csi_nts_stock` VALUES (1, '111', '水电费', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (2, '222', '水电费2', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (3, '333', '水电费3', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (4, '444', '水电费4', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (5, '555', '水电费5', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (6, '666', '水电费6', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (7, '777', '水电费7', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (8, '888', '水电费8', '士大夫', '12332', '20201222', NULL, NULL, NULL);
INSERT INTO `csi_nts_stock` VALUES (9, '999', '水电费9', '士大夫', '12332', '20201222', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for csi_nts_usage
-- ----------------------------
DROP TABLE IF EXISTS `csi_nts_usage`;
CREATE TABLE `csi_nts_usage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `stock_code` varchar(15) NOT NULL COMMENT '股票代码',
  `nt_end_date` varchar(100) NOT NULL COMMENT '限售期结束日',
  `nt_type` varchar(3000) NOT NULL COMMENT '限售类型',
  `organization` varchar(15) NOT NULL COMMENT '使用机构',
  `begin_date` varchar(8) DEFAULT NULL COMMENT '使用开始时间',
  `end_date` varchar(8) DEFAULT NULL COMMENT '使用结束时间',
  `modify_time` varchar(8) NOT NULL COMMENT '修改时间',
  `modify_by` varchar(10) NOT NULL COMMENT '修改人',
  `is_transmitted` int(1) DEFAULT NULL COMMENT '是否被报送，1为报送',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of csi_nts_usage
-- ----------------------------
BEGIN;
INSERT INTO `csi_nts_usage` VALUES (1, '111', '20201219', '1', 'xm', NULL, NULL, '20201208', '111', 1);
INSERT INTO `csi_nts_usage` VALUES (2, '222', '20201219', '2', 'xm1', NULL, NULL, '20201208', '111', 1);
INSERT INTO `csi_nts_usage` VALUES (3, '333', '20201219', '1', 'xm2', NULL, NULL, '20201208', '111', 1);
INSERT INTO `csi_nts_usage` VALUES (4, '444', '20201219', '1', 'ww', NULL, NULL, '20201208', '111', 1);
INSERT INTO `csi_nts_usage` VALUES (5, '555', '20201219', '1', 'xx', NULL, NULL, '20201208', '111', NULL);
INSERT INTO `csi_nts_usage` VALUES (6, '666', '20201219', '1', 'mmm1', NULL, NULL, '20201208', '111', NULL);
INSERT INTO `csi_nts_usage` VALUES (7, '777', '20201219', '1', 'mmm2', NULL, NULL, '20201208', '111', NULL);
INSERT INTO `csi_nts_usage` VALUES (8, '888', '20201219', '1', 'mmmt3', NULL, NULL, '20201208', '111', NULL);
INSERT INTO `csi_nts_usage` VALUES (9, '999', '20201219', '1', '工银安盛资管zxvz', NULL, NULL, '20201208', '111', NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_ab_compare
-- ----------------------------
DROP TABLE IF EXISTS `t_ab_compare`;
CREATE TABLE `t_ab_compare` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transmit_id` int(11) DEFAULT NULL COMMENT '报送记录id',
  `stock_code` varchar(15) DEFAULT NULL COMMENT '证券代码',
  `stock_name` varchar(255) DEFAULT NULL COMMENT '证券简称',
  `nt_type` varchar(300) DEFAULT NULL COMMENT '估值类型',
  `notice_date` date DEFAULT NULL COMMENT '股份变动公告日',
  `organization` varchar(255) DEFAULT NULL COMMENT '使用机构',
  `begin_date` date DEFAULT NULL COMMENT '开始使用日期/上报日期',
  `end_date` date DEFAULT NULL COMMENT '限售结束日期',
  `service_life` varchar(10) DEFAULT NULL COMMENT '限售期长度',
  `nt_stop_date` date DEFAULT NULL COMMENT '停止估值日',
  `created_by` varchar(255) DEFAULT NULL COMMENT '报送人用户名',
  `created_at` datetime DEFAULT NULL COMMENT '报送时间',
  `updated_by` varchar(255) DEFAULT NULL COMMENT '修改人',
  `updated_at` datetime DEFAULT NULL COMMENT '修改时间',
  `wash_role` int(11) DEFAULT NULL COMMENT '0 A岗 1 B岗',
  `wash_by` varchar(255) DEFAULT NULL COMMENT '清洗人',
  `wash_at` datetime DEFAULT NULL COMMENT '清洗时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=813 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_ab_compare
-- ----------------------------
BEGIN;
INSERT INTO `t_ab_compare` VALUES (697, 92, '111', '水电费', '6', '2020-12-18', 'xm', '2020-12-18', '2020-12-19', '1', '2021-01-01', '111', '2020-12-18 09:58:35', NULL, NULL, 2, '123', '2020-12-18 10:04:21');
INSERT INTO `t_ab_compare` VALUES (698, 93, '222', '水电费2', '2', '2020-12-20', 'xm1', '2020-12-18', '2020-12-19', '1', NULL, '111', '2020-12-18 09:58:53', NULL, NULL, 2, '123', '2020-12-18 10:04:21');
INSERT INTO `t_ab_compare` VALUES (699, 94, '333', '水电费3', '1', '2020-12-18', 'xm2', '2020-12-18', '2020-12-19', '1', NULL, '111', '2020-12-18 09:58:53', NULL, NULL, 2, '123', '2020-12-18 10:04:21');
INSERT INTO `t_ab_compare` VALUES (700, 95, '444', '水电费4', '1', '2020-12-18', 'ww', '2020-12-18', '2020-12-19', '1', NULL, '111', '2020-12-18 09:58:53', NULL, NULL, 2, '123', '2020-12-18 10:04:21');
INSERT INTO `t_ab_compare` VALUES (806, 93, '222', '水电费2', '2', '2020-12-18', 'xm1', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (807, 94, '333', '水电费3', '1', '2020-12-18', 'xm2', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (808, 95, '444', '水电费4', '1', '2020-12-18', 'ww', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (809, 96, '111', '水电费', '1', '2020-12-21', 'xm', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (810, 97, '222', '水电费2', '2', '2020-12-21', 'xm1', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (811, 98, '333', '水电费3', '1', '2020-12-21', 'xm2', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
INSERT INTO `t_ab_compare` VALUES (812, 99, '444', '水电费4', '1', '2020-12-21', 'ww', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL, 1, '222', '2020-12-21 11:10:09');
COMMIT;

-- ----------------------------
-- Table structure for t_compared_data
-- ----------------------------
DROP TABLE IF EXISTS `t_compared_data`;
CREATE TABLE `t_compared_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transmit_id` int(11) DEFAULT NULL COMMENT '报送记录id',
  `stock_code` varchar(15) DEFAULT NULL COMMENT '证券代码',
  `stock_name` varchar(255) DEFAULT NULL COMMENT '证券简称',
  `nt_type` varchar(3000) DEFAULT NULL COMMENT '估值类型',
  `notice_date` date DEFAULT NULL COMMENT '股份变动公告日',
  `notice_date_right` int(1) DEFAULT NULL COMMENT '和报送数据股份变动公告日是否一致，1为一致，0为不一致',
  `organization` varchar(255) DEFAULT NULL COMMENT '使用机构',
  `begin_date` date DEFAULT NULL COMMENT '开始使用日期/上报日期',
  `end_date` date DEFAULT NULL COMMENT '限售结束日期',
  `end_date_right` int(1) DEFAULT NULL COMMENT '和报送数据限售结束日期是否一致，1为一致，0为不一致',
  `service_life` varchar(10) DEFAULT NULL COMMENT '限售期长度',
  `nt_stop_date` date DEFAULT NULL COMMENT '停止估值日',
  `stop_by` varchar(255) DEFAULT NULL COMMENT '停止估值操作人用户名',
  `stop_at` datetime DEFAULT NULL COMMENT '停止估值操作时间',
  `transmit_by` varchar(255) DEFAULT NULL COMMENT '报送人用户名',
  `transmit_at` datetime DEFAULT NULL COMMENT '报送时间',
  `return_by` varchar(255) DEFAULT NULL COMMENT '反馈人用户名',
  `return_at` datetime DEFAULT NULL COMMENT '反馈时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=259 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_compared_data
-- ----------------------------
BEGIN;
INSERT INTO `t_compared_data` VALUES (237, 49, 'abc1', '股票简称', 'asad', '2020-11-12', 0, '国大资金', '2020-12-16', '2020-12-20', 0, '1', NULL, NULL, NULL, '111', '2020-12-15 11:21:09', '123', '2020-12-15 09:44:58');
INSERT INTO `t_compared_data` VALUES (244, 92, '111', '水电费', '6', '2020-12-18', 1, 'xm', '2020-12-18', '2020-12-19', 1, '1', '2021-01-01', NULL, NULL, '111', '2020-12-18 09:58:35', '222', '2020-12-18 10:57:02');
INSERT INTO `t_compared_data` VALUES (245, 93, '222', '水电费2', '2', '2020-12-20', 0, 'xm1', '2020-12-18', '2020-12-19', 1, '1', NULL, NULL, NULL, '111', '2020-12-18 09:58:53', '222', '2020-12-18 10:57:02');
INSERT INTO `t_compared_data` VALUES (246, 94, '333', '水电费3', '1', '2020-12-18', 1, 'xm2', '2020-12-18', '2020-12-19', 1, '1', NULL, NULL, NULL, '111', '2020-12-18 09:58:53', '222', '2020-12-18 10:57:02');
INSERT INTO `t_compared_data` VALUES (247, 95, '444', '水电费4', '1', '2020-12-18', 1, 'ww', '2020-12-18', '2020-12-19', 1, '1', NULL, NULL, NULL, '111', '2020-12-18 09:58:53', '222', '2020-12-18 10:57:02');
COMMIT;

-- ----------------------------
-- Table structure for t_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_dict`;
CREATE TABLE `t_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(100) DEFAULT NULL COMMENT '字典类型',
  `dkey` varchar(255) DEFAULT NULL COMMENT '条目关键词',
  `desc` varchar(255) DEFAULT NULL COMMENT '条目释义',
  `value` int(10) DEFAULT NULL COMMENT '字典值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_dict
-- ----------------------------
BEGIN;
INSERT INTO `t_dict` VALUES (1, 'nt_type', '1', '定向增发', NULL);
INSERT INTO `t_dict` VALUES (2, 'nt_type', '2', '股份代持', NULL);
INSERT INTO `t_dict` VALUES (3, 'nt_type', '3', '定向增发(锁定期延长)', NULL);
INSERT INTO `t_dict` VALUES (4, 'nt_type', '4', '老股转让', NULL);
INSERT INTO `t_dict` VALUES (5, 'nt_type', '5', '大宗交易', NULL);
INSERT INTO `t_dict` VALUES (6, 'nt_type', '6', '估值试用', 14);
COMMIT;

-- ----------------------------
-- Table structure for t_file
-- ----------------------------
DROP TABLE IF EXISTS `t_file`;
CREATE TABLE `t_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `file_name` varchar(60) DEFAULT NULL COMMENT '文件名称',
  `file_size` varchar(60) DEFAULT NULL COMMENT '文件大小',
  `ip_addr` varchar(20) DEFAULT NULL COMMENT 'ip',
  `upload_time` datetime DEFAULT NULL COMMENT '上传时间',
  `file_desc` varchar(10) DEFAULT NULL COMMENT '文件描述',
  `file_url` varchar(100) DEFAULT NULL COMMENT '文件url地址',
  `flag` int(11) DEFAULT NULL COMMENT '文件标志(提供下载)',
  `file_path` varchar(255) DEFAULT NULL COMMENT '文件完全路径',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE_UNAME` (`flag`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_file
-- ----------------------------
BEGIN;
INSERT INTO `t_file` VALUES (3, 'template.xlsx', '9018', '116.233.191.229', '2020-12-18 14:05:24', '指数模板文件', 'http://totrip.xin:80/home/file/2020/12/18/3fa80189-42e8-4c09-8eea-3e259d1a0793.xlsx', 2, '/home/csiUploadFile/file/2020/12/18/3fa80189-42e8-4c09-8eea-3e259d1a0793.xlsx');
INSERT INTO `t_file` VALUES (6, '【猎查查】背景调查报告_21212121_测试_2020-03-18.pdf', '259289', '116.233.191.229', '2020-12-18 11:13:14', '指数流程维护文件', 'http://totrip.xin:80/home/file/2020/12/18/8f69fc0f-898d-4c60-b8ac-f46e0c938ca5.pdf', 1, '/home/csiUploadFile/file/2020/12/18/8f69fc0f-898d-4c60-b8ac-f46e0c938ca5.pdf');
COMMIT;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `role_type` varchar(50) NOT NULL,
  `is_parent` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
BEGIN;
INSERT INTO `t_menu` VALUES (1, '数据报送', '1', '0');
INSERT INTO `t_menu` VALUES (2, '新股上市', '1', '1');
INSERT INTO `t_menu` VALUES (3, '数据报送', '1', '1');
INSERT INTO `t_menu` VALUES (4, '报送反馈', '1', '0');
INSERT INTO `t_menu` VALUES (5, '数据查询', '1', '0');
INSERT INTO `t_menu` VALUES (6, '停止估值', '1', '0');
INSERT INTO `t_menu` VALUES (7, '指数公司联系人查询', '1', '0');
INSERT INTO `t_menu` VALUES (8, '流程模板下载', '1', '0');
INSERT INTO `t_menu` VALUES (9, '管理人信息维护', '1', '0');
INSERT INTO `t_menu` VALUES (10, '数据处理', '2', '0');
INSERT INTO `t_menu` VALUES (11, '大宗数据', '2', '20');
INSERT INTO `t_menu` VALUES (12, '非大宗数据', '2', '20');
INSERT INTO `t_menu` VALUES (13, '数据对比下载', '2', '20');
INSERT INTO `t_menu` VALUES (14, '数据查询', '2', '0');
INSERT INTO `t_menu` VALUES (15, '管理人联系方式', '2', '0');
INSERT INTO `t_menu` VALUES (16, '信息维护', '2', '0');
INSERT INTO `t_menu` VALUES (17, '指数公司信息维护', '2', '16');
INSERT INTO `t_menu` VALUES (18, '流程维护', '2', '16');
INSERT INTO `t_menu` VALUES (19, '模板维护', '2', '16');
COMMIT;

-- ----------------------------
-- Table structure for t_nowash_type
-- ----------------------------
DROP TABLE IF EXISTS `t_nowash_type`;
CREATE TABLE `t_nowash_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '不清洗类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_nowash_type
-- ----------------------------
BEGIN;
INSERT INTO `t_nowash_type` VALUES (1, '大宗交易');
COMMIT;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(30) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_role
-- ----------------------------
BEGIN;
INSERT INTO `t_role` VALUES (1, '机构');
INSERT INTO `t_role` VALUES (2, '指数');
COMMIT;

-- ----------------------------
-- Table structure for t_staff_contact
-- ----------------------------
DROP TABLE IF EXISTS `t_staff_contact`;
CREATE TABLE `t_staff_contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(60) DEFAULT NULL COMMENT '昵称',
  `role_id` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(60) DEFAULT NULL COMMENT '邮箱',
  `station` varchar(100) DEFAULT NULL COMMENT '岗位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_staff_contact
-- ----------------------------
BEGIN;
INSERT INTO `t_staff_contact` VALUES (2, '李发财', '2', '153415241', '4213123@qq.com', '操作人员');
INSERT INTO `t_staff_contact` VALUES (7, '李龙', '1', '13412312311', 'dqqw@163.com', '技术人员11');
INSERT INTO `t_staff_contact` VALUES (8, '李龙', '1', '1341231231', 'dqqw@163.com', '技术人员');
INSERT INTO `t_staff_contact` VALUES (9, '钱星星', '2', '1341231231', 'dqqw@163.com', '服务部');
INSERT INTO `t_staff_contact` VALUES (10, '胡星', '2', '1341231231', 'dqqw@163.com', '交接人员');
INSERT INTO `t_staff_contact` VALUES (12, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_staff_contact` VALUES (13, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_staff_contact` VALUES (16, '测试111', '2', '18860468795', '111@qq.com', '测试岗位');
INSERT INTO `t_staff_contact` VALUES (17, '新的测试', '2', '18860468795', '111@qq.com', '测试岗位');
INSERT INTO `t_staff_contact` VALUES (18, 'chenggang', '1', '18860468795', '111@qq.com', '测试111');
COMMIT;

-- ----------------------------
-- Table structure for t_transmit_data
-- ----------------------------
DROP TABLE IF EXISTS `t_transmit_data`;
CREATE TABLE `t_transmit_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `stock_code` varchar(15) NOT NULL COMMENT '证券代码',
  `stock_name` varchar(255) DEFAULT NULL COMMENT '证券简称',
  `nt_type` varchar(3000) DEFAULT NULL COMMENT '估值类型',
  `notice_date` date DEFAULT NULL COMMENT '股份变动公告日',
  `organization` varchar(255) DEFAULT NULL COMMENT '使用机构',
  `begin_date` date DEFAULT NULL COMMENT '开始使用日期',
  `end_date` date DEFAULT NULL COMMENT '限售结束日期',
  `service_life` varchar(10) DEFAULT NULL COMMENT '限售期长度',
  `nt_stop_date` date DEFAULT NULL COMMENT '停止估值日',
  `created_by` varchar(255) DEFAULT NULL COMMENT '报送人',
  `created_at` datetime DEFAULT NULL COMMENT '上报时间',
  `updated_by` varchar(255) DEFAULT NULL COMMENT '修改人',
  `updated_at` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_transmit_data
-- ----------------------------
BEGIN;
INSERT INTO `t_transmit_data` VALUES (49, 'abc1', '股票简称', '2', '2019-11-02', '阿发', '2020-12-16', '2019-11-02', '-94', NULL, '111', '2020-12-16 11:21:09', '111', '2020-12-16 09:44:24');
INSERT INTO `t_transmit_data` VALUES (50, 'abc2', '股票简称', '3', '2020-09-09', '阿发', '2020-12-16', '2020-12-30', '-94', NULL, '111', '2020-12-16 11:21:09', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (54, '666', '水电费6', '5', '2020-11-12', '国大资金', '2020-12-16', '2020-12-30', '1', NULL, '111', '2020-12-16 13:59:59', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (55, '666', '水电费6', '5', '2020-11-12', '国大资金', '2020-12-16', '2020-12-23', '1', NULL, '111', '2020-12-16 14:36:09', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (82, '111', '水电费', '1', '2019-11-02', 'xm', '2020-12-16', '2019-11-02', '-409', NULL, '111', '2020-12-16 16:09:58', '111', '2020-12-16 09:36:33');
INSERT INTO `t_transmit_data` VALUES (91, '777', '水电费7', '2', '2019-11-02', 'ww', '2020-12-16', '2019-11-02', '-410', NULL, '111', '2020-12-16 17:57:17', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (92, '111', '水电费', '6', '2020-12-18', 'xm', '2020-12-18', '2020-12-19', '1', '2021-01-01', '111', '2020-12-18 09:58:35', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (93, '222', '水电费2', '2', '2020-12-18', 'xm1', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (94, '333', '水电费3', '1', '2020-12-18', 'xm2', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (95, '444', '水电费4', '1', '2020-12-18', 'ww', '2020-12-21', '2020-12-22', '1', NULL, '111', '2020-12-21 09:58:53', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (96, '111', '水电费', '1', '2020-12-21', 'xm', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (97, '222', '水电费2', '2', '2020-12-21', 'xm1', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (98, '333', '水电费3', '1', '2020-12-21', 'xm2', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (99, '444', '水电费4', '1', '2020-12-21', 'ww', '2020-12-21', '2020-12-19', '-2', NULL, '111', '2020-12-21 10:29:29', NULL, NULL);
INSERT INTO `t_transmit_data` VALUES (100, '111', '水电费', '2', '2020-12-22', 'xm', '2020-12-22', '2021-02-05', '45', NULL, '111', '2020-12-22 09:22:18', '111', '2020-12-22 09:51:54');
INSERT INTO `t_transmit_data` VALUES (101, '222', '水电费2', '2', '2020-12-22', 'xm1', '2020-12-22', '2020-12-31', '9', NULL, '111', '2020-12-22 09:22:18', '111', '2020-12-22 09:53:02');
INSERT INTO `t_transmit_data` VALUES (102, '333', '水电费3', '1', '2020-12-22', 'xm2', '2020-12-22', '2020-12-31', '9', NULL, '111', '2020-12-22 09:22:18', '111', '2020-12-22 09:53:09');
INSERT INTO `t_transmit_data` VALUES (103, '444', '水电费4', '1', '2020-12-22', 'ww', '2020-12-22', '2020-12-25', '3', NULL, '111', '2020-12-22 09:22:18', '111', '2020-12-22 09:53:15');
COMMIT;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(60) DEFAULT NULL COMMENT '昵称',
  `user_name` varchar(60) DEFAULT NULL COMMENT '用户名',
  `pass_word` varchar(255) DEFAULT NULL COMMENT '密码',
  `role_id` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(60) DEFAULT NULL COMMENT '邮箱',
  `station` varchar(100) DEFAULT NULL COMMENT '岗位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (2, '李某', '222', '222', '2', '1376110521', '123@163.com', '信息部');
INSERT INTO `t_user` VALUES (9, '王某', '123', '123', '2', '1241241234', '112312@qq.com', '维护部');
INSERT INTO `t_user` VALUES (22, NULL, '111', '111', '1', NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
