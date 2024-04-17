/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import BancoDeDados.BancoDeDados;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Model.Cliente;
import View.ViewCliente;
import View.ViewDashboard;
import java.util.logging.Logger;

/**
 *
 * @author Bruno Groehs
 */
public class HelperView {
    ViewCliente viewCliente;
    ViewDashboard view;
    BancoDeDados banco;

    public HelperView(ViewDashboard view) {
        this.view = view;
        this.banco = BancoDeDados.getInstancia();
    }

    public Cliente pegaModelo() {
        String nome = view.getjTextNomeContato().getText();
        String telefone = view.getjTextTelefoneContato().getText();
        String data = view.getjTextDataPrimeiroContato().getText();
        String obs = view.getjTextObservacaoContato().getText();
        String cidade = view.getjTextCidadeContato().getText();
        String indicacao = view.getjTextIndicacao().getText();
        int codigo = Integer.parseInt(view.getjTextCodigo().getText());
        
        Cliente cliente = new Cliente(nome, telefone, cidade, obs, data, codigo, indicacao);
        
        limpaModelo();
        
        return cliente;
    }
    public void limpaModelo(){
        view.getjTextNomeContato().setText("");
        view.getjTextTelefoneContato().setText("");
        view.getjTextDataPrimeiroContato().setText("");
        view.getjTextObservacaoContato().setText("");
        view.getjTextCidadeContato().setText("");
        view.getjTextIndicacao().setText("");
        view.getjTextCodigo().setText("");
    }
    public void preencherTabela(ArrayList<Cliente> clientes) {
        //pega a tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableLista().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista para adiciona no table
        for (Cliente cliente : clientes) {
            tableModel.addRow(new Object[]{
                cliente.getCodigo(),
                cliente.getNome(),
                cliente.getData(),
                cliente.getValor(),
                cliente.getIndicacao()
            });
        }
    }
    public Cliente buscaClickCliente() {
        
        String codigo = view.getjTableLista().getValueAt(view.getjTableLista().getSelectedRow(), 0).toString();
        int codigo1 = Integer.parseInt(codigo);
        //cria um metodo que busca o cliente e imprime ele
        Cliente cliente = banco.buscaCliente(codigo1);
        
        System.out.println(cliente);
        
        if(cliente != null){
        //cliente buscado
        return cliente;
        }
        else{
            view.exibeMensagem("Cliente não encontrado/Não possui codigo");
            return null;
        }
        
        
    }      
    
}
