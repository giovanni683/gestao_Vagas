package br.com.project.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "The [username] field must not contain spaces")
    private String username;

    @Email(message = "The [email] field must contain a valid email address")
    private String email;

    @Length(min = 10, max = 100, message = "The password must contain between [10] and [100] characters")
    private String password;

    private String description;
    private String curriculum;
}
