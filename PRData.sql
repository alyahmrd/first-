BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `User` (
	`User name`	TEXT NOT NULL,
	`Password`	INTEGER NOT NULL,
	PRIMARY KEY(`User name`,`Password`)
);

INSERT INTO `User` VALUES ('DrShimaa',210);

CREATE TABLE IF NOT EXISTS `Menu` (
	`Price`	INTEGER,
	`Name`	TEXT
);

INSERT INTO `Menu` VALUES (15,'Sandwiches');

INSERT INTO `Menu` VALUES (5,'hot drinks');

INSERT INTO `Menu` VALUES (5,'cold drinks');

INSERT INTO `Menu` VALUES (2,'biscuts');

COMMIT;
