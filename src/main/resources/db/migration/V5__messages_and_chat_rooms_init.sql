CREATE TABLE `chat`.`messages` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `content` VARCHAR(1000) NULL,
  `time` DATETIME NULL,
  `user_id` INT NULL,
  `chat_id` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `chat`.`chat_rooms` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `description` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`));