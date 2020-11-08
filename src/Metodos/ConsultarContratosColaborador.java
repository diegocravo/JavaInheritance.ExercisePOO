package Metodos;

import Entities.Colaborador;
import Entities.Contrato;

import java.util.Scanner;

public class ConsultarContratosColaborador {

    public static void consultarContratoColaborador(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a matrícula ou CPF do Colaborador: ");
        String entrada = ler.nextLine();

        boolean contratoExiste = false;

        for (Contrato c : Contrato.listaContratos){
            if(c.getColaborador().getMatricula().equals(entrada) || c.getColaborador().getCpf().equals(entrada)){
                contratoExiste = true;
                System.out.println(c);
            }
        }

        if(!contratoExiste) System.out.println("Contrato não cadastrado");

    }

}
