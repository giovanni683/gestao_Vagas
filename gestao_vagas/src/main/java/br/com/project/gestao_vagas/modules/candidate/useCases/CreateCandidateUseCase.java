package br.com.project.gestao_vagas.modules.candidate.useCases;

import br.com.project.gestao_vagas.exceptions.UserFoundException;
import br.com.project.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.project.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.project.gestao_vagas.modules.company.entities.CompanyEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {
    @Autowired
        private CandidateRepository candidateRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public CompanyEntity execute(@Valid CompanyEntity companyEntity){

        this.candidateRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        var password = passwordEncoder.encode(companyEntity.getPassword());
        companyEntity.setPassword(password);

        return this.candidateRepository.save(companyEntity);
    }
}












