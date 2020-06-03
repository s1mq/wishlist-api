DROP TABLE IF EXISTS `wishlist_items`;
DROP TABLE IF EXISTS `date`;
DROP TABLE IF EXISTS `user_group`;
DROP TABLE IF EXISTS `group`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(50) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	`name` VARCHAR(100) NOT NULL,
	`photo` VARCHAR(255) NULL DEFAULT NULL,
	`uuid` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Index 2` (`username`),
	UNIQUE INDEX `Index 3` (`uuid`)
);

CREATE TABLE `group` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	`picture` VARCHAR(255) NULL DEFAULT NULL,
	`description` VARCHAR(255) NULL DEFAULT NULL,
	`userId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Index 2` (`name`),
	INDEX `FK_group_user` (`userId`),
	CONSTRAINT `FK_group_user` FOREIGN KEY (`userId`) REFERENCES `wishlist`.`user` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
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

CREATE TABLE `date` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	`date` DATE NOT NULL,
	`userId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Index 2` (`name`),
	INDEX `FK_date_user` (`userId`),
	CONSTRAINT `FK_date_user` FOREIGN KEY (`userId`) REFERENCES `wishlist`.`user` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE `wishlist_items` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`status` BIT(1) NOT NULL,
	`itemName` VARCHAR(100) NOT NULL,
	`price` INT(11) NULL DEFAULT NULL,
	`picture` VARCHAR(255) NULL DEFAULT NULL,
	`description` VARCHAR(255) NULL DEFAULT NULL,
	`link` VARCHAR(255) NULL DEFAULT NULL,
	`userId` INT(11) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `Index 2` (`itemName`),
	INDEX `FK_wishlist_items_user` (`userId`),
	CONSTRAINT `FK_wishlist_items_user` FOREIGN KEY (`userId`) REFERENCES `wishlist`.`user` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
);

