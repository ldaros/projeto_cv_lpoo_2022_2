/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

/**
 *
 * @author 20211PF.CC0005
 */
public class Consulta {

    private Integer id;
    private Calendar data;
    private String observacao;
    private Calendar data_retorno;
    private Float valor;
    private Medico medico;
    private Receita receita;
    private Pet pet;

    public Consulta(Integer id, Calendar data, String observacao, Calendar data_retorno, Float valor, Medico medico, Receita receita, Pet pet) {
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.data_retorno = data_retorno;
        this.valor = valor;
        this.medico = medico;
        this.receita = receita;
        this.pet = pet;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Calendar getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(Calendar data_retorno) {
        this.data_retorno = data_retorno;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
