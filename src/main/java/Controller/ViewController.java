/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.BancoDeDados;
import Helper.HelperView;
import Model.Cliente;
import View.ViewCliente;
import View.ViewDashboard;

/**
 *
 * @author Bruno Groehs
 */
public class ViewController {
    private ViewDashboard view;
    private BancoDeDados banco;
    private HelperView helper;

    public ViewController(ViewDashboard view) {
        this.view = view;
        this.banco = BancoDeDados.getInstancia();
        this.helper = new HelperView(view);
        
        
    }
    public void criaUsuario(){
        banco.adicionarCliente(helper.pegaModelo());
        banco.imprimeClientes();
    }

    public void atualizaTabela() {
        helper.preencherTabela(banco.getClientes());
    }
    public void clickCliente() { 
        Cliente cliente = helper.buscaClickCliente();
        
        navegaCliente(cliente);
        
    }    
    public void navegaCliente(Cliente cliente){
        ViewCliente viewC = new ViewCliente();
        viewC.setVisible(true);
        viewC.preencheView(cliente);
    }
}
