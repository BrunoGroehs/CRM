/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Bruno Groehs
 */
public class Cliente extends Pessoa{
    protected int codigo;
    protected float valor;
    protected String indicacao;
    protected ArrayList<Historico> historico = new ArrayList<>();

    public Cliente(String nome, String telefone, String cidade, String obs, String data, int codigo, String indicacao) {
        super(nome, telefone, cidade, obs, data);
        this.codigo = codigo;
        this.indicacao = indicacao;
        this.valor = 0;
        addNovoHistorico(obs, data);
    }
    public void addNovoHistorico(String obs, String data){
        Historico hist = new Historico(obs, data);
        this.historico.add(hist);
    }

    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", valor=" + valor + ", indicacao=" + indicacao + '}';
    }
     
    
}
