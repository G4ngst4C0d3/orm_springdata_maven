package br.edu.ifsul.cstsi.clinica_veterinaria;
import br.edu.ifsul.cstsi.clinica_veterinaria.clientes.ClienteController;


import java.util.Scanner;
public class ControllerVeterinaria {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int opcao;
        do {
            System.out.println("\n------- Clínica Veterinária -------");
            System.out.println(
                    """
                            1.
                            2.
                            3.
                            4.
                            5.
                            Opção(zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1 -> ClienteController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        }while (opcao != 0);
        System.out.println("\n\n----------- Fim da aplicação -----------");
        input.close();
    }
}
