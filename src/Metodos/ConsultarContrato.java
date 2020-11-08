package Metodos;

import Entities.Contrato;

import java.util.Scanner;

public class ConsultarContrato {

    public static void consultarContrato(){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ID do Contrato: ");
        int id = ler.nextInt();
        ler.nextLine();

        boolean contratoExiste = false;

        for (Contrato c : Contrato.listaContratos){
            if(c.getId() == id){
                contratoExiste = true;
                System.out.println(c);
            }
        }

        if(!contratoExiste){
            System.out.println("Contrato não existe.");
        }

    }

}
