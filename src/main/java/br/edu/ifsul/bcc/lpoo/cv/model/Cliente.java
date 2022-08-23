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
public class Cliente extends Pessoa {

    private Calendar data_ultime_visita;
    private Pet pet;

    public Cliente(Calendar data_ultime_visita, Pet pet, String cpf, String rg, String nome, String senha, String numero_celular, String email, Calendar data_nascimento, String cep, String endereco, String complemento) {
        super(cpf, rg, nome, senha, numero_celular, email, data_nascimento, cep, endereco, complemento);
        this.data_ultime_visita = data_ultime_visita;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Calendar getData_ultime_visita() {
        return data_ultime_visita;
    }

    public void setData_ultime_visita(Calendar data_ultime_visita) {
        this.data_ultime_visita = data_ultime_visita;
    }

}
