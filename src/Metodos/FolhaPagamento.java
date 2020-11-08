package Metodos;

import Entities.*;

import java.util.Scanner;

public class FolhaPagamento {

    public static void emitirFolhaPagamento(){

    System.out.println("Lista de Contratos Ativos: ");

    boolean contratoAtivo = false;

    for (Contrato c : Contrato.listaContratos){
        if(c instanceof ContratoComissionado && c.isAtivo()){
            contratoAtivo = true;
            System.out.println("Id Contrato: "+ c.getId());
            System.out.println("Tipo de Contrato: Comissionado");
            System.out.println("Matrícula: " + c.getColaborador().getMatricula());
            System.out.println("nome: " + c.getColaborador().getNome());

            float valorContrato = 0;
            for(VendaComissionada v : VendaComissionada.listaVendasComissionadas){
                if(c.getId() == v.getContratoComissionado().getId()){
                    valorContrato = v.getValor();
                }
            }

            System.out.println("Salário: R$" + ((ContratoComissionado) c).calcVencimento(valorContrato));
        }else if (c.isAtivo()){
            contratoAtivo = true;
            System.out.println("Id Contrato: "+ c.getId());
            System.out.println("Tipo de Contrato: " + (c instanceof ContratoHorista ? "Horista" : "Assalariado"));
            System.out.println("Matrícula: " + c.getColaborador().getMatricula());
            System.out.println("nome: " + c.getColaborador().getNome());
            System.out.println("Salário: " + (c instanceof ContratoHorista ? ((ContratoHorista) c).calcVencimento() : ((ContratoAssalariado) c).calcVencimento() ));
        }
    }
    if(!contratoAtivo){
        System.out.println("Não há contratos ativos.");
    }

    }
}
