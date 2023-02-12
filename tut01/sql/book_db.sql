/* Create new database */
CREATE DATABASE bookdb;
/* Use this database */
USE bookdb;
/* Create new table */
CREATE TABLE book (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
author VARCHAR(30) NOT NULL,
price FLOAT NOT NULL);
/* Insert data to this table */
INSERT INTO book (title, author, price)
VALUES ("Java Web", "John", 100), ("Spring Boot", "David", 120);