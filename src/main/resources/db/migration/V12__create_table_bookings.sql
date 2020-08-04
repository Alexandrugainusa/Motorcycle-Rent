create table motorcyclerent.bookings(
                                          bookingId int(5) not null auto_increment primary key,
                                          bookingUserId int(5) not null,
                                          bookingMotorcycleId int(5) not null,
                                          bookingStatus varchar(5) not null,
                                          receiptDate datetime not null,
                                          returnDate datetime not null,
                                          locationId int(5) not null,
                                          totalAmount double not null,
                                          FOREIGN KEY (bookingUserId) REFERENCES motorcyclerent.users(userId),
                                          FOREIGN KEY (bookingMotorcycleId) REFERENCES  motorcyclerent.motorcycle(motorcycleId),
                                          FOREIGN KEY (bookingStatus) REFERENCES motorcyclerent.status(statusIdentifier),
                                          FOREIGN KEY (locationId) REFERENCES motorcyclerent.location(locationId)
);