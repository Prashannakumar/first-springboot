package com.my.first_springboot.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees") //table name
public class Employee {

    //@ annotations are to tell jpa to specify the column and it's name
    @Id //private key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //private key generation strategy
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;
}
