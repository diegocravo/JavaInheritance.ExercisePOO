package Test;

import Entities.Colaborador;
import Entities.ContratoHorista;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class ContratoHoristaTest {

    @Test
    public void calcVencimento() throws ParseException {

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Colaborador colaborador = new Colaborador("123", "13322481018", "Diego", formato1.parse("01/01/2008"));
        ContratoHorista contratoHorista = new ContratoHorista(1, formato1.parse("01/01/2008"), colaborador, 120);

        assertEquals(9600f, contratoHorista.calcVencimento(), 0.000000001);
    }
}