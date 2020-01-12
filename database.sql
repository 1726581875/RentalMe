SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP DATABASE IF EXISTS rental_me;
CREATE DATABASE rental_me DEFAULT CHARACTER SET utf8mb4;
use rental_me;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  phone varchar(64) NOT NULL UNIQUE,
  password varchar(64) NOT NULL,
  username varchar(64) NOT NULL UNIQUE,
  money int(11) NOT NULL,
  role int(11) NOT NULL,
  state varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE detail (
  uid int(11) NOT NULL ,
  brief varchar(64) NOT NULL DEFAULT '无',
  realName varchar(64),
  idNumber int(11),
  PRIMARY KEY (uid)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(64) NOT NULL UNIQUE,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
INSERT INTO category(name) VALUES ('包月穿衣');
INSERT INTO category(name) VALUES ('礼服');
INSERT INTO category(name) VALUES ('二次元');
INSERT INTO category(name) VALUES ('绘本玩具');
INSERT INTO category(name) VALUES ('手机数码');
INSERT INTO category(name) VALUES ('游戏电玩');
INSERT INTO category(name) VALUES ('相机镜头');
INSERT INTO category(name) VALUES ('租车户外');
INSERT INTO category(name) VALUES ('家居家电');
INSERT INTO category(name) VALUES ('企业租用');
INSERT INTO category(name) VALUES ('图书乐器');
INSERT INTO category(name) VALUES ('其他物品');

CREATE TABLE item (
  id int(11) NOT NULL AUTO_INCREMENT,
  uid int(11) NOT NULL,
  cid int(11) NOT NULL,
  title varchar(64) NOT NULL,
  contact varchar(64) NOT NULL,
  createDate  datetime NOT NULL,
  basePayment int(11) NOT NULL,
  countType varchar(64) NOT NULL,
  minTime int(11) NOT NULL,
  maxTime int(11) NOT NULL,
  overTimeMoney int(11) NOT NULL,
  deposit int(11) NOT NULL,
  renewable int(11) NOT NULL,
  rentalState int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE itemImage (
  id int(11) NOT NULL AUTO_INCREMENT,
  iid int(11) NOT NULL,
  pic varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE review (
  id int(11) NOT NULL AUTO_INCREMENT,
  uid int(11) NOT NULL,
  fromUid int(11) NOT NULL,
  submitDate  datetime NOT NULL,
  content varchar(64) NOT NULL DEFAULT 'ta在交易成功后未做出评价内容',
  review int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

CREATE TABLE orders (
  id int(11) NOT NULL AUTO_INCREMENT,
  ownId int(11) NOT NULL,
  uid int(11) NOT NULL,
  iid int(11) NOT NULL,
  orderCode varchar(64) NOT NULL,
  createDate datetime NOT NULL,
  preLoanDate datetime DEFAULT NULL,
  preReturnDate datetime DEFAULT NULL,
  prePayDate datetime DEFAULT NULL,
  prePayMoney int(11) DEFAULT NULL,
  loanConfirmDate datetime DEFAULT NULL,
  returnConfirmDate datetime DEFAULT NULL,
  adjustment int(11) DEFAULT NULL,
  realPayMoney int(11) DEFAULT NULL,
  status varchar(64) NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;




