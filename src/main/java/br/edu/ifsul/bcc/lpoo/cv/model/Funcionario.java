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
public class Funcionario extends Pessoa {

    private String numero_ctps;
    private String numero_pis;
    private Cargo cargo;

    public Funcionario(String numero_ctps, String numero_pis, Cargo cargo, String cpf, String rg, String nome, String senha, String numero_celular, String email, Calendar data_nascimento, String cep, String endereco, String complemento) {
        super(cpf, rg, nome, senha, numero_celular, email, data_nascimento, cep, endereco, complemento);
        this.numero_ctps = numero_ctps;
        this.numero_pis = numero_pis;
        this.cargo = cargo;
    }
    
    public String getNumero_pis() {
        return numero_pis;
    }

    public void setNumero_pis(String numero_pis) {
        this.numero_pis = numero_pis;
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
