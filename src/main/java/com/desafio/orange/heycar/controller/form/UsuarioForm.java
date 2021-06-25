package com.desafio.orange.heycar.controller.form;

import com.desafio.orange.heycar.modelo.Usuario;
import com.desafio.orange.heycar.repository.UsuarioRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class UsuarioForm {


    @NotNull @NotEmpty @Length(min = 10)
    private String nome;

    @NotNull @NotEmpty @Length(min = 10)
    private String email;

    @NotNull @NotEmpty
    private String cpf;

    @NotNull @NotEmpty
    private LocalDate dataNascto;

    public UsuarioForm() {
    }

    public UsuarioForm(String nome, String email, String cpf, LocalDate dataNascto) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascto = dataNascto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascto() {
        return dataNascto;
    }

    public void setDataNascto(LocalDate dataNascto) {
        this.dataNascto = dataNascto;
    }

}
