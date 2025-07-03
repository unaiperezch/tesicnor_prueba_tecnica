CREATE DATABASE IF NOT EXISTS Movies;

USE Movies;

CREATE TABLE IF NOT EXISTS Movie (
	uuid varchar(255) primary key default "UuidPorDefinir",
    title varchar(255),
    year varchar(255),
    plot varchar(255) 
);