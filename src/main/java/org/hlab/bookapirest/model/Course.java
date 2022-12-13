package org.hlab.bookapirest.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

  @Id
  long id;
  @Column(name="name")
  String name;
  @Column(name="points")
  int points;

}
