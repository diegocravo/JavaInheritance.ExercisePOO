package Entities;

import java.time.format.DateTimeFormatter;
import java.util.Date;


public class ContratoComissionado extends Contrato {

    private float percComissao = 0.10f;
    private float ajudaCusto = 3000f;

    public ContratoComissionado(int id, Date dataInicio, Colaborador colaborador) {
        super(id, dataInicio, colaborador);
    }

        public float calcVencimento(float vlFaturam){
            return ((this.percComissao * vlFaturam) + this.ajudaCusto);
    }

    @Override
    public String toString() {
        return "Tipo de Contrato: Comissionado\n"
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
