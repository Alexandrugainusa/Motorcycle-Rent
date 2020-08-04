create table motorcyclerent.motorcycleParameters
(
    parametersId      int(5)      not null auto_increment primary key,
    motorcycleYear    varchar(10) not null,
    motorcycleColour  varchar(30) not null,
    motorcycleMileAge varchar(10) not null,
    transmissionType  varchar(15) not null,
    FOREIGN KEY (parametersId) references motorcyclerent.motorcycle (motorcycleId)
);