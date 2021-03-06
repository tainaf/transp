/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import entidades.Produtos;
import hibernate.HibernateUtil;
import dao.DAO;
import java.sql.ResultSet;

public class ProdutosDAO {

    
   
    public List<Object> consultarTodos() {
        List resultado = null;
        Produtos prod = new Produtos();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Produtos");
            resultado = q.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;
 
    }
    public int contarTodos() {
        int resultado = 0;
        Produtos prod = new Produtos();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from produtos");
            resultado = q.list().size();
            System.out.println(resultado);
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;
 
    }
    public String salvarReturnID(Object o) {
        //inicializa variaveis necessarias
        String retorno = null;
        Session sessao = null;
        Produtos produtos = (Produtos) o;
        //Executa a inserção
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            //retorno = String.valueOf(produtos.getIdProduto());
            return retorno;
            //deu erro retorna false
        } catch (Exception he) {
            //LogErroDAO.salvarLog(he, us);
            he.printStackTrace();
            return retorno;
        } finally {
            sessao.close();
        }
        
   
    }
    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Id";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Peso";
        cabecalho[3] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
          List resultado = null;
        try {
           Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from produtos");

            resultado = q.list();
            sessao.close();

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from produtos WHERE produto ILIKE  '%" + criterio + "%'");
            resultado =q.list();
            
             for (Object o : resultado) {
                 Produtos p =(Produtos)o;
                 
                 dadosTabela[lin][0] = p.getId();
                 dadosTabela[lin][1] = p.getDescricao();
                 dadosTabela[lin][2] = p.getPeso();
                 dadosTabela[lin][3] = p.getSituacao();
                 
             }
            
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });}

}