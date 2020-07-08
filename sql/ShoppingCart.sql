-- auto Generated on 2020-07-08
-- DROP TABLE IF EXISTS shopping_cart;
CREATE TABLE shopping_cart(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	user_id INT (11) NOT NULL COMMENT 'userId',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'shopping_cart';
