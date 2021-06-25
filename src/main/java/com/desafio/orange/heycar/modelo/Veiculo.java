package com.desafio.orange.heycar.modelo;

import javax.persistence.*;

@Entity
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private Double valor;
    @ManyToOne
    private Usuario proprietarie;
    private String diaRodizio;
    private Boolean rodizioAtivo;



    public Boolean getRodizioAtivo() {
        return rodizioAtivo;
    }

    public String getDiaRodizio() {
        return diaRodizio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Usuario getProprietarie() {
        return proprietarie;
    }

    public void setProprietarie(Usuario proprietarie) {
        this.proprietarie = proprietarie;
    }
}
