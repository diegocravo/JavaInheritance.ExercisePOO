package Entities;

import java.util.ArrayList;
import java.util.List;

public class VendaComissionada {

    private int id;
    private int mes;
    private int ano;
    private float valor;
    private ContratoComissionado contratoComissionado;
    static public List<VendaComissionada> listaVendasComissionadas = new ArrayList<VendaComissionada>();

    public VendaComissionada(int id, int mes, int ano, float valor, ContratoComissionado contratoComissionado){
        this.id = id;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.contratoComissionado = contratoComissionado;
    }

    public int getId() {
        return id;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public float getValor() {
        return valor;
    }

    public ContratoComissionado getContratoComissionado() {
        return contratoComissionado;
    }

}
