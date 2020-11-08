package Test;

import Entities.Colaborador;
import Entities.ContratoAssalariado;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ContratoAssalariadoTest {

    @Test
    public void calcVencimento() throws ParseException {

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Colaborador colaborador = new Colaborador("123", "13322481018", "Diego", formato1.parse("01/01/2008"));
        ContratoAssalariado contratoAssalariado = new ContratoAssalariado(1, formato1.parse("01/01/2008"), colaborador, 4000f);

        assertEquals(4600f, contratoAssalariado.calcVencimento(), 0.00000000001);

    }
}