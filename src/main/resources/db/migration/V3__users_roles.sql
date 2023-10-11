CREATE TABLE `chat`.`users_roles` (
  `user_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`),
  INDEX `role_id_idx` (`role_id` ASC) VISIBLE,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `chat`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `chat`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO `chat`.`users_roles` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `chat`.`users_roles` (`user_id`, `role_id`) VALUES ('2', '2');
INSERT INTO `chat`.`users_roles` (`user_id`, `role_id`) VALUES ('3', '2');
INSERT INTO `chat`.`users_roles` (`user_id`, `role_id`) VALUES ('4', '2');