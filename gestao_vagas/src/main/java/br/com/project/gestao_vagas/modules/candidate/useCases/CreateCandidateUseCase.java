package br.com.project.gestao_vagas.modules.candidate.useCases;

import br.com.project.gestao_vagas.exceptions.UserFoundException;
import br.com.project.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.project.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.project.gestao_vagas.modules.company.entities.CompanyEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {
    @Autowired
        private CandidateRepository candidateRepository;


    public CompanyEntity execute(@Valid CompanyEntity companyEntity){
        this.candidateRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRepository.save(companyEntity);
    }
}












