package Metodos;

import Entities.Colaborador;
import Entities.Contrato;
import Entities.ContratoComissionado;
import Entities.VendaComissionada;

import java.util.Date;
import java.util.Scanner;

public class LancarVendasComissionadas {

    public static void lancarVendasComissionadas(){

        Colaborador colaborador = new Colaborador("1234", "36911873827", "Diego", new Date());
        Colaborador.listaColaborador.add(colaborador);
        ContratoComissionado contratoComissionado = new ContratoComissionado(1000, new Date(), colaborador);
        VendaComissionada vendaComissionada = new VendaComissionada(1000, 10, 2020, 6000f, new ContratoComissionado(678, new Date(), colaborador));
        VendaComissionada.listaVendasComissionadas.add(vendaComissionada);

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o id do Contrato:");
        int id = ler.nextInt();
        ler.nextLine();

        boolean contratoExiste = false;

        for(VendaComissionada venda : VendaComissionada.listaVendasComissionadas){
            if(venda.getId() == id){
                contratoExiste = true;
                System.out.println("Mês Contrato: " + venda.getMes());
                System.out.println("Ano Contrato: " + venda.getAno());
                System.out.println("Vendas Colaborador mês: R$" + (vendaComissionada.getValor()) );
            }
        }

        /*for(Contrato c : Contrato.listaContratos){
            if (c.getId() == id){
                if (c instanceof ContratoComissionado && c.isAtivo()){
                    System.out.println("Digite o id da Venda Comissionada: ");
                    int idVendaComissionada = ler.nextInt();
                            ler.nextLine();
                    for (VendaComissionada v : VendaComissionada.listaVendasComissionadas){
                        if(v.getContratoComissionado().getId() == idVendaComissionada){
                            contratoExiste = true;
                            System.out.println("Data Contrato: " + c.getDataInicio());
                            System.out.println("Vendas Colaborador: R$" + ((ContratoComissionado) c).calcVencimento(v.getValor()));
                        }
                    }
                }else if (c instanceof ContratoComissionado && !c.isAtivo()){
                    contratoExiste = true;
                    System.out.println("Contrato não está ativo. ");
                }else if ( !(c instanceof ContratoComissionado)){
                    contratoExiste = true;
                    System.out.println("Contrato não é do tipo comissionado.");
                }
                else{
                    System.out.println("Caí aqui!");
                }
            }
        }*/

        if (!contratoExiste){
            System.out.println("Contrato não cadastrado. ");
        }

    }

}
