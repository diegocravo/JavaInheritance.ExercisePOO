package Metodos;

import Entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegistrarContrato {

    private static int contador = 1000;

    public static int gerarId(){
        return contador++;
    }

    public static void registrarContrato() throws ParseException{

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner ler = new Scanner(System.in);

        int idContrato = gerarId();
        System.out.println("Digite a Data de Início: ");
        String stringData1 = ler.nextLine();
        Date dataInicio = formato1.parse(stringData1);
        System.out.println("Digite a Matrícula do Colaborador: ");
        String matricula = ler.nextLine();

        //Colaborador colaborador = new Colaborador("1231231234", "12323123", "Diego Teixeira", dataInicio);

        for(Colaborador colaborador : Colaborador.listaColaborador){
            if(colaborador.getMatricula().equals(matricula)){
                if (colaborador.isSituacao()){
                    System.out.println("Colaborador já possui um contrato ativo.");
                    break;
                }else{

                    System.out.println("Digite o tipo do Contrato");
                    System.out.println("1. Assalariado");
                    System.out.println("2. Comissionado");
                    System.out.println("3. Horista");
                    String option = ler.nextLine();

                    // inserir entradas
                    switch (option){
                        case "1":
                            ContratoAssalariado contratoAssalariado = new ContratoAssalariado(idContrato, dataInicio, colaborador, 1000.0f );
                            colaborador.ativarColaborador();
                            Contrato.listaContratos.add(contratoAssalariado);
                            break;
                        case "2":
                            ContratoComissionado contratoComissionado = new ContratoComissionado(idContrato, dataInicio, colaborador);
                            colaborador.ativarColaborador();
                            Contrato.listaContratos.add(contratoComissionado);
                            break;
                        case "3":
                            ContratoHorista contratoHorista = new ContratoHorista(idContrato, dataInicio, colaborador, 50);
                            colaborador.ativarColaborador();
                            Contrato.listaContratos.add(contratoHorista);
                            break;
                        default:
                            System.out.println("Entrada Inválida.");
                            break;
                    }

                    System.out.println("Contrato Cadastrado com sucesso.");
                    System.out.println("Número do Contrato: " + idContrato);
                    break;
                }
            }
        }

    }
}
