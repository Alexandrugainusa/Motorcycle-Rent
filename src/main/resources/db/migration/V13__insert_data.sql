INSERT INTO motorcyclerent.userroles VALUES (1,'ADMIN'),(2,'MANAGER'),(3,'CUSTOMER'),(4,'OFFICEEMPLOYEE'),(5,'RENTINGEMPLOYEE');
INSERT INTO motorcyclerent.users VALUES (1,'Alex','Mann','alexmann','alex123','alexmann@yahoo.com'),
                                          (2,'Zack','Huff','zackhuff','zack123','zackhuff@hotmail.com'),
                                          (3,'Oliver','Hunt','oliverhunt','oliver123','oliverhunt@yahoo.com'),
                                          (4,'Jude','Love','judelove','jude123','judelove@yahoo.com'),
                                          (5,'Alexis','Sonia','alexissonia','alexis123','alexissonia@hotmail.com');
INSERT INTO motorcyclerent.appuserrole VALUES (1,1), (2,3), (3,5), (4,4),(5,2);
INSERT INTO motorcyclerent.features VALUES (1,'ABS'),(2,'RADIO'),(3,'ELECTRIC STARTER'),(4,'WINDSHIELD'),(5,'TOP CASE'),
                                            (6,'SIDE CASE'),(7,'KICK STARTER'),(8,'HEATED GRIPS'),(10,'BLUETOOTH');
INSERT INTO motorcyclerent.status VALUES (1,'AVI','AVAILABLE'),(2,'UAV','UNAVAILABLE');
INSERT INTO motorcyclerent.location VALUES (1,'ROMANIA','BUCHAREST','STR. UNIRII','agentiadevise@yahoo.com'),
                                            (2,'OLANDA','AMSTERDAM','STREET','amsterdamoffice@yahoo.com'),
                                            (3,'BELGIA','ANTWERPEN','WEST STREET','antwerpenoffice@yahoo.com');
INSERT INTO motorcyclerent.motorcycle VALUES (1,'HONDA','SHADOW VT600','CHOPPER',100,'AVI',1),
                                              (2,'HONDA','FIREBLADE','SPEEDER',200,'AVI',2),
                                              (3,'BMW','1200GS ADVENTURE','ENDURO TOURING',300,'AVI',3);
INSERT INTO motorcyclerent.motorcyclefeatures VALUES (1,1),(1,2),(1,3),(1,4),(1,6),(1,10),
                                                      (2,1),(2,3),(2,10),
                                                      (3,1),(3,2),(3,3),(3,5),(3,6),(3,8),(3,10);
INSERT INTO motorcyclerent.motorcycleparameters VALUES (1,'2019','BLACK','1200 KM','CHAIN'),
                                                         (2,'2010','RED','28000 KM','CHAIN'),
                                                         (3,'2013','GREY','1370 KM','BELT DRIVE');