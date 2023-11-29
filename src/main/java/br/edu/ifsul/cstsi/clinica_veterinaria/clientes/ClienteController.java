package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ClienteController {
    private static final Scanner input = new Scanner(System.in);
    private static ClienteService ClienteService;
    public ClienteController(ClienteService ClienteService) {
        ClienteController.ClienteService = ClienteService;
    }
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n\"-------  MENU cliente -------\"");
            System.out.print(
                    """
    
                        1. Inserir novo cliente
                        2. Atualizar um cliente
                        3. Excluir um cliente 
                        4. Listar todos os clientes
                        5. Buscar cliente pelo código
                        6. Buscar clientes pelo nome
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> inserir();
                case 2 -> atualizar();
                /*case 3 -> excluir();
                case 4 -> selectclientes();
                case 5 -> selectclientesById();
                case 6 -> selectclientesByNome();

                 */
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }
    private static void inserir() {
        Cliente cliente = new Cliente();
        EnderecoCliente enderecoCliente = new EnderecoCliente();
        System.out.println("\n++++++ Cadastro de novo Cliente ++++++");
        System.out.print("Digite o nome do cliente: ");
        cliente.setNome_cliente(input.nextLine());
        System.out.println("Telefone: ");
        cliente.setTelefone_cliente(Integer.valueOf(input.nextLine()));
        System.out.println("Cep: ");
        cliente.setCep_cliente(Long.valueOf(input.nextLine()));
        System.out.println("Email: ");
        cliente.setEmail_cliente(input.nextLine());
        System.out.println("Endereço: ");
        cliente.setEndereco_cliente(enderecoCliente);
        System.out.println("cliente salvo com sucesso:" + ClienteService.insert(cliente));
    }

    private static void atualizar() {
        System.out.println("\n++++++ Alterar um cliente ++++++");
        Cliente cliente;
        int opcao = 0;
        do {
            System.out.print("\nDigite o código do cliente (Zero p/sair): ");
            long codigo = input.nextLong();
            input.nextLine();
            if (codigo == 0) {
                opcao = 0;
            } else {
                cliente = ClienteService.getClienteById(codigo);
                if (cliente == null) {
                    System.out.println("Código inválido.");
                } else {
                    System.out.println("Nome: " + cliente.getNome_cliente());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.println("Digite o novo nome do cliente: ");
                        cliente.setNome_cliente(input.nextLine());
                    }
                    System.out.println("CEP : " + cliente.getCep_cliente());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.print("Digite o novo CEP do cliente: ");
                        cliente.setCep_cliente(Long.valueOf(input.nextLine()));
                    }
                    System.out.println("Telefone : " + cliente.getTelefone_cliente());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.print("Digite o novo telefone do cliente: ");
                        cliente.setTelefone_cliente(Integer.valueOf(input.nextLine()));
                    }
                    System.out.println("Rua : " + cliente.getEndereco_cliente());
                    System.out.print("Alterar? (0-sim/1-não) ");
                    if(input.nextInt() == 0){
                        input.nextLine();
                        System.out.print("Digite o novo endereço do cliente: ");
                        input.nextLine();
                        System.out.print("Rua : ");
                        cliente.setEndereco_cliente(new EnderecoCliente());
                    }
                    if(ClienteService.update(cliente) != null) {
                        System.out.println("cliente atualizado com sucesso. " + ClienteService.getClienteById(cliente.getId()));
                    } else {
                        System.out.println("Não foi possível atualizar este cliente. Por favor, contate o administrador.");
                    }

                    opcao = 1;
                }
            }
        } while (opcao != 0);
    }


}

