package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Contrato {

    protected int id;
    protected Date dataInicio;
    protected Date dataEncerramento;
    protected Colaborador colaborador;
    protected boolean ativo;

    static public List<Contrato> listaContratos = new ArrayList<Contrato>();

    public Contrato(int id, Date dataInicio, Colaborador colaborador){
        this.id = id;
        this.dataInicio = dataInicio;
        this.colaborador = colaborador;
        this.ativo = true;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public int getId() {
        return id;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void encerrarContrato(){
        this.ativo = false;
    }

}
