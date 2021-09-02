/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : treat

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 18/08/2021 08:58:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for codename
-- ----------------------------
DROP TABLE IF EXISTS `codename`;
CREATE TABLE `codename`  (
  `cgroup` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ckey` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cvalue` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `coption` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ckey`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of codename
-- ----------------------------
INSERT INTO `codename` VALUES ('审批备注', 'A01', '丙类药物不支持报销', NULL);
INSERT INTO `codename` VALUES ('审批备注', 'A02', '未到达起付线', NULL);
INSERT INTO `codename` VALUES ('审批状态', 'S01', '未提交审批', NULL);
INSERT INTO `codename` VALUES ('审批状态', 'S02', '提交未审批', NULL);
INSERT INTO `codename` VALUES ('审批状态', 'S03', '审批未报销', NULL);
INSERT INTO `codename` VALUES ('审批状态', 'S04', '已经报销', NULL);
INSERT INTO `codename` VALUES ('账号类型', 'T01', '管理员', NULL);
INSERT INTO `codename` VALUES ('账号类型', 'T02', '用户', NULL);
INSERT INTO `codename` VALUES ('药品等级', '丙', '0', NULL);
INSERT INTO `codename` VALUES ('药品等级', '乙', '0.5', NULL);
INSERT INTO `codename` VALUES ('医保类型', '农村医保', '0.5', NULL);
INSERT INTO `codename` VALUES ('医保类型', '城镇医保', '0.6', NULL);
INSERT INTO `codename` VALUES ('药品等级', '甲', '0.7', NULL);

-- ----------------------------
-- Table structure for flyway_schema_history
-- ----------------------------
DROP TABLE IF EXISTS `flyway_schema_history`;
CREATE TABLE `flyway_schema_history`  (
  `installed_rank` int(0) NOT NULL,
  `version` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `script` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `checksum` int(0) NULL DEFAULT NULL,
  `installed_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `installed_on` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int(0) NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`) USING BTREE,
  INDEX `flyway_schema_history_s_idx`(`success`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flyway_schema_history
-- ----------------------------
INSERT INTO `flyway_schema_history` VALUES (1, '1.0', 'db', 'SQL', 'V1.0__db.sql', 1789480029, 'root', '2021-08-12 11:33:37', 6782, 1);

-- ----------------------------
-- Table structure for medical
-- ----------------------------
DROP TABLE IF EXISTS `medical`;
CREATE TABLE `medical`  (
  `m_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `m_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `m_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `m_price` float(6, 2) NOT NULL,
  `m_factory` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_option` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of medical
-- ----------------------------
INSERT INTO `medical` VALUES ('1', '阿司匹林', '甲', 10.00, '北方制药', NULL);
INSERT INTO `medical` VALUES ('eb603de', '阿司匹林', '甲', 10.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb605de', '复方丹参片', '甲', 15.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb606de', '扑尔敏', '甲', 23.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb607de', '甲硝唑', '甲', 20.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb608de', '红霉素', '甲', 12.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb609de', '乙胺丁醇', '甲', 600.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb610de', '制霉菌素', '甲', 39.00, '瑞辉制药', NULL);
INSERT INTO `medical` VALUES ('eb611de', '龙胆紫', '乙', 34.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb612de', '庆大霉素', '乙', 23.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb613de', '甲氧苯胺嘧啶', '乙', 45.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb614de', '利福平', '乙', 23.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb615de', '克霉唑', '乙', 53.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb616de', '乙酰胆碱', '乙', 34.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb617de', '阿托品', '乙', 25.00, '扬子江制药', NULL);
INSERT INTO `medical` VALUES ('eb618de', '新霉素', '丙', 50.00, '正大天晴', NULL);
INSERT INTO `medical` VALUES ('eb619de', '环磷酰胺', '丙', 26.00, '正大天晴', NULL);
INSERT INTO `medical` VALUES ('eb620de', '链霉素', '丙', 35.00, '正大天晴', NULL);
INSERT INTO `medical` VALUES ('eb621de', '金霉素', '丙', 21.00, '正大天晴', NULL);
INSERT INTO `medical` VALUES ('x', '阿莫西林', '甲', 13.00, '瑞辉制药', NULL);

-- ----------------------------
-- Table structure for medicalmaster
-- ----------------------------
DROP TABLE IF EXISTS `medicalmaster`;
CREATE TABLE `medicalmaster`  (
  `re_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `p_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `buy_date` date NOT NULL,
  `buy_doc` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `buy_place` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `all_price` float(10, 2) NOT NULL,
  `option` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`re_id`) USING BTREE,
  INDEX `p_id`(`p_id`) USING BTREE,
  CONSTRAINT `medicalmaster_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of medicalmaster
-- ----------------------------
INSERT INTO `medicalmaster` VALUES ('1', '1', '2021-08-12', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020060', 'PP2603de', '2021-01-10', '马医生', '熙康', 1050.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020061', 'PP2603de', '2021-02-10', '刘医生', '市中心医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020062', 'PP2603de', '2021-03-11', '胡医生', '大连友谊医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020063', 'PP2603de', '2021-04-12', '张医生', '附属医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020064', 'PP2603de', '2021-05-13', '蒋医生', '第二医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020065', 'PP2603de', '2021-06-14', '李医生', '第一医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020066', 'PP2603de', '2021-07-15', '王医生', '第二军医院', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020067', 'PP2603de', '2021-07-16', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020068', 'PP2603de', '2021-07-17', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020069', 'PP2603de', '2021-07-18', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020070', 'PP2603de', '2021-07-19', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020071', 'PP2603de', '2021-07-20', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020072', 'PP2603de', '2021-07-21', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020073', 'PP2603de', '2021-07-22', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020074', 'PP2603de', '2021-07-23', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020075', 'PP2603de', '2021-07-24', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020076', 'PP2603de', '2021-07-25', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020077', 'PP2603de', '2021-07-26', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020078', 'PP2603de', '2021-07-27', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020079', 'PP2603de', '2021-07-28', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020080', 'PP2603de', '2021-07-29', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020081', 'PP2603de', '2021-07-30', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020082', 'PP2603de', '2021-07-31', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc020083', 'PP2603de', '2021-08-01', '马医生', '熙康', 100.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc20084', 'pp2603de', '2021-08-17', '吴医生', '熙康医院', 395.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc20085', 'PP2604de', '2021-08-17', '吴医生', '熙康诊所', 138.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc20086', 'PP2605de', '2021-08-17', '吴医生', '熙康小诊所', 285.00, NULL);
INSERT INTO `medicalmaster` VALUES ('fc20087', 'PP2606de', '2021-08-17', '吴医生', '熙康小医院', 1.00, NULL);

-- ----------------------------
-- Table structure for medicalservant
-- ----------------------------
DROP TABLE IF EXISTS `medicalservant`;
CREATE TABLE `medicalservant`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `re_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `m_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `count` int(0) NOT NULL,
  `option` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_re`(`re_id`) USING BTREE,
  CONSTRAINT `fk_re` FOREIGN KEY (`re_id`) REFERENCES `medicalmaster` (`re_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of medicalservant
-- ----------------------------
INSERT INTO `medicalservant` VALUES ('e0cf100', 'fc020070', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf101', 'fc020071', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf102', 'fc020072', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf103', 'fc020073', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf104', 'fc020074', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf105', 'fc020075', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf106', 'fc020076', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf107', 'fc020077', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf108', 'fc020078', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf109', 'fc020079', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf110', 'fc020080', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf111', 'fc020081', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf112', 'fc020082', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf113', 'fc020083', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf114', 'fc020060', 'eb613de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf115', 'fc020060', 'eb618de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf200', 'fc20084', 'eb603de', 2, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf201', 'fc20084', 'eb613de', 5, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf202', 'fc20084', 'ed618de', 3, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf300', 'fc20085', 'eb606de', 4, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf301', 'fc20085', 'eb612de', 2, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf400', 'fc20086', 'eb618de', 5, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf401', 'fc20086', 'eb620de', 1, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf500', 'fc20087', 'eb605de', 3, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf501', 'fc20087', 'eb611de', 2, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf502', 'fc20087', 'eb621de', 5, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf90', 'fc020060', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf91', 'fc020061', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf92', 'fc020062', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf93', 'fc020063', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf94', 'fc020064', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf95', 'fc020065', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf96', 'fc020066', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf97', 'fc020067', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf98', 'fc020068', 'eb603de', 10, NULL);
INSERT INTO `medicalservant` VALUES ('e0cf99', 'fc020069', 'eb603de', 10, NULL);

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `p_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sinum` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `banknum` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `medical_category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `root_type` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`p_id`) USING BTREE,
  UNIQUE INDEX `sinum`(`sinum`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '1', '1', '1', '1', '张松', '城镇医保', 'T01', '男');
INSERT INTO `person` VALUES ('PP2603de', '123456', '123456', '1342678790976536786', '4289710895706954236', '张三', '农村医保', 'T02', '男');
INSERT INTO `person` VALUES ('PP2604de', '123457', '123457', '6783522797826456178', '8672347523876917487', '李四', '农村医保', 'T02', '男');
INSERT INTO `person` VALUES ('PP2605de', '123458', '123458', '2154326546376758678', '4556457548251345666', '王五', '农村医保', 'T02', '女');
INSERT INTO `person` VALUES ('PP2606de', '123459', '123459', '1512450486985867334', '8377592730879676287', '赵六', '城镇医保', 'T02', '女');
INSERT INTO `person` VALUES ('PP2607de', '123460', '123460', '2975982785676437568', '5216427568679696785', '小贾', '城镇医保', 'T01', '男');
INSERT INTO `person` VALUES ('PP2608de', '123461', '123461', '2654736756879546743', '3678768947242634626', '蒋二', '城镇医保', 'T01', '男');
INSERT INTO `person` VALUES ('PP2609de', '123462', '123462', '2314536756876887867', '2635476547242125346', '六七', '农村医保', 'T02', '女');

-- ----------------------------
-- Table structure for treatmaster
-- ----------------------------
DROP TABLE IF EXISTS `treatmaster`;
CREATE TABLE `treatmaster`  (
  `tm_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `re_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `p_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `all_price` float(10, 2) NOT NULL,
  `pay_price` float(10, 2) NULL DEFAULT NULL,
  `tm_price` float(10, 2) NULL DEFAULT NULL,
  `buy_date` date NOT NULL,
  `approval_state` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `approval_date` date NULL DEFAULT NULL,
  `approval_suggestion` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tm_id`) USING BTREE,
  INDEX `fk_treatinfo_treatinfo_1`(`p_id`) USING BTREE,
  INDEX `re_id`(`re_id`) USING BTREE,
  CONSTRAINT `fk_treatinfo_treatinfo_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `treatmaster_ibfk_1` FOREIGN KEY (`re_id`) REFERENCES `medicalmaster` (`re_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of treatmaster
-- ----------------------------
INSERT INTO `treatmaster` VALUES ('1', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('2', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23569', 'fc020060', 'PP2603de', 1050.00, NULL, NULL, '2021-01-10', 'S02', '2021-08-17', NULL);
INSERT INTO `treatmaster` VALUES ('23570', 'fc020061', 'PP2603de', 100.00, NULL, NULL, '2021-02-10', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23571', 'fc020062', 'PP2603de', 100.00, NULL, NULL, '2021-03-11', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23572', 'fc020063', 'PP2603de', 100.00, NULL, NULL, '2021-04-12', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23573', 'fc020064', 'PP2603de', 100.00, NULL, NULL, '2021-05-13', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23574', 'fc020065', 'PP2603de', 100.00, NULL, NULL, '2021-06-14', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23575', 'fc020066', 'PP2603de', 100.00, NULL, NULL, '2021-07-15', 'S01', NULL, NULL);
INSERT INTO `treatmaster` VALUES ('23576', 'fc020067', 'PP2603de', 100.00, NULL, NULL, '2021-07-16', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23577', 'fc020068', 'PP2603de', 100.00, NULL, NULL, '2021-07-17', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23578', 'fc020069', 'PP2603de', 100.00, NULL, NULL, '2021-07-18', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23579', 'fc020070', 'PP2603de', 100.00, NULL, NULL, '2021-07-19', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23580', 'fc020071', 'PP2603de', 100.00, NULL, NULL, '2021-07-20', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23581', 'fc020072', 'PP2603de', 100.00, NULL, NULL, '2021-07-21', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23582', 'fc020073', 'PP2603de', 100.00, NULL, NULL, '2021-07-22', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23583', 'fc020074', 'PP2603de', 100.00, NULL, NULL, '2021-07-23', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23584', 'fc020075', 'PP2603de', 100.00, NULL, NULL, '2021-07-24', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23585', 'fc020076', 'PP2603de', 100.00, NULL, NULL, '2021-07-25', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23586', 'fc020077', 'PP2603de', 100.00, NULL, NULL, '2021-07-26', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23587', 'fc020078', 'PP2603de', 100.00, NULL, NULL, '2021-07-27', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23588', 'fc020079', 'PP2603de', 100.00, NULL, NULL, '2021-07-28', 'S04', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23589', 'fc020080', 'PP2603de', 100.00, NULL, NULL, '2021-07-29', 'S04', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23590', 'fc020081', 'PP2603de', 100.00, NULL, NULL, '2021-07-30', 'S04', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23591', 'fc020082', 'PP2603de', 100.00, NULL, NULL, '2021-07-31', 'S04', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23592', 'fc020083', 'PP2603de', 100.00, NULL, NULL, '2021-08-11', 'S04', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('23600', 'fc20084', 'PP2603de', 395.00, 134.25, 126.50, '2021-08-17', 'S04', '2021-08-17', NULL);
INSERT INTO `treatmaster` VALUES ('23700', 'fc20085', 'PP2604de', 138.00, 25.30, 87.40, '2021-08-17', 'S04', '2021-08-17', NULL);
INSERT INTO `treatmaster` VALUES ('23800', 'fc20086', 'PP2605de', 285.00, 142.50, 0.00, '2021-08-17', 'S04', '2021-08-17', NULL);
INSERT INTO `treatmaster` VALUES ('23900', 'fc20087', 'PP2606de', 218.00, 91.50, 65.50, '2021-08-17', 'S04', '2021-08-17', NULL);
INSERT INTO `treatmaster` VALUES ('3', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S03', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('4', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('5', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S02', '2021-08-12', NULL);
INSERT INTO `treatmaster` VALUES ('6', '1', '1', 100.00, 155.40, 245.60, '2021-08-12', 'S02', '2021-08-12', NULL);

-- ----------------------------
-- Table structure for treatservant
-- ----------------------------
DROP TABLE IF EXISTS `treatservant`;
CREATE TABLE `treatservant`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `re_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `m_id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `count` int(0) NOT NULL,
  `approve_state` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `option` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` float(10, 2) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_medicalinfo_medicalinfo_2`(`m_id`) USING BTREE,
  INDEX `re_id`(`re_id`) USING BTREE,
  CONSTRAINT `fk_medicalinfo_medicalinfo_2` FOREIGN KEY (`m_id`) REFERENCES `medical` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `treatservant_ibfk_1` FOREIGN KEY (`re_id`) REFERENCES `medicalmaster` (`re_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of treatservant
-- ----------------------------
INSERT INTO `treatservant` VALUES ('1', '1', '1', 10, 'Y', '222', 155.40);
INSERT INTO `treatservant` VALUES ('2', '1', '1', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939489', 'fc020060', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939490', 'fc020061', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939491', 'fc020062', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939492', 'fc020063', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939493', 'fc020064', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939494', 'fc020065', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939495', 'fc020066', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939496', 'fc020067', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939497', 'fc020068', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939498', 'fc020069', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939499', 'fc020070', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('893950', 'fc20087', 'eb605de', 3, 'Y', '1', 31.50);
INSERT INTO `treatservant` VALUES ('8939500', 'fc020071', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939501', 'fc020072', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939502', 'fc020073', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939503', 'fc020074', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939504', 'fc020075', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939505', 'fc020076', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939506', 'fc020077', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939507', 'fc020078', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939508', 'fc020079', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939509', 'fc020080', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('893951', 'fc20087', 'eb611de', 2, 'Y', '1', 34.00);
INSERT INTO `treatservant` VALUES ('8939510', 'fc020081', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939511', 'fc020082', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939512', 'fc020083', 'eb603de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939513', 'fc020060', 'eb613de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('8939514', 'fc020060', 'eb618de', 10, 'N', NULL, 0.00);
INSERT INTO `treatservant` VALUES ('893952', 'fc20087', 'eb621de', 5, 'Y', '1', 0.00);
INSERT INTO `treatservant` VALUES ('8939520', 'fc20084', 'eb603de', 2, 'Y', '1', 14.00);
INSERT INTO `treatservant` VALUES ('8939521', 'fc20084', 'eb613de', 5, 'Y', '1', 112.50);
INSERT INTO `treatservant` VALUES ('8939522', 'fc20084', 'eb618de', 3, 'Y', '1', 0.00);
INSERT INTO `treatservant` VALUES ('8939530', 'fc20085', 'eb606de', 4, 'Y', '1', 64.40);
INSERT INTO `treatservant` VALUES ('8939531', 'fc20085', 'eb612de', 2, 'Y', '1', 23.00);
INSERT INTO `treatservant` VALUES ('8939540', 'fc20086', 'eb618de', 5, 'Y', '1', 0.00);
INSERT INTO `treatservant` VALUES ('8939541', 'fc20086', 'eb620de', 1, 'Y', '1', 0.00);

SET FOREIGN_KEY_CHECKS = 1;
