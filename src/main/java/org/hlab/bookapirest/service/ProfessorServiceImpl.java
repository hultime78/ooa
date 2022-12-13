package org.hlab.bookapirest.service;

import org.hlab.bookapirest.model.Professor;
import org.hlab.bookapirest.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    ProfessorRepository professorRepository;

    @Override
    public Professor saveProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public List<Professor> getProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public void deleteProfessorByID(long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public Optional<Professor> findProfessorByID(long id) {
        return professorRepository.findById(id);
    }

    @Override
    public void updateProfessor(Professor professor) {
        Professor temp=professorRepository.findById(professor.getId()).orElseThrow(()->
                new RuntimeException());
        professorRepository.save(professor);
    }
}
