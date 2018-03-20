DROP DATABASE IF EXISTS `bricks`;

CREATE DATABASE `bricks`;

USE `bricks`;

DROP TABLE IF EXISTS `bricks`;
-- the lenght is the amount of the dots on the brick
create table `brickinfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`type` varchar(45) not null,
    `lenght` int not null,
	`width` int not null,
    `height` int not null,
	primary key (`id`)
);

insert into `brickinfo` (`type`, `lenght`, `width`, `height`) values ('small', 1, 2, 1), ('medium', 2, 2, 1), ('big', 4, 2, 1)