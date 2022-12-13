package org.hlab.bookapirest.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  @Column(name="name")
  String name;
  @Column(name="points")
  int points;
  @Column(name="professors")
  List<Professor> professors;

}
