create table motorcyclerent.userRoles
(
    userRoleId   int(5) not null auto_increment primary key,
    userRoleType varchar(255) not null,
    UNIQUE (userRoleType)
);