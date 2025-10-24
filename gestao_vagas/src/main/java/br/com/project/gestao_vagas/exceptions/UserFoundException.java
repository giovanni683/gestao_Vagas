package br.com.project.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException(){
        super("Username or email already in use");
    }
}
