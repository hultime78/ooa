package org.hlab.bookapirest.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

    @Id
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
