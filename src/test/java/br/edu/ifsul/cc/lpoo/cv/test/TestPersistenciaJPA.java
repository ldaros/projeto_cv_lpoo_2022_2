
package br.edu.ifsul.cc.lpoo.cv.test;

import br.edu.ifsul.cc.lpoo.cv.model.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.cv.model.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPersistenciaJPA {

    @Test
    public void testConexaoJPA() {
        PersistenciaJPA JPA = new PersistenciaJPA();
        assertTrue(JPA.conexaoAberta());
    }

    @Test
    public void testListProduto() throws Exception {
        PersistenciaJPA JPA = new PersistenciaJPA();

        List<Produto> produtos = JPA.listProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        JPA.fecharConexao();
    }

    @Test
    public void testPersitenciaProduto() throws Exception {
        PersistenciaJPA JPA = new PersistenciaJPA();
        List<Produto> produtos = JPA.listProdutos();

        if (produtos.isEmpty()) {
            Produto novoProduto = new Produto();
            novoProduto.setNome("teste");
            novoProduto.setFornecedor(getFornecedor(JPA));
            novoProduto.setQuantidade(0f);
            novoProduto.setTipo(TipoProduto.ATENDIMENTO_AMBULATORIAL);
            novoProduto.setValor(100f);

            JPA.persist(novoProduto);
            System.out.println("Incluiu o produto: " + novoProduto.getId());
        } else {
            for (Produto produto : produtos) {
                produto.setNome(produto.getNome() + " - nome alterado");

                // altera o registro a partir do objeto gerenciado (p).
                JPA.persist(produto);
                // remove o registro a partir do objeto gerenciado (p).
                JPA.remover(produto);
            }
        }

        System.out.println("Removeu todos os " + produtos.size() + " produtos");
        JPA.fecharConexao();
    }

    @Test
    public void testPersitenciaReceita() throws Exception {
        PersistenciaJPA JPA = new PersistenciaJPA();

        List<Receita> receitas = JPA.listReceitas();

        if (receitas.isEmpty()) {
            // criar uma objeto do tipo Receita
            // vincular dois Produtos na receita.

        } else {

            for (Receita r : receitas) {

                // listar os produtos da receita
                // remover os produtos da receita
                // remover a receita.
                JPA.remover(r);
            }

            System.out.println("Removeu todas as " + receitas.size() + " receitas");
        }

        JPA.fecharConexao();
    }

    // retorna um objeto do tipo Fornecedor gerenciado pelo JPA
    private Fornecedor getFornecedor(PersistenciaJPA JPA) throws Exception {

        if (JPA.conexaoAberta()) {
            List<Fornecedor> fornecedores = JPA.listFornecedores();

            if (fornecedores.isEmpty()) {

                Fornecedor fornecedorNovo = new Fornecedor();
                fornecedorNovo.setNome("teste");
                fornecedorNovo.setCnpj("08316535000");
                fornecedorNovo.setIe("");
                fornecedorNovo.setData_cadastro(Calendar.getInstance());
                fornecedorNovo.setNome("Laboratório Santa Inês");
                fornecedorNovo.setRg("123");
                fornecedorNovo.setSenha("123");
                fornecedorNovo.setCpf("00001337788");

                JPA.persist(fornecedorNovo);

                return fornecedorNovo;
            } else {
                return fornecedores.get(0);
            }

        }

        throw new Exception("Não foi possível conectar no banco de dados");
    }

}
