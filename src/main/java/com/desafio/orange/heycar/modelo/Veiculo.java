package com.desafio.orange.heycar.modelo;

import javax.persistence.*;

@Entity
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int anoModelo;
    private Double valor;
    @ManyToOne
    private Usuario proprietarie;
    private String diaRodizio;
    private Boolean rodizioAtivo;


    public Veiculo() {

    }

    public Veiculo(Long id, String marca, String modelo, int anoModelo, Double valor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.valor = valor;
    }

    public void setProprietarie(Usuario proprietarie) {
        this.proprietarie = proprietarie;
    }

    public void setDiaRodizio(String diaRodizio) {
        this.diaRodizio = diaRodizio;
    }

    public void setRodizioAtivo(Boolean rodizioAtivo) {
        this.rodizioAtivo = rodizioAtivo;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public Double getValor() {
        return valor;
    }

    public Usuario getProprietarie() {
        return proprietarie;
    }

    public String getDiaRodizio() {
        return diaRodizio;
    }

    public Boolean getRodizioAtivo() {
        return rodizioAtivo;
    }
}
