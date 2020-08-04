create table motorcyclerent.users
(
    userId       int(5)       not null auto_increment primary key,
    name     varchar(30)  not null,
    surname  varchar(30)  not null,
    login    varchar(30)  not null,
    password varchar(30)  not null,
    email    varchar(255) not null,
    UNIQUE (login, email)
);