DROP TABLE IF EXISTS `wishlist`;
DROP TABLE IF EXISTS `date`;
DROP TABLE IF EXISTS `person`;
DROP TABLE IF EXISTS `user_group`;
DROP TABLE IF EXISTS `group`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(50) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `USERNAME` (`username`)
);

CREATE TABLE `group` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) NOT NULL,
	`Picture` VARCHAR(255) NULL DEFAULT NULL,
	`Description` VARCHAR(255) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Name` (`Name`)
);

CREATE TABLE `user_group` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`userId` INT(11) NOT NULL,
	`groupId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_user_group_user` (`userId`),
	INDEX `FK_user_group_group` (`groupId`),
	CONSTRAINT `FK_user_group_group` FOREIGN KEY (`groupId`) REFERENCES `wishlist`.`group` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT `FK_user_group_user` FOREIGN KEY (`userId`) REFERENCES `wishlist`.`user` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE `person` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	`photo` VARCHAR(255) NULL DEFAULT NULL,
	`uuid` VARCHAR(50) NOT NULL,
	`groupId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `NAME` (`name`),
	UNIQUE INDEX `UUID` (`uuid`),
	INDEX `FK_person_group` (`groupId`),
	CONSTRAINT `FK_person_group` FOREIGN KEY (`groupId`) REFERENCES `wishlist`.`group` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE `date` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) NOT NULL,
	`Date` DATE NOT NULL,
	`personId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Index 2` (`Name`),
	INDEX `FK_date_person` (`personId`),
	CONSTRAINT `FK_date_person` FOREIGN KEY (`personId`) REFERENCES `wishlist`.`person` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE `wishlist` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`status` BIT(1) NOT NULL,
	`itemName` VARCHAR(150) NOT NULL,
	`price` INT(11) NULL DEFAULT NULL,
	`picture` VARCHAR(255) NULL DEFAULT NULL,
	`description` VARCHAR(255) NULL DEFAULT NULL,
	`link` VARCHAR(255) NULL DEFAULT NULL,
	`personId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	INDEX `FK_wishlist_person` (`personId`),
	CONSTRAINT `FK_wishlist_person` FOREIGN KEY (`personId`) REFERENCES `wishlist`.`person` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);