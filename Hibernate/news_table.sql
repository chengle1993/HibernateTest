
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8;
USE `test`;

-- 创建  表 test.news_table 结构
CREATE TABLE IF NOT EXISTS `news_table` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `fullcontent` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
