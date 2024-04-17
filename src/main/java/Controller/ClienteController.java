/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BancoDeDados.BancoDeDados;
import Helper.HelperCliente;
import Model.Cliente;
import View.ViewCliente;



/**
 *
 * @author Bruno Groehs
 */
public class ClienteController {
    private ViewCliente view;
    private BancoDeDados banco;
    private HelperCliente helper;

    public ClienteController(ViewCliente view) {
        this.view = view;
        this.banco = BancoDeDados.getInstancia();
        this.helper = new HelperCliente(view);
    }

    public void preencheView(Cliente cliente) {
        helper.preencheModelo(cliente);
    }
    public void atualizaTabela(Cliente cliente){
        helper.preencherTabela(cliente);
        cliente.addNovoHistorico("aa", "09/07/2001");
        cliente.addNovoHistorico("aa", "09/07/2001");
        cliente.addNovoHistorico("aa", "09/07/2001");
        cliente.addNovoHistorico("aa", "09/07/2001");
        cliente.addNovoHistorico("aa", "09/07/2001");
        helper.preencherTabela(cliente);
        
    }
    
    
}
