package br.com.ada.controle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue
    private Long id;
    private String veículo;
    private String descricao;
    private String tipo;
    private String placa;
    private String marca;
    private int anoFabricacao;
    private int anoModelo;
    private LocalDate dataCompra;
    private boolean ipvaVencido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVeículo() {
        return veículo;
    }

    public void setVeículo(String veículo) {
        this.veículo = veículo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isIpvaVencido() {
        return ipvaVencido;
    }

    public void setIpvaVencido(boolean ipvaVencido) {
        this.ipvaVencido = ipvaVencido;
    }
}
