create table motorcyclerent.location
(
    locationId int(5)       not null auto_increment primary key,
    country    varchar(40)  not null,
    city       varchar(40)  not null,
    address    varchar(100) not null,
    email      varchar(100) not null
);