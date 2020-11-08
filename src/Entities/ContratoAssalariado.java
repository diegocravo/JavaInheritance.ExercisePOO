package Entities;

import java.util.Date;

public class ContratoAssalariado extends Contrato {

    private float salarioMensal;
    private float percInsalubridade = 0.10f;
    private float percPericulosidade = 0.05f;

    public ContratoAssalariado(int id, Date dataInicio, Colaborador colaborador, float salarioMensal){
        super(id, dataInicio, colaborador);
        this.salarioMensal = salarioMensal;
    }

    public float calcVencimento(){
        return (this.salarioMensal + (this.salarioMensal * this.percPericulosidade) + (this.salarioMensal * this.percInsalubridade));
    }

    @Override
    public String toString() {
        return "Tipo Contrato: Assalariado"
                + "\nid Contrato: "
                + id
                + ", Início Contrato: "
                + dataInicio
                + ", Situação Contrato: "
                + (ativo ? "Contrato Ativo" : "Contrato Inativo")
                + "\n"
                + colaborador;
    }
}
