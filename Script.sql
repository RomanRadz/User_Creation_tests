--<ScriptOptions statementTerminator=";"/>

CREATE TABLE categories (
	id INT NOT NULL,
	name VARCHAR(256) NOT NULL,
	description TEXT NOT NULL,
	created DATETIME NOT NULL,
	modified TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE products (
	id INT NOT NULL,
	name VARCHAR(32) NOT NULL,
	description TEXT NOT NULL,
	price DECIMAL(10 , 2) NOT NULL,
	category_id INT NOT NULL,
	created DATETIME NOT NULL,
	modified TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP' NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

