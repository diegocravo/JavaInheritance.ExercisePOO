package Menu;

import Metodos.*;

import java.text.ParseException;
import java.util.Scanner;

public class Index {

    public static void escolha() throws ParseException {

        Scanner ler = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){

            System.out.println("\nEscolha a opção:");
            System.out.println("1. Inserir Colaborador");
            System.out.println("2. Registrar Contrato");
            System.out.println("3. Consultar Contrato");
            System.out.println("4. Encerrar Contrato");
            System.out.println("5. Listar Colaboradores Ativos");
            System.out.println("6. Consultar Contratos do Colaborador");
            System.out.println("7. Lançar Vendas Comissionadas");
            System.out.println("8. Emitir Folha de Pagamento");
            System.out.println("0. Sair");


            String option = ler.nextLine();

            switch (option){
                case "1":
                    InserirColaborador.inserirColaborador();
                    break;
                case "2":
                    RegistrarContrato.registrarContrato();
                    break;
                case "3":
                    ConsultarContrato.consultarContrato();
                    break;
                case "4":
                    EncerrarContrato.encerrarContrato();
                    break;
                case "5":
                    ListarColaboradoresAtivos.listarColaboradores();
                    break;
                case "6":
                    ConsultarContratosColaborador.consultarContratoColaborador();
                    break;
                case "7":
                    LancarVendasComissionadas.lancarVendasComissionadas();
                    break;
                case "8":
                    FolhaPagamento.emitirFolhaPagamento();
                    break;
                case "0":
                    System.out.println("Obrigado e até breve!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção Inválida, Tente Novamente.");
                    break;

            }

        }

    }

}
