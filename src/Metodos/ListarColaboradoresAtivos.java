package Metodos;

import Entities.Colaborador;

public class ListarColaboradoresAtivos {

    public static void listarColaboradores(){

        boolean existe = false;

        for (Colaborador c : Colaborador.listaColaborador){
            if (c.isSituacao()){
                existe = true;
                System.out.println("Id Colaborador: " + c.getMatricula());
                System.out.println("Nome: " + c.getNome());
                System.out.println("CPF: " + c.getCpf());
            }
        }

        if (!existe){
            System.out.println("Não há colaboradores ativos.");
        }

    }

}
