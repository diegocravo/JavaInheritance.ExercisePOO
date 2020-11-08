package Test;

import Test.ContratoAssalariadoTest;
import Test.ContratoHoristaTest;
import Test.ColaboradorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ContratoAssalariadoTest.class,
        ContratoHoristaTest.class,
        ColaboradorTest.class
})

public class TestSuit {

}
