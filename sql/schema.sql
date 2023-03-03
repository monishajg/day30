drop database if exists acme_bank;

CREATE SCHEMA `acme_bank`;

USE acme_bank;

CREATE TABLE `accounts` (
  `account_id` char(10) NOT NULL,
  `name` varchar(80) NOT NULL,
  `balance` decimal(8,2) NOT NULL,
  PRIMARY KEY (`account_id`)
);

INSERT INTO accounts (account_id, name, balance) values ('V9L3Jd1BBI','fred','100');
INSERT INTO accounts (account_id, name, balance) values ('fhRq46Y6vB','barney','300');
INSERT INTO accounts (account_id, name, balance) values ('uFSFRqUpJy','wilma','1000');
INSERT INTO accounts (account_id, name, balance) values ('ckTV56axff','betty','1000');
INSERT INTO accounts (account_id, name, balance) values ('Qgcnwbshbh','pebbles','50');
INSERT INTO accounts (account_id, name, balance) values ('if9l185l18','bambam','50');