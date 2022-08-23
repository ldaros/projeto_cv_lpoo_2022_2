/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20211PF.CC0005
 */
public class Venda {

    private Integer id;
    private String observacao;
    private Float valot_total;
    private Calendar data;
    private List<Consulta> consultas;
    private List<Produto> produtos;
    private Pagamento pagamento;
    
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(Integer id, String observacao, Float valot_total, Calendar data, List<Consulta> consultas, List<Produto> produtos, Pagamento pagamento, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.observacao = observacao;
        this.valot_total = valot_total;
        this.data = data;
        this.consultas = consultas;
        this.produtos = produtos;
        this.pagamento = pagamento;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Float getValot_total() {
        return valot_total;
    }

    public void setValot_total(Float valot_total) {
        this.valot_total = valot_total;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
