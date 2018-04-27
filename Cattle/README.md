# Cattle V3.2

## 介绍
入门spring-boot 小例子

## 数据库
第一、在application.yml 配置文件里面

 jpa:
    hibernate:
      ddl-auto: create    <-- 自动创建数据库、前提后面还是修改成update 不然一直创建数据库表
    show-sql: true
	
第二、可以自己创建
CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

