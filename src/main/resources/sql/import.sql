INSERT INTO `spring-security`.`users` (`user_id`, `bactive`, `vpassword`, `vusername`) VALUES ('1', 1, '123456', 'root');
INSERT INTO `spring-security`.`users` (`user_id`, `bactive`, `vpassword`, `vusername`) VALUES ('2', 1, '654321', 'admin');
INSERT INTO `spring-security`.`users` (`user_id`, `bactive`, `vpassword`, `vusername`) VALUES ('3', 1, '123456', 'user');

INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('1', 'admin');
INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('2', 'root');
INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('3', 'user');
INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('4', 'update_user');
INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('5', 'delete_user');
INSERT INTO `spring-security`.`role` (`role_id`, `vname`) VALUES ('6', 'insert_user');

INSERT INTO `spring-security`.`users_roles` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `spring-security`.`users_roles` (`user_id`, `role_id`) VALUES ('2', '2');
INSERT INTO `spring-security`.`users_roles` (`user_id`, `role_id`) VALUES ('3', '3');
INSERT INTO `spring-security`.`users_roles` (`user_id`, `role_id`) VALUES ('3', '4');
INSERT INTO `spring-security`.`users_roles` (`user_id`, `role_id`) VALUES ('3', '6');

