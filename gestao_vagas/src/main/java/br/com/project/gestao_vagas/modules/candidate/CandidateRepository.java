package br.com.project.gestao_vagas.modules.candidate;

import br.com.project.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
