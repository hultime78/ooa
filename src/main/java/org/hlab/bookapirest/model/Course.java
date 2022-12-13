package org.hlab.bookapirest.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="course")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  @Column(name="name")
  String name;
  @Column(name="points")
  int points;

}
