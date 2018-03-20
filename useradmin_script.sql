CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int AUTO_INCREMENT primary key,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

create table `preOrders` (
`id` int auto_increment primary key,
userID int not null,
FOREIGN KEY (userID) REFERENCES users(`id`),
`dates` datetime default current_timestamp
);


LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES (1,'malik@sharfo.com','batman','employee');
UNLOCK TABLES;

