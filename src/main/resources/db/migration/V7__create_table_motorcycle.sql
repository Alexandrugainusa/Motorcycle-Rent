create table motorcyclerent.motorcycle
(
    motorcycleId         int(5)      not null auto_increment primary key,
    motorcycleName       varchar(30) not null,
    motorcycleModel      varchar(50) not null,
    motorcycleType       varchar(50) not null,
    motorcycleAmount     int (5)      not null,
    motorcycleStatus     varchar(5)  not null,
    motorcycleLocationId int(5) not null,
    FOREIGN KEY (motorcycleLocationId) REFERENCES motorcyclerent.location (locationId),
    FOREIGN KEY (motorcycleStatus) REFERENCES motorcyclerent.status (statusIdentifier)
);