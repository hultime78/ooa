package org.hlab.bookapirest.service;

import org.hlab.bookapirest.model.Professor;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {

    Professor saveProfessor(Professor professor);
    List<Professor> getProfessors();
    void deleteProfessorByID(long id);
    Optional<Professor> findProfessorByID(long id);
    void updateProfessor(Professor professor);
}
