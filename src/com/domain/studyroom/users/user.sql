CREATE TABLE `user` (
                        `user_id` INT NOT NULL AUTO_INCREMENT,
                        `username` VARCHAR(50) NOT NULL,
                        `password` VARCHAR(100) NOT NULL,
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
