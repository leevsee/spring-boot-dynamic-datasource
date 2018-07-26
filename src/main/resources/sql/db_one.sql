SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for db_one_table
-- ----------------------------
DROP TABLE IF EXISTS `db_one_table`;
CREATE TABLE `db_one_table` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_one_table
-- ----------------------------
INSERT INTO `db_one_table` VALUES ('1', 'leeves');
