# springBoot-mybatis
通过springBoot+mybatis+mysql实现简单的增删改查
建表sql



CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(100) character set utf8 default NULL,
  `gender` varchar(10) character set latin1 default NULL,
  `job` varchar(200) character set latin1 default NULL,
  `birthday` date default NULL,
  `number` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `image` blob,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
SET FOREIGN_KEY_CHECKS=1;
