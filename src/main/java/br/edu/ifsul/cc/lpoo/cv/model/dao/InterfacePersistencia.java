package br.edu.ifsul.cc.lpoo.cv.model.dao;

import br.edu.ifsul.cc.lpoo.cv.model.Cliente;
import br.edu.ifsul.cc.lpoo.cv.model.Consulta;
import br.edu.ifsul.cc.lpoo.cv.model.Especie;
import br.edu.ifsul.cc.lpoo.cv.model.Fornecedor;
import br.edu.ifsul.cc.lpoo.cv.model.Medico;
import br.edu.ifsul.cc.lpoo.cv.model.Pet;
import br.edu.ifsul.cc.lpoo.cv.model.Procedimento;
import br.edu.ifsul.cc.lpoo.cv.model.Produto;
import br.edu.ifsul.cc.lpoo.cv.model.Raca;
import br.edu.ifsul.cc.lpoo.cv.model.Receita;
import java.util.List;

public interface InterfacePersistencia {

    public Boolean conexaoAberta();

    public void fecharConexao();

    public Object find(Class c, Object id) throws Exception;

    public void persist(Object o) throws Exception;

    public void remover(Object o) throws Exception;

    public List<Produto> listProdutos() throws Exception;

    public List<Fornecedor> listFornecedores() throws Exception;

    public List<Medico> listMedicos() throws Exception;

    public List<Receita> listReceitas() throws Exception;

    public List<Procedimento> listProcedimentos() throws Exception;

    public List<Consulta> listConsultas() throws Exception;

    public List<Pet> listPets() throws Exception;

    public List<Raca> listRacas() throws Exception;

    public List<Especie> listEspecies() throws Exception;

    public List<Cliente> listClientes() throws Exception;
}
