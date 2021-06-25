package com.desafio.orange.heycar.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nome;
    @Column (name = "email", unique = true)
    private String email;
    @Column (name = "cpf", unique = true)
    private String cpf;
    @Column
    private String dataNascto;


    public Usuario(String nome, String email, String cpf, String dataNascto) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascto = dataNascto;
    }

    public Usuario(){
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascto() {
        return dataNascto;
    }

}
