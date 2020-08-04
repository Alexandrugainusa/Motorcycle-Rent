create table motorcyclerent.comments
(
    commentId     int(5)        not null auto_increment primary key,
    motoCommentId int(5)        not null,
    commentText   varchar(5000) not null,
    login         varchar(30)   not null,
    commentDate   datetime      not null,
    FOREIGN KEY (motoCommentId) REFERENCES motorcyclerent.motorcycle (motorcycleId)
);