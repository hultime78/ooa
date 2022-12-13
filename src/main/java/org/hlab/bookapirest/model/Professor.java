package org.hlab.bookapirest.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="professor")
public class Professor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    @Column(name="firstName")
    String firstName;
    @Column(name="lastName")
    String lastName;


}
