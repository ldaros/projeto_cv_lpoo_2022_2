/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.List;

/**
 *
 * @author 20211PF.CC0005
 */
public class Procedimento {

    private Integer id;
    private String observacao;
    private Float valor;
    private List<Produto> produtos;
    private Status status;
    private Pet pet;
    private Agenda agenda;

    public Procedimento(Integer id, String observacao, Float valor, List<Produto> produtos, Status status, Pet pet, Agenda agenda) {
        this.id = id;
        this.observacao = observacao;
        this.valor = valor;
        this.produtos = produtos;
        this.status = status;
        this.pet = pet;
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    
}
