/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import BancoDeDados.BancoDeDados;
import Model.Cliente;
import Model.Historico;
import View.ViewCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Groehs
 */
public class HelperCliente {
    
    private ViewCliente view;
    private BancoDeDados banco;

    public HelperCliente(ViewCliente view) {
        this.view = view;
        banco = BancoDeDados.getInstancia();
    }
    
    /*Mexe no modelo Cliente*/
    public void preencheModelo(Cliente cliente) {
        view.getjTextAlerObs().setText(cliente.getNome());
    }
    public void preencherTabela(Cliente cliente) {
        //pega a tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableObsData().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista para adiciona no table
        ArrayList<Historico> hist = cliente.getHistorico();
        for (Historico historico : hist) {
            tableModel.addRow(new Object[]{
                historico.getObservação(),
                historico.getData()
                
            });
        }
    }
    
    
}
