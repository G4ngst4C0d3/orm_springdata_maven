package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class ClienteController {
    private static final Scanner input = new Scanner(System.in);
    private static ClienteService clienteService;

    public ClienteController(ClienteService ClienteService) {
        ClienteController.clienteService = ClienteService;

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
                case 4 -> selectClientes();


                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }

    private static void inserir() {
        Cliente clientes = new Cliente();
        System.out.println("\n       Cadastrar novo cliente      ");
        System.out.println("Digite o nome do cliente: ");
        clientes.setNome_cliente(input.nextLine());
        System.out.println("Digite o telefone do cliente: ");
        clientes.setTelefone_cliente(input.nextInt());
        System.out.println("Digite o cep do cliente: ");
        clientes.setCep_cliente(input.nextInt());
        System.out.println("Digite o email do cliente: ");
        clientes.setEmail_cliente(input.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        System.out.println("Rua: ");
        clientes.setEndereco_cliente(new EnderecoCliente());
        System.out.println("cliente salvo com sucesso:" + clienteService.insert(clientes));
    }
    private  static void selectClientes(){
        System.out.println("\n Lista dos clientes cadastrados na clínica veterinária:\n" + clienteService.getClientes());
    };


}


