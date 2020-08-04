package com.project.motorcycleRental.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId")
    private int commentId;

    @Column(name = "motoCommentId")
    private int motoCommentId;

    @Column(name = "commentText")
    private String commenttext;

    @Column(name = "login")
    private String login;

    @Column(name = "commentDate")
    private LocalDateTime commentDateCreated;

    @ManyToOne
    @JoinColumn(name = "motoCommentId", referencedColumnName = "motorcycleId", insertable = false, updatable = false)
    private Motorcycle motorcycle;

    public Comment() {
    }

    public Comment(int commentId, String commenttext, String login, LocalDateTime commentDateCreated) {
        this.commentId = commentId;
        this.commenttext = commenttext;
        this.login = login;
        this.commentDateCreated = LocalDateTime.now();
    }

    public Comment(int commentId, int motoCommentId, String commenttext, String login, LocalDateTime commentDateCreated) {
        this.commentId = commentId;
        this.motoCommentId = motoCommentId;
        this.commenttext = commenttext;
        this.login = login;
        this.commentDateCreated = commentDateCreated;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getMotoCommentId() {
        return motoCommentId;
    }

    public void setMotoCommentId(int motoCommentId) {
        this.motoCommentId = motoCommentId;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDateTime getCommentDateCreated() {
        return commentDateCreated;
    }

    public void setCommentDateCreated(LocalDateTime commentDateCreated) {
        this.commentDateCreated = commentDateCreated;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", motoCommentId=" + motoCommentId +
                ", commenttext='" + commenttext + '\'' +
                ", login='" + login + '\'' +
                ", commentDateCreated=" + commentDateCreated +
                ", motorcycle=" + motorcycle +
                '}';
    }
}
