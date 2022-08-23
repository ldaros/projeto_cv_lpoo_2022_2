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
public class Medico extends Pessoa {

    private String numero_crmv;

    public Medico(String numero_crmv, String cpf, String rg, String nome, String senha, String numero_celular, String email, Calendar data_nascimento, String cep, String endereco, String complemento) {
        super(cpf, rg, nome, senha, numero_celular, email, data_nascimento, cep, endereco, complemento);
        this.numero_crmv = numero_crmv;
    }

    public String getNumero_crmv() {
        return numero_crmv;
    }

    public void setNumero_crmv(String numero_crmv) {
        this.numero_crmv = numero_crmv;
    }

}
