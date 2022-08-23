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
public class Fornecedor extends Pessoa {

    private String cnpj;
    private String ie;

    public Fornecedor(String cnpj, String ie, String cpf, String rg, String nome, String senha, String numero_celular, String email, Calendar data_nascimento, String cep, String endereco, String complemento) {
        super(cpf, rg, nome, senha, numero_celular, email, data_nascimento, cep, endereco, complemento);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
