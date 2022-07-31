package com.shs.beapi.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class User {
    @Id
    private String userId;

    @Column
    private String name;

    @Column
    String password;

    @Column
    String regNo;

    public User(String userId, String name, String password, String regNo) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.regNo = regNo;
    }

    public User() {

    }
}
