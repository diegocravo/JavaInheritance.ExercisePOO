package Metodos;

import Entities.Contrato;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EncerrarContrato {

    public static void encerrarContrato() throws ParseException {

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ID do Contrato: ");
        int id = ler.nextInt();
        ler.nextLine();

        boolean existe = false;
        boolean estaAtivo = false;
        // alterar status
        for (Contrato c : Contrato.listaContratos){
            if(c.getId() == id){
                if(c.isAtivo()){

                    System.out.println("Digite a data de encerramento do Contrato: ");
                    String data = ler.nextLine();
                    Date dataEncerramento = formato1.parse(data);
                    c.setDataEncerramento(dataEncerramento);

                    c.setAtivo(false);
                    c.getColaborador().setSituacao(false);

                    estaAtivo = true;
                    existe = true;
                    System.out.println("Contrato Encerrado com Sucesso. ");
                }else{
                    existe = true;
                }
            }
        }

        if (!existe){
            System.out.println("Contrato não existe.");
        }else if(existe && !estaAtivo){
            System.out.println("Contrato já está Inativo.");
        }

    }
}
