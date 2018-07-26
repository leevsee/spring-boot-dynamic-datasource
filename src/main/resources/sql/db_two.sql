SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for db_two_table
-- ----------------------------
DROP TABLE IF EXISTS `db_two_table`;
CREATE TABLE `db_two_table` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_two_table
-- ----------------------------
INSERT INTO `db_two_table` VALUES ('1', '男');
