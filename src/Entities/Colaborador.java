package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

public class Colaborador {

    private String matricula;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private boolean situacao;
    static public List<Colaborador> listaColaborador = new ArrayList<Colaborador>();

    public Colaborador(String matricula, String cpf, String nome, Date dataNascimento){
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.situacao = false;
    }

    public static boolean validarCpf(String CPF){
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
                CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

    public void ativarColaborador(){
        this.situacao = true;
    }

    public static void desativarColaborador(){

    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    // excluir
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Colaborador: "
                + "Matrícula: "
                + matricula
                + ", CPF: "
                + cpf
                + ", Nome: "
                + nome
                + ", Data Nascimento: "
                + dataNascimento
                + ", Situação Colaborador: "
                + (situacao ? "Ativo": "Não Ativo");
    }
}
