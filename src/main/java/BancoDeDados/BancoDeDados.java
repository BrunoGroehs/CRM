/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDeDados;

import Model.Cliente;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Bruno Groehs
 */
public class BancoDeDados {
    
    private static BancoDeDados instancia = new BancoDeDados(); // Instância única do Banco (singleton)
    private ArrayList<Usuario> usuarios;
    private ArrayList<Cliente> clientes;
    
    // Construtor da classe Sistema
    public BancoDeDados() {
        usuarios = new ArrayList<>();
        clientes = new ArrayList<>();
        criaClientes();
    }  
    //usa esse metodo para retornar o banco sem precisar inicializar toda hora
    public static BancoDeDados getInstancia() {
        return instancia;
    }
    
    // Método para adicionar um usuário ao ArrayList de usuários
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    // Método para adicionar um cliente ao ArrayList de clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    // Método para obter a lista de usuários
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    // Método para obter a lista de clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void imprimeClientes(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    public Cliente buscaCliente(int codigo){
        for (Cliente cliente : clientes) {
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        return null;
    }

    private void criaClientes() {
        Cliente cliente1 = new Cliente("Ana Silva", "(11) 98765-4321", "São Paulo", "Prefere contato por e-mail.", "16/04/2024", 1, "Indicação de amigo");
        adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente("Pedro Souza", "(21) 98765-1234", "Rio de Janeiro", "Sem preferências especiais.", "15/04/2024", 2, "Pesquisa online");
        adicionarCliente(cliente2);

        Cliente cliente3 = new Cliente("Maria Oliveira", "(81) 98765-5678", "Recife", "Prefere contato por WhatsApp.", "14/04/2024", 3, "Redes sociais");
        adicionarCliente(cliente3);

        Cliente cliente4 = new Cliente("Carlos Santos", "(31) 98765-8765", "Belo Horizonte", "Necessita de faturas impressas.", "13/04/2024", 4, "Panfletos");
        adicionarCliente(cliente4);

        Cliente cliente5 = new Cliente("Fernanda Lima", "(85) 98765-5432", "Fortaleza", "Prefere pagar com cartão de crédito.", "12/04/2024", 5, "Cliente anterior");
        adicionarCliente(cliente5);

        Cliente cliente6 = new Cliente("João Pereira", "(51) 98765-2345", "Porto Alegre", "Sem observações especiais.", "11/04/2024", 6, "Publicidade em rádio");
        adicionarCliente(cliente6);

        Cliente cliente7 = new Cliente("Laura Costa", "(61) 98765-6543", "Brasília", "Prefere atendimento presencial.", "10/04/2024", 7, "Indicação de familiar");
        adicionarCliente(cliente7);

        Cliente cliente8 = new Cliente("Gabriel Almeida", "(62) 98765-3456", "Goiânia", "Preferência por comunicação via SMS.", "09/04/2024", 8, "Site da empresa");
        adicionarCliente(cliente8);

        Cliente cliente9 = new Cliente("Mariana Costa e Silva", "(91) 98765-7654", "Belém", "Necessita de entrega rápida.", "08/04/2024", 9, "Propaganda em revista");
        adicionarCliente(cliente9);

        Cliente cliente10 = new Cliente("Rafael Oliveira", "(27) 98765-5678", "Vitória", "Sem preferências especiais.", "07/04/2024", 10, "Busca online");
        adicionarCliente(cliente10);

        Cliente cliente11 = new Cliente("Camila Martins", "(98) 98765-8765", "São Luís", "Prefere pagamento por transferência bancária.", "06/04/2024", 11, "Evento corporativo");
        adicionarCliente(cliente11);

        Cliente cliente12 = new Cliente("Lucas Mendes", "(95) 98765-2345", "Boa Vista", "Sem observações especiais.", "05/04/2024", 12, "Indicação de colega");
        adicionarCliente(cliente12);

        Cliente cliente13 = new Cliente("Letícia Fernandes", "(92) 98765-6543", "Manaus", "Necessita de suporte técnico constante.", "04/04/2024", 13, "Anúncio em jornal local");
        adicionarCliente(cliente13);

        Cliente cliente14 = new Cliente("Thiago Silva", "(79) 98765-3456", "Aracaju", "Preferência por comunicação por telefone.", "03/04/2024", 14, "Recomendação de consultor");
        adicionarCliente(cliente14);

        Cliente cliente15 = new Cliente("Juliana Alves", "(84) 98765-7654", "Natal", "Sem preferências especiais.", "02/04/2024", 15, "Indicação de outro cliente");
        adicionarCliente(cliente15);

        Cliente cliente16 = new Cliente("André Ribeiro", "(68) 98765-5678", "Rio Branco", "Necessita de treinamento para uso do produto.", "01/04/2024", 16, "E-mail marketing");
        adicionarCliente(cliente16);

        Cliente cliente17 = new Cliente("Paula Santos", "(96) 98765-8765", "Macapá", "Sem observações especiais.", "31/03/2024", 17, "Indicação de parceiro de negócios");
        adicionarCliente(cliente17);

        Cliente cliente18 = new Cliente("Marcos Lima", "(63) 98765-2345", "Palmas", "Prefere contato por aplicativos de mensagem.", "30/03/2024", 18, "Redes sociais");
        adicionarCliente(cliente18);

        Cliente cliente19 = new Cliente("Bruna Oliveira", "(94) 98765-6543", "Belém", "Necessita de assistência técnica remota.", "29/03/2024", 19, "Pesquisa online");
        adicionarCliente(cliente19);

        Cliente cliente20 = new Cliente("Gustavo Pereira", "(71) 98765-3456", "Salvador", "Sem observações especiais.", "28/03/2024", 20, "Anúncio em site de classificados");
        adicionarCliente(cliente20);


    }
}
