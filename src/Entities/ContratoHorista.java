package Entities;

import java.util.Date;

public class ContratoHorista extends Contrato {

    private int horasMes;
    private float valorHora = 80f;

    public ContratoHorista(int id, Date dataInicio, Colaborador colaborador, int horasMes) {
        super(id, dataInicio, colaborador);
        this.horasMes = horasMes;
    }

    public float calcVencimento(){
        return (this.valorHora * this.horasMes);
    }

    @Override
    public String toString() {
        return "Contrato Colaborador Horista: \n"
                + "Id Contrato: "
                + id
                + ", Início Contrato: "
                + dataInicio
                + ", Situação Contrato: "
                + (ativo ? "Contrato Ativo" : "Contrato Inativo")
                + "\n"
                + colaborador;

    }
}
