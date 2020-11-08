package Test;

import org.junit.Before;
import Entities.*;

import static org.junit.Assert.*;

public class ColaboradorTest {

    @org.junit.Test
    public void validarCpf() {
        assertTrue(Colaborador.validarCpf("13322481018"));
        assertFalse(Colaborador.validarCpf("123"));
        assertFalse(Colaborador.validarCpf("11122233345"));
    }
}