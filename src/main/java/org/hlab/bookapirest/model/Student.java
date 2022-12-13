package org.hlab.bookapirest.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    @Column(name="firstName")
    String firstName;
    @Column(name="lastName")
    String lastName;
    @Column(name="promotion")
    String promotion;
    @Column(name="option")
    String option;
    @Column(name="faculte")
    String faculte ;



}
