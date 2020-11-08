package Metodos;
import Entities.*;

import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class InserirColaborador {

    public static void inserirColaborador() throws ParseException {

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a matrícula: ");
        String matricula = ler.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = ler.nextLine();
        System.out.println("Digite o Nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite a Data de Nascimento: ");
        String stringData = ler.nextLine();
        Date data = formato1.parse(stringData);

        LocalDate localDate = LocalDate.parse(stringData, formatter);
        //System.out.println(formatter.format(localDate)); // utilizar no to string


        int anos = (localDate.now().getYear() - localDate.getYear());
        int mes = (localDate.now().getMonthValue() - localDate.getMonthValue());
        int dias = (localDate.now().getDayOfMonth() - localDate.getDayOfMonth());


        if(Colaborador.validarCpf(cpf) && Period.between(localDate, LocalDate.now()).getYears() >= 18){
            Colaborador colaborador = new Colaborador(matricula, cpf, nome, data);
            Colaborador.listaColaborador.add(colaborador);
            System.out.println("Colaborador Adicionado com sucesso!");
        } else if (Colaborador.validarCpf(cpf) && Period.between(localDate, LocalDate.now()).getYears() < 18){
                System.out.println("Colaborador menor de idade. Não pode ser inserido.");
        } else {
            System.out.println("CPF Inválido.");
        }


    }

}
