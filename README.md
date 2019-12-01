# webalk

DROP TABLE IF EXISTS cities;
CREATE TABLE cities(id INT PRIMARY KEY AUTO_INCREMENT not null, name VARCHAR(255) not null,
    population INT not null);

INSERT INTO cities(name, population) VALUES('Budapest', 1779000);
INSERT INTO cities(name, population) VALUES('Pécs', 145011);
INSERT INTO cities(name, population) VALUES('Debrecen', 202520);
INSERT INTO cities(name, population) VALUES('Szeged', 161879);
INSERT INTO cities(name, population) VALUES('Győr', 129435);
INSERT INTO cities(name, population) VALUES('Miskolc', 157639);
INSERT INTO cities(name, population) VALUES('Eger', 53876);
INSERT INTO cities(name, population) VALUES('Soporon', 62246);
