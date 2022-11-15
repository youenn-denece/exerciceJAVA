CREATE DATABASE LBC;

USE LBC;

CREATE TABLE Article
(   
    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title VARCHAR(255) NOT NULL,
    price VARCHAR(25) NOT NULL,
    descript TEXT,
    id_category INTEGER NOT NULL,
    id_user INTEGER NOT NULL
);
CREATE TABLE Utilisateur
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
);