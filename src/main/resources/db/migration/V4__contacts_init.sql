CREATE TABLE `chat`.`contacts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(100) NULL,
  `phone` VARCHAR(45) NOT NULL,
  `is_processed` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));

INSERT INTO `chat`.`contacts` (`name`, `email`, `phone`, `is_processed`) VALUES ('Yahor', 'egor43585@bk.ru', '+375255335607', '0');
INSERT INTO `chat`.`contacts` (`name`, `email`, `phone`, `is_processed`) VALUES ('Vika', 'vika@gmail.com', '+375333333333', '0');
INSERT INTO `chat`.`contacts` (`name`, `email`, `phone`, `is_processed`) VALUES ('Something', 'some@gmail.com', '+375291111111', '1');