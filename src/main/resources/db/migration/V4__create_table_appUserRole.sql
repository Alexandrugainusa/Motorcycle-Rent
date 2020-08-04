create table motorcyclerent.appUserRole
(
    appUserId     int(5) not null,
    appUserRoleId int(5) not null,
    PRIMARY KEY (appUserId, appUserRoleId),
    FOREIGN KEY (appUserId) REFERENCES motorcyclerent.users (userId),
    FOREIGN KEY (appUserRoleId) REFERENCES motorcyclerent.userRoles (userRoleId)

);